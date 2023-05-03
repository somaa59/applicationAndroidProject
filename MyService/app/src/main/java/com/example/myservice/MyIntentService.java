package com.example.myservice;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;


public class MyIntentService extends IntentService {


    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("service","onCreate");
    }

    @Override
    protected void onHandleIntent( Intent intent) {
        try {
            Thread.sleep(8000 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Service","onDestroy");
    }
}
