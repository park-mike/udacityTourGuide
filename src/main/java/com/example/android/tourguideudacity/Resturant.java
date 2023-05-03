package com.example.android.tourguideudacity;

/**
 * Created by MP on 2/9/2017.
 */

public class Resturant {

    private String mRestName;
    private String mAvgPrice;
    private int mRestImg;

    public Resturant(String restName, String avgPrice, int restImg) {
         mRestName = restName;
         mAvgPrice = avgPrice;
         mRestImg= restImg;
    }

    public String getRestName() {
        return mRestName;
    }

    public String getAvgPrice() {
        return mAvgPrice;
    }

    public int getRestImg() {
        return mRestImg;
    }



}
