package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

//    Create an object variable for the signup text view
    TextView txtSignup;

//    Create a button object variable
    Button objBTNLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Bind the view
        txtSignup = (TextView) findViewById(R.id.tvLoginSignup);

        objBTNLogin = (Button) findViewById(R.id.btnLoginPage_Login);

//        Create an event listener for the sign link
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start the Signup activity
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();
            }
        });

//        Create an onclick event listener for the button object
        objBTNLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Perform field validations

//                Retrieve data from SQLite database and validate

//                Send user to home dashboard activity

                // Start the Signup activity
                Intent intent = new Intent(LoginActivity.this, HomeDashboardActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();

            }
        });








    }
}