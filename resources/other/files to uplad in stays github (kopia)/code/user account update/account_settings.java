package com.example.stays.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.stays.DatabaseHelper;
import com.example.stays.R;
import com.example.stays.UserModel;


public class account_settings extends Fragment {
    TextView ID;
    EditText Name, LastName, Email, Phone, Password;
    Button saveChanges, BackToBtn;

    private String loggedInUserEmail;

    @SuppressLint({"MissingInflateId", "MissingInflatedId"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.account_settings, container, false);

        // Retrieve user email from SharedPreferences
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("user_email", "");
        loggedInUserEmail = sharedPreferences.getString("user_email", "");

        // Initialize the databaseHelper
        DatabaseHelper databaseHelper = new DatabaseHelper(requireContext());
        UserModel user = databaseHelper.getUserByEmail(requireContext(), email);

        // Buttons
        saveChanges = view.findViewById(R.id.Save_Changes);
        BackToBtn = view.findViewById(R.id.BackToBtn);

        //EditTexts
        ID = (TextView) view.findViewById(R.id.ID);
        Name = (EditText) view.findViewById(R.id.Name);
        LastName = (EditText) view.findViewById(R.id.LastName);
        Email = (EditText) view.findViewById(R.id.Email);
        Phone = (EditText) view.findViewById(R.id.Phone);
        Password = (EditText) view.findViewById(R.id.Password);

        // Display user data in EditText fields
        if (user != null) {
            ID.setText(String.valueOf(user.getUser_id()));
            Name.setText(user.getFirstname());
            LastName.setText(user.getLastname());
            Email.setText(user.getEmail());
            Phone.setText(user.getMobile());
            Password.setText(user.getPassword());
        }

        saveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the updated values from the EditText fields
                String newFirstName = Name.getText().toString();
                String newLastName = LastName.getText().toString();
                String newEmail = Email.getText().toString();
                String newPhone = Phone.getText().toString();
                String newPassword = Password.getText().toString();

                // Check if any of the fields are empty
                if (TextUtils.isEmpty(newFirstName) || TextUtils.isEmpty(newLastName) ||
                        TextUtils.isEmpty(newEmail) || TextUtils.isEmpty(newPhone) ||
                        TextUtils.isEmpty(newPassword)) {

                    // Display a message to the user to fill in all fields
                    Toast.makeText(requireContext(), "Please fill in all fields.", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Initialize the databaseHelper
                DatabaseHelper databaseHelper = new DatabaseHelper(requireContext());

                // Get the current user's ID from SharedPreferences
                SharedPreferences sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
                int userId = sharedPreferences.getInt("user_id", -1);

                // Update the user details in the database
                boolean isUpdated = databaseHelper.updateUserDetails(
                        userId, // Pass the user ID
                        newFirstName,
                        newLastName,
                        newPhone,
                        newEmail,
                        newPassword,
                        null // You can add the avatar URI if you have it here
                );

                if (isUpdated) {
                    // Display a success message
                    Toast.makeText(requireContext(), "User details updated successfully!", Toast.LENGTH_SHORT).show();
                } else {
                    // Display an error message
                    Toast.makeText(requireContext(), "Failed to update user details.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        BackToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserAccountFragment userAccountFragment = new UserAccountFragment();

                // Get the FragmentManager
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

                // Start a fragment transaction
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // Replace the current fragment with the new fragment
                fragmentTransaction.replace(R.id.frameLayoutHome, userAccountFragment);

                // Add the transaction to the back stack (optional)
                fragmentTransaction.addToBackStack(null);

                // Commit the transaction
                fragmentTransaction.commit();
            }
        });
        return view;
    }

}







