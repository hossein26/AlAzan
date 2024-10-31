package com.example.alazan.ui.settings.screens.sound

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.intro.AzanAndNotifItem
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Sound(navController: NavController, modifier: Modifier = Modifier) {
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

        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .verticalScroll(rememberScrollState())
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(bottom = 8.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),
                horizontalArrangement = Arrangement.SpaceBetween

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
                        painter = painterResource(R.drawable.ic_sound),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(top = 12.dp, bottom = 12.dp)
                            .size(24.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Sound & Notification",
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        style = MaterialTheme.typography.titleLarge,
                        textAlign = TextAlign.Center
                    )
                }

                Box(
                    modifier = Modifier
                        .size(24.dp)
                )

            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {

                Row(
                    modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Rounding Method:",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Ragheb Mustafa Ghalwash",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 12.sp,
                            color = Color(0xFF008083),
                            style = MaterialTheme.typography.labelMedium,
                            textAlign = TextAlign.Justify
                        )
                    }

                    Icon(
                        modifier = Modifier
                            .padding(12.dp)
                            .size(24.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(R.drawable.ic_nav_naxt),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }


            }


            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {

                Row(
                    modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Notification Sound",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Bling!",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 12.sp,
                            color = Color(0xFF008083),
                            style = MaterialTheme.typography.labelMedium,
                            textAlign = TextAlign.Justify
                        )
                    }

                    Icon(
                        modifier = Modifier
                            .padding(12.dp)
                            .size(24.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(R.drawable.ic_nav_naxt),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }


            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(12.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Azan & notification",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Spacer(modifier = modifier.padding(2.dp))
                            Text(
                                text = "Choose when you want Azan to be played and when you want to get notified.",
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .fillMaxWidth()

                            )
                            Spacer(modifier = modifier.padding(4.dp))
                            Column {
                                azanNotifList.forEach { item ->
                                    AzanAndNotifItem(item)
                                }
                            }
                            Spacer(modifier = modifier.padding(4.dp))
                            Row {
                                Icon(
                                    painter = painterResource(R.drawable.information_slab_circle_gray),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onSurface,
                                )
                                Text(
                                    "Tahajjud is last third part of the night",
                                    style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurface),
                                    modifier = modifier
                                        .align(Alignment.CenterVertically)
                                        .padding(horizontal = 4.dp)
                                )
                            }
                        }

                    }

                }
            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row(
                    modifier
                        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Column(
                        modifier
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Vibration Mode",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Should phone vibrate when Azan or reminders start playing ?",
                            modifier
                                .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                            fontSize = 12.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.labelMedium,
                            textAlign = TextAlign.Justify
                        )
                        Spacer(modifier = modifier.padding(4.dp))
                        SimpleDropdownMenu(items = vibrationList) {

                        }
                    }


                }
            }
            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(8.dp)
            ) {
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Show “Upcoming Alarm” Notification ",
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
                            text = "If enabled, a notification will be shown around one hour before any prayer time or reminder that has sound  ",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Show “Next” in Notification",
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
                            text = "If enabled, when a notification is shown, it will contain info for the next prayer time ",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
                Column(
                    modifier
                        .padding(4.dp)
                ) {
                    Text(
                        text = "Custom upcoming alarm time",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Adjust when “Upcoming Alarm” notification will be shown. Both Azan and reminder.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 12.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.labelMedium,
                        textAlign = TextAlign.Justify
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = alarmTimeList) {

                    }

                }
            }
            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(8.dp)
            ) {
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Bypass “Do not Disturb”",
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
                            text = "Should app still play Azan when “Do not Disturb” is active ?",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Use headphones when available",
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
                            text = "When using headphones, all audio will play only on headphones.",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Volume button Stops Azan",
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
                            text = "Azan stops playing when the volume button is pressed.",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
                Column {
                    Row(
                        modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {

                        Text(
                            text = "Don’t Show Alarm Screen",
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
                            text = "When enabled, the screen will remain off when Azan or reminder starts playing, and alarm screen won’t be shown.",
                            modifier
                                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            fontSize = 14.sp,
                        )

                    }
                }
            }
            Spacer(modifier.padding(50.dp))

        }

    }

}

