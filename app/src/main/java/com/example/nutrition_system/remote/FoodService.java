package com.example.nutrition_system.remote;

import com.example.nutrition_system.models.Food;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FoodService {

    @GET("food/")
    Call<Food> getFood();
}
