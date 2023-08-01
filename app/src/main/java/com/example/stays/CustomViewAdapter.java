package com.example.stays;

import android.telephony.PhoneNumberFormattingTextWatcher;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.stays.Fragments.BeachFragment;
import com.example.stays.Fragments.CabinFragment;
import com.example.stays.Fragments.CampingFragment;
import com.example.stays.Fragments.HomeMasterFragment;
import com.example.stays.Fragments.HotelFragment;

public class CustomViewAdapter extends FragmentStateAdapter {

    public CustomViewAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position){
            case 0:{
                HomeMasterFragment objHomeMasterFragment = new HomeMasterFragment();
                return objHomeMasterFragment;
            }
            case 1:{
                CabinFragment objCabinFragment = new CabinFragment();
                return objCabinFragment;
            }
            case 2:{
                BeachFragment objBeachFragment = new BeachFragment();
                return  objBeachFragment;
            }
            case 3:{
                CampingFragment objCampingFragment = new CampingFragment();
                return objCampingFragment;
            }
            case 4:{
                HotelFragment objHotelFragment = new HotelFragment();
                return objHotelFragment;
            }
            default:{
//                HomeMasterFragment objHomeMasterFragment = new HomeMasterFragment();
//                return objHomeMasterFragment;
                return new HomeMasterFragment();
            }
        }

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
