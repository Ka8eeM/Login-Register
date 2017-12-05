package com.example.karim.login.Models;

/**
 * Created by Ka8eeM on 12/4/2017.
 */

public class User {
    private String name;
    private String password;
    private String address;

    public User() {
    }

    String getName() {
        return this.name;
    }

    String getPassword() {
        return this.password;
    }

    String getAddress() {
        return this.address;
    }

    void setName(String name) {
        this.name = name;
    }

    void setPassword(String password) {
        this.password = password;
    }

    void setAddress(String address) {
        this.address = address;
    }
}