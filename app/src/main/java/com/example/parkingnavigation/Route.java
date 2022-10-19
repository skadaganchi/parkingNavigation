package com.example.parkingnavigation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.View;

public class Route extends View {

    private Paint paint = new Paint();

    private Point pointA, pointB;

    public Route(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        canvas.drawLine(pointA.x, pointA.y, pointB.x, pointB.y, paint);
        super.draw(canvas);
    }

    public void setPointA(Point point){
        pointA = point;
    }

    public void setPointB(Point point){
        pointB = point;
    }

    public void draw(){
        invalidate();
        requestLayout();
    }
}
