package com.example.nutrition_system.remote;




import com.example.nutrition_system.models.Charge;
import com.example.nutrition_system.models.Food;
import com.example.nutrition_system.models.User;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface BaseApiService {

    @GET("food/")
    Call<Food> getFood();

    @GET("login/")
    Call<User> getUser();

    @GET("charge/")
    Call<Charge> getCharge();
    @FormUrlEncoded
    @POST("/api/food-reserve/")
    Single<JsonArray> reserveFood(@Field("user_id")  String userId,
                                  @Field("date")    String date,
                                  @Field("food_id") String foodId);
    @FormUrlEncoded
    @POST("/api/charge/")
    Single<JsonObject> chargeWallet(@Field("charge") int charge);
    @GET("/api/user/")
    Single<JsonArray> loginRequest();
}

