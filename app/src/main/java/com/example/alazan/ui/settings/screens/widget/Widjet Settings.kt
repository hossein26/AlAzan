package com.example.alazan.ui.settings.screens.widget

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun WidgetSetting(
    navController: NavController,
    modifier: Modifier = Modifier) {
    AlAzanTheme {

        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {


            Row(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(bottom = 8.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),

                ) {

                Icon(
                    modifier = Modifier
                        .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                        .size(16.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(R.drawable.icon_back),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,
                )

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_widget),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Widget Settings",
                        modifier
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Box(
                        modifier = Modifier
                            .size(24.dp)
                    )
                }


            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Show Notification Widget",
                            modifier
                                .align(Alignment.CenterVertically)
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                            fontSize = 14.sp,

                            )

                        var isChecked by remember { mutableStateOf(true) }
                        Switch(
                            checked = isChecked,
                            onCheckedChange = { isChecked = it },
                            modifier = Modifier
                                .padding(end = 8.dp),
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color(0xFFFFFFFF),
                                checkedTrackColor = Color(0xFF00585A)
                            )
                        )
                    }

                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "An small version of widget in notification.",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }

                }


            }


            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Show Countdown Timer",
                            modifier
                                .align(Alignment.CenterVertically)
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                            fontSize = 14.sp,

                            )

                        var isChecked by remember { mutableStateOf(true) }
                        Switch(
                            checked = isChecked,
                            onCheckedChange = { isChecked = it },
                            modifier = Modifier
                                .padding(end = 8.dp),
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color(0xFFFFFFFF),
                                checkedTrackColor = Color(0xFF00585A)
                            )
                        )
                    }
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Use Adaptive Theme",
                            modifier
                                .align(Alignment.CenterVertically)
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp),
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                            fontSize = 14.sp,

                            )

                        var isChecked by remember { mutableStateOf(true) }
                        Switch(
                            checked = isChecked,
                            onCheckedChange = { isChecked = it },
                            modifier = Modifier
                                .padding(end = 8.dp),
                            colors = SwitchDefaults.colors(
                                checkedThumbColor = Color(0xFFFFFFFF),
                                checkedTrackColor = Color(0xFF00585A)
                            )
                        )
                    }




                    Text(
                        text = "Calendar",
                        modifier
                            .align(Alignment.Start)
                            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 2.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.titleSmall,
                        fontSize = 14.sp,

                        )
                    Text(
                        text = "Choose the calendar of the widget.",
                        modifier
                            .align(Alignment.Start)
                            .padding(start = 8.dp, end = 8.dp, top = 2.dp, bottom = 4.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,

                        )


                    val items = listOf(
                        "Lunar Calendar",
                        "Lunar Calendar",
                        "Lunar Calendar",
                        "Lunar Calendar",
                    )

                    Box(modifier.padding(8.dp)) {
                        SimpleDropdownMenu(
                            items = items,
                            //modifier = Modifier.padding(8.dp)
                        ) {

                        }
                    }


                }


            }
            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = "Show/Hide Prayer times",
                        modifier
                            .padding(start = 8.dp, top = 8.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface

                    )
                    Text(
                        text = "Choose what prayer times to show on widget.",
                        modifier
                            .padding(start = 8.dp),
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    val prayerTimes = listOf(
                        "Fajr", "Sunrise", "Dhuhr", "Asr", "Sunset",
                        "Maghrib", "Isha", "Midnight", "Tahajjud"
                    )
                    val checkedStates = remember {
                        mutableStateListOf<Boolean>().apply {
                            repeat(prayerTimes.size) { add(true) }
                        }
                    }
                    Spacer(modifier = modifier.padding(3.dp))
                    Row(
                        modifier
                            .fillMaxWidth()
                            //.padding(horizontal = 8.dp)
                            .background(MaterialTheme.colorScheme.surfaceContainerHigh)
                            ,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Time",
                            modifier
                                .padding(8.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Show",
                            modifier
                                .padding(horizontal = 26.dp, vertical = 8.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    HorizontalDivider(
                        modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp),
                         thickness = 0.5.dp,
                        color = Color(0xFFBDC9C9)
                    )

                    LazyColumn(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp)
                    ) {
                        items(prayerTimes.size) { index ->


                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 16.dp, end = 16.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {


                                BasicText(
                                    text = prayerTimes[index],
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    ),
                                )
                                Checkbox(
                                    checked = checkedStates[index],
                                    onCheckedChange = { checked ->
                                        checkedStates[index] = checked
                                    },
                                    colors = CheckboxDefaults.colors(
                                        checkedColor = Color(0xFF00585A)
                                    )
                                )

                            }
                            HorizontalDivider(
                                modifier = Modifier
                                //.padding(start = 8.dp, end = 8.dp),
                                , thickness = 0.5.dp,
                                color = Color(0xFFBDC9C9)
                            )
                        }
                    }


                }
            }


        }


    }


}



