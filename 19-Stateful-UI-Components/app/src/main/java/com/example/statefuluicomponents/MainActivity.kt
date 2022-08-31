package com.example.statefuluicomponents

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.statefuluicomponents.ui.theme.StatefulUIComponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatefulUIComponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyLayout()
                }
            }
        }
    }
}

val alphabet = listOf("Alpha", "Baker", "Charlie", "Delta")

@Composable
fun MyLayout() {
    var progress by remember { mutableStateOf<Float>(0f) }
    var increment by remember { mutableStateOf<Float>(0.1f) }
    Column {
        Row( horizontalArrangement = Arrangement.Center ) {
            for (letter in alphabet) {
                Button(
                    onClick = {
                        progress = progress + increment
                        if( progress > 1f ) {
                            increment = -0.1f
                            progress = 1f
                        } else if ( progress < 0f ) {
                            increment = 0.1f
                            progress = 0f
                        }
                    },
                    modifier = Modifier
                        .padding(5.dp)
                        .width(85.dp)
                ) {
                    Text(text = letter, textAlign = TextAlign.Center)
                }
            }
        }
        CircularProgressIndicator(
            progress =progress,
            strokeWidth = 40.dp,
            color = Color.Red,
            modifier = Modifier.width(200.dp)
            )
    }

}

