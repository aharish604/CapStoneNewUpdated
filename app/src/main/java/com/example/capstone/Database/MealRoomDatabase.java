package com.example.capstone.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.capstone.Models.MealInfo;

@Database(entities = {MealInfo.class},version = 1,exportSchema = false)
public abstract class MealRoomDatabase extends RoomDatabase {
    private static final String DATABASE = "meals_database";
    public abstract MealDAO mealDAO();

    private static volatile MealRoomDatabase INSTANCE;

    static MealRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MealRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MealRoomDatabase.class, DATABASE)
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;

    }
}