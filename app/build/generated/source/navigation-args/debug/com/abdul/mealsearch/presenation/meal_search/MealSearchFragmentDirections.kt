package com.abdul.mealsearch.presenation.meal_search

import android.os.Bundle
import androidx.navigation.NavDirections
import com.abdul.mealsearch.R
import kotlin.Int
import kotlin.String

public class MealSearchFragmentDirections private constructor() {
  private data class ActionMealSearchFragmentToMealDetailsFragment(
    public val mealId: String = ""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_mealSearchFragment_to_mealDetailsFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("meal_id", this.mealId)
        return result
      }
  }

  public companion object {
    public fun actionMealSearchFragmentToMealDetailsFragment(mealId: String = ""): NavDirections =
        ActionMealSearchFragmentToMealDetailsFragment(mealId)
  }
}
