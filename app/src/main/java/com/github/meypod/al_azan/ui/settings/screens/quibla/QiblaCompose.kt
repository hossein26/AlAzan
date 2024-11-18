package com.github.meypod.al_azan.ui.settings.screens.quibla

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar

@Preview
@Composable
fun QiblaCompose(navController: NavController = rememberNavController()) {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            SampleTopAppBar(
                title = "Qibla By Compose",
                navController = navController
            )
        }
    ) {
        Box(modifier = Modifier.padding(it)) {

        }


    }
}


