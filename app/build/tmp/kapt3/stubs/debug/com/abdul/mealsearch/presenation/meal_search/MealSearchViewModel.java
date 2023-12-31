package com.abdul.mealsearch.presenation.meal_search;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/abdul/mealsearch/presenation/meal_search/MealSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchMealsUseCase", "Lcom/abdul/mealsearch/domain/use_case/SearchMealsUseCase;", "(Lcom/abdul/mealsearch/domain/use_case/SearchMealsUseCase;)V", "_mealSearchList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/abdul/mealsearch/presenation/meal_search/MealSearchState;", "mealSearchList", "Lkotlinx/coroutines/flow/StateFlow;", "getMealSearchList", "()Lkotlinx/coroutines/flow/StateFlow;", "getSearchMeal", "", "s", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MealSearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.abdul.mealsearch.domain.use_case.SearchMealsUseCase searchMealsUseCase;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.abdul.mealsearch.presenation.meal_search.MealSearchState> _mealSearchList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.abdul.mealsearch.presenation.meal_search.MealSearchState> mealSearchList = null;
    
    @javax.inject.Inject
    public MealSearchViewModel(@org.jetbrains.annotations.NotNull
    com.abdul.mealsearch.domain.use_case.SearchMealsUseCase searchMealsUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.abdul.mealsearch.presenation.meal_search.MealSearchState> getMealSearchList() {
        return null;
    }
    
    public final void getSearchMeal(@org.jetbrains.annotations.NotNull
    java.lang.String s) {
    }
}