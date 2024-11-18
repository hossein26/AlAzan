package com.github.meypod.al_azan.screens.settings.screens.fixproblem

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.Navigation.ADVANCED
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.screens.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun FixProblems(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.fix_problems),
                    icon = R.drawable.ic_widget,
                    navController = navController
                )
            }
        ) { innerPadding ->
            Column(
                modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .verticalScroll(rememberScrollState())
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
                            text = stringResource(R.string.fix_problems_desc),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Column {
                        Text(
                            text = stringResource(R.string.help_app_running),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            modifier = modifier.padding(dimensionResource(R.dimen.item_content_padding)).widthIn(max = dimensionResource(R.dimen.max_width)),
                            text = stringResource(R.string.help_app_running_desc),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Column(
                            modifier.align(Alignment.CenterHorizontally)
                        ) {
                            Row{
                                Checkbox(
                                    checked = false,
                                    onCheckedChange = {
                                    },
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = MaterialTheme.colorScheme.primary
                                    )
                                )
                                Text(
                                    text = stringResource(R.string.state),
                                    modifier
                                        .align(Alignment.CenterVertically),
                                    style = MaterialTheme.typography.labelLarge,
                                    color = MaterialTheme.colorScheme.onSurface
                                )

                                Text(
                                    text = stringResource(R.string.enabled),
                                    modifier
                                        .align(Alignment.CenterVertically),
                                    color = MaterialTheme.colorScheme.error,
                                    style = MaterialTheme.typography.labelLarge
                                )
                            }
                            Button(
                                onClick = {},
                                modifier
                                    .align(Alignment.CenterHorizontally),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = MaterialTheme.colorScheme.primary,
                                    contentColor = MaterialTheme.colorScheme.secondaryContainer
                                )
                            ) {
                                Text(
                                    text = stringResource(R.string.open_battery_settings),
                                    style = MaterialTheme.typography.labelLarge,
                                    fontSize = 14.sp,
                                )
                            }
                        }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Column {
                        Text(
                            text = stringResource(R.string.power_settings),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            modifier = modifier.widthIn(max = dimensionResource(R.dimen.max_width)),
                            text = stringResource(R.string.power_settings_desc),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Button(
                            onClick = {

                            },
                            modifier
                                .align(Alignment.CenterHorizontally),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.open_power_settings),
                                style = MaterialTheme.typography.labelLarge,
                                fontSize = 14.sp,
                                color = MaterialTheme.colorScheme.secondaryContainer
                            )
                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
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
                                text = stringResource(R.string.samsung_devices_exception),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .clickable {
                            navController.navigate(ADVANCED)
                        }
                        .padding(dimensionResource(R.dimen.card_content_padding))

                ) {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = stringResource(R.string.advanced),
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.titleMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(R.drawable.ic_nav_naxt),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
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
                                .size(dimensionResource(R.dimen.icon_info_size))
                                .align(Alignment.Top),
                            painter = painterResource(R.drawable.ic_info_gray),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            text = stringResource(R.string.advanced_desc),
                            fontSize = 12.sp,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
                Spacer(modifier
                    .padding(dimensionResource(R.dimen.last_card_padding_intro)))

            }
        }
    }
}