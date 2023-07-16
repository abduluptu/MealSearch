package com.abdul.mealsearch.data.repository

import com.abdul.mealsearch.data.model.MealsDTO
import com.abdul.mealsearch.data.remote.MealSearchApi
import com.abdul.mealsearch.domain.repository.MealSearchRepository

//step16: implements MealSearchRepository interface to get meal b y search

class MealSearchRepositoryImpl(private val mealSearchApi: MealSearchApi) : MealSearchRepository {
    override suspend fun getMealSearch(s: String): MealsDTO {
        return mealSearchApi.getSearchMealList(s)
    }
}