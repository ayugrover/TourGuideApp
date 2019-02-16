package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyAdapter(FragmentManager fr, Context ct) {
        super(fr);
        mContext = ct;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int place) {
        if (place == 0) {
            return new HotelFragment();
        } else if (place == 1) {
            return new RestaurantsFragment();
        } else if (place == 2) {
            return new PlacesFragment();
        } else
            return new EventsFragment();
    }

    @Override
    public CharSequence getPageTitle(int pos) {
        switch (pos) {
            case 0:
                return mContext.getString(R.string.bar);
            case 1:
                return mContext.getString(R.string.restaurants);

            case 2:
                return mContext.getString(R.string.special_places);

            default:
                return mContext.getString(R.string.events);
        }
    }
}
