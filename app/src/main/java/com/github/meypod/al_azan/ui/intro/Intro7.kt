package com.github.meypod.al_azan.ui.intro

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.INTRO_8
import com.github.meypod.al_azan.ui.components.Footer
import com.github.meypod.al_azan.ui.components.PatternBackgroundBox
import com.github.meypod.al_azan.ui.settings.screens.sound.SoundDialog
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro7(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        val azanNotifList = listOf(
            stringResource(R.string.fajr),
            stringResource(R.string.sunrise),
            stringResource(R.string.dhuhr),
            stringResource(R.string.asr),
            stringResource(R.string.sunset),
            stringResource(R.string.maghrib),
            stringResource(R.string.isha),
            stringResource(R.string.midnight),
            stringResource(R.string.tahajjud),
        )
        var showDialog by remember { mutableStateOf(false) }
        PatternBackgroundBox {

            if (showDialog) {
                Dialog(
                    content = {  SoundDialog() },
                    properties = DialogProperties(
                        usePlatformDefaultWidth = false
                    ),
                    onDismissRequest = { showDialog = false }
                )
            }

            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(dimensionResource(R.dimen.screen_padding))
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.azan_and_notification),
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(dimensionResource(R.dimen.text_padding))
                    )
                    Row(
                        modifier = Modifier
                            .padding(
                                top = dimensionResource(R.dimen.horizontal_title_padding),
                                bottom = dimensionResource(R.dimen.horizontal_title_padding)
                            ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_mdi_talk),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = dimensionResource(R.dimen.icon_size_intro))
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_large_icon_text)))
                        Text(
                            text = stringResource(R.string.favorite_muazzin),
                            color = MaterialTheme.colorScheme.onBackground,
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight.Bold,
                                fontSize = 16.sp,
                                lineHeight = 24.sp
                            ),
                            modifier = Modifier
                                .padding(dimensionResource(R.dimen.text_padding)),
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column {
                            Text(
                                text = stringResource(R.string.muazzin),
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Text(
                                text = stringResource(R.string.muazzin_name_1),
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.primaryContainer)
                            )
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .size(dimensionResource(R.dimen.icon_size_small))
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column {
                            Text(
                                text = stringResource(R.string.notification_sound),
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Text(
                                text = stringResource(R.string.bling),
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.primaryContainer)
                            )
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .size(dimensionResource(R.dimen.icon_size_small))
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
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
                                text = stringResource(R.string.azan_and_notification),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            Text(
                                text = stringResource(R.string.notification_sound_desc),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .fillMaxWidth()

                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                            Column {
                                azanNotifList.forEach { item ->
                                    AzanAndNotifItem(item) {
                                        showDialog = true
                                    }
                                }
                            }
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                            Row {
                                Icon(
                                    painter = painterResource(R.drawable.information_slab_circle_gray),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onSurface,
                                )
                                Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
                                Text(
                                    stringResource(R.string.tahajjud_desc),
                                    style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurface),
                                    modifier = modifier
                                        .align(Alignment.CenterVertically)
                                )
                            }
                        }

                    }
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.last_card_padding)))

                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_8) },
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {}
                )
            }
        }

    }

}

@Composable
fun AzanAndNotifItem(title: String, showDialog: () -> Unit) {
    var notifState by remember { mutableStateOf(ToggleableState.Off) }
    var azanState by remember { mutableStateOf(ToggleableState.Off) }
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Medium
                ),
            )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = stringResource(R.string.notification),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.bodySmall
                        )
                        TriStateCheckbox(
                            state = notifState,
                            onClick = {
                                notifState = when (notifState) {
                                    ToggleableState.On -> ToggleableState.Off
                                    ToggleableState.Off -> ToggleableState.Indeterminate
                                    ToggleableState.Indeterminate -> ToggleableState.On
                                }
                            }
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Text(
                            text = stringResource(R.string.azan),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.bodySmall
                        )
                        TriStateCheckbox(
                            state = azanState,
                            onClick = {
                                azanState = when (azanState) {
                                    ToggleableState.On -> ToggleableState.Off
                                    ToggleableState.Off -> ToggleableState.Indeterminate
                                    ToggleableState.Indeterminate -> ToggleableState.On
                                }
                            }
                        )
                    }
                    Icon(
                        painter = painterResource(id = R.drawable.ic_settings),
                        contentDescription = stringResource(R.string.settings),
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .size(dimensionResource(R.dimen.icon_size_small))
                            .clickable {
                                showDialog()
                            }
                    )
                }




        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.5.dp,
            color = MaterialTheme.colorScheme.outline
        )
    }
}




