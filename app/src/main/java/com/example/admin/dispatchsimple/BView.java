package com.example.admin.dispatchsimple;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by admin on 2018/3/6.
 */

public class BView extends LinearLayout {
    private static String tag="B";
    public BView(Context context) {
        super(context);
    }

    public BView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(tag,"---onTouchEvent-----B");
        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(tag,"---onInterceptTouchEvent-----B");
        return false;
    }
}
