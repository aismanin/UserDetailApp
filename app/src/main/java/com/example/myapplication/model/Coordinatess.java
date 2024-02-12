package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Coordinatess {
    @SerializedName("lat")
    double lat;
    @SerializedName("lng")
    double lng;

    // Getters
    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
