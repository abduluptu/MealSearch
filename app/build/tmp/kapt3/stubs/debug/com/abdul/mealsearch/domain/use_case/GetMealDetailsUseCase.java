package com.abdul.mealsearch.domain.use_case;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/abdul/mealsearch/domain/use_case/GetMealDetailsUseCase;", "", "repository", "Lcom/abdul/mealsearch/domain/repository/MealDetailsRepository;", "(Lcom/abdul/mealsearch/domain/repository/MealDetailsRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/abdul/mealsearch/common/Resource;", "", "Lcom/abdul/mealsearch/domain/model/MealDetails;", "id", "", "app_debug"})
public final class GetMealDetailsUseCase {
    @org.jetbrains.annotations.NotNull
    private final com.abdul.mealsearch.domain.repository.MealDetailsRepository repository = null;
    
    @javax.inject.Inject
    public GetMealDetailsUseCase(@org.jetbrains.annotations.NotNull
    com.abdul.mealsearch.domain.repository.MealDetailsRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.abdul.mealsearch.common.Resource<java.util.List<com.abdul.mealsearch.domain.model.MealDetails>>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
}