package com.example.stays.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.stays.Models.PropertyDataModel;
import com.example.stays.R;

public class Property_DetailFragment extends Fragment {

    private PropertyDataModel selectedProperty;

    public Property_DetailFragment() {
        // Required empty public constructor
    }

    public static Property_DetailFragment newInstance(PropertyDataModel property) {
        Property_DetailFragment fragment = new Property_DetailFragment();
        Bundle args = new Bundle();
//        args.putParcelable("property", property);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedProperty = getArguments().getParcelable("property");
        }
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_property_detail, container, false);

        View view = inflater.inflate(R.layout.fragment_property_detail, container, false);

        ImageView imageView = view.findViewById(R.id.propertyImage);
        TextView addressText = view.findViewById(R.id.tvAddress);
        TextView ratingText = view.findViewById(R.id.tvRating);
        TextView mileageText = view.findViewById(R.id.tvMileage);
        TextView priceText = view.findViewById(R.id.tvPrice);

//        imageView.setImageResource(String.valueOf(selectedProperty.getImage_uri()));
        addressText.setText(selectedProperty.getAddress());
        ratingText.setText(String.valueOf(selectedProperty.getRating()));
        mileageText.setText(selectedProperty.getMileage() + " miles from city");
        priceText.setText(selectedProperty.getPrice());

        return view;
    }
}