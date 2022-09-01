package com.example.roomdatabase

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun InsertRestaurantView(restaurantViewModel :RestaurantViewModel) {

    ConstraintLayout {

        val (heading, name, cuisine, rating, submit ) = createRefs()

        var rName by remember { mutableStateOf("") }
        var rCuisine by remember { mutableStateOf("") }
        var rRating by remember { mutableStateOf("") }

        val textWidth = 0.70f
        val buttonWidth = 0.25f


        Text(
            "Add a Restaurant",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(heading) {
                    top.linkTo(parent.top, 20.dp)
                    start.linkTo((parent.start))
                }
        )

        OutlinedTextField(
            value = rName,
            onValueChange = {rName = it},
            label = { Text("Restaurant name") },
            modifier = Modifier
                .constrainAs(name) {
                    top.linkTo(heading.bottom, 10.dp)
                    start.linkTo(parent.start)
                }
                .fillMaxWidth(textWidth)
        )

        OutlinedTextField(
            value = rCuisine,
            onValueChange = {rCuisine = it},
            label = { Text("Cuisine") },
            modifier = Modifier
                .constrainAs(cuisine) {
                    top.linkTo(name.bottom, 10.dp)
                    start.linkTo(parent.start)
                }
                .fillMaxWidth(textWidth)
        )

        OutlinedTextField(
            value = rRating,
            onValueChange = {rRating = it},
            label = { Text("Rating (1-5)") },
            modifier = Modifier
                .constrainAs(rating) {
                    top.linkTo(cuisine.bottom, 10.dp)
                    start.linkTo(parent.start)
                }
                .fillMaxWidth(textWidth)
        )

        Button(
            enabled = rName != "" && rCuisine != "" && rRating != "",
            onClick = {

                restaurantViewModel.insertRestaurant(Restaurant(rName, rCuisine, rRating.toInt()))

                rName = ""
                rCuisine = ""
                rRating = ""

            },
            modifier = Modifier
                .padding(4.dp)
                .constrainAs(submit) {
                    top.linkTo(name.top, 2.dp)
                    start.linkTo(name.end, 5.dp)
                    end.linkTo(parent.end)
                }
                .height(207.dp)
                .fillMaxWidth(buttonWidth)
        ) {
            Text( "Submit" )
        }


    }

}