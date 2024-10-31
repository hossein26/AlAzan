package com.example.alazan.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import kotlinx.coroutines.delay

@Preview
@Composable
fun LocationDialog(modifier: Modifier = Modifier) {
    val countries = listOf(
        "Iran", "Iraq", "England"
    )
    val cities = listOf(
        "Tehran", "Arak", "Shahryar"
    )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = MaterialTheme.colorScheme.surfaceContainer)
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Icon(
                    modifier = modifier.padding(end = 8.dp),
                    painter = painterResource(R.drawable.information_slab_circle),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "You can add your location in 3 different ways. Choose one below:\n" +
                            "  • Search By City\n" +
                            "  • Find Use Location\n" +
                            "  • Using Coordinates",
                    color = MaterialTheme.colorScheme.onSurface,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier
                        .fillMaxWidth(),
                    lineHeight = 22.sp
                )

            }
            HorizontalDivider(color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier = modifier.padding(6.dp))
            Text("Search By City", style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            ))
            Spacer(modifier = modifier.padding(4.dp))
            Row(
                modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text(
                        "Country", style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        modifier = modifier.padding(start = 6.dp)
                    )
                    Spacer(modifier = modifier.padding(2.dp))
                    SimpleDropdownMenu(items = countries) { }
                }
                Spacer(modifier.padding(4.dp))
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f)
                ) {
                    Text(
                        "City", style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        modifier = modifier.padding(start = 6.dp)
                    )
                    Spacer(modifier = modifier.padding(2.dp))
                    SimpleDropdownMenu(items = cities) { }
                }
            }
            HorizontalDivider(modifier.padding(vertical = 8.dp), color =  MaterialTheme.colorScheme.outlineVariant)
            Text("Find Location", style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            ))
            Spacer(modifier.padding(4.dp))
            Button(
                modifier = modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                onClick = {}
            ) {
                Row {
                    Icon(
                        modifier = modifier.size(18.dp),
                        painter = painterResource(R.drawable.ic_find_location),
                        contentDescription = "",
                    )
                    Spacer(modifier.padding(horizontal = 4.dp))
                    Text("Find Location", style = MaterialTheme.typography.labelLarge.copy(
                    ))
                }
            }
            HorizontalDivider(modifier.padding(vertical = 8.dp), color = MaterialTheme.colorScheme.outlineVariant)
            Text("Using Coordinates", style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            ))
            Spacer(modifier = modifier.padding(6.dp))
            Row(
                modifier.fillMaxWidth(),
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Latitude", style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        modifier = modifier.padding(start = 6.dp)
                    )
                    Spacer(modifier = modifier.padding(2.dp))
                    Box(
                        modifier
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp)
                            )
                            .height(32.dp)
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("0", color = MaterialTheme.colorScheme.primaryContainer)
                    }
                }
                Text(
                    "_",
                    modifier
                        .align(Alignment.Bottom)
                        .padding(4.dp)
                )
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        "Longitude", style = MaterialTheme.typography.labelMedium.copy(
                            color = MaterialTheme.colorScheme.onSurface
                        ),
                        modifier = modifier.padding(start = 6.dp)
                    )
                    Spacer(modifier = modifier.padding(2.dp))
                    Box(
                        modifier
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                            .fillMaxWidth()
                            .height(32.dp)
                            .border(
                                width = 1.dp,
                                color = Color.Gray,
                                shape = RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("0", color = MaterialTheme.colorScheme.primaryContainer)
                    }
                }
            }
            Spacer(modifier = modifier.padding(8.dp))
            Button(
                modifier = modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                onClick = {}
            ) {
                Row {
                    Icon(
                        modifier = modifier.size(18.dp),
                        painter = painterResource(R.drawable.ic_paste),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                    Spacer(modifier.padding(horizontal = 4.dp))
                    Text("Paste", style = MaterialTheme.typography.labelLarge)
                }
            }
        }
    }




@Composable
fun SkipSetupDialog(
    onSkip: () -> Unit,
    onCancel: () -> Unit,
) {
    var skipCount by remember { mutableStateOf(3) }
    var timerActive by remember { mutableStateOf(true) }

    // Countdown logic
    LaunchedEffect(timerActive) {
        if (timerActive) {
            for (i in 3 downTo 1) {
                skipCount = i
                delay(1000L) // 1 second delay
            }
            onSkip() // Automatically trigger skip action after 3 seconds
        }
    }

    AlertDialog(
        onDismissRequest = onCancel,
        title = {
            Row {
                Icon(
                    imageVector = Icons.Default.Info, // Use an info icon
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primaryContainer // Customize icon color
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "The app might not work properly if you skip the setup!",
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
        },
        text = {
            Text(
                text = "Do you really want to skip?",
                style = MaterialTheme.typography.titleSmall.copy(
                    fontWeight = FontWeight(500),
                    color = MaterialTheme.colorScheme.onSurface
                ),
            )
        },

        confirmButton = {
            Button(
                onClick = {
                    onCancel()
                    timerActive = false
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    contentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            ) {
                Text(text = "Cancel")
            }

        },
        dismissButton = {
            Button(
                onClick = {
                    onSkip()
                    timerActive = false
                },
                colors = ButtonDefaults.buttonColors(
                    disabledContentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    containerColor = Color.Transparent,
                    contentColor = MaterialTheme.colorScheme.error
                ),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                shape = RoundedCornerShape(50)
            ) {
                Text(text = "skip ($skipCount)")
            }
        },
        shape = RoundedCornerShape(16.dp),
        // backgroundColor = Color.White
    )
}


