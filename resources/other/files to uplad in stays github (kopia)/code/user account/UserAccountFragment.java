package com.example.stays.Fragments;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.stays.DatabaseHelper;
import com.example.stays.R;
import com.example.stays.UserModel;


public class UserAccountFragment extends Fragment {

    Button delete, Update;
    Dialog dialog;
    TextView ID, Name, LastName, Email, Phone, Password;

    private String loggedInUserEmail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user_account, container, false);

        // Retrieve user email from SharedPreferences
        SharedPreferences sharedPreferences = requireContext().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("user_email", "");
        loggedInUserEmail = sharedPreferences.getString("user_email", "");

        // Initialize the databaseHelper
        DatabaseHelper databaseHelper = new DatabaseHelper(requireContext());
        UserModel user = databaseHelper.getUserByEmail(requireContext(),email);


        //EditTexts
        ID = view.findViewById(R.id.ID);
        Name = view.findViewById(R.id.Name);
        LastName = view.findViewById(R.id.LastName);
        Email = view.findViewById(R.id.Email);
        Phone = view.findViewById(R.id.Phone);
        Password = view.findViewById(R.id.Password);

        // Display user data in EditText fields
        if (user != null) {
            ID.setText(String.valueOf(user.getUser_id()));
            Name.setText(user.getFirstname());
            LastName.setText(user.getLastname());
            Email.setText(user.getEmail());
            Phone.setText(user.getMobile());
            Password.setText(user.getPassword());
        }

        // Buttons
        Update = view.findViewById(R.id.Update);
        delete = view.findViewById(R.id.Delete);

        // Get Dialog
        dialog = new Dialog(requireContext());
        dialog.setContentView(R.layout.custom_delete_view);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.border_layout);

        // Prevent dismiss when clicking outside
        dialog.setCanceledOnTouchOutside(false);

        // Prevent dismiss when clicking outside by consuming touch events on the root view
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Consume the touch event, do not propagate it to the underlying views
                return true;
            }
        });

        //dialog buttons
        Button YesBtn = dialog.findViewById(R.id.YesBtn);
        Button NoBtn = dialog.findViewById(R.id.NoBtn);

        // Update button, go to update page
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                account_settings accountUpdateFragment = new account_settings();

                // Get the FragmentManager
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

                // Start a fragment transaction
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                // Replace the current fragment with the new fragment
                fragmentTransaction.replace(R.id.frameLayoutHome, accountUpdateFragment);

                // Add the transaction to the back stack (optional)
                fragmentTransaction.addToBackStack(null);

                // Commit the transaction
                fragmentTransaction.commit();
            }
        });

        // Delete Account, Display Popup Warning
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDeleteDialogFragment dialogFragment = new CustomDeleteDialogFragment();
                dialogFragment.setLoggedInUserEmail(loggedInUserEmail);
                dialogFragment.show(getChildFragmentManager(), "customDeleteDialog");
            }
        });
        return view;
    }






}
