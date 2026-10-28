package com.example.testnewapp

sealed class Routes(val route: String) {
    object MainScreen : Routes("MainScreen")
    object SecondScreen : Routes("SecondScreen")
}
