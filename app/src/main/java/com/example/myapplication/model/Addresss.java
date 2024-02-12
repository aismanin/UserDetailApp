package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Addresss {
    @SerializedName("address")
    String address;
    @SerializedName("city")
    String city;
    @SerializedName("coordinates")
    Coordinatess coordinatess;
    @SerializedName("postalCode")
    String postalCode;
    @SerializedName("state")
    String state;

    // Getters
    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Coordinatess getCoordinates() {
        return coordinatess;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }
}