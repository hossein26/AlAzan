package com.github.meypod.al_azan.ui.settings.screens.interfacesettings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun InterfaceSettings(
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
    val languageList = listOf(
        stringResource(R.string.english),
        stringResource(R.string.persian),
        stringResource(R.string.france)
    )
    val timerList = listOf(
        stringResource(R.string.next_active_azan), stringResource(R.string.next_active_reminder)
    )
    val numberingList = listOf(
        stringResource(R.string.western), stringResource(R.string.arabic)
    )
    val lunarList = listOf(
        stringResource(R.string.default_), stringResource(R.string.arabic), stringResource(R.string.persian)
    )
    val calendarList = listOf(
        stringResource(R.string.lunar),stringResource(R.string.gregorian)
    )
    var selectedTheme by remember { mutableStateOf("Light") }
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title =stringResource(R.string.interface_settings) ,
                    icon = R.drawable.ic_interface_settings,
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

                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {

                    Row(
                        modifier
                            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text =stringResource(R.string.language) ,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                            SampleBottomSheetMenu(items = languageList) { }
                        }
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

                    Row(
                        modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colorScheme.surfaceContainer),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                            modifier.background(MaterialTheme.colorScheme.surfaceContainer)
                        ) {
                            Text(
                                text = stringResource(R.string.themes),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            val themes = listOf(
                                "Light" to Color(0xFFE0F7FA),
                                "Dark" to Color.Black,
                                "Classic Black" to Color(0xFF000000),
                                "Classic Light" to Color.White,
                                "System Default" to Color(0xFFE0F7FA),
                                "Dynamic" to Color(0xFFB39DDB)
                            )

                            for (i in themes.indices step 3) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(MaterialTheme.colorScheme.surfaceContainer),
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    for (j in 0 until 3) {
                                        val index = i + j
                                        if (index < themes.size) {
                                            val (label, color) = themes[index]
                                            ThemeOptionCard(
                                                modifier = Modifier.weight(1f),
                                                color = color,
                                                label = label,
                                                isSelected = selectedTheme == label,
                                                onClick = { selectedTheme = label }
                                            )
                                        } else {
                                            Spacer(modifier = Modifier.weight(1f))
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        text = stringResource(R.string.show_prayer_times),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleSmall,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    Text(
                        text = stringResource(R.string.show_prayer_times_desc),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier
                            .fillMaxWidth()

                    )

                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))

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
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Row(
                        modifier
                            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            SwitchWithText(
                                title = stringResource(R.string.countdown_timer),
                                isChecked = true,
                                onCheckedChange = {}
                            )
                            Text(
                                text = stringResource(R.string.countdown_to),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                            SampleBottomSheetMenu(items = timerList) { }
                        }
                    }
                }
                Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items)))

                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Row(
                        modifier
                            .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column {
                            Text(
                                text = stringResource(R.string.date_time),
                                fontSize = 16.sp,
                                style = MaterialTheme.typography.titleMedium,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Medium
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                            Text(
                                text = stringResource(R.string.time_format),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight.Medium
                            )
                            SwitchWithText(
                                title = stringResource(R.string.time_format_desc),
                                isChecked = true,
                                onCheckedChange = {}
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                            Text(
                                text = stringResource(R.string.numbering_system),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                            Text(
                                text = stringResource(R.string.numbering_system_desc),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.titleSmall,
                                textAlign = TextAlign.Justify,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            SampleBottomSheetMenu(items = numberingList) { }
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                            Text(
                                text = stringResource(R.string.lunar_calendar_language),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                            Text(
                                text = stringResource(R.string.lunar_calendar_language_desc),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            SampleBottomSheetMenu(items = lunarList) { }
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                            Text(
                                text = stringResource(R.string.primary_calendar),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                            Text(
                                text = stringResource(R.string.primary_calendar_desc),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            SampleBottomSheetMenu(items = calendarList) { }
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_large)))

                            Text(
                                text = stringResource(R.string.secondary_calendar),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))

                            Text(
                                text = stringResource(R.string.secondary_calendar_desc),
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            )
                            Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                            SampleBottomSheetMenu(
                                items = calendarList
                            ) { }
                        }


                    }

                }

                Spacer(modifier.padding(dimensionResource(R.dimen.last_card_padding)))

            }
        }
    }


}



