package com.example.stays.Models;

import java.util.ArrayList;

public class PropertyDataModel extends ArrayList<PropertyDataModel> {

    private String address;
    private String rating;
    private String mileage;
    private String price;
    private String image_uri;
    private String property_type;

//    Constructor
    public PropertyDataModel() {
    }

//    2nd Constructor


    public PropertyDataModel(String address, String rating, String mileage, String price, String image_uri, String property_type) {
        this.address = address;
        this.rating = rating;
        this.mileage = mileage;
        this.price = price;
        this.image_uri = image_uri;
        this.property_type = property_type;
    }

//    Getters

    public String getAddress() {
        return address;
    }

    public String getRating() {
        return rating;
    }

    public String getMileage() {
        return mileage;
    }

    public String getPrice() {
        return price;
    }

    public String getImage_uri() {
        return image_uri;
    }

    public String getProperty_type() {
        return property_type;
    }
}
