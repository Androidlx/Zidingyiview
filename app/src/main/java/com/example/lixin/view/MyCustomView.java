package com.example.lixin.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by hua on 2017/8/30.
 */

public class MyCustomView extends LinearLayout implements View.OnClickListener {


    private ImageView icon;
    private TextView title;

    public MyCustomView(Context context) {
        super(context);
        initView(context);
    }



    public MyCustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    private void initView(Context context) {
        inflate(context,R.layout.custom_view,this);

        title = findViewById(R.id.title);
        icon = findViewById(R.id.icon);

        icon.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.equals(icon)){
            Toast.makeText(getContext(), "我在自定义view中被点击了", Toast.LENGTH_SHORT).show();
        }

    }
}
