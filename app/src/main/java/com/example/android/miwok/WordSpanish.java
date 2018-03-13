package com.example.android.miwok;

/**
 * Created by KASIBHATLA on 05-Nov-17.
 */

public class WordSpanish {
    private String mDefaultTranslation;

    private String mSpanishTranslation;

    private int mImageResourceId;

    public WordSpanish(String defaultTranslation, String spanishTranslation) {
        mDefaultTranslation= defaultTranslation;
        mSpanishTranslation = spanishTranslation;
    }
    public WordSpanish(String defaultTranslation, String spanishTranslation,int imageResourceId) {
        mDefaultTranslation= defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getmSpanishTranslation() {

        return mSpanishTranslation;
    }

    public int getImageResourseId(){

        return mImageResourceId;
    }
}
