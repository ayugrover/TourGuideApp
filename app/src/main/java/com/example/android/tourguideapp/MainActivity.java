package com.example.android.tourguideapp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.TabLayout;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //find the id of the viewpager in the activity_main.xml file
        ViewPager view = (ViewPager) findViewById(R.id.viewpager);

        //create customized adapter
        MyAdapter adapt = new MyAdapter(getSupportFragmentManager(),this);

        //set adapter to the ViewPager
        view.setAdapter(adapt);

        //set the ViewPager to TabLayout
        TabLayout tab = (TabLayout) findViewById(R.id.tabs);
        tab.setupWithViewPager(view);


    }
}
