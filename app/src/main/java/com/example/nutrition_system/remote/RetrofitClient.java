package com.example.nutrition_system.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static String token = "eyJhbGciOiJFUzUxMiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MTE2NjAxMjcsInVzZXJfaWQiOjIsInVzZXJuYW1lIjoibmV3X3VzZXIiLCJyb2xlIjowLCJmaXJzdF9uYW1lIjoiIiwibGFzdF9uYW1lIjoiIiwiZW1haWwiOiIifQ.AGBtQUY1Zcz7Jb6yKdJppkHXP7g71vyV3xo7XbEJ9r471vaBqo7qdbnKrWbXs4qnq7eB0PLnGfUMhBjQoifm6Id6AC4IeVOfbw_VB8o4JceTYQmWuDDz_PJuQ2tLUqJgcyGFHrTEWLCv2bYEn4jh3EuP7AnRwK4i0JzOlWY_qX9Ueeai";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(100, TimeUnit.SECONDS)
                .callTimeout(100, TimeUnit.SECONDS)
                .writeTimeout(100, TimeUnit.SECONDS).readTimeout(100, TimeUnit.SECONDS)
                .addInterceptor(chain -> {
                    Request newRequest = chain.request().newBuilder()
                            .addHeader("Authorization", "Bearer " + token)
                            .build();
                    return chain.proceed(newRequest);
                }).build();
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
