package com.example.stays.Models;

import android.content.Context;

public class UserModel {

//    Declare variables to hold the data
    private Integer user_id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String password;


//    Non parameterised constructor

    public UserModel() {
    }

//    Constructor to be used for retrieving login details


    public UserModel(String email) {
        this.email = email;
    }

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }



    //    Create the class constructor (to be used for inserting new records)
    public UserModel(String firstname, String lastname, String email, String mobile, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }

//    This constructor would be used for updates only

    public UserModel(String id, String firstname, String lastname, String email, String mobile, String password) {
        this.user_id = Integer.parseInt(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
    }


//    Create the getters and setters

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



//    Create the toString method to get all the data from the database

    @Override
    public String toString() {
        return "UserModel{" +
                "user_id='" + user_id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
