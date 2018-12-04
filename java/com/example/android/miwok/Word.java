package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceID;
    
    public Word(String defaultTranslation, String miwokTranslation, int AudioResourceID) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mAudioResourceID = AudioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=ImageResourceID;
    }
    
    public Word(String defaultTranslation, String miwokTranslation, intImageResourceID, int AudioResourceID) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=ImageResourceID;
        mAudioResourceID=AudioResourceID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() {return mImageResourceID != NO_IMAGE_PROVIDED; }
    
    public int get AudioResourceID() { return mAudioResourceID;}
    
}
