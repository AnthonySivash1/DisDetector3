package com.example.margarita.disdetector3;

/**
 * Created by Margarita on 10/17/2017.
 */

public class DisDetectorMethods {
    private  String ScoreTag;
    private String Confidence;
    private String Irony;
    public DisDetectorMethods(String score_tag, String confidence, String irony)
    {
        this.ScoreTag=score_tag;
        this.Confidence=confidence;
        this.Irony=irony;

    }

    public String getScoreTag()
    {

        return ScoreTag;
    }

    public void setScoreTag(String scoretag)
    {
        ScoreTag=scoretag;
    }




    public String getConfidence()
    {

        return Confidence;
    }

    public void setConfidence(String newConfidence)
    {

        Confidence= newConfidence;

    }

    public String getIrony()
    {
        return Irony;
    }

    public void setIrony(String irony)
    {
        Irony=irony;
    }

    @Override
    public String toString() {
        return "ScoreTag " + ScoreTag  +"\n" + "Confidence " + Confidence +"\n" + "Irony " + Irony;
               /* "ScoreTag='" + ScoreTag + '\n'' +
                ", Confidence='" + Confidence + '\'' +
                ", Irony='" + Irony + '\'' +
                '}';*/
    }
}
