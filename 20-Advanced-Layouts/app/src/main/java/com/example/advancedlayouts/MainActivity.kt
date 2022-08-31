package com.example.advancedlayouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.advancedlayouts.ui.theme.AdvancedLayoutsTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdvancedLayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyScaffold()
                }
            }
        }
    }
}

@Composable
fun MyScaffold() {
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = {Text("Scaffold App")},
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_menu_24),
                        contentDescription = "Menu", modifier = Modifier.clickable {
                            scope.launch {
                                scaffoldState.drawerState.open()
                            }
                        }
                    )
                },
                backgroundColor = MaterialTheme.colors.primary)  },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }){
                Text("?")
            } },
        drawerContent = { Text(text = "drawerContent") },
        content = { MyLayout() },
        bottomBar = {
            BottomAppBar(backgroundColor = MaterialTheme.colors.primary,
            ) {
                Text("Copyright © 2022, Example.com",textAlign= TextAlign.Center,
                    modifier = Modifier.fillMaxWidth())
            } }
    )
}

@Composable
fun MyLayout() {
    var progress by remember { mutableStateOf<Float>(0f) }
    var increment by remember { mutableStateOf<Float>(0.1f) }

    val alphabet = arrayListOf("Alpha","Baker","Charlie","Delta")

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
