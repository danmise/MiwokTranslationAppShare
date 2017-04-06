package com.example.android.miwok;

/**
 * Created by Zach on 3/28/2017.
 * <p>
 * {@link Word} represents a vocab word that the user wants to learn.
 * Contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /**
     * Constant vlaue that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    // Setting variables to private so no other class can manipulate
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /**
     * Image Resource ID for each word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Audio resource ID for each word
     */
    private int mAudioResourceId;

    /**
     * Create a new Word object
     *
     * @param defaultTranslation - is the word in a language already known such as English
     * @param miwokTranslation   - is the word in the Miwok language
     * @param audioResourceId    - is the audio file associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word Object
     *
     * @param defaultTranslation - is the word in a language already known such as English
     * @param miwokTranslation   - is the word in the Miwok language
     * @param imageResourceId    - is the drawable resource id associated with the word
     * @param audioResourceId    - is the audio file associated with the word
     */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Gets the default translation
     *
     * @return English word
     */

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Gets the Miwok translation
     *
     * @return Miwok work
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Gets the image resource Id
     *
     * @return image reource Id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Checks to see if the image resource id has changed from the constant of -1 if it has then we
     * have an image
     *
     * @return returns whether the word has an associated image
     */

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Gets the audio resource id
     *
     * @return audio resource id
     */

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
