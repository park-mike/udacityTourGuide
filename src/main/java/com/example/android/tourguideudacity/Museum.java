package com.example.android.tourguideudacity;

/**
 * Created by MP on 2/8/2017.
 */

public class Museum {
    private String mMuseumName;
    private String mMuseumStyle;
    private int mMuseumImg;

    public Museum(String museumName, String museumStyle, int museumImg) {
        mMuseumName = museumName;
        mMuseumStyle = museumStyle;
        mMuseumImg = museumImg;
    }

    public int getMuseumImg() {
        return mMuseumImg;
    }

    public String getMuseumName() {
        return mMuseumName;
    }

    public String getMuseumStyle() {
        return mMuseumStyle;
    }
}
