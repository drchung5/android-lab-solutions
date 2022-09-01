package com.example.roomdatabase;

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun RestaurantView(restaurantViewModel: RestaurantViewModel) {

      val allRestaurants by restaurantViewModel.allRestaurants.observeAsState(listOf())

      Column(
      ) {

            Text(
                  "Restaurants",
                  fontSize = 20.sp,
                  fontWeight = FontWeight.Bold,
                  modifier = Modifier.padding(bottom = 10.dp)
            )

            for( restaurant in allRestaurants ) {
                  Text(
                        """${restaurant.name}: ${restaurant.cuisine} ${restaurant.rating} stars""",
                        modifier = Modifier
                              .padding(top=2.dp, bottom = 2.dp)
                              .border(1.dp, Color.LightGray)
                              .background(Color(255,255,240))
                              .fillMaxWidth()
                              .padding(10.dp)
                  )
            }
      }

}
