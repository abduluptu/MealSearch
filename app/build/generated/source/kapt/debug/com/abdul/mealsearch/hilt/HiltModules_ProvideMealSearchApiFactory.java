package com.abdul.mealsearch.hilt;

import com.abdul.mealsearch.data.remote.MealSearchApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata("javax.inject.Singleton")
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
public final class HiltModules_ProvideMealSearchApiFactory implements Factory<MealSearchApi> {
  @Override
  public MealSearchApi get() {
    return provideMealSearchApi();
  }

  public static HiltModules_ProvideMealSearchApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MealSearchApi provideMealSearchApi() {
    return Preconditions.checkNotNullFromProvides(HiltModules.INSTANCE.provideMealSearchApi());
  }

  private static final class InstanceHolder {
    private static final HiltModules_ProvideMealSearchApiFactory INSTANCE = new HiltModules_ProvideMealSearchApiFactory();
  }
}
