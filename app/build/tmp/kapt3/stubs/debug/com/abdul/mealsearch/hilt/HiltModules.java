package com.abdul.mealsearch.hilt;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/abdul/mealsearch/hilt/HiltModules;", "", "()V", "provideMealDetailsRepository", "Lcom/abdul/mealsearch/domain/repository/MealDetailsRepository;", "searchApi", "Lcom/abdul/mealsearch/data/remote/MealSearchApi;", "provideMealSearchApi", "provideMealSearchRepository", "Lcom/abdul/mealsearch/domain/repository/MealSearchRepository;", "mealSearchApi", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class HiltModules {
    @org.jetbrains.annotations.NotNull
    public static final com.abdul.mealsearch.hilt.HiltModules INSTANCE = null;
    
    private HiltModules() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.abdul.mealsearch.data.remote.MealSearchApi provideMealSearchApi() {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.abdul.mealsearch.domain.repository.MealSearchRepository provideMealSearchRepository(@org.jetbrains.annotations.NotNull
    com.abdul.mealsearch.data.remote.MealSearchApi mealSearchApi) {
        return null;
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.abdul.mealsearch.domain.repository.MealDetailsRepository provideMealDetailsRepository(@org.jetbrains.annotations.NotNull
    com.abdul.mealsearch.data.remote.MealSearchApi searchApi) {
        return null;
    }
}