package com.github.meypod.al_azan.ui.settings.screens.sound

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.intro.AzanAndNotifItem
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Sound(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    val azanNotifList = listOf(
        "Fajr", "Sunrise", "Dhuhr", "Asr", "Sunset", "Maghrib", "Isha", "Midnight", "Tahajjud"
    )
    val vibrationList = listOf(
        "Once", "Twice", "Thrice"
    )
    val alarmTimeList = listOf(
        "60 minutes", "120 minutes", "180 minutes", "240 minutes"
    )
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.sound_and_notification),
                    navController = navController,
                    icon = R.drawable.ic_sound
                )
            }
        ) {
            Column(
                modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .verticalScroll(rememberScrollState())
                    .padding(dimensionResource(R.dimen.item_content_padding))
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                        .clickable {

                        }
                ) {
                    Row(
                        modifier
                            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Rounding Method:",
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Ragheb Mustafa Ghalwash",
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.primaryContainer,
                                style = MaterialTheme.typography.labelMedium,
                            )
                        }
                        Icon(
                            modifier = Modifier
                                .size(dimensionResource(R.dimen.icon_size_button))
                                .align(Alignment.CenterVertically),
                            painter = painterResource(R.drawable.ic_nav_naxt),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                        .clickable {

                        }
                ) {
                    Row(
                        modifier
                            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = "Notification Sound",
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Text(
                                text = "Bling!",
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.primaryContainer,
                                style = MaterialTheme.typography.labelMedium,
                            )
                        }
                        Icon(
                            modifier = Modifier
                                .size(dimensionResource(R.dimen.icon_size_button))
                                .align(Alignment.CenterVertically),
                            painter = painterResource(R.drawable.ic_nav_naxt),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        text = "Azan & notification",
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleSmall,
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    Text(
                        text = "Choose when you want Azan to be played and when you want to get notified.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_small)))
                    Column {
                        azanNotifList.forEach { item ->
                            AzanAndNotifItem(item) {

                            }
                        }
                    }
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_small)))
                    Row {
                        Icon(
                            painter = painterResource(R.drawable.information_slab_circle_gray),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            "Tahajjud is last third part of the night",
                            style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurfaceVariant),
                            modifier = modifier
                                .align(Alignment.CenterVertically)
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        text = "Vibration Mode",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                    Text(
                        text = "Should phone vibrate when Azan or reminders start playing ?",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.labelMedium,
                    )
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    SampleBottomSheetMenu(items = vibrationList) { }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    SwitchWithText(
                        title = "Show “Upcoming Alarm” Notification ",
                        description = "If enabled, a notification will be shown around one hour before any prayer time or reminder that has sound  ",
                        onCheckedChange = {},
                        isChecked = true
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    SwitchWithText(
                        title = "Show “Next” in Notification",
                        description = "If enabled, when a notification is shown, it will contain info for the next prayer time ",
                        onCheckedChange = {},
                        isChecked = true
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Text(
                        text = "Custom upcoming alarm time",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Adjust when “Upcoming Alarm” notification will be shown. Both Azan and reminder.",
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Justify
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                    SampleBottomSheetMenu(items = alarmTimeList) { }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    SwitchWithText(
                        title = "Bypass “Do not Disturb”",
                        description = "Should app still play Azan when “Do not Disturb” is active ?",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    SwitchWithText(
                        title = "Use headphones when available",
                        description = "When using headphones, all audio will play only on headphones.",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    SwitchWithText(
                        title = "Volume button Stops Azan",
                        description = "Azan stops playing when the volume button is pressed.",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    SwitchWithText(
                        title = "Don’t Show Alarm Screen",
                        description = "When enabled, the screen will remain off when Azan or reminder starts playing, and alarm screen won’t be shown.",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.last_card_padding)))
            }
        }


    }

}

