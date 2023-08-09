package com.example.stays.Models;

public class CustomerReviewsModel {

    //        Set the column names
    private Integer review_id;
    private String description;
    private Double star_rating;
    private String customer_name;
    private Integer prop_id_fk;
    private String avatar_uri;

//    Generate constructor(s)


    public CustomerReviewsModel() {
    }

    public CustomerReviewsModel(String description, Double star_rating, String customer_name, Integer prop_id_fk, String avatar_uri) {
        this.description = description;
        this.star_rating = star_rating;
        this.customer_name = customer_name;
        this.prop_id_fk = prop_id_fk;
        this.avatar_uri = avatar_uri;
    }

    public CustomerReviewsModel(Integer review_id, String description, Double star_rating, String customer_name, Integer prop_id_fk, String avatar_uri) {
        this.review_id = review_id;
        this.description = description;
        this.star_rating = star_rating;
        this.customer_name = customer_name;
        this.prop_id_fk = prop_id_fk;
        this.avatar_uri = avatar_uri;
    }

//    Getters and Setters

    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getStar_rating() {
        return star_rating;
    }

    public void setStar_rating(Double star_rating) {
        this.star_rating = star_rating;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Integer getProp_id_fk() {
        return prop_id_fk;
    }

    public void setProp_id_fk(Integer prop_id_fk) {
        this.prop_id_fk = prop_id_fk;
    }

    public String getAvatar_uri() {
        return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
        this.avatar_uri = avatar_uri;
    }

//    Generate toString method

    @Override
    public String toString() {
        return "CustomerReviewsModel{" +
                "review_id=" + review_id +
                ", description='" + description + '\'' +
                ", star_rating=" + star_rating +
                ", customer_name='" + customer_name + '\'' +
                ", prop_id_fk=" + prop_id_fk +
                ", avatar_uri='" + avatar_uri + '\'' +
                '}';
    }

}
