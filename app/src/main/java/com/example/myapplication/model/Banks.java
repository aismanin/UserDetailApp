package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Banks {
    @SerializedName("cardExpire")
    String cardExpire;
    @SerializedName("cardNumber")
    String cardNumber;
    @SerializedName("cardType")
    String cardType;
    @SerializedName("currency")
    String currency;
    @SerializedName("iban")
    String iban;

    // Getters
    public String getCardExpire() {
        return cardExpire;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCurrency() {
        return currency;
    }

    public String getIban() {
        return iban;
    }
}
