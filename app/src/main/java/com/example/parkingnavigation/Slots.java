package com.example.parkingnavigation;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Slots extends AppCompatActivity implements View.OnClickListener {

    ImageView directionWayA1IV, directionA1IV, directionA2IV, directionA3IV, directionA4IV, directionA5IV,
            directionA6IV, directionA7IV, directionA8IV, directionA9IV, directionA10IV, directionWayA2IV,
            directionWayB1IV, directionB1IV, directionB2IV, directionB3IV, directionB4IV, directionB5IV,
            directionB6IV, directionB7IV, directionB8IV, directionB9IV, directionB10IV, directionWayB2IV;

    TextView slotA1TV, slotA2TV, slotA3TV, slotA4TV, slotA5TV,
            slotA6TV, slotA7TV, slotA8TV, slotA9TV, slotA10TV,
            slotB1TV, slotB2TV, slotB3TV, slotB4TV, slotB5TV,
            slotB6TV, slotB7TV, slotB8TV, slotB9TV, slotB10TV,
            slotC1TV, slotC2TV, slotC3TV, slotC4TV, slotC5TV,
            slotC6TV, slotC7TV, slotC8TV, slotC9TV, slotC10TV;

    DirectionPathWay direction;
    TextView oldView,currentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slots);
        init();
        onClickListeners();
    }

    public void init() {
        directionWayA1IV = (ImageView) findViewById(R.id.directionWayA1IV);
        directionA1IV = (ImageView) findViewById(R.id.directionA1IV);
        directionA2IV = (ImageView) findViewById(R.id.directionA2IV);
        directionA3IV = (ImageView) findViewById(R.id.directionA3IV);
        directionA4IV = (ImageView) findViewById(R.id.directionA4IV);
        directionA5IV = (ImageView) findViewById(R.id.directionA5IV);
        directionA6IV = (ImageView) findViewById(R.id.directionA6IV);
        directionA7IV = (ImageView) findViewById(R.id.directionA7IV);
        directionA8IV = (ImageView) findViewById(R.id.directionA8IV);
        directionA9IV = (ImageView) findViewById(R.id.directionA9IV);
        directionA10IV = (ImageView) findViewById(R.id.directionA10IV);
        directionWayA2IV = (ImageView) findViewById(R.id.directionWayA2IV);

        ArrayList<ImageView> directionAImages = new ArrayList<>();
        /*directionAImages.add(directionWayA1IV);
        directionAImages.add(directionWayA2IV);*/
        directionAImages.add(directionA10IV);
        directionAImages.add(directionA9IV);
        directionAImages.add(directionA8IV);
        directionAImages.add(directionA7IV);
        directionAImages.add(directionA6IV);
        directionAImages.add(directionA5IV);
        directionAImages.add(directionA4IV);
        directionAImages.add(directionA3IV);
        directionAImages.add(directionA2IV);
        directionAImages.add(directionA1IV);

        directionWayB1IV = (ImageView) findViewById(R.id.directionWayB1IV);
        directionB1IV = (ImageView) findViewById(R.id.directionB1IV);
        directionB2IV = (ImageView) findViewById(R.id.directionB2IV);
        directionB3IV = (ImageView) findViewById(R.id.directionB3IV);
        directionB4IV = (ImageView) findViewById(R.id.directionB4IV);
        directionB5IV = (ImageView) findViewById(R.id.directionB5IV);
        directionB6IV = (ImageView) findViewById(R.id.directionB6IV);
        directionB7IV = (ImageView) findViewById(R.id.directionB7IV);
        directionB8IV = (ImageView) findViewById(R.id.directionB8IV);
        directionB9IV = (ImageView) findViewById(R.id.directionB9IV);
        directionB10IV = (ImageView) findViewById(R.id.directionB10IV);
        directionWayB2IV = (ImageView) findViewById(R.id.directionWayB2IV);

        ArrayList<ImageView> directionBImages = new ArrayList<>();
        /*directionBImages.add(directionWayB1IV);
        directionBImages.add(directionWayB2IV);*/
        directionBImages.add(directionB10IV);
        directionBImages.add(directionB9IV);
        directionBImages.add(directionB8IV);
        directionBImages.add(directionB7IV);
        directionBImages.add(directionB6IV);
        directionBImages.add(directionB5IV);
        directionBImages.add(directionB4IV);
        directionBImages.add(directionB3IV);
        directionBImages.add(directionB2IV);
        directionBImages.add(directionB1IV);

        direction = new DirectionPathWay(directionAImages, directionBImages);
        direction.updatePathWayA(directionWayA1IV, directionWayA2IV);
        direction.updatePathWayB(directionWayB1IV, directionWayB2IV);

        slotA1TV = (TextView) findViewById(R.id.slotA1TV);
        slotA2TV = (TextView) findViewById(R.id.slotA2TV);
        slotA3TV = (TextView) findViewById(R.id.slotA3TV);
        slotA4TV = (TextView) findViewById(R.id.slotA4TV);
        slotA5TV = (TextView) findViewById(R.id.slotA5TV);
        slotA6TV = (TextView) findViewById(R.id.slotA6TV);
        slotA7TV = (TextView) findViewById(R.id.slotA7TV);
        slotA8TV = (TextView) findViewById(R.id.slotA8TV);
        slotA9TV = (TextView) findViewById(R.id.slotA9TV);
        slotA10TV = (TextView) findViewById(R.id.slotA10TV);
        slotB1TV = (TextView) findViewById(R.id.slotB1TV);
        slotB2TV = (TextView) findViewById(R.id.slotB2TV);
        slotB3TV = (TextView) findViewById(R.id.slotB3TV);
        slotB4TV = (TextView) findViewById(R.id.slotB4TV);
        slotB5TV = (TextView) findViewById(R.id.slotB5TV);
        slotB6TV = (TextView) findViewById(R.id.slotB6TV);
        slotB7TV = (TextView) findViewById(R.id.slotB7TV);
        slotB8TV = (TextView) findViewById(R.id.slotB8TV);
        slotB9TV = (TextView) findViewById(R.id.slotB9TV);
        slotB10TV = (TextView) findViewById(R.id.slotB10TV);
        slotC1TV = (TextView) findViewById(R.id.slotC1TV);
        slotC2TV = (TextView) findViewById(R.id.slotC2TV);
        slotC3TV = (TextView) findViewById(R.id.slotC3TV);
        slotC4TV = (TextView) findViewById(R.id.slotC4TV);
        slotC5TV = (TextView) findViewById(R.id.slotC5TV);
        slotC6TV = (TextView) findViewById(R.id.slotC6TV);
        slotC7TV = (TextView) findViewById(R.id.slotC7TV);
        slotC8TV = (TextView) findViewById(R.id.slotC8TV);
        slotC9TV = (TextView) findViewById(R.id.slotC9TV);
        slotC10TV = (TextView) findViewById(R.id.slotC10TV);


    }

    public void onClickListeners() {
        slotA1TV.setOnClickListener(this);
        slotA2TV.setOnClickListener(this);
        slotA3TV.setOnClickListener(this);
        slotA4TV.setOnClickListener(this);
        slotA5TV.setOnClickListener(this);
        slotA6TV.setOnClickListener(this);
        slotA7TV.setOnClickListener(this);
        slotA8TV.setOnClickListener(this);
        slotA9TV.setOnClickListener(this);
        slotA10TV.setOnClickListener(this);
        slotB1TV.setOnClickListener(this);
        slotB2TV.setOnClickListener(this);
        slotB3TV.setOnClickListener(this);
        slotB4TV.setOnClickListener(this);
        slotB5TV.setOnClickListener(this);
        slotB6TV.setOnClickListener(this);
        slotB7TV.setOnClickListener(this);
        slotB8TV.setOnClickListener(this);
        slotB9TV.setOnClickListener(this);
        slotB10TV.setOnClickListener(this);
        slotC1TV.setOnClickListener(this);
        slotC2TV.setOnClickListener(this);
        slotC3TV.setOnClickListener(this);
        slotC4TV.setOnClickListener(this);
        slotC5TV.setOnClickListener(this);
        slotC6TV.setOnClickListener(this);
        slotC7TV.setOnClickListener(this);
        slotC8TV.setOnClickListener(this);
        slotC9TV.setOnClickListener(this);
        slotC10TV.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(oldView!=null){
            oldView.setBackgroundResource(R.color.red);
        }
        currentView = (TextView) v;
        currentView.setBackgroundResource(R.color.green);
        oldView = currentView;
        switch (v.getId()) {
            case R.id.slotA1TV:
                direction.createDirection(1, 9);
                break;
            case R.id.slotA2TV:
                direction.createDirection(1, 8);
                break;
            case R.id.slotA3TV:
                direction.createDirection(1, 7);
                break;
            case R.id.slotA4TV:
                direction.createDirection(1, 6);
                break;
            case R.id.slotA5TV:
                direction.createDirection(1, 5);
                break;
            case R.id.slotA6TV:
                direction.createDirection(1, 4);
                break;
            case R.id.slotA7TV:
                direction.createDirection(1, 3);
                break;
            case R.id.slotA8TV:
                direction.createDirection(1, 2);
                break;
            case R.id.slotA9TV:
                direction.createDirection(1, 1);
                break;
            case R.id.slotA10TV:
                direction.createDirection(1, 0);
                break;
            case R.id.slotB1TV:
                direction.createDirection(2, 9);
                break;
            case R.id.slotB2TV:
                direction.createDirection(2, 8);
                break;
            case R.id.slotB3TV:
                direction.createDirection(2, 7);
                break;
            case R.id.slotB4TV:
                direction.createDirection(2, 6);
                break;
            case R.id.slotB5TV:
                direction.createDirection(2, 5);
                break;
            case R.id.slotB6TV:
                direction.createDirection(2, 4);
                break;
            case R.id.slotB7TV:
                direction.createDirection(2, 3);
                break;
            case R.id.slotB8TV:
                direction.createDirection(2, 2);
                break;
            case R.id.slotB9TV:
                direction.createDirection(2, 1);
                break;
            case R.id.slotB10TV:
                direction.createDirection(2, 0);
                break;
            case R.id.slotC1TV:
                direction.createDirection(3, 9);
                break;
            case R.id.slotC2TV:
                direction.createDirection(3, 8);
                break;
            case R.id.slotC3TV:
                direction.createDirection(3, 7);
                break;
            case R.id.slotC4TV:
                direction.createDirection(3, 6);
                break;
            case R.id.slotC5TV:
                direction.createDirection(3, 5);
                break;
            case R.id.slotC6TV:
                direction.createDirection(3, 4);
                break;
            case R.id.slotC7TV:
                direction.createDirection(3, 3);
                break;
            case R.id.slotC8TV:
                direction.createDirection(3, 2);
                break;
            case R.id.slotC9TV:
                direction.createDirection(3, 1);
                break;
            case R.id.slotC10TV:
                direction.createDirection(3, 0);
                break;
        }
    }
}
