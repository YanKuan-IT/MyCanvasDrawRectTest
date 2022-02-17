package com.example.mycanvasdrawrecttest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

public class MyDrawRectView extends View {
    public MyDrawRectView(Context context) {
        super(context);
    }

    public MyDrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyDrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
//        mPaint.setStyle(Paint.Style.STROKE); // 空心的，只有边框

        canvas.drawRect(0, 0, 500, 500, mPaint);
    }
}
