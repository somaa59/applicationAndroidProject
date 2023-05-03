package com.example.boundservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyBoundService extends Service {
  MyBinder myBinder =new MyBinder();
    public MyBoundService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
       return myBinder ;
    }
String getCurrentDate(){
    SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
    return format.format(new Date());
}


    class MyBinder extends Binder {
        MyBoundService getService(){
            return MyBoundService.this;
        }
    }
}