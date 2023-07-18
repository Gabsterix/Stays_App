package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoardingActivity extends AppCompatActivity {
//    Create the object variables of the button class
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

//  Bind to the views
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

//        Create event listeners for the buttons
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start the Login activity
                Intent intent = new Intent(OnBoardingActivity.this, LoginActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();

            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start the Signup activity
                Intent intent = new Intent(OnBoardingActivity.this, SignupActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();

            }
        });




    }
}