package com.github.meypod.al_azan.ui.settings.screens.quibla

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Qibla(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {

    var showDetails by remember { mutableStateOf(true) }
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = "Qibla",
                    navController = navController,
                    icon = R.drawable.ic_qibla
                )
            }

        ) {
            Column(
                modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(dimensionResource(R.dimen.item_content_padding))
            ) {
                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_content_padding)))
                        .background(color = MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding)),
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_info),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier
                            .size(dimensionResource(R.dimen.icon_info_size))
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                    ) {
                        Text(
                            text = "Disclaimer",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Text(
                            text = "Note that due to software and hardware errors, Quibla direction shown by this app, particularly in “Compass Mode”, can be wrong." +
                                    "\nOther magnetic devices and your compass may " +
                                    "need calibration. ",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }

                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                if (showDetails) {
                    Button(
                        onClick = {
                            showDetails = false
                        },
                        modifier
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )

                    ) {
                        Text(
                            text = "I Understand",
                            style = MaterialTheme.typography.labelLarge
                        )
                    }
                }

                if (!showDetails) {
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_large)))
                    Column(
                        modifier.align(Alignment.CenterHorizontally)
                    ) {
                        Card(
                            modifier
                                .clickable {

                                }
                                .size(dimensionResource(R.dimen.qibla_card_size))
                                .background(
                                    MaterialTheme.colorScheme.background,
                                    shape = RoundedCornerShape(
                                        dimensionResource(R.dimen.qibla_corner_cards)
                                    )
                                )
                                .shadow(
                                    dimensionResource(R.dimen.shadow_elevation_high),
                                    shape = RoundedCornerShape(dimensionResource(R.dimen.qibla_corner_cards))
                                ),
                        ) {
                            Box(
                                modifier
                                    .fillMaxSize()
                                    .background(MaterialTheme.colorScheme.background),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_location),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onBackground,
                                    modifier = Modifier
                                        .size(dimensionResource(R.dimen.qibla_icon_size))
                                )
                            }
                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        Text(
                            modifier = modifier.align(Alignment.CenterHorizontally),
                            text = "Map & Location",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_large)))
                        Card(
                            modifier
                                .clickable {

                                }
                                .size(dimensionResource(R.dimen.qibla_card_size))
                                .background(
                                    MaterialTheme.colorScheme.background,
                                    shape = RoundedCornerShape(
                                        dimensionResource(R.dimen.qibla_corner_cards)
                                    )
                                )
                                .shadow(
                                    dimensionResource(R.dimen.shadow_elevation_high),
                                    shape = RoundedCornerShape(dimensionResource(R.dimen.qibla_corner_cards))
                                ),
                        ) {
                            Box(
                                modifier
                                    .fillMaxSize()
                                    .background(MaterialTheme.colorScheme.background),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_compose_black),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onBackground,
                                    modifier = Modifier
                                        .size(dimensionResource(R.dimen.qibla_icon_size))
                                )
                            }
                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        Text(
                            modifier = modifier.align(Alignment.CenterHorizontally),
                            text = "Use Compose",
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onBackground
                        )
                    }

                }


            }


        }
    }


}




