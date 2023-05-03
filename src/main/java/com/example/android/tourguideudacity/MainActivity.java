package com.example.android.tourguideudacity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView museums = (TextView) findViewById(R.id.museums);
        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumIntent = new Intent(MainActivity.this, MuseumPage.class);
                startActivity(museumIntent);
            }
        });

        TextView rivers = (TextView) findViewById(R.id.rivers);
        rivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent riversIntent = new Intent(MainActivity.this, RiverPage.class);
                startActivity(riversIntent);
            }
        });

        TextView hiking = (TextView) findViewById(R.id.hiking);
        hiking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hikingIntent = new Intent(MainActivity.this, HikingPage.class);
                startActivity(hikingIntent);
            }
        });

        TextView resturants = (TextView) findViewById(R.id.resturants);
        resturants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resturantIntent = new Intent(MainActivity.this, resturantPage.class);
                startActivity(resturantIntent);
            }
        });


    }

}

