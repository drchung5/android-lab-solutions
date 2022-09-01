package com.example.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [(Restaurant::class)], version = 1)
abstract class RestaurantDatabase: RoomDatabase() {
    abstract fun restaurantDao(): RestaurantDao

    companion object {

        fun getInstance(context: Context): RestaurantDatabase {
            synchronized(this) {

                context.deleteDatabase("restaurants")

                val restaurantDB = Room.databaseBuilder(
                    context.applicationContext,
                    RestaurantDatabase::class.java,
                    "restaurants")
                    .build()

                return restaurantDB

            }
        }
    }
}