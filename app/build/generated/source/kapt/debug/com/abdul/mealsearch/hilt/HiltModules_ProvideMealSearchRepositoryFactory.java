package com.abdul.mealsearch.hilt;

import com.abdul.mealsearch.data.remote.MealSearchApi;
import com.abdul.mealsearch.domain.repository.MealSearchRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class HiltModules_ProvideMealSearchRepositoryFactory implements Factory<MealSearchRepository> {
  private final Provider<MealSearchApi> mealSearchApiProvider;

  public HiltModules_ProvideMealSearchRepositoryFactory(
      Provider<MealSearchApi> mealSearchApiProvider) {
    this.mealSearchApiProvider = mealSearchApiProvider;
  }

  @Override
  public MealSearchRepository get() {
    return provideMealSearchRepository(mealSearchApiProvider.get());
  }

  public static HiltModules_ProvideMealSearchRepositoryFactory create(
      Provider<MealSearchApi> mealSearchApiProvider) {
    return new HiltModules_ProvideMealSearchRepositoryFactory(mealSearchApiProvider);
  }

  public static MealSearchRepository provideMealSearchRepository(MealSearchApi mealSearchApi) {
    return Preconditions.checkNotNullFromProvides(HiltModules.INSTANCE.provideMealSearchRepository(mealSearchApi));
  }
}
