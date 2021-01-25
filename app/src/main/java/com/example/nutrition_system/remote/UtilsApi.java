package com.example.nutrition_system.remote;

public class UtilsApi {
    public static final String BASE_URL_API = "http://127.0.0.1:8000/api/";

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }

    public static FoodService getFoodService(){
        return RetrofitClient.getClient(BASE_URL_API).create(FoodService.class);
    }

}
