package com.abdul.mealsearch.hilt

import com.abdul.mealsearch.common.Constants
import com.abdul.mealsearch.data.remote.MealSearchApi
import com.abdul.mealsearch.data.repository.MealDetailsRepositoryImpl
import com.abdul.mealsearch.data.repository.MealSearchRepositoryImpl
import com.abdul.mealsearch.domain.repository.MealDetailsRepository
import com.abdul.mealsearch.domain.repository.MealSearchRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

//step13: create modules to provides dependency / object

@InstallIn(SingletonComponent::class)
@Module
object HiltModules {

    //step13.1: create modules

    @Provides
    @Singleton
    fun provideMealSearchApi(): MealSearchApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MealSearchApi::class.java)
    }

    //step13.1: provide MealSearchRepositoryImpl object
    @Provides
    fun provideMealSearchRepository(mealSearchApi: MealSearchApi): MealSearchRepository {
        return MealSearchRepositoryImpl(mealSearchApi)
    }

    //step13.2: provide MealDetailsRepositoryImpl object
    @Provides
    fun provideMealDetailsRepository(searchApi: MealSearchApi): MealDetailsRepository {
        return MealDetailsRepositoryImpl(searchApi)
    }
}

