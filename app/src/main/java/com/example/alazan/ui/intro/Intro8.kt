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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.alazan.R
import com.example.alazan.general_components.Navigation.INTRO_9
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.general_components.SwitchWithText
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro8(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        var isChecked by remember { mutableStateOf(true) }
        val vibrationMode = listOf(
            "Once", "Twice"
        )
        val upcomingAlarm = listOf(
            "60 minutes", "50 minutes"
        )
        PatternBackgroundBox {
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
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                        Text(
                            text = stringResource(R.string.vibration_desc),
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                        SimpleDropdownMenu(items = vibrationMode) {}
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        SwitchWithText(
                            title = stringResource(R.string.upcoming_alarm),
                            description = stringResource(R.string.upcoming_alarm_desc),
                            onCheckedChange = { checked ->
                                isChecked = checked
                            },
                            isChecked = isChecked
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        SwitchWithText(
                            title = stringResource(R.string.next_notification_show),
                            description = stringResource(R.string.next_notification_show_desc),
                            onCheckedChange = {},
                            isChecked = true
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
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                        Text(
                            text = stringResource(R.string.custom_alarm_desc),
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                        SimpleDropdownMenu(items = upcomingAlarm) {}
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
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
                            onCheckedChange = {},
                            isChecked = true
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        SwitchWithText(
                            title = stringResource(R.string.use_headphones),
                            description = stringResource(R.string.use_headphones_desc),
                            onCheckedChange = {},
                            isChecked = true
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        SwitchWithText(
                            title = stringResource(R.string.volume_stop),
                            description = stringResource(R.string.volume_stop_desc),
                            onCheckedChange = {},
                            isChecked = true
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        SwitchWithText(
                            title = stringResource(R.string.dont_show_alarm),
                            description = stringResource(R.string.dont_show_alarm_desc),
                            onCheckedChange = {},
                            isChecked = true
                        )
                    }
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.last_card_padding)))
                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_9) },
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {}
                )
            }
        }

    }

}






