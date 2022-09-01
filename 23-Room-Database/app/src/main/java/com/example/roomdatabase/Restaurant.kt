package com.example.roomdatabase

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "restaurants")
data class Restaurant (
    @PrimaryKey @NonNull val name :String,
    val cuisine :String,
    val rating :Int
)