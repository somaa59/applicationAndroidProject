package com.example.myservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.start_service);
        Button button2 = findViewById(R.id.intent_service);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,MyIntentService.class);
                startService(intent);
            }
        });






                button.setOnClickListener(new View.OnClickListener() {
                    @Override

                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, MyService.class);
                        startService(intent);

                    }
                });
    }
}