package com.example.testnewapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CustomBottomBar(
    clickRoute: () -> Unit,
    clickRouteSecond: () -> Unit,
    customBackColor: Color = Color.Transparent
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(customBackColor)
    ) {
        BottomAppBar(
            containerColor = Color.DarkGray,
            modifier = Modifier
                .clip(shape = RoundedCornerShape(16.dp))

        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Icon(
                    painterResource(R.drawable.lighiting),
                    contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = clickRoute)
                        .size(40.dp)
                )
                Icon(
                    painterResource(R.drawable.homeico), contentDescription = null,
                    modifier = Modifier
                        .clickable(onClick = clickRouteSecond)
                        .size(40.dp)
                )
            }
        }
    }
}