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

public class CView extends LinearLayout {
    private static String tag="C";
    public CView(Context context) {
        super(context);
    }

    public CView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(tag,"---onTouchEvent-----C");


        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(tag,"---onInterceptTouchEvent-----C");
        return false;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(tag,"---dispatchTouchEvent-----C");
        return super.dispatchTouchEvent(ev);
    }
}

