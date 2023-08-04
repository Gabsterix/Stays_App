package com.example.stays.Models;

public class UserModel {

//    Declare variables to hold the data
    private Integer user_id;
    private String firstname;
    private String lastname;
    private String email;
    private String mobile;
    private String password;
    private String imagePath="https://drive.google.com/file/d/1KCZyhsxMATy76quSiSvKtLuFwfVWjbkA/view?usp=drive_link";

//    Non parameterised constructor

    public UserModel() {
    }

//    Constructor to be used for retrieving login details
    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    //    Create the class constructor (to be used for inserting new records)
    public UserModel(String firstname, String lastname, String email, String mobile, String password, String imagePath) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.imagePath = imagePath;
    }

//    This constructor would be used for updates only

    public UserModel(Integer user_id, String firstname, String lastname, String email, String mobile, String password, String imagePath) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.mobile = mobile;
        this.password = password;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
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
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
