package com.example.testnewapp.second

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.testnewapp.navigation.CustomBottomBar
import com.example.testnewapp.navigation.Routes
import dev.chrisbanes.haze.rememberHazeState

@Composable
fun SecondScreen(navController: NavController) {

    val hazeState = rememberHazeState()

    Scaffold(
        bottomBar = {
            CustomBottomBar(
                { navController.navigate(Routes.MainScreen.route) },
                {
                    navController.navigate(
                        Routes.SecondScreen.route
                    )
                },
                hazeState = hazeState
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        )
        {
            Text("Hello")
        }
    }
}