package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Hairs {
    @SerializedName("color")
    String color;
    @SerializedName("type")
    String type;

    // Getters
    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
