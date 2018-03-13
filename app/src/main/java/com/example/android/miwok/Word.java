package com.example.android.miwok;

/**
 * Created by KASIBHATLA on 05-Nov-17.
 */

public class Word {
    private String mDefaultTranslation;

    private String mFrenchTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    public Word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation= defaultTranslation;
        mFrenchTranslation = frenchTranslation;

    }
    public Word(String defaultTranslation, String frenchTranslation,int imageResourceId,int audioResourceId) {
        mDefaultTranslation= defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
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

    public boolean hasImage() {
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
