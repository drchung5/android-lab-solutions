package com.example.layouts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layouts.ui.theme.LayoutsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LayoutsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    myLayout()
                }
            }
        }
    }
}

@Composable
fun myLayout() {
    Column(
        modifier = Modifier.background(Color.White)
    ) {
        Text("title",
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .border(1.dp, Color.Black)
                .fillMaxWidth()
                .padding(10.dp))
        Row() {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .border(1.dp, Color.Black)
                    .fillMaxSize()
                    .weight(0.3f)) {
                Text("menu",
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center)
            }
            Row( Modifier.weight(1f)) {
                Column(){
                    Text(
                        content,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .border(1.dp, Color.Black)
                            .fillMaxHeight()
                            .weight(1f)
                            .padding(10.dp))
                    Text("footer",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .border(1.dp, Color.Black)
                            .fillMaxWidth()
                            .padding(5.dp))
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LayoutsTheme {
        myLayout()
    }
}

val content = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut bibendum sed urna quis ornare. Proin imperdiet sem nisi, id blandit sapien varius nec. Pellentesque placerat vel arcu eget venenatis. Interdum et malesuada fames ac ante ipsum primis in faucibus. Vivamus vel auctor ipsum, sit amet porta dui. Vivamus orci arcu, fringilla et ligula facilisis, rhoncus aliquam nulla. Suspendisse in ante et odio scelerisque condimentum. Aenean elementum porta ex eget volutpat. Donec eget ornare odio. Donec id massa diam. Nullam molestie nunc non nunc accumsan ultricies at nec mi. Quisque ac vestibulum mi. Nam id dictum lacus. Maecenas molestie lorem eget luctus pulvinar. Nulla facilisi. Duis sit amet tortor venenatis, hendrerit metus et, viverra eros.\n" +
        "\n" +
        "Integer tincidunt nisl scelerisque, tempor massa vitae, maximus sem. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam erat volutpat. Sed vel mauris viverra nisi interdum accumsan non id nisl. Aenean efficitur ex quis consectetur rhoncus. Etiam congue diam et bibendum convallis. Fusce vitae faucibus orci, vel molestie elit.\n" +
        "\n" +
        "Pellentesque eu ex varius, finibus sapien nec, condimentum est. Proin molestie leo eget auctor tempor. Mauris id magna nisl. Vivamus efficitur gravida erat, ut pretium magna tincidunt et. Donec tincidunt, magna at ultricies aliquam, diam ex tristique tortor, sit amet imperdiet nisi quam at felis. Sed semper nunc ut tortor venenatis blandit. Maecenas lobortis volutpat laoreet. Sed mi lectus, gravida ac dolor vel, bibendum congue justo. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam vel odio sem. Aliquam at orci mauris. Proin laoreet sit amet ex eget sollicitudin. Sed placerat in orci et pretium. Morbi facilisis non leo a suscipit. In porttitor mauris eros, eget efficitur nibh tempus nec."