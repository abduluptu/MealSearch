package com.abdul.mealsearch;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.abdul.mealsearch.databinding.FragmentMealDetailsBindingImpl;
import com.abdul.mealsearch.databinding.FragmentMealSearchBindingImpl;
import com.abdul.mealsearch.databinding.ViewHolderSearchListBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTMEALDETAILS = 1;

  private static final int LAYOUT_FRAGMENTMEALSEARCH = 2;

  private static final int LAYOUT_VIEWHOLDERSEARCHLIST = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abdul.mealsearch.R.layout.fragment_meal_details, LAYOUT_FRAGMENTMEALDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abdul.mealsearch.R.layout.fragment_meal_search, LAYOUT_FRAGMENTMEALSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.abdul.mealsearch.R.layout.view_holder_search_list, LAYOUT_VIEWHOLDERSEARCHLIST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTMEALDETAILS: {
          if ("layout/fragment_meal_details_0".equals(tag)) {
            return new FragmentMealDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_meal_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMEALSEARCH: {
          if ("layout/fragment_meal_search_0".equals(tag)) {
            return new FragmentMealSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_meal_search is invalid. Received: " + tag);
        }
        case  LAYOUT_VIEWHOLDERSEARCHLIST: {
          if ("layout/view_holder_search_list_0".equals(tag)) {
            return new ViewHolderSearchListBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for view_holder_search_list is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "meal");
      sKeys.put(2, "mealDetails");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/fragment_meal_details_0", com.abdul.mealsearch.R.layout.fragment_meal_details);
      sKeys.put("layout/fragment_meal_search_0", com.abdul.mealsearch.R.layout.fragment_meal_search);
      sKeys.put("layout/view_holder_search_list_0", com.abdul.mealsearch.R.layout.view_holder_search_list);
    }
  }
}
