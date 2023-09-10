package com.codingwithmitch.googlemaps2018;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class project2_custom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_custom);

        TextView simpelText = (TextView) findViewById(R.id.simple);
        simpelText.setText("That is a simple TextView");
    }
}
