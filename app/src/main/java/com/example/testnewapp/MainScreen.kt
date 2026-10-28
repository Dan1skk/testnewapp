package com.example.testnewapp

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Composable
fun MainScreen(
    navController: NavController
) {
    Scaffold(
        bottomBar = {
            CustomBottomBar({ navController.navigate(Routes.MainScreen.route) }, {
                navController.navigate(
                    Routes.SecondScreen.route
                )
            }, customBackColor = Color(0xFFFF4646))
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFFFF4646)),
            contentAlignment = Alignment.CenterEnd
        ) {
            var state by remember { mutableStateOf(UiState()) }

            Row() {
                Column() {
                    BasicTextField(
                        value = state.textValue,
                        onValueChange = { state.textValue = it },
                        modifier = Modifier
                            .background(Color.LightGray)
                            .padding(8.dp)
                    )

                    Image(
                        painter = painterResource(R.drawable.psjksks_sd),
                        contentDescription = null,
                        modifier = Modifier
                            .size(200.dp)
                            .clickable(onClick = { navController.navigate(Routes.SecondScreen.route) }),
                    )
                }

                Spacer(Modifier.size(40.dp))

                LazyColumn {
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