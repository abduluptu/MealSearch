package com.abdul.mealsearch.presenation.meal_search;

import com.abdul.mealsearch.domain.use_case.SearchMealsUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MealSearchViewModel_Factory implements Factory<MealSearchViewModel> {
  private final Provider<SearchMealsUseCase> searchMealsUseCaseProvider;

  public MealSearchViewModel_Factory(Provider<SearchMealsUseCase> searchMealsUseCaseProvider) {
    this.searchMealsUseCaseProvider = searchMealsUseCaseProvider;
  }

  @Override
  public MealSearchViewModel get() {
    return newInstance(searchMealsUseCaseProvider.get());
  }

  public static MealSearchViewModel_Factory create(
      Provider<SearchMealsUseCase> searchMealsUseCaseProvider) {
    return new MealSearchViewModel_Factory(searchMealsUseCaseProvider);
  }

  public static MealSearchViewModel newInstance(SearchMealsUseCase searchMealsUseCase) {
    return new MealSearchViewModel(searchMealsUseCase);
  }
}
