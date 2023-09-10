package com.codingwithmitch.googlemaps2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class project2 extends AppCompatActivity {

    private TextView linear;
    private TextView relative;
    private TextView table;
    private TextView absolute;
    private TextView frame;
    private TextView list;
    private TextView control;
    private TextView custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project2);

        linear = findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_linear.class);
                startActivity(klik);
            }
        });

        relative = findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_relative.class);
                startActivity(klik);
            }
        });

        table = findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_table.class);
                startActivity(klik);
            }
        });

        absolute = findViewById(R.id.absolute);
        absolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_absolute.class);
                startActivity(klik);
            }
        });

        frame = findViewById(R.id.frame);
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_frame.class);
                startActivity(klik);
            }
        });

        list = findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_list.class);
                startActivity(klik);
            }
        });

        control = findViewById(R.id.control);
        control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_control.class);
                startActivity(klik);
            }
        });

        custom = findViewById(R.id.custom);
        custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent klik = new Intent(project2.this, project2_custom.class);
                startActivity(klik);
            }
        });
    }

}
