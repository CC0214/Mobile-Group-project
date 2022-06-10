package com.example.StarMartApp.models;

import android.graphics.drawable.Drawable;

public class UserModel {
    String name;
    String email;
    String password;

    public UserModel() {

    }

    public UserModel(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {

        return email;
    }

    public String getPassword() {

        return password;
    }

    public Drawable getProfileImg() {

        return null;
    }
}
