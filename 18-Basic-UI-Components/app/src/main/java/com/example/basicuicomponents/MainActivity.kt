package com.example.basicuicomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Arrangement.Center
import androidx.compose.material.*
import androidx.compose.material.FabPosition.Companion.Center
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin.Companion.Center
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.text.PlaceholderVerticalAlign.Companion.Center
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextAlign.Companion.Center
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basicuicomponents.ui.theme.BasicUIComponentsTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicUIComponentsTheme {
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

    Row( horizontalArrangement = Arrangement.Center ) {
    for (letter in alphabet) {
        Button(
                onClick = {},
                modifier = Modifier
                    .padding(2.dp)
                    .width(85.dp)
            ) {
                Text(text = letter, textAlign = TextAlign.Center)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicUIComponentsTheme {
        MyLayout()
    }
}