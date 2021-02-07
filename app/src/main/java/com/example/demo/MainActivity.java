package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void testClick(View view) {
        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        super.dispatchTouchEvent(ev);
        Log.e(TAG, "MainActivity===dispatchTouchEvent");
       return super.dispatchTouchEvent(ev);
//        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "MainActivity===onTouchEvent");
        return super.onTouchEvent(event);
//        return true;
    }
}