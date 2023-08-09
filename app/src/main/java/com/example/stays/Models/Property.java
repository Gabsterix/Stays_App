package com.example.stays.Models;

public class Property {

    private int prop_id;
    private String building_no;
    private String address;
    private String star_rating;
    private String rate_per_night;
    private String mileage;
    private String image_uri;

//    Constructors

    public Property() {
    }

//    public Property(int prop_id, String building_no, String address, String star_rating, String rate_per_night, String mileage, String image_uri) {
//        this.prop_id = prop_id;
//        this.building_no = building_no;
//        this.address = address;
//        this.star_rating = star_rating;
//        this.rate_per_night = rate_per_night;
//        this.mileage = mileage;
//        this.image_uri = image_uri;
//    }


    public Property(String address, String star_rating, String rate_per_night, String mileage, String image_uri) {
        this.address = address;
        this.star_rating = star_rating;
        this.rate_per_night = rate_per_night;
        this.mileage = mileage;
        this.image_uri = image_uri;
    }

    public Property(String building_no, String address, String star_rating, String rate_per_night, String mileage, String image_uri) {
        this.building_no = building_no;
        this.address = address;
        this.star_rating = star_rating;
        this.rate_per_night = rate_per_night;
        this.mileage = mileage;
        this.image_uri = image_uri;
    }

    //    Getters and setters

    public int getProp_id() {
        return prop_id;
    }

    public void setProp_id(int prop_id) {
        this.prop_id = prop_id;
    }

    public String getBuilding_no() {
        return building_no;
    }

    public void setBuilding_no(String building_no) {
        this.building_no = building_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(String star_rating) {
        this.star_rating = star_rating;
    }

    public String getRate_per_night() {
        return rate_per_night;
    }

    public void setRate_per_night(String rate_per_night) {
        this.rate_per_night = rate_per_night;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getImage_uri() {
        return image_uri;
    }

    public void setImage_uri(String image_uri) {
        this.image_uri = image_uri;
    }


//    Display method (toString)

    @Override
    public String toString() {
        return "Property{" +
                "address='" + address + '\'' +
                ", star_rating='" + star_rating + '\'' +
                ", rate_per_night='" + rate_per_night + '\'' +
                ", mileage='" + mileage + '\'' +
                ", image_uri='" + image_uri + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Property{" +
//                "building_no='" + building_no + '\'' +
//                ", address='" + address + '\'' +
//                ", star_rating='" + star_rating + '\'' +
//                ", rate_per_night='" + rate_per_night + '\'' +
//                ", mileage='" + mileage + '\'' +
//                ", image_uri='" + image_uri + '\'' +
//                '}';
//    }


//    @Override
//    public String toString() {
//        return "Property{" +
//                "prod_id=" + prop_id +
//                ", building_no='" + building_no + '\'' +
//                ", address='" + address + '\'' +
//                ", star_rating=" + star_rating +
//                ", rate_per_night=" + rate_per_night +
//                ", mileage=" + mileage +
//                ", image_uri='" + image_uri + '\'' +
//                '}';
//    }
}
