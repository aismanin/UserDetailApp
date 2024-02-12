package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Cryptos {
    @SerializedName("coin")
    String coin;
    @SerializedName("wallet")
    String wallet;
    @SerializedName("network")
    String network;

    // Getters
    public String getCoin() {
        return coin;
    }

    public String getWallet() {
        return wallet;
    }

    public String getNetwork() {
        return network;
    }
}
