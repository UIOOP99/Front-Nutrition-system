package com.example.nutrition_system.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Food {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Expose
    @SerializedName("name")
    private int id;

    @Expose
    @SerializedName("name")
    private String name;

    @Expose
    @SerializedName("price")
    private int price;

    @Expose
    @SerializedName("meal")
    private String meal;

    @Expose
    @SerializedName("capacity")
    private int capacity;

    @Expose
    @SerializedName("reserve")
    private ArrayList<String> reserve ;

    public Food(String name, int price, String meal, int capacity, ArrayList<String> reserve) {
        this.name = name;
        this.price = price;
        this.meal = meal;
        this.capacity = capacity;
        this.reserve = reserve;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<String> getReserve() {
        return reserve;
    }

    public void setReserve(ArrayList<String> reserve) {
        this.reserve = reserve;
    }
}
