package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.codingwithmitch.googlemaps2018.ui.LoginActivity;

public class project extends AppCompatActivity {
    private TextView project1, project4,;
    private TextView project2, project5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        project1 = findViewById(R.id.project1);
        project1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik =new Intent(project.this, project1.class);
                startActivity(klik);
            }
        });

        project2 = findViewById(R.id.project2);
        project2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik2 = new Intent(project.this, project2.class);
                startActivity(klik2);
            }
        });

        project4 = findViewById(R.id.project4);
        project4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik2 = new Intent(project.this, LoginActivity.class);
                startActivity(klik2);
            }
        });

        project5 = findViewById(R.id.project5);
        project5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik2 = new Intent(project.this, LoginActivity.class);
                startActivity(klik2);
            }
        });
    }
}

