package com.example.capstone.Database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.capstone.Models.MealInfo;

import java.util.List;

@Dao
public interface MealDAO {
    @Query("SELECT * FROM meal_table")
    LiveData<List<MealInfo>> getAllFavs();

    @Query("SELECT * FROM meal_table WHERE idMeal = :id")
    public boolean isCheckFav(String id);

    @Insert
    public void addToFavs(MealInfo entity);

    @Delete
    public void delFromFav(MealInfo entity);
}
