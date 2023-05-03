package com.example.android.tourguideudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MP on 2/9/2017.
 */

public class RiverPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.river);

        ArrayList<River> riverArrayList = new ArrayList<>();
        riverArrayList.add(new River(getString(R.string.RiverA), getString(R.string.RiverAType), R.drawable.kitkat));
        riverArrayList.add(new River(getString(R.string.RiverB), getString(R.string.RiverBType), R.drawable.jellybean));
        riverArrayList.add(new River(getString(R.string.RiverC), getString(R.string.RiverCType), R.drawable.marshmallow));
        riverArrayList.add(new River(getString(R.string.RiverD), getString(R.string.RiverDType), R.drawable.lollipop));

        RiverAdapter riverAdapter = new RiverAdapter(this, riverArrayList);

        ListView riverListView = (ListView) findViewById(R.id.listview_river);
        riverListView.setAdapter(riverAdapter);
    }
}