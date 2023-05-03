package com.example.boundservices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyBoundService service ;
ServiceConnection serviceConnection = new ServiceConnection() {
    @Override
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MyBoundService.MyBinder myBinder = (MyBoundService.MyBinder) iBinder;
        service =myBinder.getService();
    }

    @Override
    public void onServiceDisconnected(ComponentName componentName) {

    }
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dateText = findViewById(R.id.date_tx);
        Button button = findViewById(R.id.start_service);
        Intent intent =new Intent(MainActivity.this,MyBoundService.class);
        bindService(intent,serviceConnection,BIND_ABOVE_CLIENT);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
            String date = service.getCurrentDate();
            dateText.setText(date);
            }
        });
    }
}