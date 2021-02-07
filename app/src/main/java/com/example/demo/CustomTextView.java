package com.example.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import androidx.annotation.Nullable;

/**
 * @ describe
 * @ author lzl
 * @ time 2021/2/4 5:43 PM
 */
class CustomTextView extends androidx.appcompat.widget.AppCompatTextView {
    private static final String TAG = "TAG";

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e(TAG, "CustomTextView===dispatchTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "CustomTextView===dispatchTouchEvent===ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "CustomTextView==dispatchTouchEvent===ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "CustomTextView==dispatchTouchEvent===ACTION_CANCEL");
                break;
        }
        return super.dispatchTouchEvent(event);
//        return true;
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "CustomTextView===onTouchEvent");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(TAG, "CustomTextView===onTouchEvent===ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(TAG, "CustomTextView=====onTouchEvent===ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(TAG, "CustomTextView==onTouchEvent===ACTION_CANCEL");
                break;
        }
//        return super.onTouchEvent(event);
        return true;
//        return false;
    }
}
