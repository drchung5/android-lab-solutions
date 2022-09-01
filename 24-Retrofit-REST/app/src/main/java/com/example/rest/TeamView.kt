package com.example.rest

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TeamView(teamViewModel: TeamViewModel) {

    LaunchedEffect(Unit, block = {
        teamViewModel.getTeams()
    })

    Column(
    ) {
        Text(
            "Teams",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 10.dp))

        for( team in teamViewModel.teamList ) {
            Text("""${team.name}: ${team.city}""")
            Log.d("***","""$team.name: $team.city""")
        }
    }
}