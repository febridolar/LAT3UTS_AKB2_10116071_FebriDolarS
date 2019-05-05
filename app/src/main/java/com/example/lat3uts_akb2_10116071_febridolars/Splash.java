package com.example.lat3uts_akb2_10116071_febridolars;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;

public class Splash extends AppCompatActivity {
    private ProgressBar mProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mProgress = (ProgressBar) findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                StartApp();
                finish();
            }
        }).start();
    }

    private void doWork(){
        for (int progress=0; progress<100; progress+=30) {
            try{
                Thread.sleep(1000);
                mProgress.setProgress(progress);
            }catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }

    private void StartApp(){
        Intent intent = new Intent(Splash.this, MainActivity.class);
        startActivity(intent);
    }
}

