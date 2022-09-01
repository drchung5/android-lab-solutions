package com.example.roomdatabase

import android.app.Application
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.roomdatabase.ui.theme.RoomDatabaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RoomDatabaseTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {

                        val owner = LocalViewModelStoreOwner.current

                        owner?.let {
                            val restaurantViewModel: RestaurantViewModel = viewModel(
                                it,
                                "RestaurantViewModel",
                                RestaurantViewModelFactory(
                                    LocalContext.current.applicationContext
                                            as Application
                                )
                            )

                            RestaurantView(restaurantViewModel)
                            Spacer(
                                modifier = Modifier
                                    .padding(top = 5.dp, bottom = 5.dp)
                                    .background(Color.Blue)
                                    .height(5.dp)
                                    .fillMaxWidth()
                            )
                            InsertRestaurantView(restaurantViewModel)
                        }
                    }
                }
            }
        }
    }
}

class RestaurantViewModelFactory(val application: Application) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return RestaurantViewModel(application) as T
    }
}