package com.abdul.mealsearch.data.repository

import com.abdul.mealsearch.data.model.MealsDTO
import com.abdul.mealsearch.data.remote.MealSearchApi
import com.abdul.mealsearch.domain.repository.MealDetailsRepository

//step17: implements MealDetailsRepository interface to get meal details

class MealDetailsRepositoryImpl(private val mealSearchApi: MealSearchApi) : MealDetailsRepository {

    override suspend fun getMealDetails(id: String): MealsDTO {
        return mealSearchApi.getMealDetails(id)
    }
}