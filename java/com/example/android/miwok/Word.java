package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mMediaPlayerID = NO_FILE_PROVIDED;
    private static final int NO_FILE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=ImageResourceID;
    }
    
    public Word(String defaultTranslation, String miwokTranslation, intImageResourceID, int MediaPlayerID) {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourceID=ImageResourceID;
        mMediaPlayerID=MediaPlayerID;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceID() { return mImageResourceID; }

    public boolean hasImage() {return mImageResourceID != NO_IMAGE_PROVIDED; }
    
    public int getMediaPlayerID() { return mMediaPlayerID;}
    
    public boolean hasMedia() { return mMediaPlayerID != NO_FILE_PROVIDED;}
}
