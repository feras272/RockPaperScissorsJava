package com.ferasdev.rockpaperscissorsjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Create a new Handler
        Handler handler = new Handler();

        // Create a Runnable that calls the doSomething() method
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                doSomething();
            }
        };

        // Post the Runnable with a delay
        handler.postDelayed(runnable, 3000); // 3 seconds
    }

    private void doSomething() {
        // Do something here after the delay
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}