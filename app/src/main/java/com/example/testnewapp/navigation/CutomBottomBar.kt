package com.example.testnewapp.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.WineBar
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testnewapp.R
import dev.chrisbanes.haze.HazeInput
import dev.chrisbanes.haze.HazeState
import dev.chrisbanes.haze.glass.GlassStyle
import dev.chrisbanes.haze.glass.hazeGlass
import dev.chrisbanes.haze.glass.material3.material3

@Composable
fun CustomBottomBar(
    clickRoute: () -> Unit,
    clickRouteSecond: () -> Unit,
    hazeState: HazeState,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(bottom = 8.dp),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .wrapContentWidth()
                .clip(shape = RoundedCornerShape(36.dp))
                .hazeGlass(
                    input = HazeInput.Backdrop(hazeState),
                    style = GlassStyle.regular.material3()
                )
                .padding(horizontal = 24.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(32.dp)

        ) {
            Icon(
                Icons.Default.Person,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = null,
                modifier = Modifier
                    .clickable(onClick = clickRoute)
                    .size(36.dp)
            )
            Icon(
                Icons.Default.Home,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = null,
                modifier = Modifier
                    .clickable(onClick = clickRouteSecond)
                    .size(36.dp)
            )
            Icon(
                Icons.Default.Menu,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
            )
            Icon(
                Icons.Default.WineBar,
                tint = MaterialTheme.colorScheme.onSurface,
                contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
            )
        }
    }
}