package com.github.meypod.al_azan.ui.settings.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleTopAppBar(title: String,icon: Int? = null,navController: NavController) {
    val fontScale = LocalConfiguration.current.fontScale
    val topBarHeight = if (fontScale >= 1.5f) 90.dp else 72.dp
    val iconSize = if (fontScale >= 1.5f) 24.dp else 18.dp
    AlAzanTheme {
        CenterAlignedTopAppBar(
            title = {
                Row(modifier = Modifier.fillMaxHeight(), verticalAlignment = Alignment.CenterVertically){
                    if (icon != null) {
                        Icon(
                            modifier = Modifier.size(dimensionResource(R.dimen.icon_medium)),
                            painter = painterResource(icon),
                            contentDescription = title,
                            tint = MaterialTheme.colorScheme.onSurface)
                        Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                    }
                    Text(
                        title, textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        maxLines = 1
                    )
                }

            },
            colors = centerAlignedTopAppBarColors(
                containerColor = MaterialTheme.colorScheme.surfaceContainer,
                actionIconContentColor = MaterialTheme.colorScheme.onSurface,
                navigationIconContentColor = MaterialTheme.colorScheme.onSurface,
                titleContentColor = MaterialTheme.colorScheme.onSurface,
                scrolledContainerColor = MaterialTheme.colorScheme.surfaceContainer,
            ),
            navigationIcon = {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.Center
                ){
                    IconButton(modifier = Modifier.fillMaxHeight(), onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(
                            modifier = Modifier.size(iconSize),
                            painter = painterResource(R.drawable.icon_back),
                            contentDescription = stringResource(R.string.back),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }

            },
            modifier = Modifier
                .wrapContentWidth()
                .height(topBarHeight)
                .shadow(elevation = dimensionResource(R.dimen.shadow_elevation_low)),
        )
    }

}