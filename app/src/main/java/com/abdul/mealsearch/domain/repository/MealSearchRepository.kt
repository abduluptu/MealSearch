package com.abdul.mealsearch.domain.repository

import com.abdul.mealsearch.data.model.MealsDTO

//step14: create MealSearchRepository proto type / interface

interface MealSearchRepository {
    suspend fun getMealSearch(s:String): MealsDTO
}