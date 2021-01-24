package com.example.nutrition_system.remote;

public class UtilsApi {
    public static final String BASE_URL_API = "http://10.0.2.2:8000/";

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
