package com.github.meypod.al_azan.ui.settings.screens.reminder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.general_components.SampleDivider
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.theme.AlAzanTheme


@Preview
@Composable
fun ReminderDialog(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }
    val options1 = listOf("5 min", "10 min", "15 min")
    val options2 = listOf("Before", "After")
    val options3 = listOf("Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")
    val options4 = listOf("Data", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")

    AlAzanTheme {

        Card(
            modifier = modifier
                .padding(dimensionResource(R.dimen.dialog_screen_padding))
                .clip(RoundedCornerShape(dimensionResource(R.dimen.dialog_radius)))
                .background(MaterialTheme.colorScheme.surfaceContainer),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.shadow_elevation_high))
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(
                        MaterialTheme.colorScheme.surfaceContainer,
                        shape = RoundedCornerShape(dimensionResource(R.dimen.dialog_radius))
                    )
                    .padding(dimensionResource(R.dimen.dialog_content_padding))
            ) {
                OutlinedTextField(
                    modifier = modifier.fillMaxWidth(),
                    value = value,
                    onValueChange = { value = it },
                    label = { Text("Lable") },
                    placeholder = {
                        Text(
                            "Give me a name",
                            style = TextStyle(
                                fontFamily = MaterialTheme.typography.bodySmall.fontFamily,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    },
                    textStyle = TextStyle(
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                )
                SampleDivider()
                Text(
                    text = "Time",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                ) {
                    SampleBottomSheetMenu(
                        modifier = modifier.weight(1f),
                        items = options1
                    ) { }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                    SampleBottomSheetMenu(
                        modifier = modifier.weight(1f),
                        items = options2
                    ) { }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                SampleBottomSheetMenu(
                    items = options3
                ) { }
                SampleDivider()
                Text(
                    text = "Sound",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                SampleBottomSheetMenu(
                    items = options4
                ) { }
                SampleDivider()
                Text(
                    text = "Options",
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )
                SwitchWithText(
                    title = "Only Once",
                    isChecked = true,
                    onCheckedChange = {}
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    DayOfWeekItem("Sunday")
                    DayOfWeekItem("Monday")
                    DayOfWeekItem("Tuesday")
                }

                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    DayOfWeekItem("Wednesday")
                    DayOfWeekItem("Thursday")
                    DayOfWeekItem("Friday")
                }
                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                )
                {
                    DayOfWeekItem("Saturday")
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_extra_large)))
                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                )
                {
                    OutlinedButton(
                        onClick = {},
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

@Composable
fun DayOfWeekItem(text: String, modifier: Modifier = Modifier){
    Box(
        modifier = modifier
            .padding(dimensionResource(R.dimen.spacer_items_medium))
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












