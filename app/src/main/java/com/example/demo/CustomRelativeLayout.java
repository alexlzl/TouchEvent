package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * @ describe
 * @ author lzl
 * @ time 2021/2/4 5:51 PM
 */
class CustomRelativeLayout extends RelativeLayout {
    private static final String TAG = "TAG";

    public CustomRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "CustomRelativeLayout===dispatchTouchEvent");
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "CustomRelativeLayout=====dispatchTouchEvent===ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "CustomRelativeLayout======dispatchTouchEvent===ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "CustomRelativeLayout==dispatchTouchEvent===ACTION_CANCEL");
                break;
        }
        return super.dispatchTouchEvent(ev);
//        return false;
//        return true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "CustomRelativeLayout===onInterceptTouchEvent");
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "CustomRelativeLayout=====onInterceptTouchEvent===ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "CustomRelativeLayout======onInterceptTouchEvent===ACTION_MOVE");
//                break;
                return true;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "CustomRelativeLayout==onInterceptTouchEvent===ACTION_CANCEL");
                break;
//                return true;

        }
        return super.onInterceptTouchEvent(ev);
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "CustomRelativeLayout===onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "CustomRelativeLayout=====onTouchEvent===ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "CustomRelativeLayout======onTouchEvent===ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "CustomRelativeLayout==onTouchEvent===ACTION_CANCEL");
                break;
        }
        return super.onTouchEvent(event);
//        return true;
    }

}
