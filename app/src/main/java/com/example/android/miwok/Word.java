package com.example.android.miwok;

/**
 * Created by KASIBHATLA on 05-Nov-17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mFrenchTranslation;

    private int mImageResourceId;

    public Word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation= defaultTranslation;
        mFrenchTranslation = frenchTranslation;
    }
    public Word(String defaultTranslation, String frenchTranslation,int imageResourceId) {
        mDefaultTranslation= defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getmFrenchTranslation() {

        return mFrenchTranslation;
    }

    public int getImageResourseId(){

        return mImageResourceId;
    }
}
