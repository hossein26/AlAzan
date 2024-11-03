package com.example.alazan.general_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
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
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun SimpleDropdownMenu(modifier: Modifier = Modifier,items: List<String>, onItemSelected: (String) -> Unit) {
    // State for managing the expanded state of the dropdown menu
    var expanded by remember { mutableStateOf(false) }
    // State for storing the selected item
    var selectedItem by remember { mutableStateOf(items.firstOrNull() ?: "") }
    // State for displaying a message after selection
    var savedMessage by remember { mutableStateOf("") }
    AlAzanTheme {
        // Dropdown menu UI
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(40.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                    .border(
                        width = 1.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(8.dp)
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = selectedItem,
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f),
                    style = MaterialTheme.typography.labelLarge.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
                Icon(
                    tint = MaterialTheme.colorScheme.onSurface,
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
                    modifier = Modifier.width(350.dp).border(BorderStroke(1.dp, MaterialTheme.colorScheme.outline)),
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                ) {
                    items.forEach { item ->
                        DropdownMenuItem(
                            text = {
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = item,
                                    style = MaterialTheme.typography.labelLarge.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    ),
                                    maxLines = 1,
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
}
