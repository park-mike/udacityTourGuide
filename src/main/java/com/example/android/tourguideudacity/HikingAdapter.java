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

public class HikingAdapter extends ArrayAdapter<Hiking> {

    private static final String LOG_TAG = HikingAdapter.class.getSimpleName();

    public HikingAdapter(Activity context, ArrayList<Hiking> hiking) {
        super(context, 0, hiking);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Hiking currentHike = getItem(position);

        TextView mountainName = (TextView) listItemView.findViewById(R.id.list_item_upper_name);
        mountainName.setText(currentHike.getMountainName());

        TextView miles = (TextView) listItemView.findViewById(R.id.list_item_lower);
        miles.setText(currentHike.getMiles());

        ImageView hikeImg = (ImageView) listItemView.findViewById(R.id.list_item_img);
        hikeImg.setImageResource(currentHike.getHikeImg());

        return listItemView;

    }
}
