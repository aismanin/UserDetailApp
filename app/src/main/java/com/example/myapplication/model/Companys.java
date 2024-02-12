package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Companys {
    @SerializedName("address")
    Addresss addresss;
    @SerializedName("department")
    String department;
    @SerializedName("name")
    String name;
    @SerializedName("title")
    String title;

    // Getters
    public Addresss getAddress() {
        return addresss;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
