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

public class DView extends LinearLayout {
    private static String tag="D";
    public DView(Context context) {
        super(context);
    }

    public DView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(tag,"---onTouchEvent-----D");
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(tag,"---onInterceptTouchEvent-----D");
        return false;
    }
}