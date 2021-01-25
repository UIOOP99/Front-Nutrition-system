package com.example.nutrition_system.remote;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONObject;

import io.reactivex.Single;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BaseApiService {

    @GET("/api/user/")
    Single<JsonArray> loginRequest();

    @FormUrlEncoded
    @POST("/api/food-reserve/")
    Single<JsonArray> reserveFood(@Field("user_id")  String userId,
                                   @Field("date")    String date,
                                   @Field("food_id") String foodId);
    @FormUrlEncoded
    @POST("/api/charge/")
    Single<JsonObject> chargeWallet(@Field("charge") int charge);

}

