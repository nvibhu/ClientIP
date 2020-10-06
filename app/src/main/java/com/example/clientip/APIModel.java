package com.example.clientip;
import com.google.gson.annotations.SerializedName;

public class APIModel {
    @SerializedName("city")
    String city;

    @SerializedName("region")
    String region;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
