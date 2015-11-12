package com.example.guest.hikeioclone;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {
    private String TAG;
    public static boolean isLoggedIn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TAG = getClass().getSimpleName();


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "-- onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "-- onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "-- onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "--onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "-- onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "-- onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.e(TAG, "-- onSavedInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG, "-- onRestoreInstanceState");
    }

}