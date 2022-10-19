package com.example.parkingnavigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Floors extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.floors);
        getIntent().getIntExtra("buildingNo", 0);
    }

    public void moveToFloor(View view) {

        Intent intent = new Intent(this, Slots.class);
    }
}
