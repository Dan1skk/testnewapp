package com.example.testnewapp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(
        bottomBar = {
            CustomBottomBar({ navController.navigate(Routes.MainScreen.route) }, {
                navController.navigate(
                    Routes.SecondScreen.route
                )
            })
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