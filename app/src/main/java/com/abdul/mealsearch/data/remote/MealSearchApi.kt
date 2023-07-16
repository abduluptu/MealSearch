package com.abdul.mealsearch.data.remote

import com.abdul.mealsearch.data.model.MealsDTO
import retrofit2.http.GET
import retrofit2.http.Query

//step12: create api interface

interface MealSearchApi {

    //ful url for search:  https://www.themealdb.com/api/json/v1/1/search.php?s=chicken
    //where s is the query parameter

    @GET("api/json/v1/1/search.php")
    suspend fun getSearchMealList(@Query("s") query: String): MealsDTO


    //https://www.themealdb.com/api/json/v1/1/lookup.php?i=52772

    @GET("api/json/v1/1/lookup.php")
    suspend fun getMealDetails(@Query("i") i: String): MealsDTO
}