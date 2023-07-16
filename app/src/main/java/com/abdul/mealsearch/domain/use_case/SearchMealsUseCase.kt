package com.abdul.mealsearch.domain.use_case

import com.abdul.mealsearch.common.Resource
import com.abdul.mealsearch.data.model.toDomainMeal
import com.abdul.mealsearch.domain.model.Meal
import com.abdul.mealsearch.domain.repository.MealSearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import java.lang.Exception
import javax.inject.Inject

//step19: create use case for search meal

class SearchMealsUseCase @Inject constructor(private val repository: MealSearchRepository) {

    // invoke is inbuilt function used with operator
    operator fun invoke(q: String): Flow<Resource<List<Meal>>> = flow {
        try {
            emit(Resource.Loading())
            val data = repository.getMealSearch(q) // data = response

            val domainData =
                if (data.meals != null) data.meals.map { it -> it.toDomainMeal() } else emptyList()
            emit(Resource.Success(data = domainData))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "An Unknown error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Check Connectivity"))
        } catch (e: Exception) {
        }
    }
}