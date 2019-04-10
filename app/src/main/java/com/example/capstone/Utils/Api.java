package com.example.capstone.Utils;

import com.example.capstone.Models.Category;
import com.example.capstone.Models.CountryData;
import com.example.capstone.Models.LatestMeal;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    public String BASE_URL="https://www.themealdb.com/api/json/v1/1/";

    @GET("randomselection.php")
    Call<LatestMeal> getRandomMeal();

    @GET("lookup.php")
    Call<LatestMeal> getMealDetails(@Query("i") int mealId);

    @GET("filter.php")
    Call<CountryData> getCountry(@Query("a") String country);

    @GET("filter.php")
    Call<CountryData> getCategory(@Query("c") String category);

    @GET("categories.php")
    Call<ArrayList<Category>> getCategores();

    @GET("latest.php")
    Call<LatestMeal> getLatestMeal();
}
