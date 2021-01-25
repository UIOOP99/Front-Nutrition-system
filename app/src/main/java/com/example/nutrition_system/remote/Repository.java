package com.example.nutrition_system.remote;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.nutrition_system.remote.BaseApiService;
import com.example.nutrition_system.remote.UtilsApi;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import org.json.JSONArray;
import org.json.JSONObject;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class Repository {

    BaseApiService apiService = UtilsApi.getAPIService();
    MutableLiveData<Boolean> allowed = new MutableLiveData<>();
    MutableLiveData<Boolean> reserve = new MutableLiveData<>();

    public MutableLiveData<Boolean> checkLogin(String username, String password) {
        apiService.loginRequest().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<JsonArray>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.d("json", "1" + "");

                    }

                    @Override
                    public void onSuccess(@NonNull JsonArray jsonArray) {
                        Log.d("json", "2" + "");
                        int i=0;
                        for ( i = 0; i < jsonArray.size(); i++) {
                            JsonElement js = jsonArray.get(i);
                            if (js.getAsJsonObject().getAsJsonPrimitive("name").getAsString().equals(username)) {
                                Log.d("json", js.getAsJsonObject().getAsJsonPrimitive("name").getAsString() + "");
                                allowed.postValue(Boolean.TRUE);
                                break;
                            }
                        }
                        if(i==jsonArray.size())
                         allowed.postValue(Boolean.FALSE);

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("json", e + "");
                    }
                });
        Log.d("all",allowed+"");
        return allowed;
    }

    public MutableLiveData<Boolean> reserveFood(String userId, String foodId, String date) {
        apiService.reserveFood(userId, date, foodId).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<JsonArray>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                    }

                    @Override
                    public void onSuccess(@NonNull JsonArray jsonObject) {
                        Log.d("json", jsonObject + "ok");
                        reserve.postValue(Boolean.TRUE);

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("e",e.getMessage());
                        reserve.postValue(Boolean.FALSE);

                    }
                });
        return reserve;
    }

    public MutableLiveData<Boolean>charge(int amount){
        apiService.chargeWallet( amount).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<JsonObject>() {

                    @Override
                    public void onSubscribe(@NonNull Disposable d) {
                        Log.d("ssa","saa");

                    }

                    @Override
                    public void onSuccess(@NonNull JsonObject jsonObject) {
                        Log.d("json", jsonObject + "ok");
                        reserve.postValue(Boolean.TRUE);

                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("e",e.getMessage());
                        reserve.postValue(Boolean.FALSE);
                    }
                });
        return reserve;
    }

}
