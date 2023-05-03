package com.example.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {
    public MyService() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("service","onCreate");
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i("Service","onStartCommand");
        new Thread(){
           public void  run() {
               try {

                   Thread.sleep(8000);
                   stopSelf();
                   Log.i("Thread", "" + "Thread finshed");
               } catch (InterruptedException e) {
                   e.printStackTrace();

               }
           }
        }.start();

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Service","onDestroy");
    }
}
