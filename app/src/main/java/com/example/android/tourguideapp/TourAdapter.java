package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class TourAdapter extends ArrayAdapter<VisitingPlaces> {


    public  TourAdapter(Context context1, List<VisitingPlaces> objects) {
        super(context1, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        VisitingPlaces currentPlace = getItem(position);

        // Find the TextViews and ImageView in the list_item.xml layout
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_textview);
        TextView dateAddressTextView = (TextView) listItemView.findViewById(R.id.address_date_textview);
        ImageView eventImage = (ImageView) listItemView.findViewById(R.id.image_event);

        // Since every VisitingPlace has a name, we put the name to its corresponding TextView
        nameTextView.setText(currentPlace.getName());

        //for all the VisitingPlaces, either the address OR the date is null; the TextView
        //dateAddressTextView contains the address if the date is null or the other way around
        if (currentPlace.getAddress() == null) {
            dateAddressTextView.setText(currentPlace.getDate());
        } else {
            dateAddressTextView.setText(currentPlace.getAddress());
        }

        //only Events have images; all the others have mImageResourceId = -1
        // hence, for = -1; set the visibility to gone; otherwise, set picture
        if (currentPlace.getImageResourceId() == -1) {
            eventImage.setVisibility(View.GONE);
        } else {
            eventImage.setImageResource(currentPlace.getImageResourceId());
            eventImage.setVisibility(View.VISIBLE);
        }

        return listItemView;
    }
}
