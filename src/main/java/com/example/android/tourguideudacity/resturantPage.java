package com.example.android.tourguideudacity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MP on 2/9/2017.
 */
public class resturantPage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resturant);

        ArrayList<Resturant> resturantArrayList = new ArrayList<>();
        resturantArrayList.add(new Resturant(getString(R.string.RestA), getString(R.string.RestTypeA), R.drawable.jellybean));
        resturantArrayList.add(new Resturant(getString(R.string.RestB), getString(R.string.RestTypeB), R.drawable.kitkat));
        resturantArrayList.add(new Resturant(getString(R.string.RestC), getString(R.string.RestTypeC),  R.drawable.marshmallow));

        ResturantAdapter resturantAdapter= new ResturantAdapter(this, resturantArrayList);

        ListView ResturantListView = (ListView) findViewById(R.id.listview_resturant);
        ResturantListView.setAdapter(resturantAdapter);

    }
}