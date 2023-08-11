package com.example.stays.Models;

import java.util.ArrayList;

public class PropertyData {

    public static ArrayList<PropertyDataModel> getList(){

        ArrayList<PropertyDataModel> propertyList = new ArrayList<>();
//        propertyList.add(new PropertyDataModel("1961 Forest Road", "4.5", "12.05", "£203.00", "https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "15", "£193.00", "https://drive.google.com/file/d/1hT_m7nKMXLPxSjclCBJsi91ubWjNFs4t/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("01 Fjord Street",  "4.7", "13.90", "£130.00", "https://drive.google.com/file/d/1p60ZZXTHpTyB4UoKqCV7TpRqGyVWZGkR/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "1.08", "£90.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Cabin"));
//        propertyList.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "35.60", "£160.00", "https://drive.google.com/file/d/1bm2snorxQ4LxeR6UhZRC2yC0-URC5MmP/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("1099 Patong Beach","4.6", "2.8", "£108.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("22 Paradise Island", "4.8", "24.00", "£150.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("90 Hotel Zone", "4.3", "24.10", "£173.00", "https://drive.google.com/file/d/1tHdCLNacPmlCMjqvDipJOR5dZmP6aIvM/view?usp=drive_link", "Beach"));
//        propertyList.add(new PropertyDataModel("78 Campground Road","3.5", "6.9", "£270.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("600 Nature Trail","4.0", "8.00", "£140.00", "https://drive.google.com/file/d/1pmarhD_2-oj9nOzjF409JjXW9RppUKL7/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("11 Beachside Camping", "4.2", "17.05", "£80.90", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "7.56", "£351.00", "https://drive.google.com/file/d/16TOHITqB2jkFVAvfEvCnfIZKAnAN9EED/view?usp=drive_link", "Camp"));
//        propertyList.add(new PropertyDataModel("2333 La Rambla", "4.7", "3.77", "£220.00", "https://drive.google.com/file/d/1JTwmIRA9wTGZ0_qzJoX82KbqVagu8_6-/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("12 Champs-Élysées","4.9", "4.30", "£170.00", "https://drive.google.com/file/d/1Q-mjZU5ddzcU75gmbnKGMSPz0iK_3AuR/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("64 Grand Canal", "4.5", "2.5", "£75.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Hotel"));
//        propertyList.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "1.80", "£260.00", "https://drive.google.com/file/d/1QDk0SLOtiv6durBUa485BVg4e0G7I6yu/view?usp=drive_link", "Hotel"));
        
//        Sample other dataset
        propertyList.add(new PropertyDataModel("1961 Forest Road", "4.5", "20.00", "£230.00", "@drawable/cabin_1", "Cabin"));
        propertyList.add(new PropertyDataModel("233 Mountain View Drive", "4.8", "15.55", "£143.00", "@drawable/cabin_2", "Cabin"));
        propertyList.add(new PropertyDataModel("01 Fjord Street",  "4.7", "1.8", "£213.00", "R.drawable.cabin_3.jpeg", "Cabin"));
        propertyList.add(new PropertyDataModel("100 Alpine Avenue", "3.8", "5.3", "£99.00", "R.drawable.cabin_4.jpeg", "Cabin"));
        propertyList.add(new PropertyDataModel("33 Beach Villa Road",  "4.9", "3.5", "£160.00", "R.drawable.beach_1", "Beach"));
        propertyList.add(new PropertyDataModel("1099 Patong Beach","4.6", "12.8", "£89.00", "R.drawable.beach_2", "Beach"));
        propertyList.add(new PropertyDataModel("22 Paradise Island", "4.8", "4.2", "£150.00", "R.drawable.beach_3", "Beach"));
        propertyList.add(new PropertyDataModel("90 Hotel Zone", "4.3", "2.011", "£330.00", "R.drawable.beach_4", "Beach"));
        propertyList.add(new PropertyDataModel("78 Campground Road","3.5", "6.04", "£271.00", "R.drawable.camp_1", "Camp"));
        propertyList.add(new PropertyDataModel("600 Nature Trail","4.0", "8.00", "£140.00", "R.drawable.camp_2", "Camp"));
        propertyList.add(new PropertyDataModel("11 Beachside Camping", "4.2", "10.21", "£80.90", "R.drawable.camp_3", "Camp"));
        propertyList.add(new PropertyDataModel("44 Arctic Circle",  "3.8", "7.0", "£251.55", "R.drawable.camp_4", "Camp"));
        propertyList.add(new PropertyDataModel("2333 La Rambla", "4.7", "3.0", "£221.00", "R.drawable.hotel_1", "Hotel"));
        propertyList.add(new PropertyDataModel("12 Champs-Élysées","4.9", "4.3", "£179.00", "R.drawable.hotel_2", "Hotel"));
        propertyList.add(new PropertyDataModel("64 Grand Canal", "4.5", "2.5", "£177.50", "R.drawable.hotel_3", "Hotel"));
        propertyList.add(new PropertyDataModel("11101 Shibuya Drive, Mandelson Way",  "4.2", "18.34", "£211.66", "R.drawable.hotel_4", "Hotel"));


        return propertyList;


    }




}
