package com.example.stays.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stays.Models.PropertyData;
import com.example.stays.Models.PropertyDataModel;
import com.example.stays.PropertyDataAdapter;
import com.example.stays.R;

import java.util.ArrayList;


public class HomeMasterFragment extends Fragment {
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    ArrayList<PropertyDataModel> propertyArrayList;
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

        return view;
    }

}
