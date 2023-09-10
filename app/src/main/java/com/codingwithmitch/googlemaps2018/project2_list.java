package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class project2_list extends AppCompatActivity {

    String[] mobileArray = {"Android", "Iphone", "WindowsMobile", "Blackberry", "WebOS", "Windows7", "Max OS X"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

    }
}
