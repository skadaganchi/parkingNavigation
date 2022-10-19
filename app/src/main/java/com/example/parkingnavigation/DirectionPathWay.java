package com.example.parkingnavigation;

import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class DirectionPathWay {

    ArrayList<ImageView> directionAImages = new ArrayList<>();
    ArrayList<ImageView> directionBImages = new ArrayList<>();
    ImageView directionWayA1IV, directionWayA2IV,
            directionWayB1IV, directionWayB2IV;

    public DirectionPathWay(ArrayList<ImageView> directionAImages, ArrayList<ImageView> directionBImages) {
        this.directionAImages = directionAImages;
        this.directionBImages = directionBImages;
    }

    public void updatePathWayA(ImageView directionWayA1IV, ImageView directionWayA2IV) {
        this.directionWayA1IV = directionWayA1IV;
        this.directionWayA2IV = directionWayA2IV;
    }

    public void updatePathWayB(ImageView directionWayB1IV, ImageView directionWayB2IV) {
        this.directionWayB1IV = directionWayB1IV;
        this.directionWayB2IV = directionWayB2IV;
    }

    public void createDirection(int slotType, int slotNumber) {
        hideDirection();
        if (slotType == 1) {
            directionWayB1IV.setVisibility(View.VISIBLE);

            directionWayB2IV.setImageResource(R.drawable.arrow3);
            directionWayB2IV.setRotation(-135);
            directionWayB2IV.setVisibility(View.VISIBLE);

            directionWayA1IV.setImageResource(R.drawable.arrow3);
            directionWayA1IV.setRotation(-135);
            directionWayA1IV.setVisibility(View.VISIBLE);

            directionWayA2IV.setImageResource(R.drawable.arrow1);
            directionWayA2IV.setRotation(90);
            directionWayA2IV.setVisibility(View.VISIBLE);
            for (int i = 0; i < slotNumber; i++) {
                directionAImages.get(i).setImageResource(R.drawable.arrow3);
                directionAImages.get(i).setRotation(-45);
                directionAImages.get(i).setVisibility(View.VISIBLE);
            }
            directionAImages.get(slotNumber).setImageResource(R.drawable.arrow2);
            directionAImages.get(slotNumber).setRotation(180);
            directionAImages.get(slotNumber).setVisibility(View.VISIBLE);
        } else {
            directionWayB1IV.setVisibility(View.VISIBLE);

            directionWayB2IV.setImageResource(R.drawable.arrow1);
            directionWayB2IV.setRotation(90);
            directionWayB2IV.setVisibility(View.VISIBLE);
            for (int i = 0; i < slotNumber; i++) {
                directionBImages.get(i).setImageResource(R.drawable.arrow3);
                directionBImages.get(i).setRotation(-45);
                directionBImages.get(i).setVisibility(View.VISIBLE);
            }

            if (slotType == 2) {
                directionBImages.get(slotNumber).setImageResource(R.drawable.arrow2);
            } else {
                directionBImages.get(slotNumber).setImageResource(R.drawable.arrow1);
            }
            directionBImages.get(slotNumber).setRotation(180);
            directionBImages.get(slotNumber).setVisibility(View.VISIBLE);
        }
    }

    public void hideDirection() {
        directionWayB1IV.setVisibility(View.INVISIBLE);
        directionWayB2IV.setVisibility(View.INVISIBLE);
        directionWayA1IV.setVisibility(View.INVISIBLE);
        directionWayA2IV.setVisibility(View.INVISIBLE);
        for (int i = 0; i < directionAImages.size(); i++) {
            directionAImages.get(i).setVisibility(View.INVISIBLE);
        }
        for (int i = 0; i < directionBImages.size(); i++) {
            directionBImages.get(i).setVisibility(View.INVISIBLE);
        }
    }
}
