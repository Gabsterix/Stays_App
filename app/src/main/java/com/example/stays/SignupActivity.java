package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

//    Create an object variable for the text view
    TextView txtLogin;

    /* Create an object variable for the text view */
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

//        Bind to the view
        txtLogin = (TextView) findViewById(R.id.tvLoginLink);

        btnSignup = (Button)findViewById(R.id.btnSignupBTN);

//        Create an onclick listener event on the textview link
        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Start the Login activity
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();

            }
        });

//        Create the onclick event listener for the signup button
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Check for appropriate field entries


//                Create the database connection to the SQLite database and insert the data



                // Start the Login activity
                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();

            }
        });
    }
}