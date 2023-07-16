package com.abdul.mealsearch.presenation.meal_search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdul.mealsearch.common.Resource
import com.abdul.mealsearch.domain.use_case.SearchMealsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

//step22: get data from SearchMealsUseCase and pass to the ui

@HiltViewModel
class MealSearchViewModel @Inject constructor(private var searchMealsUseCase: SearchMealsUseCase) :
    ViewModel() {

    private val _mealSearchList = MutableStateFlow<MealSearchState>(MealSearchState())
    val mealSearchList: StateFlow<MealSearchState> = _mealSearchList

    fun getSearchMeal(s: String) {
        searchMealsUseCase(s).onEach { // searchMealsUseCase(s) --> call as function
            when (it) {
                is Resource.Loading -> {
                    _mealSearchList.value = MealSearchState(isLoading = true)
                }

                is Resource.Success -> {
                    _mealSearchList.value = MealSearchState(data = it.data)
                }

                is Resource.Error -> {
                    _mealSearchList.value = MealSearchState(error = it.message ?: "")
                }
            }
        }.launchIn(viewModelScope)
    }
}