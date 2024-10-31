package com.example.alazan.ui.settings

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R


@Composable
fun Settings(navController: NavController, modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            Box(
                modifier = modifier
                    .shadow(elevation = 1.dp)
                    .height(44.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = modifier.align(Alignment.Center),
                    text = "Settings",
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                IconButton(onClick = {

                }) {
                    Icon(
                        painter = painterResource(R.drawable.icon_back),
                        contentDescription = "back",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background)
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(24.dp)

        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("interface")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_interface_settings),
                    contentDescription = "Interface Settings",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Interface Settings",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("sound")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_sound_settings),
                    contentDescription = "Sound & Notifications",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Sound & Notifications",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("calculation")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_caculation_settings),
                    contentDescription = "Calculations",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Calculations",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("location")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_location_settings),
                    contentDescription = "Locations",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Locations",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("fix_problems")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_fix_settings),
                    contentDescription = "Fix Problems",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Fix Problems",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("widget_setting")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_widget_settings),
                    contentDescription = "Widget Settings",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Widget Settings",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))
            Row(
                modifier
                    .fillMaxWidth()
                    .clickable {
                        navController.navigate("backup")
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_backup_settings),
                    contentDescription = "Backup & Restore",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.width(8.dp))
                Text(
                    "Backup & Restore",
                    style = MaterialTheme.typography.bodyLarge.copy(
                        fontSize = 16.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier.padding(12.dp))

        }
    }

}