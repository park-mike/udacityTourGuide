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

public class MuseumAdapter extends ArrayAdapter<Museum> {

    private static final String LOG_TAG = MuseumAdapter.class.getSimpleName();

    public MuseumAdapter(Activity context, ArrayList<Museum> museum) {
        super(context, 0, museum);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Museum currentMuseum = getItem(position);

        ImageView museumImg = (ImageView) listItemView.findViewById(R.id.list_item_img);
        museumImg.setImageResource(currentMuseum.getMuseumImg());

        TextView museumName = (TextView) listItemView.findViewById(R.id.list_item_upper_name);
        museumName.setText(currentMuseum.getMuseumName());

        TextView style = (TextView) listItemView.findViewById(R.id.list_item_lower);
        style.setText(currentMuseum.getMuseumStyle());

        return listItemView;

    }
}
