package com.example.capstone.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class Client {
    public static Retrofit getClient(){

        return new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

