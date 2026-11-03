package com.example.testnewapp.main

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.testnewapp.navigation.CustomBottomBar
import com.example.testnewapp.R
import com.example.testnewapp.navigation.Routes
import dev.chrisbanes.haze.hazeSource
import dev.chrisbanes.haze.rememberHazeState
import org.koin.compose.viewmodel.koinViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen(
    navController: NavController, vm: MainViewModel = koinViewModel()
) {

    val state by vm.state.collectAsState()
    val hazeState = rememberHazeState()


    Scaffold(
        bottomBar = {
            CustomBottomBar(
                clickRoute = { navController.navigate(Routes.MainScreen.route) },
                clickRouteSecond = { navController.navigate(Routes.SecondScreen.route) },
                hazeState = hazeState
            )
        }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .hazeSource(hazeState)
        ) {
            Row() {
                Column(
                    modifier = Modifier
                        .padding(start = 24.dp)
                ) {
                    OutlinedTextField(
                        value = state.textValue,
                        onValueChange = { vm.updateTextValue(it) }
                    )
                    Row() {
                        LazyColumn() {
                            items(20) {
                                Image(
                                    painter = painterResource(R.drawable.i),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .clickable(onClick = { navController.navigate(Routes.SecondScreen.route) })
                                        .padding(vertical = 8.dp),
                                )
                            }
                        }


                        Spacer(Modifier.size(24.dp))

                        LazyColumn(
                            contentPadding = PaddingValues(bottom = 86.dp)
                        ) {
                            items(100) { index ->
                                Text(
                                    text = stringResource(id = R.string.main_title, index),
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
