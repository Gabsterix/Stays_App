package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Delay the transition to the onboarding screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the onboarding activity
                Intent intent = new Intent(MainActivity.this, OnBoardingActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();
            }
        }, 2000);


    }
}