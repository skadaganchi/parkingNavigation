package com.example.parkingnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Building extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building);
        getIntent().getIntExtra("buildingNo", 0);
    }

    public void moveToFloor(View view) {
        Intent intent = new Intent(this, Floors.class);
    }
}