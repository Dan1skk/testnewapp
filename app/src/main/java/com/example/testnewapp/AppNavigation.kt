package com.example.testnewapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, Routes.MainScreen.route) {
        composable(Routes.MainScreen.route) {
            MainScreen(navController)
        }
        composable(Routes.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}
