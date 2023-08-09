package com.example.stays.Models;

import java.util.List;

public class PropertyModel {

    //        Set the column names
    private Integer prop_id;
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
    private Float star_rating;
    private Float rate_per_night;
    private Float mileage;
    private String image_uri;
    private String description;

//    Base constructor
    public PropertyModel() {
    }

//    Constructor for inserting a record in the database supplying all data fields


    public PropertyModel(String prop_code, String country, String location, String building_no, String address, String postcode, String rental_type, String child_friendly, String disability_friendly, Integer no_of_rooms, Integer no_of_bathrooms, Integer no_of_toilets, String property_type, Float star_rating, Float rate_per_night, Float mileage, String image_uri, String description) {
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
        this.image_uri = image_uri;
        this.description = description;
    }

    public PropertyModel(Integer prop_id, String building_no, String address, Float star_rating, Float rate_per_night, Float mileage, String image_uri) {
        this.prop_id = prop_id;
        this.building_no = building_no;
        this.address = address;
        this.star_rating = star_rating;
        this.rate_per_night = rate_per_night;
        this.mileage = mileage;
        this.image_uri = image_uri;
    }

    //    Getters and setters

    public Integer getProp_id() {
        return prop_id;
    }

    public void setProp_id(Integer prop_id) {
        this.prop_id = prop_id;
    }

    public String getProp_code() {
        return prop_code;
    }

    public void setProp_code(String prop_code) {
        this.prop_code = prop_code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public String getRental_type() {
        return rental_type;
    }

    public void setRental_type(String rental_type) {
        this.rental_type = rental_type;
    }

    public String getChild_friendly() {
        return child_friendly;
    }

    public void setChild_friendly(String child_friendly) {
        this.child_friendly = child_friendly;
    }

    public String getDisability_friendly() {
        return disability_friendly;
    }

    public void setDisability_friendly(String disability_friendly) {
        this.disability_friendly = disability_friendly;
    }

    public Integer getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(Integer no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public Integer getNo_of_bathrooms() {
        return no_of_bathrooms;
    }

    public void setNo_of_bathrooms(Integer no_of_bathrooms) {
        this.no_of_bathrooms = no_of_bathrooms;
    }

    public Integer getNo_of_toilets() {
        return no_of_toilets;
    }

    public void setNo_of_toilets(Integer no_of_toilets) {
        this.no_of_toilets = no_of_toilets;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public Float getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(Float star_rating) {
        this.star_rating = star_rating;
    }

    public Float getRate_per_night() {
        return rate_per_night;
    }

    public void setRate_per_night(Float rate_per_night) {
        this.rate_per_night = rate_per_night;
    }

    public Float getMileage() {
        return mileage;
    }

    public void setMileage(Float mileage) {
        this.mileage = mileage;
    }

    public String getImage_uri() {
        return image_uri;
    }

    public void setImage_uri(String image_uri) {
        this.image_uri = image_uri;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


//    To string method for displaying through the cursor

    @Override
    public String toString() {
        return "PropertyModel{" +
                "prop_id=" + prop_id +
                ", prop_code='" + prop_code + '\'' +
                ", country='" + country + '\'' +
                ", location='" + location + '\'' +
                ", building_no='" + building_no + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", rental_type='" + rental_type + '\'' +
                ", child_friendly='" + child_friendly + '\'' +
                ", disability_friendly='" + disability_friendly + '\'' +
                ", no_of_rooms=" + no_of_rooms +
                ", no_of_bathrooms=" + no_of_bathrooms +
                ", no_of_toilets=" + no_of_toilets +
                ", property_type='" + property_type + '\'' +
                ", star_rating=" + star_rating +
                ", rate_per_night=" + rate_per_night +
                ", mileage=" + mileage +
                ", image_uri='" + image_uri + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
