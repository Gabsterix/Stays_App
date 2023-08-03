package com.example.stays;

import java.util.List;

public class PropertyModel {

    //        Set the column names
    private String prop_id;
    private String prop_code;
    private String country;
    private String location;
    private String building_no;
    private String address;
    private String postcode;
    private String rental_type;
    private String child_friendly;
    private String disability_friendly;
    private Integer no_of_rooms;
    private Integer no_of_bathrooms;
    private Integer no_of_toilets;
    private String property_type;
    private Integer star_rating;
    private Float rate_per_night;
    private Float mileage;
    private List<String> image_urls;
    private String description;

//    Base constructor

    public PropertyModel() {
    }

//    Constructor to select all record
    public PropertyModel(String prop_code, String country, String location, String building_no, String address, String postcode, String rental_type, String child_friendly, String disability_friendly, Integer no_of_rooms, Integer no_of_bathrooms, Integer no_of_toilets, String property_type, Integer star_rating, Float rate_per_night, Float mileage, List<String> image_urls, String description) {
        this.prop_code = prop_code;
        this.country = country;
        this.location = location;
        this.building_no = building_no;
        this.address = address;
        this.postcode = postcode;
        this.rental_type = rental_type;
        this.child_friendly = child_friendly;
        this.disability_friendly = disability_friendly;
        this.no_of_rooms = no_of_rooms;
        this.no_of_bathrooms = no_of_bathrooms;
        this.no_of_toilets = no_of_toilets;
        this.property_type = property_type;
        this.star_rating = star_rating;
        this.rate_per_night = rate_per_night;
        this.mileage = mileage;
        this.image_urls = image_urls;
        this.description = description;
    }


//    Constructor to update the records


//    Getters and setters


}
