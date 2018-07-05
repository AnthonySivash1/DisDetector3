package com.example.margarita.disdetector3;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONObject;

import java.net.URI;
import java.net.URL;



public class MainActivity extends AppCompatActivity {
    private ProgressBar spinner;
    private TextView inputText;
    private EditText editText;
     Views1 tttView;
    DisDetectorMethods disdetector;
    String userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        // spinner = (ProgressBar) findViewById(R.id.progressBar);
        inputText = (TextView) findViewById(R.id.result);
        disdetector=new DisDetectorMethods("","","");
        // editText=(EditText) findViewById(R.id.edittext);


        ButtonHandler bh = new ButtonHandler();
        tttView = new Views1(this, bh);
        setContentView(tttView);


    }
    //BuildURI
    private void executeURI2() {
        tttView.ExecuteUSerInput(userInput);
       String input2=tttView.ExecuteUSerInput(userInput);
        URL CloudSearchUrl = NetworkUtils.buildUrl2(input2);
        String x=CloudSearchUrl.toString();
        new DisDetector().execute(x);

    }




    public class DisDetector extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... url) {
            // android.os.Debug.waitForDebugger();

            String toReturn = "DID NOT WORK";
            try {
                toReturn = NetworkUtils.getResponseFromHttpUrl(url[0]);

            } catch (Exception e) {
                Log.d("doInBackground", "exception on get Response from HTTP call" + e.getMessage());
            }
            return toReturn;
        }

        @Override
        protected void onPostExecute(String sentimentData) {
           // spinner.setVisibility(View.INVISIBLE);

            try {
                JSONObject sentimentJSON = new JSONObject(sentimentData);
                String scoreTag=sentimentJSON.get("score_tag").toString();
                String confidenceTag=sentimentJSON.get("confidence").toString();
                String ironyTag=sentimentJSON.get("irony").toString();
                disdetector. setScoreTag(scoreTag);
                     disdetector.setConfidence( confidenceTag);
                disdetector.setIrony(ironyTag);
                tttView.setTextView(disdetector.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }

            super.onPostExecute(sentimentData);
           // return sentimentData;

        }


    }

    private class ButtonHandler implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
            if(tttView.isButton((Button)view))

            executeURI2();
        }
    }
}

