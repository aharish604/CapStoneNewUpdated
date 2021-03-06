package com.example.capstone.Database;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.capstone.Models.MealInfo;

import java.util.List;

public class MealViewModel extends AndroidViewModel {

    private MealsRepository mealsRepository;
    private LiveData<List<MealInfo>> mlist;
    public MealViewModel(@NonNull Application application) {
        super(application);
        mealsRepository = new MealsRepository(application);
        mlist = mealsRepository.getmAllMeals();
    }

    public LiveData<List<MealInfo>> getMlist() {
        return mlist;
    }
    public void insert(MealInfo mealInfo){
        mealsRepository.insert(mealInfo);
    }
    public void delete(MealInfo mealInfo){
        mealsRepository.delete(mealInfo);
    }

    public boolean checkFav(String id){
        return mealsRepository.checkFav(id);
    }
}
