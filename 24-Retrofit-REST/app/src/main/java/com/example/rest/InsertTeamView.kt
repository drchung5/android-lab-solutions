package com.example.rest

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
fun InsertTeamView(teamViewModel : TeamViewModel) {

    ConstraintLayout {
        val (heading, name, city, submit ) = createRefs()
        var teamName by remember { mutableStateOf("") }
        var teamCity by remember { mutableStateOf("") }

        Text(
            "Add a Team",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .constrainAs(heading) {
                    top.linkTo(parent.top, 20.dp)
                    start.linkTo((parent.start))
                }
        )

        OutlinedTextField(
            value = teamName,
            onValueChange = {teamName = it},
            label = { Text("Team name") },
            modifier = Modifier
                .constrainAs(name) {
                    top.linkTo(heading.bottom, 10.dp)
                    start.linkTo(parent.start)
                }
                .width(250.dp)
        )
        OutlinedTextField(
            value = teamCity,
            onValueChange = {teamCity = it},
            label = { Text("Team city") },
            modifier = Modifier
                .constrainAs(city) {
                    top.linkTo(name.bottom, 10.dp)
                    start.linkTo(parent.start)
                }
                .width(250.dp)
        )

        Button(
            enabled = teamName != "" && teamCity != "",
            onClick = {
                teamViewModel.addTeam(Team(teamName,teamCity))
                teamName=""
                teamCity=""
            },
            modifier = Modifier
                .padding(4.dp)
                .constrainAs(submit) {
                    top.linkTo(name.top, 2.dp)
                    start.linkTo(city.end, 5.dp)
                    end.linkTo(parent.end)
                }
                .height(133.dp)
        ) {
            Text( "Submit" )
        }


    }

}