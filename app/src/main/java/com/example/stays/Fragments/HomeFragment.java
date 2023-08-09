package com.example.stays.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stays.CustomViewAdapter;
import com.example.stays.R;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    TabLayout tabLayout;

    ViewPager2 viewPager2;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


//        Bind the viewpager2 object to the class
        viewPager2 = view.findViewById(R.id.home_ViewPager);

//        Create an object of the CustomViewAdaptor
        CustomViewAdapter adapter = new CustomViewAdapter(getActivity().getSupportFragmentManager(),getLifecycle());
//        Set the adaptor to show the fragment
        viewPager2.setAdapter(adapter);
//        Bind the tab-layout object
        tabLayout = view.findViewById(R.id.tabHome);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
//                Set the current ViewPager2 object to the clicked on tab
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

//        Method to handle the swipe gestures
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {

                tabLayout.selectTab(tabLayout.getTabAt(position));

                super.onPageSelected(position);
            }
        });

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);


    }
}