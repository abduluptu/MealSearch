package com.abdul.mealsearch.domain.repository

import com.abdul.mealsearch.data.model.MealsDTO

//step15: create MealDetailsRepository proto type / interface

interface MealDetailsRepository {
    suspend fun getMealDetails(id: String): MealsDTO
}