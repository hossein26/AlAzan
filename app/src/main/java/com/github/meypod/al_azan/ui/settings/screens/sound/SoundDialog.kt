package com.github.meypod.al_azan.ui.settings.screens.sound

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
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SampleDivider
import com.github.meypod.al_azan.ui.theme.AlAzanTheme


@Composable
fun SoundDialog(modifier: Modifier = Modifier, cancel: () -> Unit) {
    val options4 = listOf("Default", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")
    val customMuazzin = listOf("Default", "Abdolbaset")

    AlAzanTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent),
            contentAlignment = Alignment.Center
        ) {
            Card(
                modifier = Modifier
                    .wrapContentSize()
                    .background(Color.Transparent)
                    .padding(dimensionResource(R.dimen.dialog_screen_padding))
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.dialog_radius))),
                shape = MaterialTheme.shapes.medium,
            ) {
                Column(
                    modifier
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.dialog_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.dialog_content_padding))
                ) {
                    Text(
                        text = "Custom Muazzin",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    SampleBottomSheetMenu(
                        items = customMuazzin
                    ) { }
                    SampleDivider()
                    Text(
                        text = "Azan",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Row {
                        DayOfWeekItemTertiary(text = "Sunday")
                        DayOfWeekItemTertiary(text = "Monday")
                        DayOfWeekItemTertiary(text = "Tuesday")
                    }
                    Row {
                        DayOfWeekItemTertiary(text = "Wednesday")
                        DayOfWeekItemTertiary(text = "Thursday")
                        DayOfWeekItemTertiary(text = "Friday")
                    }
                    Row {
                        DayOfWeekItemTertiary(text = "Saturday")
                    }
                    SampleDivider()
                    Text(
                        text = "Custom Notification:",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    SampleBottomSheetMenu(
                        items = options4
                    ) { }
                    SampleDivider()

                    Text(
                        text = "Notifications",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Row {
                        DayOfWeekItemPrimary("Sunday")
                        DayOfWeekItemPrimary("Monday")
                        DayOfWeekItemPrimary("Tuesday")
                    }

                    Row {
                        DayOfWeekItemPrimary("Wednesday")
                        DayOfWeekItemPrimary("Thursday")
                        DayOfWeekItemPrimary("Friday")
                    }
                    Row {
                        DayOfWeekItemPrimary("Saturday")
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_extra_large)))
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.End
                    )
                    {
                        OutlinedButton(
                            onClick = {
                                cancel()
                            },
                            modifier
                                .wrapContentWidth()
                                .wrapContentHeight(),
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Cancel",
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.error
                            )
                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            )

                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Confirm",
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onPrimary
                            )
                        }
                    }
                }
            }
        }
    }


}

@Composable
fun DayOfWeekItemTertiary(text: String){
    Box(
        modifier = Modifier
            .padding(vertical = dimensionResource(R.dimen.spacer_items_medium))
            .padding(end = dimensionResource(R.dimen.spacer_items_medium))
            .widthIn(min = dimensionResource(R.dimen.day_of_week_width))
            .heightIn(min = dimensionResource(R.dimen.day_of_week_height))
            .clip(RoundedCornerShape(dimensionResource(R.dimen.item_border_radius)))
            .background(MaterialTheme.colorScheme.tertiaryContainer)
            .padding(horizontal = dimensionResource(R.dimen.spacer_items_extra_large)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onTertiaryContainer
        )
    }
}
@Composable
fun DayOfWeekItemPrimary(text: String){
    Box(
        modifier = Modifier
            .padding(vertical = dimensionResource(R.dimen.spacer_items_medium))
            .padding(end = dimensionResource(R.dimen.spacer_items_medium))
            .widthIn(min = dimensionResource(R.dimen.day_of_week_width))
            .heightIn(min = dimensionResource(R.dimen.day_of_week_height))
            .clip(RoundedCornerShape(dimensionResource(R.dimen.item_border_radius)))
            .background(MaterialTheme.colorScheme.primaryContainer)
            .padding(horizontal = dimensionResource(R.dimen.spacer_items_extra_large)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.onPrimaryContainer
        )
    }
}











