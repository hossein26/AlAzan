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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
            .background(color = MaterialTheme.colorScheme.surfaceContainer)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.information_slab_circle),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.onSurface
            )
            Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
            Text(
                text = stringResource(R.string.location_dialog_desc),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier
                    .fillMaxWidth(),
                lineHeight = 22.sp
            )

        }
        HorizontalDivider(color = MaterialTheme.colorScheme.onSurface)
        Spacer(modifier = modifier.padding(6.dp))
        Text(
            stringResource(R.string.search_by_city),
            style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            )
        )
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
                    stringResource(R.string.country),
                    style = MaterialTheme.typography.labelMedium.copy(
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
                    stringResource(R.string.city),
                    style = MaterialTheme.typography.labelMedium.copy(
                        color = MaterialTheme.colorScheme.onSurface
                    ),
                    modifier = modifier.padding(start = 6.dp)
                )
                Spacer(modifier = modifier.padding(2.dp))
                SimpleDropdownMenu(items = cities) { }
            }
        }
        HorizontalDivider(
            modifier.padding(vertical = 8.dp),
            color = MaterialTheme.colorScheme.outlineVariant
        )
        Text(
            stringResource(R.string.find_location),
            style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            )
        )
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
                    contentDescription = stringResource(R.string.find_location),
                )
                Spacer(modifier.padding(horizontal = 4.dp))
                Text(
                    stringResource(R.string.find_location),
                    style = MaterialTheme.typography.labelLarge.copy(
                    )
                )
            }
        }
        HorizontalDivider(
            modifier.padding(vertical = 8.dp),
            color = MaterialTheme.colorScheme.outlineVariant
        )
        Text(
            stringResource(R.string.using_coordinates),
            style = MaterialTheme.typography.titleSmall.copy(
                color = MaterialTheme.colorScheme.onSurface
            )
        )
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
                    stringResource(R.string.latitude),
                    style = MaterialTheme.typography.labelMedium.copy(
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
                    stringResource(R.string.longitude),
                    style = MaterialTheme.typography.labelMedium.copy(
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
                    contentDescription = stringResource(R.string.paste),
                    tint = MaterialTheme.colorScheme.onPrimary
                )
                Spacer(modifier.padding(horizontal = 4.dp))
                Text(stringResource(R.string.paste), style = MaterialTheme.typography.labelLarge)
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
                    imageVector = Icons.Default.Info,
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.primaryContainer
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(R.string.skip_dialog_warning_desc),
                    style = MaterialTheme.typography.bodyMedium.copy(
                        color = MaterialTheme.colorScheme.onSurface
                    )
                )
            }
        },
        text = {
            Text(
                text = stringResource(R.string.skip_dialog_warning),
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
                Text(text = stringResource(R.string.cancel))
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
                Text(text = stringResource(R.string.skip) + " ($skipCount) ")
            }
        },
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)),
        // backgroundColor = Color.White
    )
}


