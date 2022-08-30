package com.example.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.Home
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyNavHost()
                }
            }
        }
    }
}


@Composable
fun MyNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "page1"
) {
    Column() {
        NavHost(
            modifier = Modifier,
            navController = navController,
            startDestination = startDestination
        ) {
            composable("page1") {
                PageOne()
            }
            composable("page2") {
                PageTwo()
            }
        }
        Row( Modifier.fillMaxWidth().background(Color.LightGray)) {
            Button(
                onClick = { navController.navigate("page1") },
                modifier = Modifier.padding(5.dp).width(85.dp)
            ) {
                Text( "Page 1", textAlign = TextAlign.Center)
            }
            Button(
                onClick = { navController.navigate("page2") },
                modifier = Modifier.padding(5.dp).width(85.dp)
            ) {
                Text( "Page 2", textAlign = TextAlign.Center)
            }
        }
    }
}

@Composable
fun PageOne() {
    Box(modifier = Modifier
        .height(200.dp)
        .fillMaxWidth()
        .background(Color.Red)
    ) {
        Text(
            text = "Page One",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
fun PageTwo() {
    Box(modifier = Modifier
        .height(200.dp)
        .fillMaxWidth()
        .background(Color.Blue)
    ) {
        Text(
            text = "Page Two",
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}
