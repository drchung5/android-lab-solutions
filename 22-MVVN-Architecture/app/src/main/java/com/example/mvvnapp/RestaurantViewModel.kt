package com.example.mvvnapp

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.mvvnapp.data.Restaurant

class RestaurantViewModel : ViewModel() {

    var restaurantListState : MutableState<List<Restaurant>> = mutableStateOf(emptyList<Restaurant>())

    fun addRestaurant( restaurant :Restaurant ) {
        (restaurantListState.value + listOf<Restaurant>(restaurant)).also { restaurantListState.value = it }
    }

}