package com.example.capstone.Models;

import android.os.Parcel;

import java.util.List;

public class LatestMeal {
    private List<MealInfo> meals;

    public void setMeals(List<MealInfo> meals) {
        this.meals = meals;
    }

    public LatestMeal(List<MealInfo> meals) {
        this.meals = meals;
    }

    protected LatestMeal(Parcel in) {
    }

    public LatestMeal() {

    }


    public List<MealInfo> getMeals() {
        return meals;
    }

}

