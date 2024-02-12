package com.example.myapplication.model;

import java.util.List;


import com.google.gson.annotations.SerializedName;

public class UserListResponse {
    @SerializedName("users")
    List<Users> users;
    @SerializedName("total")
    int total;
    @SerializedName("skip")
    int skip;
    @SerializedName("limit")
    int limit;

    // Getters
    public List<Users> getUsers() {
        return users;
    }

    public int getTotal() {
        return total;
    }

    public int getSkip() {
        return skip;
    }

    public int getLimit() {
        return limit;
    }
}


