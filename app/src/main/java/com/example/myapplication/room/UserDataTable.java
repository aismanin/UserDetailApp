package com.example.myapplication.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.myapplication.model.Addresss;
import com.example.myapplication.model.Banks;
import com.example.myapplication.model.Companys;
import com.example.myapplication.model.Cryptos;
import com.example.myapplication.model.Hairs;
import com.google.gson.annotations.SerializedName;

@Entity
public class UserDataTable {
    @SerializedName("ids")
    @PrimaryKey(autoGenerate = true)
    int ids;

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
    @SerializedName("domain")
    String domain;
    @SerializedName("ip")
    String ip;
    @SerializedName("macAddress")
    String macAddress;
    @SerializedName("university")
    String university;
    @SerializedName("ein")
    String ein;
    @SerializedName("ssn")
    String ssn;
    @SerializedName("userAgent")
    String userAgent;

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setEin(String ein) {
        this.ein = ein;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

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

    public String getDomain() {
        return domain;
    }

    public String getIp() {
        return ip;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getUniversity() {
        return university;
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
}