package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.alazan.R
import com.example.alazan.general_components.Navigation.MAIN_SCREEN
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro9(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = modifier
                        .align(Alignment.TopCenter)
                        .verticalScroll(rememberScrollState())
                        .padding(dimensionResource(R.dimen.screen_padding)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.battery_settings),
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(dimensionResource(R.dimen.text_padding))
                    )
                    Row(
                        modifier = Modifier
                            .padding(top= dimensionResource(R.dimen.horizontal_title_padding), bottom = dimensionResource(R.dimen.horizontal_title_padding)),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_battery),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = dimensionResource(R.dimen.icon_size_intro))
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_large_icon_text)))
                        Text(
                            text = stringResource(R.string.battery_settings_desc),
                            color = MaterialTheme.colorScheme.onBackground,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                            ),
                            modifier = Modifier
                                .padding(dimensionResource(R.dimen.text_padding)),
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.help_app_running),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Medium
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))
                            Text(
                                text = stringResource(R.string.help_app_running_desc),
                                modifier = Modifier
                                    .widthIn(max = dimensionResource(R.dimen.max_width_text))
                                    .padding(horizontal = dimensionResource(R.dimen.text_padding)),
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))
                            Column(
                                modifier = modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row {
                                    Text(stringResource(R.string.state), style = MaterialTheme.typography.labelLarge.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    ))
                                    Text(
                                        stringResource(R.string.enabled),
                                        style = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.error)
                                    )
                                }
                                Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                                Button(
                                    onClick = {

                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                                    modifier = Modifier
                                        .widthIn(min = dimensionResource(R.dimen.button_icon_width))
                                        .wrapContentWidth()
                                        .align(Alignment.CenterHorizontally)
                                ) {
                                    Text(
                                        text = stringResource(R.string.open_battery_settings),
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.labelLarge,
                                        modifier = Modifier
                                            .wrapContentHeight(align = Alignment.CenterVertically)
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.power_settings),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Medium
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                            Text(
                                text = stringResource(R.string.power_settings_desc),
                                modifier = Modifier
                                    .widthIn(max = dimensionResource(R.dimen.max_width_text)).padding(horizontal = dimensionResource(R.dimen.text_padding)),
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                            Column(
                                modifier = modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Button(
                                    onClick = {

                                    },
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                                    modifier = Modifier
                                        .widthIn(min = dimensionResource(R.dimen.button_icon_width))
                                        .wrapContentHeight()
                                        .align(Alignment.CenterHorizontally)
                                ) {
                                    Text(
                                        text = stringResource(R.string.open_power_settings),
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.labelLarge,
                                        modifier = Modifier
                                            .wrapContentHeight(align = Alignment.CenterVertically)
                                    )
                                }
                            }
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))
                            Row {
                                Icon(
                                    painter = painterResource(R.drawable.information_slab_circle_gray),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
                                Text(
                                    stringResource(R.string.samsung_devices_exception),
                                    style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant),
                                    modifier = modifier.align(Alignment.CenterVertically)
                                )
                            }
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.last_card_padding)))

                }

                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = {navController.navigate(MAIN_SCREEN)},
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {}
                )

            }

        }

    }

}

