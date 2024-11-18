package com.github.meypod.al_azan.ui.settings.screens.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.settings.screens.interfacesettings.ShowPrayerTimeItem
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun WidgetSetting(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val azanNotifList = listOf(
        stringResource(R.string.fajr),
        stringResource(R.string.sunrise),
        stringResource(R.string.dhuhr),
        stringResource(R.string.asr),
        stringResource(R.string.sunset),
        stringResource(R.string.maghrib),
        stringResource(R.string.isha),
        stringResource(R.string.midnight),
        stringResource(R.string.tahajjud)
    )
    val items = listOf(
        "Lunar Calendar",
        "Lunar Calendar",
        "Lunar Calendar",
        "Lunar Calendar",
    )
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.widget_settings),
                    icon = R.drawable.ic_widget,
                    navController = navController
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

                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(horizontal = dimensionResource(R.dimen.card_content_padding))
                        .padding(bottom = dimensionResource(R.dimen.card_content_padding))
                ) {
                    SwitchWithText(
                        title = "Show Notification Widget",
                        description = "An small version of widget in notification.",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(horizontal = dimensionResource(R.dimen.card_content_padding))
                ) {
                    SwitchWithText(
                        title = "Show Countdown Timer",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                    SwitchWithText(
                        title = "Use Adaptive Theme",
                        isChecked = true,
                        onCheckedChange = {}
                    )
                    Text(
                        text = "Calendar",
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleSmall,
                    )
                    Text(
                        text = "Choose the calendar of the widget.",
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                    )
                    SampleBottomSheetMenu(
                        items = items
                    ) { }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
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
                        text = "Show/Hide Prayer times",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    Text(
                        text = "Choose what prayer times to show on widget.",
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    Row(
                        modifier
                            .background(MaterialTheme.colorScheme.surfaceContainerHighest)
                            .fillMaxWidth()
                            .heightIn(min = dimensionResource(R.dimen.text_view_height))
                            .padding(horizontal = dimensionResource(R.dimen.padding_large)),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = stringResource(R.string.time),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                        )
                        Text(
                            text = stringResource(R.string.show),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                        )
                    }
                    Column(
                        modifier.padding(horizontal = dimensionResource(R.dimen.text_padding))
                    ) {
                        azanNotifList.forEach { item ->
                            ShowPrayerTimeItem(item)
                        }
                    }

                }
                Spacer(modifier.padding(dimensionResource(R.dimen.last_card_padding_intro)))
            }
        }
    }
}



