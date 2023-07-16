package com.abdul.mealsearch.presenation.meal_details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abdul.mealsearch.common.Resource
import com.abdul.mealsearch.domain.use_case.GetMealDetailsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

//step22.2:

@HiltViewModel
class MealDetailsViewModel @Inject constructor(private val mealDetailsUseCase: GetMealDetailsUseCase) :
    ViewModel() {

    private val _mealDetails = MutableStateFlow<MealDetailsState>(MealDetailsState())
    val mealDetails: MutableStateFlow<MealDetailsState> = _mealDetails

    fun getMealDetails(id: String) {
        mealDetailsUseCase(id).onEach { // mealDetailsUseCase(s) --> call as function
            when (it) {
                is Resource.Loading -> {
                    _mealDetails.value = MealDetailsState(isLoading = true)
                }

                is Resource.Error -> {
                    _mealDetails.value = MealDetailsState(error = it.message ?: "")
                }

                is Resource.Success -> {
                    _mealDetails.value = MealDetailsState(data = it.data?.get(0))
                }
            }
        }.launchIn(viewModelScope)
    }
}