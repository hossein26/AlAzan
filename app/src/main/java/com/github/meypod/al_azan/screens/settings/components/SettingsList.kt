package com.github.meypod.al_azan.screens.settings.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.github.meypod.al_azan.R

@Composable
fun SettingsList(navController: NavController, settingItems: List<SettingItem>){
    LazyColumn(
        modifier = Modifier
    ) {
        items(settingItems) { item ->
            Row(
                modifier = Modifier
                    .clickable { navController.navigate(item.route) }
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.item_content_padding)), // Adjust vertical padding for spacing
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(item.icon),
                    contentDescription = item.label,
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = item.label,
                    style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_items))) // Add spacing between rows
        }
    }
}
data class SettingItem(val icon: Int, val label: String, val route: String)
