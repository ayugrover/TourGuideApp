package com.example.android.tourguideapp;

public class VisitingPlaces {

    //name of the bar,restaurant, event, place,...
    private String mName;

    //address of the bar/restaurant/place
    private String mAddress;

    //resource id for the Image of the events
    private int mImageId;

    //date of the event
    private String mDate;

    public VisitingPlaces(String name, String address) {
        mName = name;
        mAddress = address;
        mImageId = -1;
        mDate = null;
    }

    public VisitingPlaces(String name, String date, int image) {
        mName = name;
        mDate = date;
        mImageId = image;
        mAddress = null;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getName() {
        return mName;
    }


    public String getDate() {
        return mDate;
    }


    public int getImageResourceId() {
        return mImageId;
    }

}
