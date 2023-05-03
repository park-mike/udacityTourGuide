package com.example.android.tourguideudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MP on 2/9/2017.
 */

public class HikingPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hiking);

        ArrayList<Hiking> hikingArray = new ArrayList<>();
        hikingArray.add(new Hiking(getString(R.string.HikingA), getString(R.string.HikingLenghtA), R.drawable.kitkat));
        hikingArray.add(new Hiking(getString(R.string.HikingB), getString(R.string.HikingLenghtB), R.drawable.jellybean));
        hikingArray.add(new Hiking(getString(R.string.HikingC), getString(R.string.HikingLenghtC), R.drawable.lollipop));
        hikingArray.add(new Hiking(getString(R.string.HikingD), getString(R.string.HikingLenghtD), R.drawable.marshmallow));


        HikingAdapter hikingAdapter = new HikingAdapter(this, hikingArray);

        ListView HikingListView = (ListView) findViewById(R.id.listview_hiking);
        HikingListView.setAdapter(hikingAdapter);

    }
}