package com.github.meypod.al_azan.general_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.runtime.mutableIntStateOf
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import kotlinx.coroutines.delay

@Preview
@Composable
fun LocationDialog(modifier: Modifier = Modifier, navController: NavController = rememberNavController()) {
    val countries = listOf(
        "Iran", "Iraq", "England"
    )
    val cities = listOf(
        "Tehran", "Arak", "Shahryar"
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Transparent),
        contentAlignment = Alignment.Center
    ){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.dialog_screen_padding))
                .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.dialog_border_radius)))
                .background(color = MaterialTheme.colorScheme.surfaceContainer)
                .padding(dimensionResource(R.dimen.dialog_content_padding))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
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
            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant, modifier = modifier.padding(
                    vertical =
                    dimensionResource(R.dimen.divider_vertical_padding)
                )
            )
            Text(
                stringResource(R.string.search_by_city),
                style = MaterialTheme.typography.titleSmall.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_small)))
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
                        modifier = modifier.padding(start = dimensionResource(R.dimen.spacer_small))
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    SampleBottomSheetMenu(
                        items = countries
                    ) { }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
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
                        modifier = modifier.padding(start = dimensionResource(R.dimen.spacer_small))
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    SampleBottomSheetMenu(
                        items = cities
                    ) { }
                }
            }
            HorizontalDivider(
                modifier.padding(vertical = dimensionResource(R.dimen.divider_vertical_padding)),
                color = MaterialTheme.colorScheme.outlineVariant
            )
            Text(
                stringResource(R.string.find_location),
                style = MaterialTheme.typography.titleSmall.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_medium)))
            Button(
                modifier = modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                onClick = {

                }
            ) {
                Row {
                    Icon(
                        modifier = modifier.size(dimensionResource(R.dimen.icon_size_button)),
                        painter = painterResource(R.drawable.ic_find_location),
                        contentDescription = stringResource(R.string.find_location),
                    )
                    Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                    Text(
                        stringResource(R.string.find_location),
                        style = MaterialTheme.typography.labelLarge.copy(
                        )
                    )
                }
            }
            HorizontalDivider(
                color = MaterialTheme.colorScheme.outlineVariant,
                modifier = modifier.padding(vertical = dimensionResource(R.dimen.divider_vertical_padding))
            )
            Text(
                stringResource(R.string.using_coordinates),
                style = MaterialTheme.typography.titleSmall.copy(
                    color = MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_small)))
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
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    Box(
                        modifier
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                            )
                            .height(dimensionResource(R.dimen.gps_text_height))
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
                        .padding(dimensionResource(R.dimen.spacer_small))
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
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    Box(
                        modifier
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                            .fillMaxWidth()
                            .height(dimensionResource(R.dimen.gps_text_height))
                            .border(
                                width = 1.dp,
                                color = MaterialTheme.colorScheme.outline,
                                shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text("0", color = MaterialTheme.colorScheme.primaryContainer)
                    }
                }
            }
            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))
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
                        modifier = modifier.size(dimensionResource(R.dimen.icon_size_button)),
                        painter = painterResource(R.drawable.ic_paste),
                        contentDescription = stringResource(R.string.paste),
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                    Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                    Text(stringResource(R.string.paste), style = MaterialTheme.typography.labelLarge)
                }
            }
        }
    }
}
@Composable
fun SkipSetupDialog(
    onSkip: () -> Unit,
    onCancel: () -> Unit,
) {
    var skipCount by remember { mutableIntStateOf(3) }
    var timerActive by remember { mutableStateOf(true) }
    LaunchedEffect(timerActive) {
        if (timerActive) {
            for (i in 3 downTo 1) {
                skipCount = i
                delay(1000L)
            }
            onSkip()
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
                Spacer(modifier = Modifier.width(dimensionResource(R.dimen.spacer_items)))
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
                    fontWeight = FontWeight.Medium,
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
        shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius))
    )
}