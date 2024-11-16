package com.github.meypod.al_azan.ui.settings.screens.locations

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.components.LocationDialog
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun LocationList(
    modifier: Modifier = Modifier,
    navController: NavController = rememberNavController(),
) {
    var showLocationDialog by remember { mutableStateOf(false) }
    var showLocationListDialog by remember { mutableStateOf(false) }
    AlAzanTheme {
        if (showLocationDialog) {
            Dialog(
                onDismissRequest = { showLocationDialog = false },
                properties = DialogProperties(
                    usePlatformDefaultWidth = false,
                )
            ) {
                LocationDialog()
            }
        }
        if (showLocationListDialog) {
            BasicAlertDialog(
                onDismissRequest = { showLocationListDialog = false },

                ) {
                LocationListDialog()
            }
        }
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.locations),
                    navController = navController,
                    icon = R.drawable.ic_location
                )
            }
        ) {
            Box(
                modifier
                    .padding(it)
                    .fillMaxSize()
            ) {
                Column(
                    modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(dimensionResource(R.dimen.item_content_padding))

                ) {
                    Box(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Row {
                            Icon(
                                modifier = Modifier
                                    .size(dimensionResource(R.dimen.icon_info_size)),
                                painter = painterResource(R.drawable.ic_info_gray),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface,
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                            Text(
                                text = "We need your location to calculate Azan for you." +
                                        "Just hit the “Add New Location” button below to add your location." +
                                        "\nYou can add multiple locations",
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }


                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Column(
                        modifier.padding(dimensionResource(R.dimen.padding_extra_medium))
                    ) {
                        Text(
                            text = "Locations List",
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))

                        Card(
                            modifier = Modifier
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
                            elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.shadow_elevation_medium)),
                            shape = RoundedCornerShape(0.dp)
                        ) {

                            Row(
                                modifier
                                    .fillMaxWidth()
                                    .padding(dimensionResource(R.dimen.card_content_padding)),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_dots),
                                        contentDescription = stringResource(R.string.move),
                                        tint = MaterialTheme.colorScheme.onSurface,
                                        modifier = Modifier
                                            .size(dimensionResource(R.dimen.icon_medium))
                                    )
                                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_small)))
                                    Column {
                                        Text(
                                            text = "Iran, Shahriyar",
                                            fontSize = 16.sp,
                                            style = MaterialTheme.typography.bodyLarge,
                                            color = MaterialTheme.colorScheme.onSurface
                                        )
                                        Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))

                                        Text(
                                            modifier = modifier.widthIn(max = 200.dp),
                                            text = "X:35.658°  Y:51.05775°",
                                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                                            style = MaterialTheme.typography.bodyMedium
                                        )
                                    }
                                }
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Icon(
                                        painter = painterResource(R.drawable.ic_check),
                                        modifier = Modifier
                                            .requiredSize(dimensionResource(R.dimen.sp_icon_size_button)),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onSurface
                                    )
                                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)))
                                    Icon(
                                        painter = painterResource(R.drawable.ic_3dot),
                                        contentDescription = "",
                                        tint = MaterialTheme.colorScheme.onSurface,
                                        modifier = Modifier
                                            .requiredSize(dimensionResource(R.dimen.sp_icon_size_button))
                                            .align(Alignment.CenterVertically)
                                            .clickable {
                                                showLocationListDialog = true
                                            }
                                    )
                                }


                            }

                            HorizontalDivider(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                thickness = 1.dp,
                                color = Color(0xFFBDC9C9)
                            )
                        }
                    }


                }
                FloatingActionButton(
                    onClick = {
                        showLocationDialog = true
                    },
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.fab_padding))
                        .align(Alignment.BottomEnd),
                    containerColor = MaterialTheme.colorScheme.primaryContainer

                )
                {
                    Icon(
                        modifier = Modifier
                            .size(dimensionResource(R.dimen.plus_icon_size)),
                        painter = painterResource(R.drawable.ic_plus),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onPrimaryContainer,
                    )
                }
            }
        }

    }

}

