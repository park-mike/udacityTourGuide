package com.example.android.tourguideudacity;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by MP on 2/8/2017.
 */

public class RiverAdapter extends ArrayAdapter<River> {

    private static final String LOG_TAG = RiverAdapter.class.getSimpleName();

    public RiverAdapter(Activity context, ArrayList<River> rivers) {
        super(context, 0, rivers);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        River currentRiver = getItem(position);


        TextView riverName = (TextView) listItemView.findViewById(R.id.list_item_upper_name);
        riverName.setText(currentRiver.getRiverName());

        TextView riverWater = (TextView) listItemView.findViewById(R.id.list_item_lower);
        riverWater.setText(currentRiver.getWater());

        ImageView riverImg = (ImageView) listItemView.findViewById(R.id.list_item_img);
        riverImg.setImageResource(currentRiver.getRiverImg());


        return listItemView;


    }
}
