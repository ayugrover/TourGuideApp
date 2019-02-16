package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        //create ArrayList for a list of the BARS
        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        //set the elements of the ArrayList
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place1), getResources().getString(R.string.place1_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place2), getResources().getString(R.string.place2_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place3), getResources().getString(R.string.place3_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place4), getResources().getString(R.string.place4_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place5),getResources().getString(R.string.place5_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place6), getResources().getString(R.string.place6_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place7), getResources().getString(R.string.place7_address)));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.place8), getResources().getString(R.string.place8_address)));

        //create adapter
        TourAdapter arrayAdapter = new TourAdapter(getActivity(), visitingPlaces);

        // Find the listview object in the view hierarchy of the Activity
        // id see xml file
        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        // Make the ListView use the ArrayAdapter, so that the ListView will display the list items
        listView.setAdapter(arrayAdapter);

        return rootView;
    }

}
