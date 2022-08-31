package com.example.mvvnapp

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RestaurantView(vm :RestaurantViewModel = viewModel()) {

    Column(
    ) {
        Text(
            "Restaurants",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 10.dp))

        for( restaurant in vm.restaurantListState.value ) {
            Text("""${restaurant.name}: ${restaurant.cuisine} ${restaurant.rating} stars""")
        }
    }

}