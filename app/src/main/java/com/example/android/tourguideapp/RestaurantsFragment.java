package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList to store the restaurants
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //Add the elements to the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar1), getResources().getString(R.string.bar1_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar2), getResources().getString(R.string.bar2_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar3), getResources().getString(R.string.bar3_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar4), getResources().getString(R.string.bar4_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar5), getResources().getString(R.string.bar5_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar6), getResources().getString(R.string.bar6_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.bar7), getResources().getString(R.string.bar7_address)));
        //create arrayAdapter
        TourAdapter arrayAdapter = new TourAdapter(getActivity(), visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}

