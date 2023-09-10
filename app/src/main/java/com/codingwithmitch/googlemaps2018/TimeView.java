package com.codingwithmitch.googlemaps2018;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeView extends AppCompatActivity {

    private String titleText;
    private boolean color;

    public TimeView(Context context){
        super(context);
        setTimeView();
    }

    public TimeView(Context context, AttributeSet attrs){
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TimeView);
        int count = typedArray.getIndexCount();
        try {
            for (int i = 0; i < count; ++i){
                int attr = typedArray.getIndex(i);
                if (attr == R.styleable.TimeView_title) {
                    titleText = typedArray.getString(attr);
                    setTimeView();
                } else if (attr == R.styleable.TimeView_setColor) {
                    color = typedArray.getBoolean(attr,false);
                    decorateText();
                }
            }
        }
        finally {
            typedArray.recycle();
        }
    }
    public TimeView(Context context, AttributeSet attrs, int defstyle) {
        super(context, attrs, defstyle);
        setTimeView();
    }
    private void setTimeView() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
        String time = dateFormat.format(Calendar.getInstance().getTime());

        if (this.titleText != null )
            setText(this.titleText+" "+time);
        else
            setText(time);
    }
    private void decorateText() {
        if (this.color == true){
            setShadowLayer(4, 2, 2, Color.rgb(250, 00, 250));
            setBackgroundColor(Color.CYAN);
        } else {
            setBackgroundColor(Color.RED);
        }

    }
}
