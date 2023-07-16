// Generated by data binding compiler. Do not edit!
package com.abdul.mealsearch.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.abdul.mealsearch.R;
import com.abdul.mealsearch.domain.model.Meal;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewHolderSearchListBinding extends ViewDataBinding {
  @NonNull
  public final ImageView viewHolderImage;

  @NonNull
  public final TextView viewHolderItemName;

  @Bindable
  protected Meal mMeal;

  protected ViewHolderSearchListBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView viewHolderImage, TextView viewHolderItemName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.viewHolderImage = viewHolderImage;
    this.viewHolderItemName = viewHolderItemName;
  }

  public abstract void setMeal(@Nullable Meal meal);

  @Nullable
  public Meal getMeal() {
    return mMeal;
  }

  @NonNull
  public static ViewHolderSearchListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_search_list, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderSearchListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewHolderSearchListBinding>inflateInternal(inflater, R.layout.view_holder_search_list, root, attachToRoot, component);
  }

  @NonNull
  public static ViewHolderSearchListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_holder_search_list, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewHolderSearchListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewHolderSearchListBinding>inflateInternal(inflater, R.layout.view_holder_search_list, null, false, component);
  }

  public static ViewHolderSearchListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ViewHolderSearchListBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewHolderSearchListBinding)bind(component, view, R.layout.view_holder_search_list);
  }
}
