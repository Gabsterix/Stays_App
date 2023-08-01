package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.RestrictionEntry;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

//    Create objects variables for the username/mobile and password
    private EditText usernameEditText, passwordEditText;

//    Create object variable to for the checkbox
    private CheckBox rememberMeCheckBox;


//    Create an object variable for the signup text view
    TextView txtSignup;

//    Create a button object variable
    Button objBTNLogin;

    DatabaseHelper databaseHelper=new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        Bind to views
        usernameEditText = (EditText) findViewById(R.id.etLoginUsername);
        passwordEditText = (EditText) findViewById(R.id.etLoginPassword);

        //                Retrieve data from the text field
        String user = usernameEditText.getText().toString().trim();
        String password = passwordEditText.getText().toString().trim();

//        Bind the view
        txtSignup = (TextView) findViewById(R.id.tvLoginSignup);

        objBTNLogin = (Button) findViewById(R.id.btnLoginPage_Login);

//        Create an event listener for the signup link
        txtSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Retrieve data from the text field
//                String user = usernameEditText.getText().toString().trim();
//                String password = passwordEditText.getText().toString().trim();

                // Start the Signup activity
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);

                // Close the main activity
                finish();
            }
        });

//        Create an onClick event listener for the login button object
        objBTNLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                PART 1: Retrieve data from the text field
                String user = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

//                PART 2: Perform field validations
                if (user.isEmpty()) {
                    usernameEditText.setError("Please enter your email address");
                    usernameEditText.requestFocus();
                    return;
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
                    usernameEditText.setError("Please enter a valid email address");
                    usernameEditText.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    passwordEditText.setError("Please enter a password");
                    passwordEditText.requestFocus();
                    return;
                }

//                PART 3: Retrieve data from SQLite database and validate
                try {
//                    True part: send the user to the home screen
//                    Create an object of the User Model Class
                    UserModel userModel =new UserModel(user,password);
//                    Instantiate the database helper class
                    databaseHelper = new DatabaseHelper(LoginActivity.this);
//                    Create a boolean variable to store the connection
                    boolean success = databaseHelper.validateUser(userModel);

                    if(success==true){
//                        Show a message saying login was successful
                        Toast.makeText(LoginActivity.this, success + ": Login  was successful.", Toast.LENGTH_SHORT).show();

                        // Start the Signup activity
                        Intent intent = new Intent(LoginActivity.this, HomeDashboardActivity.class);
                        startActivity(intent);

                        // Close the main activity
                        finish();

                    }else {
                        Toast.makeText(LoginActivity.this,"Login failed.", Toast.LENGTH_SHORT).show();

                    }


                } catch (Exception e){
//                    False part: Show incorrect message
                    Toast.makeText(LoginActivity.this, (CharSequence) e, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    //        Utility Methods

    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

//    public void loginUser() {
//        // Retrieve email and password from EditText fields
//            String user = usernameEditText.getText().toString().trim();
//            String password = passwordEditText.getText().toString().trim();
//
//        // Validate input
//        if (user.isEmpty() || password.isEmpty()) {
//            showToast("Please enter email and password");
//            return;
//        }
//
//        // Perform the login process
//        if (databaseHelper.validateUser(user, password)) {
//            showToast("Login successful!");
//            // TODO: Add code to navigate to the next activity after successful login.
//            // Start the Signup activity
//            Intent intent = new Intent(LoginActivity.this, HomeDashboardActivity.class);
//            startActivity(intent);
//
//            // Close the main activity
//            finish();
//        } else {
//            showToast("Login failed. Invalid email or password.");
//        }
//    }

    //        Method to retrieve the data from the data base and compare the result
//    public boolean validateCurrentUser( String user, String password ) {
//        // TODO: Replace this implementation with SQLite database query to validate user
//        // For demonstration purposes, let's assume there's a user with email "test@example.com" and password "password".
//        String validEmail = "test@example.com";
//        String validPassword = "password";
//
//        return user.equals(validEmail) && password.equals(validPassword);
//    }





}