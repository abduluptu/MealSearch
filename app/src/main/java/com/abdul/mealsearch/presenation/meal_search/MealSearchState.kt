package com.abdul.mealsearch.presenation.meal_search

import com.abdul.mealsearch.domain.model.Meal

//step22.1: to represent state of Search Meal Use case

data class MealSearchState(
    val isLoading: Boolean = false,
    val data: List<Meal>? = null,
    val error: String = ""
)
