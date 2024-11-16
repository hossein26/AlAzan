package com.github.meypod.al_azan.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.unit.dp
import com.github.meypod.al_azan.R

@Composable
fun SmplDropdownMenu() {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf("English", "Persian", "France")
    var selectedItem by remember { mutableStateOf(items[0]) }

    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .requiredHeight(40.dp)
            .padding(horizontal = 48.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color.Transparent)
                .width(272.dp)
                .align(Alignment.Center)
                .clickable { expanded = !expanded }
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(8.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = selectedItem,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f),
                style = MaterialTheme.typography.labelLarge.copy(MaterialTheme.colorScheme.onPrimaryContainer)
            )
            Icon(
                tint = Color.White,
                painter = painterResource(
                    id = if (expanded) {
                        R.drawable.arrow_drop_up
                    } else {
                        R.drawable.arrow_drop_down
                    }
                ),
                contentDescription = "Drop down",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 2.dp, start = 2.dp),
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.primaryContainer)
                    .requiredWidth(width = 270.dp)
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                item,
                                style = MaterialTheme.typography.labelLarge.copy(MaterialTheme.colorScheme.onPrimaryContainer),
                                modifier = Modifier.background(color = MaterialTheme.colorScheme.primaryContainer)
                            )
                        },
                        onClick = {
                            selectedItem = item
                            expanded = false
                        }
                    )
                }
            }
        }
    }

}