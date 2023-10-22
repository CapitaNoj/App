package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button btActA_fromC = findViewById(R.id.OpActivityA_fromC);

        btActA_fromC.setOnClickListener((view -> {
            Intent intent = new Intent(ActivityC.this, ActivityA.class);
            startActivity(intent);
        }));

        Button btActD_fromC = findViewById(R.id.OPActivityD_fromC);

        btActD_fromC.setOnClickListener((view -> {
            Intent intent = new Intent(ActivityC.this, ActivityD.class);
            finishActivity(1);
            startActivity(intent);
        }));

        Button clActC = findViewById(R.id.CLActC);

        clActC.setOnClickListener((view -> {
            Intent intent = new Intent(ActivityC.this, ActivityB.class);
            startActivity(intent);
        }));

        Button btclstack = findViewById(R.id.CLStack);

        btclstack.setOnClickListener((view -> finishActivity(1)));
    }
}