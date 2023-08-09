package com.example.stays.Models;

public class PropertyDataModel {

    private String address;
    private String rating;
    private String mileage;
    private String price;
    private String image_uri;

//    Constructor


    public PropertyDataModel() {
    }

    public PropertyDataModel(String address, String rating, String mileage, String price, String image_uri) {
        this.address = address;
        this.rating = rating;
        this.mileage = mileage;
        this.price = price;
        this.image_uri = image_uri;
    }

//    Getters and Setters

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImage_uri() {
        return image_uri;
    }

    public void setImage_uri(String image_uri) {
        this.image_uri = image_uri;
    }
}
