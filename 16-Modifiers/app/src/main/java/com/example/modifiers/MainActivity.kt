package com.example.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifiersTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    myComposableFunction()
                }
            }
        }
    }
}

@Composable
fun myComposableFunction() {
    Text(text = "Albert Einstein",
        color = Color.Red,
        fontSize = 25.sp,
        fontWeight =
        FontWeight.Bold,
        fontStyle =
        FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
        modifier = Modifier
            .background(Color.White)
            .padding(10.dp)
            .border(
                5.dp,
                Brush.horizontalGradient(
                    0f to Color.Red,
                    1000f to Color.Blue
                ),
                RoundedCornerShape(5.dp)
            )
            .padding(15.dp)
            .size(140.dp,30.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ModifiersTheme {
        myComposableFunction()
    }
}