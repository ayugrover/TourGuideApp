package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList for a list of the Hotels
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //set the elements of the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel1), getResources().getString(R.string.hotel1_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel2), getResources().getString(R.string.hotel2_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel3), getResources().getString(R.string.hotel3_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel4), getResources().getString(R.string.hotel4_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel5), getResources().getString(R.string.hotel5_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel6), getResources().getString(R.string.hotel6_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel7), getResources().getString(R.string.hotel7_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel8), getResources().getString(R.string.hotel8_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel9), getResources().getString(R.string.hotel9_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.hotel10), getResources().getString(R.string.hotel10_address)));

        //create ArrayAdapter
        TourAdapter arrayAdapter = new TourAdapter(getActivity(), visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
