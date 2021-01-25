package com.example.nutrition_system.remote;




import com.example.nutrition_system.models.Charge;
import com.example.nutrition_system.models.Food;
import com.example.nutrition_system.models.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BaseApiService {

    @GET("food/")
    Call<Food> getFood();

    @GET("login/")
    Call<User> getUser();

    @GET("charge/")
    Call<Charge> getCharge();

}

