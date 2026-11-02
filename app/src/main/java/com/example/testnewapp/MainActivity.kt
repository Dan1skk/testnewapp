package com.example.testnewapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.testnewapp.navigation.AppNavigation
import com.example.testnewapp.ui.theme.TestnewappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestnewappTheme {
                AppNavigation()
            }
        }
    }
}

