package com.example.testnewapp.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testnewapp.second.SecondScreen
import com.example.testnewapp.main.MainScreen
import com.example.testnewapp.main.MainViewModel

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
