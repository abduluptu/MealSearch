package com.abdul.mealsearch.presenation.meal_details

import com.abdul.mealsearch.domain.model.MealDetails

//step22.3: to represent state of Details Meal Use case

data class MealDetailsState(
    val isLoading: Boolean = false,
    val data: MealDetails? = null,
    val error: String = ""
)
