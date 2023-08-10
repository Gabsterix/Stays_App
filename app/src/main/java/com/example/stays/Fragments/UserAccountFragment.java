//package com.example.stays.Fragments;
//
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.fragment.app.Fragment;
//import androidx.fragment.app.FragmentManager;
//import androidx.fragment.app.FragmentTransaction;
//
//import com.example.stays.DatabaseHelper;
//import com.example.stays.Models.UserModel;
//import com.example.stays.R;
//
//
//
//public class UserAccountFragment extends Fragment {
//    TextView ID;
//    EditText Name, LastName, Email, Phone, Password;
//    Button saveChanges, BackToBtn;
//
//    Integer userId;
//    String newFirstName;
//    String newLastName;
//    String newEmail ;
//    String newPhone;
//    String newPassword ;
//
//    private String loggedInUserEmail;
//
//    @SuppressLint({"MissingInflateId", "MissingInflatedId"})
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        // Inflate the layout for this fragment
//        View view = inflater.inflate(R.layout.fragment_account_settings, container, false);
//
//        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
//        String email = sharedPreferences.getString("user_email", "");
//
//        //Check if email is not null or empty
//        if (email != null && !email.isEmpty()) {
//            // Initialize the databaseHelper
//            DatabaseHelper databaseHelper = new DatabaseHelper(requireContext());
////            UserModel user = databaseHelper.getUserByEmail(requireContext(), email);
//            UserModel user = databaseHelper.updateUserDetails(requireContext(), userId,  newFirstName, newLastName, newPhone, newEmail, newPassword);
//
//            //EditTexts
//            ID = view.findViewById(R.id.ID);
//            Name = view.findViewById(R.id.Name);
//            LastName = view.findViewById(R.id.LastName);
//            Email = view.findViewById(R.id.Email);
//            Phone = view.findViewById(R.id.Phone);
//            Password = view.findViewById(R.id.Password);
//
//            // Display user data in EditText fields
//            if (user != null) {
//                ID.setText(String.valueOf(user.getUser_id()));
//                Name.setText(user.getFirstname());
//                LastName.setText(user.getLastname());
//                Email.setText(user.getEmail());
//                Phone.setText(user.getMobile());
//                Password.setText(user.getPassword());
//            }
//
//            // Buttons
//            saveChanges = view.findViewById(R.id.Save_Changes);
//            BackToBtn = view.findViewById(R.id.BackToBtn);
//            // ... Rest of your code ...
//
//
//            // Retrieve user email from SharedPreferences
//            //loggedInUserEmail = sharedPreferences.getString("user_email", "");
//
//            saveChanges.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    // Get the updated values from the EditText fields
//                    newFirstName = Name.getText().toString();
//                    newLastName = LastName.getText().toString();
//                    newEmail = Email.getText().toString();
//                    newPhone = Phone.getText().toString();
//                    newPassword = Password.getText().toString();
//
//                    // Check if any of the fields are empty
//                    if (TextUtils.isEmpty(newFirstName) || TextUtils.isEmpty(newLastName) ||
//                            TextUtils.isEmpty(newEmail) || TextUtils.isEmpty(newPhone) ||
//                            TextUtils.isEmpty(newPassword)) {
//
//                        // Display a message to the user to fill in all fields
//                        Toast.makeText(requireContext(), "Please fill in all fields.", Toast.LENGTH_SHORT).show();
//                        return;
//                    }
//
//                    // Get the current user's ID from SharedPreferences
//                    userId = sharedPreferences.getInt("user_id", -1);
//
//                    // Update the user details in the database
////                    boolean isUpdated = databaseHelper.updateUserDetails(
////                            userId, // Pass the user ID
////                            newFirstName,
////                            newLastName,
////                            newPhone,
////                            newEmail,
////                            newPassword
////                    );
//
//                    boolean isUpdated = databaseHelper.updateUserDetails(
//                            userId, // Pass the user ID
//                            newFirstName,
//                            newLastName,
//                            newPhone,
//                            newEmail,
//                            newPassword
//                    );
//
//                    if (isUpdated) {
//                        // Display a success message
//                        Toast.makeText(requireContext(), "User details updated successfully!", Toast.LENGTH_SHORT).show();
//                    } else {
//                        // Display an error message
//                        Toast.makeText(requireContext(), "Failed to update user details.", Toast.LENGTH_SHORT).show();
//                    }
//
//                }
//            });
//
//            BackToBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    UserAccountFragment userAccountFragment = new UserAccountFragment();
//
//                    // Get the FragmentManager
//                    FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
//
//                    // Start a fragment transaction
//                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                    // Replace the current fragment with the new fragment
//                    fragmentTransaction.replace(R.id.frameLayoutHome, userAccountFragment);
//
//                    // Add the transaction to the back stack (optional)
//                    fragmentTransaction.addToBackStack(null);
//
//                    // Commit the transaction
//                    fragmentTransaction.commit();
//                }
//            });
//
//        }
//        return view;
//    }
//}
//
//
//
//
//
//
//
package com.example.stays.Fragments;

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
import com.example.stays.Models.UserModel;
import com.example.stays.R;

public class UserAccountFragment extends Fragment {
    TextView ID;
    EditText Name, LastName, Email, Phone, Password;
    Button saveChanges, BackToBtn;

    Integer userId;
    String newFirstName;
    String newLastName;
    String newEmail;
    String newPhone;
    String newPassword;

    private DatabaseHelper databaseHelper; // Declare the databaseHelper

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_account_settings, container, false);

        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("user_email", "");

        if (!TextUtils.isEmpty(email)) {
            databaseHelper = new DatabaseHelper(requireContext());

            UserModel user = databaseHelper.getUserByEmail(requireContext(),email);

            ID = view.findViewById(R.id.ID);
            Name = view.findViewById(R.id.Name);
            LastName = view.findViewById(R.id.LastName);
            Email = view.findViewById(R.id.Email);
            Phone = view.findViewById(R.id.Phone);
            Password = view.findViewById(R.id.Password);

            if (user != null) {
                ID.setText(String.valueOf(user.getUser_id()));
                Name.setText(user.getFirstname());
                LastName.setText(user.getLastname());
                Email.setText(user.getEmail());
                Phone.setText(user.getMobile());
                Password.setText(user.getPassword());
            }

            saveChanges = view.findViewById(R.id.Save_Changes);
            BackToBtn = view.findViewById(R.id.BackToBtn);

            saveChanges.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    newFirstName = Name.getText().toString();
                    newLastName = LastName.getText().toString();
                    newEmail = Email.getText().toString();
                    newPhone = Phone.getText().toString();
                    newPassword = Password.getText().toString();

                    if (TextUtils.isEmpty(newFirstName) || TextUtils.isEmpty(newLastName) ||
                            TextUtils.isEmpty(newEmail) || TextUtils.isEmpty(newPhone) ||
                            TextUtils.isEmpty(newPassword)) {
                        Toast.makeText(requireContext(), "Please fill in all fields.", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    userId = sharedPreferences.getInt("user_id", -1);

                    boolean isUpdated = databaseHelper.updateUserDetails(
                            userId,
                            newFirstName,
                            newLastName,
                            newPhone,
                            newEmail,
                            newPassword
                    );

                    if (isUpdated) {
                        Toast.makeText(requireContext(), "User details updated successfully!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(requireContext(), "Failed to update user details.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

            BackToBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // No need to create a new instance of UserAccountFragment
                    FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                    fragmentManager.popBackStack(); // Use popBackStack instead of replace

                    // You might want to add some additional handling here, such as updating UI
                }
            });

        }
        return view;
    }
}
