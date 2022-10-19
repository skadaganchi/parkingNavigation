package com.example.parkingnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //count down timer class with 5 secs
        startTimer();
        Intent nextIntent = new Intent(this, Building.class);
        startActivity(nextIntent);
        finish(); //no back option
    }

    public void startTimer(){
        countDownTimer = new CountDownTimer(30000, 10000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {

            }
        }.start();
    }
}