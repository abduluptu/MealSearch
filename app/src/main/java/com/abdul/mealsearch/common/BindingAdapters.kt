package com.abdul.mealsearch.common

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.abdul.mealsearch.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

//step22: create binding adapter to bind to the layout

@BindingAdapter("urlToImage")
fun urlToImage(view: ImageView, s: String?) {
    val options = RequestOptions.placeholderOf(R.drawable.loading).error(R.drawable.error)
    Glide.with(view).setDefaultRequestOptions(options).load(s ?: "").into(view)
}