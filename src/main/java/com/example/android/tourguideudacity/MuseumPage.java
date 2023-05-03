package com.example.android.tourguideudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MP on 2/9/2017.
 */

public class MuseumPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museum);

        ArrayList<Museum> museumArrayList = new ArrayList<>();
        museumArrayList.add(new Museum(getString(R.string.museumA), getString(R.string.museumTypeA), R.drawable.kitkat));
        museumArrayList.add(new Museum(getString(R.string.museumB), getString(R.string.museumTypeB), R.drawable.jellybean));
        museumArrayList.add(new Museum(getString(R.string.museumC), getString(R.string.museumTypeC), R.drawable.marshmallow));
        museumArrayList.add(new Museum(getString(R.string.museumD), getString(R.string.museumTypeD), R.drawable.lollipop));

        MuseumAdapter museumAdapter= new MuseumAdapter(this, museumArrayList);

        ListView museumRiverView= (ListView) findViewById(R.id.listview_museum);
        museumRiverView.setAdapter(museumAdapter);
    }
}