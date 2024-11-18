package com.github.meypod.al_azan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.INTRO_9
import com.github.meypod.al_azan.general_components.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.components.Footer
import com.github.meypod.al_azan.ui.components.IslamicPatternBackground
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview(device = "id:pixel_9_pro_fold")
@Composable
fun Intro8(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        val vibrationMode = listOf(
            "Once", "Twice"
        )
        val upcomingAlarm = listOf(
            "60 minutes", "50 minutes"
        )
        IslamicPatternBackground(
            color = Color(0xFF00585A)
        ) {
            BoxWithConstraints(
                modifier = modifier
                    .fillMaxSize()
            ) {
                val maxWidthDp = with(LocalDensity.current) { maxWidth }
                val isWide = maxWidthDp > dimensionResource(R.dimen.max_width)
                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(dimensionResource(R.dimen.screen_padding))
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.spacer_top_screen)))
                    Text(
                        text = stringResource(R.string.notification),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
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
                            painter = painterResource(id = R.drawable.ic_alarm),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = dimensionResource(R.dimen.icon_size_intro))
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_large_icon_text)))
                        Text(
                            text = stringResource(R.string.notification_desc),
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .padding(dimensionResource(R.dimen.text_padding)),
                        )
                    }
                    if (isWide) {
                        Row(
                            modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            PartOne(
                                modifier.weight(1f),
                                vibrationMode,
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                            PartTwo(
                                modifier.weight(1f),
                                upcomingAlarm,
                            )
                        }
                    } else {
                        PartOne(
                            modifier,
                            vibrationMode,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                        PartTwo(
                            modifier,
                            upcomingAlarm,
                        )
                    }
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.last_card_padding_intro)))
                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_9) },
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {
                        navController.navigate(MAIN_SCREEN)
                    }
                )
            }
        }

    }

}

@Composable
private fun PartTwo(
    modifier: Modifier,
    upcomingAlarm: List<String>,

) {
    var upcomingAlarmSwitch by remember { mutableStateOf(true) }
    var nextNotificationSwitch by remember { mutableStateOf(true) }
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
            .background(color = MaterialTheme.colorScheme.surfaceContainer)
            .padding(dimensionResource(R.dimen.card_content_padding))
    ) {
        SwitchWithText(
            title = stringResource(R.string.upcoming_alarm),
            description = stringResource(R.string.upcoming_alarm_desc),
            onCheckedChange = { checked ->
                upcomingAlarmSwitch = checked
            },
            isChecked = upcomingAlarmSwitch
        )
        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
        SwitchWithText(
            title = stringResource(R.string.next_notification_show),
            description = stringResource(R.string.next_notification_show_desc),
            onCheckedChange = { checked ->
                nextNotificationSwitch = checked
            },
            isChecked = nextNotificationSwitch
        )
        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
        Text(
            text = stringResource(R.string.dont_show_alarm),
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.titleSmall.copy(
                MaterialTheme.colorScheme.onSurface
            )
        )
        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
        Text(
            text = stringResource(R.string.custom_alarm_desc),
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
        )
        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items)))
        SampleBottomSheetMenu(
            items = upcomingAlarm
        ) { }
    }


}

@Composable
private fun PartOne(
    modifier: Modifier,
    vibrationMode: List<String>,
) {
    var bypassSwitch by remember { mutableStateOf(true) }
    var headPhonesSwitch by remember { mutableStateOf(true) }
    var volumeStopSwitch by remember { mutableStateOf(true) }
    var showAlarmSwitch by remember { mutableStateOf(true) }

    Column(modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                .background(color = MaterialTheme.colorScheme.surfaceContainer)
                .padding(dimensionResource(R.dimen.card_content_padding))
        ) {
            Text(
                text = stringResource(R.string.vibration_mode),
                modifier = Modifier
                    .fillMaxWidth(),
                style = MaterialTheme.typography.titleSmall.copy(
                    MaterialTheme.colorScheme.onSurface
                )
            )
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
            Text(
                text = stringResource(R.string.vibration_desc),
                modifier = Modifier
                    .fillMaxWidth(),
                style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items)))
            SampleBottomSheetMenu(
                items = vibrationMode
            ) { }
        }
        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items)))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                .background(color = MaterialTheme.colorScheme.surfaceContainer)
                .padding(dimensionResource(R.dimen.card_content_padding))
        ) {
            SwitchWithText(
                title = stringResource(R.string.do_not_disturb),
                description = stringResource(R.string.do_not_disturb_desc),
                onCheckedChange = { checked ->
                    bypassSwitch = checked
                },
                isChecked = bypassSwitch
            )
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            SwitchWithText(
                title = stringResource(R.string.use_headphones),
                description = stringResource(R.string.use_headphones_desc),
                onCheckedChange = { checked ->
                    headPhonesSwitch = checked
                },
                isChecked = headPhonesSwitch
            )
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            SwitchWithText(
                title = stringResource(R.string.volume_stop),
                description = stringResource(R.string.volume_stop_desc),
                onCheckedChange = { checked ->
                    volumeStopSwitch = checked
                },
                isChecked = volumeStopSwitch
            )
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            SwitchWithText(
                title = stringResource(R.string.dont_show_alarm),
                description = stringResource(R.string.dont_show_alarm_desc),
                onCheckedChange = { checked ->
                    showAlarmSwitch = checked
                },
                isChecked = showAlarmSwitch
            )
        }
    }
}






