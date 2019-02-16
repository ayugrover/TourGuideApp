package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
public class EventsFragment extends Fragment {

    public EventsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = (View) inflater.inflate(R.layout.list_file, container, false);

        ArrayList<VisitingPlaces> visitingPlaces = new ArrayList<>();

        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event1), getResources().getString(R.string.event1_date), R.drawable.aladin));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event2), getResources().getString(R.string.event2_date), R.drawable.ppp));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event3), getResources().getString(R.string.event3_date), R.drawable.ballet));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event4), getResources().getString(R.string.event4_date), R.drawable.dstak));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event5), getResources().getString(R.string.event5_date), R.drawable.run));
        visitingPlaces.add(new VisitingPlaces(getResources().getString(R.string.event6), getResources().getString(R.string.event6_date), R.drawable.neon));

        TourAdapter arrayAdapter = new TourAdapter(getActivity(), visitingPlaces);

        ListView listView = (ListView) rootView.findViewById(R.id.listview);

        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
