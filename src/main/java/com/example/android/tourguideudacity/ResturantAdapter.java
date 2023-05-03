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
 * Created by MP on 2/9/2017.
 */


public class ResturantAdapter extends ArrayAdapter<Resturant> {

    private static final String LOG_TAG = ResturantAdapter.class.getSimpleName();

    public ResturantAdapter(Activity context, ArrayList<Resturant> resturant) {
        super(context, 0, resturant);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Resturant currentResturant = getItem(position);

        ImageView restImg = (ImageView) listItemView.findViewById(R.id.list_item_img);
        restImg.setImageResource(currentResturant.getRestImg());

        TextView restName = (TextView) listItemView.findViewById(R.id.list_item_upper_name);
        restName.setText(currentResturant.getRestName());

        TextView avgPrice = (TextView) listItemView.findViewById(R.id.list_item_lower);
        avgPrice.setText(String.valueOf(currentResturant.getAvgPrice()));

        return listItemView;

    }
}
