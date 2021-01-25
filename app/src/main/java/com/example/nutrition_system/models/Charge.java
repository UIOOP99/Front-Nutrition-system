package com.example.nutrition_system.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Charge {
    @Expose
    @SerializedName("charge")
    private int price;

    public Charge(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
