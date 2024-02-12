package com.example.myapplication.model;

import com.google.gson.annotations.SerializedName;

public class Users {
    @SerializedName("id")
    int id;
    @SerializedName("firstName")
    String firstName;
    @SerializedName("lastName")
    String lastName;
    @SerializedName("maidenName")
    String maidenName;
    @SerializedName("age")
    int age;
    @SerializedName("gender")
    String gender;
    @SerializedName("email")
    String email;
    @SerializedName("phone")
    String phone;
    @SerializedName("username")
    String username;
    @SerializedName("password")
    String password;
    @SerializedName("birthDate")
    String birthDate;
    @SerializedName("image")
    String image;
    @SerializedName("bloodGroup")
    String bloodGroup;
    @SerializedName("height")
    int height;
    @SerializedName("weight")
    double weight;
    @SerializedName("eyeColor")
    String eyeColor;
    @SerializedName("hair")
    Hairs hairs;
    @SerializedName("domain")
    String domain;
    @SerializedName("ip")
    String ip;
    @SerializedName("address")
    Addresss addresss;
    @SerializedName("macAddress")
    String macAddress;
    @SerializedName("university")
    String university;
    @SerializedName("bank")
    Banks banks;
    @SerializedName("company")
    Companys companys;
    @SerializedName("ein")
    String ein;
    @SerializedName("ssn")
    String ssn;
    @SerializedName("userAgent")
    String userAgent;
    @SerializedName("crypto")
    Cryptos cryptos;


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMaidenName() {
        return maidenName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getImage() {
        return image;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public Hairs getHair() {
        return hairs;
    }

    public String getDomain() {
        return domain;
    }

    public String getIp() {
        return ip;
    }

    public Addresss getAddress() {
        return addresss;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getUniversity() {
        return university;
    }

    public Banks getBank() {
        return banks;
    }

    public Companys getCompany() {
        return companys;
    }

    public String getEin() {
        return ein;
    }

    public String getSsn() {
        return ssn;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public Cryptos getCrypto() {
        return cryptos;
    }
}
