package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RestaurantRepository(private val restaurantDao: RestaurantDao) {
    val allRestaurants: LiveData<List<Restaurant>> = restaurantDao.getAllRestaurants()
    private val coroutineScope = CoroutineScope(Dispatchers.Main)

    fun insertRestaurant(restaurant: Restaurant) {
        coroutineScope.launch(Dispatchers.IO) {
            restaurantDao.insertRestaurant(restaurant)
        }
    }
}