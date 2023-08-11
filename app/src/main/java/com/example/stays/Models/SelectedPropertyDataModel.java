package com.example.stays.Models;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class SelectedPropertyDataModel {

    public static ArrayList<PropertyDataModel> getProperty(Integer itemPosition){

        ArrayList<PropertyDataModel> propertyRecord = new ArrayList<>();

        //        Sample other dataset
        propertyRecord.add(new PropertyDataModel("1961 Forest Road", "4.5", "20.00", "£230.00", "@drawable/cabin_1", "Cabin"));
        propertyRecord.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "15.55", "£143.00", "@drawable/cabin_2", "Cabin"));
        propertyRecord.add(new PropertyDataModel("01 Fjord Street",  "4.7", "1.8", "£213.00", "R.drawable.cabin_3.jpeg", "Cabin"));
        propertyRecord.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "5.3", "£99.00", "R.drawable.cabin_4.jpeg", "Cabin"));
        propertyRecord.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "3.5", "£160.00", "R.drawable.beach_1", "Beach"));
        propertyRecord.add(new PropertyDataModel("1099 Patong Beach","4.6", "12.8", "£89.00", "R.drawable.beach_2", "Beach"));
        propertyRecord.add(new PropertyDataModel("22 Paradise Island", "4.8", "4.2", "£150.00", "R.drawable.beach_3", "Beach"));
        propertyRecord.add(new PropertyDataModel("90 Hotel Zone", "4.3", "2.011", "£330.00", "R.drawable.beach_4", "Beach"));
        propertyRecord.add(new PropertyDataModel("78 Campground Road","3.5", "6.04", "£271.00", "R.drawable.camp_1", "Camp"));
        propertyRecord.add(new PropertyDataModel("600 Nature Trail","4.0", "8.00", "£140.00", "R.drawable.camp_2", "Camp"));
        propertyRecord.add(new PropertyDataModel("11 Beachside Camping", "4.2", "10.21", "£80.90", "R.drawable.camp_3", "Camp"));
        propertyRecord.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "7.0", "£251.55", "R.drawable.camp_4", "Camp"));
        propertyRecord.add(new PropertyDataModel("2333 La Rambla", "4.7", "3.0", "£221.00", "R.drawable.hotel_1", "Hotel"));
        propertyRecord.add(new PropertyDataModel("12 Champs-Élysées","4.9", "4.3", "£179.00", "R.drawable.hotel_2", "Hotel"));
        propertyRecord.add(new PropertyDataModel("64 Grand Canal", "4.5", "2.5", "£177.50", "R.drawable.hotel_3", "Hotel"));
        propertyRecord.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "18.34", "£211.66", "R.drawable.hotel_4", "Hotel"));


//        return propertyRecord;

        if (itemPosition >= 0 && itemPosition < propertyRecord.size()) {
            return propertyRecord.get(itemPosition);
        } else {
            // Handle invalid itemPosition here (out of bounds)
            return null; // You can return null or throw an exception, depending on your needs
        }

    }


}
