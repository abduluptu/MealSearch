package com.abdul.mealsearch.hilt;

import com.abdul.mealsearch.data.remote.MealSearchApi;
import com.abdul.mealsearch.domain.repository.MealDetailsRepository;
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
public final class HiltModules_ProvideMealDetailsRepositoryFactory implements Factory<MealDetailsRepository> {
  private final Provider<MealSearchApi> searchApiProvider;

  public HiltModules_ProvideMealDetailsRepositoryFactory(
      Provider<MealSearchApi> searchApiProvider) {
    this.searchApiProvider = searchApiProvider;
  }

  @Override
  public MealDetailsRepository get() {
    return provideMealDetailsRepository(searchApiProvider.get());
  }

  public static HiltModules_ProvideMealDetailsRepositoryFactory create(
      Provider<MealSearchApi> searchApiProvider) {
    return new HiltModules_ProvideMealDetailsRepositoryFactory(searchApiProvider);
  }

  public static MealDetailsRepository provideMealDetailsRepository(MealSearchApi searchApi) {
    return Preconditions.checkNotNullFromProvides(HiltModules.INSTANCE.provideMealDetailsRepository(searchApi));
  }
}
