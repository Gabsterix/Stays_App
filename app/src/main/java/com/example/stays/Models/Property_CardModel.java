package com.example.stays.Models;

import java.util.List;

public class Property_CardModel {

//    Set the columns
    private Integer prop_id;
    private String building_no;
    private String address;
    private String postcode;
    private String property_type;
    private String star_rating;
    private Float rate;
    private Float mileage;
    private List<String> property_image;
    private Integer prop_id_fk;

//    General Constructor
    public Property_CardModel() {
    }

//   Constructors for all data required for the card

    public Property_CardModel(Integer prop_id, String building_no, String address, String postcode, String property_type, String star_rating, Float rate, Float mileage, List<String> property_image, Integer prop_id_fk) {
        this.prop_id = prop_id;
        this.building_no = building_no;
        this.address = address;
        this.postcode = postcode;
        this.property_type = property_type;
        this.star_rating = star_rating;
        this.rate = rate;
        this.mileage = mileage;
        this.property_image = property_image;
        this.prop_id_fk = prop_id_fk;
    }




//    Getters and Setters


    public Integer getProp_id() {
        return prop_id;
    }

    public void setProp_id(Integer prop_id) {
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(String star_rating) {
        this.star_rating = star_rating;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public List<String> getProperty_image() {
        return property_image;
    }

    public void setProperty_image(List<String> property_image) {
        this.property_image = property_image;
    }

    public Integer getProp_id_fk() {
        return prop_id_fk;
    }

    public void setProp_id_fk(Integer prop_id_fk) {
        this.prop_id_fk = prop_id_fk;
    }

    //    Create the to string method

    @Override
    public String toString() {
        return "Property_CardModel{" +
                "prop_id=" + prop_id +
                ", building_no='" + building_no + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", property_type='" + property_type + '\'' +
                ", star_rating='" + star_rating + '\'' +
                ", rate=" + rate +
                ", mileage=" + mileage +
                ", property_image=" + property_image +
                ", prop_id_fk=" + prop_id_fk +
                '}';
    }
}
