package com.example.rest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rest.ui.theme.RESTTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val teamViewModel = TeamViewModel()
        setContent {
            RESTTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        TeamView(teamViewModel)
                        Spacer(
                            modifier = Modifier
                                .padding(top = 5.dp, bottom = 5.dp)
                                .background(Color.Blue)
                                .height(5.dp)
                                .fillMaxWidth())
                        InsertTeamView(teamViewModel)
                    }
                }
            }
        }
    }
}

