package com.example.splashscreen;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar=findViewById(R.id.progress_bar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i<=100; i++){
                    if(i==100){
                        Intent intent= new Intent(MainActivity.this,Home.class);
                        startActivity(intent);
                    }
                    else
                        progressBar.setProgress(i);
                    try {
                        Thread.sleep(50);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();


    }


    }

