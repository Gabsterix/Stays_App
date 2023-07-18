package com.example.stays;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.stays.Fragments.BookmarkFragment;
import com.example.stays.Fragments.HomeFragment;
import com.example.stays.Fragments.NotificationsFragment;
import com.example.stays.Fragments.SearchFragment;
import com.example.stays.Fragments.ShoppingCartFragment;
import com.example.stays.Fragments.UserAccountFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class HomeDashboardActivity extends AppCompatActivity {

//    Declare an object of the frame layout class
//    FrameLayout frameLayoutHome;

//    Declare an object of the bottom navigation class
    BottomNavigationView bottomNavigationViewMain;

    //        Create an object of the home, search, notifications, bookmarks, user account, and initialise it
    HomeFragment objHomeFragment = new HomeFragment();

//    SearchFragment objSearchFragment = new SearchFragment();

    ShoppingCartFragment objBookingsFragment = new ShoppingCartFragment();

    NotificationsFragment objNotificationsFragment = new NotificationsFragment();

    BookmarkFragment objBookmarkFragment = new BookmarkFragment();

    UserAccountFragment objUserAccountFragment = new UserAccountFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dashboard);

//        Bind object variables declared to the views
//        frameLayoutHome = findViewById(R.id.frameLayoutHome);

        bottomNavigationViewMain = findViewById(R.id.bottomNav);

//        Show default fragment on page load
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
        fragmentTransaction.replace(R.id.frameLayoutHome,objHomeFragment);
//        Commit/Execute the transition
        fragmentTransaction.commit();

//        Onclick listener for handling menu item selected
        bottomNavigationViewMain.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                //                Declare a variable of integer datatype to store the number of the menu item selected
                int clickedMenuItem = item.getItemId();

//                    Check which item was selected and show appropriate fragment
                if(clickedMenuItem==R.id.mnu_Item_Home){
                    //        Show default fragment on page load
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
                    fragmentTransaction.replace(R.id.frameLayoutHome,objHomeFragment);
//        Commit/Execute the transition
                    fragmentTransaction.commit();

                }else if (clickedMenuItem==R.id.mnu_Item_Cart){
                    //        Show default fragment on page load
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
                    fragmentTransaction.replace(R.id.frameLayoutHome,objBookingsFragment);
//        Commit/Execute the transition
                    fragmentTransaction.commit();

                } else if (clickedMenuItem==R.id.mnu_Item_Notification) {

                    //        Show default fragment on page load
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
                    fragmentTransaction.replace(R.id.frameLayoutHome,objNotificationsFragment);
//        Commit/Execute the transition
                    fragmentTransaction.commit();


                } else if (clickedMenuItem==R.id.mnu_Item_Bookmark) {

                    //        Show default fragment on page load
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
                    fragmentTransaction.replace(R.id.frameLayoutHome,objBookmarkFragment);
//        Commit/Execute the transition
                    fragmentTransaction.commit();

                } else if (clickedMenuItem==R.id.mnu_Item_UserAccount) {

                    //        Show default fragment on page load
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

//        Replace the current fragment with the home fragment
                    fragmentTransaction.replace(R.id.frameLayoutHome,objUserAccountFragment);
//        Commit/Execute the transition
                    fragmentTransaction.commit();

                }

                return false;
            }
        });




    }
}