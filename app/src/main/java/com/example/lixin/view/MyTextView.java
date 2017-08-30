package com.example.lixin.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by hua on 2017/8/30.  第三次
 */

public class MyTextView extends View {
    private String text;
    private int textColor;
    private float textSize;


    public MyTextView(Context context) {
        super(context);
        initAttrs(null);
    }



    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);
    }

    private void initAttrs(@Nullable AttributeSet attrs) {
        TypedArray array = getContext().obtainStyledAttributes(attrs, R.styleable.MyTextView);
        text = array.getString(R.styleable.MyTextView_text);
        textColor = array.getColor(R.styleable.MyTextView_textColor, 0xffffff);
        textSize = array.getDimension(R.styleable.MyTextView_textSize, 16);
    }


    //画布
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(textColor);
        paint.setTextSize(textSize);
        canvas.drawText(text,500,500,paint);
    }




    //测量
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    //设置子view的位置
    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
    //触摸事件处理
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
