package com.example.android.tourguideudacity;

/**
 * Created by MP on 2/8/2017.
 */

public class River {

    private String mRiverName;
    private String mWater;
    private int mRiverImg;

    public River(String riverName, String water, int riverImg) {
        mRiverName = riverName;
        mWater = water;
        mRiverImg = riverImg;
    }

    public String getRiverName() {
        return mRiverName;
    }

    public String getWater() {
        return mWater;
    }

    public int getRiverImg() {
        return mRiverImg;
    }

}


