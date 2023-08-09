package com.example.stays.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stays.Models.Property;
import com.example.stays.Models.PropertyData;
import com.example.stays.PropertyDataAdapter;
import com.example.stays.R;

import java.util.ArrayList;


public class HomeMasterFragment extends Fragment {
    RecyclerView recyclerView;
//    PropertyRecyclerAdapter adapter;
//    DatabaseHelper databaseHelper;
//    List<Property> propertyList = new ArrayList<>();

    LinearLayoutManager layoutManager;
    ArrayList<Property> propertyArrayList;
    PropertyDataAdapter propertyAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_master, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.rvPropertyList);
        propertyArrayList = PropertyData.getList();

        layoutManager = new LinearLayoutManager(requireContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setHasFixedSize(true);

        propertyAdapter = new PropertyDataAdapter(requireContext(),propertyArrayList);

        recyclerView.setAdapter(propertyAdapter);

//        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
//        adapter = new PropertyRecyclerAdapter(propertyList);
//        recyclerView.setAdapter(adapter);
//
//        databaseHelper = new DatabaseHelper(requireContext());
//        fetchProperties();

        return view;
    }

//    private void fetchProperties() {
//        Cursor cursor = databaseHelper.getData();
//        if (cursor.getCount() == 0) {
//            Toast.makeText(requireContext(), "No Data Exists", Toast.LENGTH_SHORT).show();
//            return;
//        } else {
//            while (cursor.moveToNext()) {
//                Property property = new Property();
////                property.setBuilding_no(cursor.getString(0));
//                property.setAddress(cursor.getString(1));
//                property.setStar_rating(cursor.getString(2));
//                property.setMileage(cursor.getString(3));
//                property.setRate_per_night(cursor.getString(4));
//                property.setImage_uri(cursor.getString(5));
//                propertyList.add(property);
//            }
//            cursor.close();
//            adapter.notifyDataSetChanged(); // Notify the adapter about the changes in data
//        }
//    }
}
