package com.example.roomdatabase

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class RestaurantViewModel(application: Application) : ViewModel() {

    val allRestaurants: LiveData<List<Restaurant>>
    private val repository: RestaurantRepository

    init {
        val restaurantDb = RestaurantDatabase.getInstance(application)
        val restaurantDao = restaurantDb.restaurantDao()
        repository = RestaurantRepository(restaurantDao)

        allRestaurants = repository.allRestaurants
    }

    fun insertRestaurant(restaurant: Restaurant) {
        repository.insertRestaurant(restaurant)
    }


}