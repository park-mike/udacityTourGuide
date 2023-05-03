package com.example.android.tourguideudacity;

/**
 * Created by MP on 2/8/2017.
 */

public class Hiking {

    private String mMountainName;
    private String mMiles;
    private int mHikeImg;

    public Hiking(String mountainName, String miles, int hikeImg) {
        mMountainName = mountainName;
        mMiles = miles;
        mHikeImg = hikeImg;
    }

    public String getMountainName() {
        return mMountainName;
    }

    public String getMiles() {
        return mMiles;
    }

    public int getHikeImg() {
        return mHikeImg;
    }

}
