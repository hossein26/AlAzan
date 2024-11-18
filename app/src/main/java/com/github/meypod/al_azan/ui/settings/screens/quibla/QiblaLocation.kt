package com.github.meypod.al_azan.ui.settings.screens.quibla

import android.content.Context
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import org.osmdroid.config.Configuration
import org.osmdroid.views.MapView
import org.osmdroid.views.overlay.Marker

@Preview
@Composable
fun QiblaLocation(navController: NavController = rememberNavController()) {
    Scaffold(
        topBar = {
            SampleTopAppBar(
                title = "Qibla By Location",
                navController = navController
            )
        }
    ) {
        Box(
            modifier = Modifier.padding(it)
        ){
            OpenStreetMapView(context = LocalContext.current)
        }
    }
}

@Composable
fun OpenStreetMapView(context: Context) {

    Configuration.getInstance()
        .load(context, context.getSharedPreferences("osmdroid", Context.MODE_PRIVATE))

    AndroidView(
        factory = { ctx ->
            val mapView = MapView(ctx)
            mapView.apply {
                setMultiTouchControls(true) // Enables pinch to zoom
                controller.setZoom(15.0) // Initial zoom level
                controller.setCenter(
                    org.osmdroid.util.GeoPoint(
                        37.7749,
                        -122.4194
                    )
                ) // Set to desired location
            }
            val marker = Marker(mapView).apply {
                position = org.osmdroid.util.GeoPoint(37.7749, -122.4194) // Example marker at SF
                setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM)
                title = "San Francisco"
            }
            mapView.overlays.add(marker)
            mapView
        },
        modifier = Modifier.fillMaxSize()
    )
}