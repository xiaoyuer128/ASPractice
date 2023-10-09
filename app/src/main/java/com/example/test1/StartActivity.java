package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Intent intent = new Intent(this,MainActivity.class);
        Timer timer = new Timer();
        TimerTask timerTask =new TimerTask() {
            @Override
            public void run() {
                startActivity(intent);
            }
        };
        timer.schedule(timerTask,5000);
    }
}