package com.abdul.mealsearch.presenation.meal_search

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abdul.mealsearch.databinding.ViewHolderSearchListBinding
import com.abdul.mealsearch.domain.model.Meal

//step21: adapter to display search meal in the list

class MealSearchAdapter : RecyclerView.Adapter<MealSearchAdapter.MyViewHolder>() {
    private var listener: ((Meal) -> Unit)? = null

    private var list = mutableListOf<Meal>()

    @SuppressLint("NotifyDataSetChanged")
    fun setContentList(list: MutableList<Meal>) {
        this.list = list
        notifyDataSetChanged()
    }


    class MyViewHolder(val viewHolder: ViewHolderSearchListBinding) :
        RecyclerView.ViewHolder(viewHolder.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val binding =
            ViewHolderSearchListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    // create a function for item click of meal
    fun itemClickListener(l: (Meal) -> Unit) {
        listener = l
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.viewHolder.meal = this.list[position]

        holder.viewHolder.root.setOnClickListener {
            listener?.let {
                it(this.list[position])
            }
        }

    }

    override fun getItemCount(): Int {
        return this.list.size
    }
}
