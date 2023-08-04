package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.stays.Models.UserModel;

public class SignupActivity extends AppCompatActivity {

    private EditText firstNameEditText;
    private EditText lastNameEditText;
    private EditText emailEditText;
    private EditText mobileNumberEditText;
    private EditText passwordEditText;

    private EditText imagePathEditText;

    private DatabaseHelper databaseHelper;

//    Create an object variable for the text view
    TextView txtLogin;

    /* Create an object variable for the text view */
    Button btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize DatabaseHelper
        databaseHelper = new DatabaseHelper(this);

//        Set the table name variable
//        databaseHelper.TABLE_NAME = "user";

        // Find views by their IDs
        firstNameEditText = findViewById(R.id.etSignupFirstname);
        lastNameEditText = findViewById(R.id.etSignupLastname);
        emailEditText = findViewById(R.id.etSignupEmail);
        mobileNumberEditText = findViewById(R.id.etSignupMobile);
        passwordEditText = findViewById(R.id.etSignupPassword);
        imagePathEditText = findViewById(R.id.etImagePath);
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

                // Retrieve entered user details
                String firstName = firstNameEditText.getText().toString().trim();
                String lastName = lastNameEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();
                String mobileNumber = mobileNumberEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();
                String imagepath = imagePathEditText.getText().toString();


                // Validate input fields
                if (firstName.isEmpty()) {
                    firstNameEditText.setError("Please enter your first name");
                    firstNameEditText.requestFocus();
                    return;
                }

                if (lastName.isEmpty()) {
                    lastNameEditText.setError("Please enter your last name");
                    lastNameEditText.requestFocus();
                    return;
                }

                if (email.isEmpty()) {
                    emailEditText.setError("Please enter your email address");
                    emailEditText.requestFocus();
                    return;
                }

                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    emailEditText.setError("Please enter a valid email address");
                    emailEditText.requestFocus();
                    return;
                }

                if (mobileNumber.isEmpty()) {
                    mobileNumberEditText.setError("Please enter your mobile number");
                    mobileNumberEditText.requestFocus();
                    return;
                }

                if (password.isEmpty()) {
                    passwordEditText.setError("Please enter a password");
                    passwordEditText.requestFocus();
                    return;
                }


                // Insert user details into SQLite database

                try {
//                    Try to save the data into the sqlite database
                    UserModel userModel =new UserModel(firstName, lastName, email, mobileNumber, password, imagepath);
//                    Instantiate the database helper class
                    databaseHelper = new DatabaseHelper(SignupActivity.this);

                    boolean success = databaseHelper.addOneUser(userModel);

//                    Show a quick success message
                    Toast.makeText(SignupActivity.this, success + ": Signup was successful.", Toast.LENGTH_SHORT).show();
//                    Clear the fields of their values
                    clearEditTextFields();
                    // Start the Login activity
                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    // Execute the activity
                    startActivity(intent);
                    // Close the signup activity
                    finish();
                }catch (Exception e){
//                    Show an error message to the user to let them know the insert failed
                    Toast.makeText(SignupActivity.this, "Signup failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void clearEditTextFields(){

        firstNameEditText.setText("");
        lastNameEditText.setText("");
        emailEditText.setText("");
        mobileNumberEditText.setText("");
        passwordEditText.setText("");

    }
}