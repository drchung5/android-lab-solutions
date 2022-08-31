package com.example.mvvnapp

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Slider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mvvnapp.data.Restaurant

@Composable
fun InsertRestaurantView(vm :RestaurantViewModel = viewModel()) {

    ConstraintLayout {

        val (heading, name, cuisine, rating, submit ) = createRefs()

        var rName by remember { mutableStateOf("") }
        var rCuisine by remember { mutableStateOf("") }
        var rRating by remember { mutableStateOf("") }

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
                .width(250.dp)
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
                .width(250.dp)
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
                .width(250.dp)
        )

        Button(
            enabled = rName != "" && rCuisine != "" && rRating != "",
            onClick = {

                vm.addRestaurant(Restaurant(rName, rCuisine, rRating.toInt()))

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
        ) {
            Text( "Submit" )
        }


    }

}