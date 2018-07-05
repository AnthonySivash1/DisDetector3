package com.example.margarita.disdetector3;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
//import android.widget.RelativeLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.net.URL;

import static android.view.Gravity.CENTER_HORIZONTAL;

/**
 * Created by Margarita on 10/15/2017.
 */

public class Views1 extends LinearLayout {
    private Button button;
    private TextView textView;
    private EditText editText;

    public Views1(Context context, View.OnClickListener listener)
    {
          super(context);
        button=new Button(context);

//Create relative layout

        //Creating LinearLayout.
        LinearLayout linearlayout = new LinearLayout(context);

        //Setting up LinearLayout Orientation
        linearlayout.setOrientation(LinearLayout.VERTICAL);

        LayoutParams linearlayoutlayoutparams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);

        addView(linearlayout, linearlayoutlayoutparams);


        //edittext

        editText=new EditText(context);
        LinearLayout.LayoutParams  edittextparams=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);

        //edittextparams.addRule(CENTER_HORIZONTAL);
        edittextparams.setMargins(20,0,0,0);
        editText.setHint(R.string.sentence);
        linearlayout.addView(editText);

       //button
        button=new Button(context);

        LinearLayout.LayoutParams  buttonviewparams=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
       // buttonviewparams.setMargins(20,0,0,0);
        buttonviewparams.gravity=Gravity.CENTER_HORIZONTAL;
        button.setText("Submit!");
        button.setTextSize(10);
        button.setOnClickListener(listener);
        linearlayout.addView(button,buttonviewparams);


        //textview
       textView= new TextView(context);
        // RelativeLayout relativeLayout=new RelativeLayout(context);
        LinearLayout.LayoutParams  textviewparams=new LinearLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
    //textviewparams.addRule(CENTER_HORIZONTAL);
       // textviewparams.setMargins(20,0,0,0);
        textviewparams.gravity=Gravity.CENTER_HORIZONTAL;
        textView.setLayoutParams(textviewparams);
        textView.setText(R.string.result);
        textView.setTextSize(25);
       linearlayout.addView(textView,textviewparams);

    }




    public  void setTextView(String textview)
    {
        textView.setText(textview.toString());
    }


    public String ExecuteUSerInput(String userInput)
    {
         userInput=editText.getText().toString();
        return userInput;
    }
public boolean isButton(Button b)
{
   return(b==button);
}

    public void getingINput(String s, String t, String z)
    {
        textView.setText("Score_Tag: " +s + "\n"+"Confidence Level: "+t +"\n" + "Irony Tag " +z);
    }

}









/*  RelativeLayout relativelayout=new RelativeLayout(context);
        RelativeLayout.LayoutParams  relativeparams=new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT);

        relativelayout.setLayoutParams(relativeparams);
        addView(relativelayout);
//Create textview
        //setup layour parameters
        textView= new TextView(context);
       // RelativeLayout relativeLayout=new RelativeLayout(context);
        RelativeLayout.LayoutParams  textviewparams=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);
        textviewparams.addRule(CENTER_HORIZONTAL);
        textviewparams.setMargins(20,0,0,0);
        textView.setLayoutParams(textviewparams);
        textView.setText("Text view!");
        addView(textView);

        //Create edittext
        editText=new EditText(context);
        RelativeLayout.LayoutParams  edittextparams=new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT);

        edittextparams.addRule(CENTER_HORIZONTAL);
        edittextparams.setMargins(20,0,0,0);
        editText.setHint(R.string.sentence);
        addView(editText);*/


