package com.example.android.miwok;

/**
 * Created by KASIBHATLA on 05-Nov-17.
 */

public class WordGerman {
    private String mDefaultTranslation;

    private String mGermanTranslation;

    private int mImageResourceId;

    public WordGerman(String defaultTranslation, String germanTranslation) {
        mDefaultTranslation= defaultTranslation;
        mGermanTranslation = germanTranslation;
    }
    public WordGerman(String defaultTranslation, String germanTranslation,int imageResourceId) {
        mDefaultTranslation= defaultTranslation;
        mGermanTranslation = germanTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getmGermanTranslation() {

        return mGermanTranslation;
    }

    public int getImageResourseId(){

        return mImageResourceId;
    }
}
