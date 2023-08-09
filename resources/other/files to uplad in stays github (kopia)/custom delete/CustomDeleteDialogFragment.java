package com.example.stays.Fragments;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.stays.DatabaseHelper;
import com.example.stays.OnBoardingActivity;
import com.example.stays.R;

public class CustomDeleteDialogFragment extends DialogFragment {

    ImageView IconImageView;
    Animation blink;

    public String loggedInUserEmail;

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext());
        dialog.setContentView(R.layout.custom_delete_view);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.border_layout);

        // Find YesBtn and NoBtn inside the dialog
        Button YesBtn = dialog.findViewById(R.id.YesBtn);
        Button NoBtn = dialog.findViewById(R.id.NoBtn);


        // Set click listener for YesBtn
        YesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deleteUserAccount(loggedInUserEmail);
                // Dismiss the dialog after the action is performed
                dismiss();
            }
        });

        // NoBtn
        NoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dismiss the dialog if NoBtn is clicked
                dismiss();
            }
        });
        IconImageView = dialog.findViewById(R.id.warning); // Replace 'yourIconImageView' with the ID of your icon ImageView
        blink = AnimationUtils.loadAnimation(requireContext(), R.anim.bounce); // Load the blink animation
        IconImageView.startAnimation(blink);

        return dialog;
    }



    // Add any additional methods or logic for your custom dialog here

   private void deleteUserAccount(String userEmail) {
        // Example method to delete the user account
        // You can put your actual implementation here
        //String userEmail = "user@example.com";
        DatabaseHelper databaseHelper = new DatabaseHelper(requireContext());
        boolean isDeleted = databaseHelper.deleteUserByEmail(userEmail);
        if (isDeleted) {
            Toast.makeText(requireContext(), "Account deleted successfully!", Toast.LENGTH_SHORT).show();
            // Navigate back to the main activity or any other desired activity
            Intent intent = new Intent(requireContext(), OnBoardingActivity.class);
            startActivity(intent);
            requireActivity().finish();
        } else {
            Toast.makeText(requireContext(), "Failed to delete account.", Toast.LENGTH_SHORT).show();
        }
    }

    public void setLoggedInUserEmail(String email) {
        loggedInUserEmail = email;
    }
}













