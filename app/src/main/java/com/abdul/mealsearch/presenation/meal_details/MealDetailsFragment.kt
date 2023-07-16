package com.abdul.mealsearch.presenation.meal_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.coroutineScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.abdul.mealsearch.databinding.FragmentMealDetailsBinding
import dagger.hilt.android.AndroidEntryPoint

//step22: Display Meal details

@AndroidEntryPoint
class MealDetailsFragment : Fragment() {

    private var _binding: FragmentMealDetailsBinding? = null
    val binding: FragmentMealDetailsBinding
        get() = _binding!!

    private val viewModel: MealDetailsViewModel by viewModels()

    // to get all args by navigation in this Fragment
    private val args: MealDetailsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMealDetailsBinding.inflate(inflater, container, false)
        return _binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        args.mealId?.let {
            viewModel.getMealDetails(it)
        }

        lifecycle.coroutineScope.launchWhenCreated {
            viewModel.mealDetails.collect {
                if (it.isLoading) {
                }
                if (it.error.isNotBlank()) {
                    Toast.makeText(requireContext(), it.error, Toast.LENGTH_SHORT).show()
                }
                it.data?.let {
                    binding.mealDetails = it
                }
            }
        }


        binding.detailsBackArrow.setOnClickListener {
            findNavController().popBackStack()
        }


    }

}