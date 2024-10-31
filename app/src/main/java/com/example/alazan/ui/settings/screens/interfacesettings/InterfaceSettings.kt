package com.example.alazan.ui.settings.screens.interfacesettings

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu


@Composable
fun InterfaceSettings(navController: NavController, modifier: Modifier = Modifier) {
    val azanNotifList = listOf(
        "Fajr", "Sunrise", "Dhuhr", "Asr", "Sunset", "Maghrib", "Isha", "Midnight", "Tahajjud"
    )
    val languageList = listOf(
        "English", "Persian", "France"
    )
    val themeList = listOf(
        "Light", "Dark", "Classic Black", "Classic Light", "System Default", "Dynamic"
    )
    val timerList = listOf(
        "Next Active Azan", "Next Active Reminder"
    )
    val numberingList = listOf(
        "Western", "Arabic"
    )
    val lunarList = listOf(
        "Default", "Arabic", "Persian"
    )
    val calendarList = listOf(
        "Lunar", "Gregorian"
    )
    var selectedTheme by remember { mutableStateOf("Light") }

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
                    painter = painterResource(R.drawable.ic_interface_settings),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier
                        .padding(top = 12.dp, bottom = 12.dp)
                        .size(24.dp)
                        .align(Alignment.CenterVertically)
                )

                Text(
                    text = "Interface Settings",
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
                        text = "Language: ",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    SimpleDropdownMenu(items = languageList) { }

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
                    .fillMaxWidth().background(MaterialTheme.colorScheme.surfaceContainer), horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(
                    modifier
                        .padding(8.dp).background(MaterialTheme.colorScheme.surfaceContainer)
                ) {
                    Text(
                        text = "Themes",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))


                    // Define themes as a list of pairs (label, color)
                    val themes = listOf(
                        "Light" to Color(0xFFE0F7FA),
                        "Dark" to Color.Black,
                        "Classic Black" to Color(0xFF000000),
                        "Classic Light" to Color.White,
                        "System Default" to Color(0xFFE0F7FA),
                        "Dynamic" to Color(0xFFB39DDB)
                    )

                    // Divide themes into rows
                    for (i in themes.indices step 3) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth().background(MaterialTheme.colorScheme.surfaceContainer)
                                .padding(vertical = 4.dp),
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
                            text = "Show Prayer times",
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                        )
                        Spacer(modifier = modifier.padding(2.dp))
                        Text(
                            text = "Choose what prayer times to show on Main Screen.",
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium,
                            modifier = Modifier
                                .fillMaxWidth()

                        )
                        Spacer(modifier = modifier.padding(4.dp))
                        Row(
                            modifier
                                .fillMaxWidth()
                                .requiredHeight(36.dp)
                                .padding(end = 8.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                        ) {
                            Text(
                                text = "Time",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                            )
                            Text(
                                text = "Show",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                            )
                        }
                        Column {
                            azanNotifList.forEach { item ->
                                ShowPrayerTimeItem(item)
                            }
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
                    Row(
                        modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Countdown Timer",
                            modifier
                                .padding(start = 4.dp, end = 4.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight(500)
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
                    Spacer(modifier = modifier.padding(2.dp))
                    Text(
                        text = "Countdown To",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(2.dp))
                    SimpleDropdownMenu(items = timerList) {

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
                        text = "Date and Time",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleMedium,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = FontWeight(500)
                    )
                    Spacer(modifier = modifier.padding(8.dp))
                    Text(
                        text = "Time Format",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = FontWeight(500)
                    )
                    Row(
                        modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Use 24-Hour Fromat",
                            modifier
                                .padding(start = 4.dp, end = 4.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
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
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Numbering System ",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Forces all numbers to be in the selected system.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = numberingList) {

                    }
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Numbering System ",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Forces all numbers to be in the selected system.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = numberingList) {

                    }
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Lunar Calendar Language",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Change the language used for lunar calendar.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = lunarList) {

                    }
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Primary Calendar",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "The calendar that shows on top of the page.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = calendarList) {

                    }
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "Secondary Calendar",
                        modifier
                            .padding(start = 4.dp, end = 4.dp, top = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    Text(
                        text = "The calendar that shows below the day of the week.",
                        modifier
                            .padding(start = 4.dp, end = 4.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier = modifier.padding(4.dp))
                    SimpleDropdownMenu(items = calendarList) {

                    }
                }


            }

        }

        Spacer(modifier.padding(50.dp))

    }
}

@Composable
fun ShowPrayerTimeItem(title: String) {
    var notifState by remember { mutableStateOf(ToggleableState.Off) }
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 2.dp)
        ) {
            Text(
                text = title,
                color = MaterialTheme.colorScheme.onSurface,
                lineHeight = 1.43.em,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight(500)
                ),
                modifier = Modifier
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    TriStateCheckbox(
                        state = notifState, // وضعیت چک‌باکس
                        onClick = {
                            notifState = when (notifState) {
                                ToggleableState.On -> ToggleableState.Off // از Checked به Unchecked
                                ToggleableState.Off -> ToggleableState.Indeterminate // از Unchecked به Indeterminate
                                ToggleableState.Indeterminate -> ToggleableState.On // از Indeterminate به Checked
                            }
                        }
                    )
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.2.dp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Composable
fun ThemeOptionCard(
    color: Color,
    label: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            // Fixed width for consistent size
             // Keep square shape
            .padding(4.dp).fillMaxSize()
            .background(Color.Transparent)
            ,
        onClick = onClick
    ) {
        Column(
            modifier = Modifier

                .wrapContentSize()
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Box for displaying color
            Box(
                modifier = Modifier
                    //.weight(1f)
                    .aspectRatio(1f)
                    .fillMaxSize()
                    .background(color, shape = RoundedCornerShape(8.dp))
            )

            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = isSelected,
                    onClick = onClick,
                )
                Text(
                    text = label,
                    fontSize = 12.sp,
                    style = MaterialTheme.typography.labelMedium,
                    color = MaterialTheme.colorScheme.onSurface,
                )
            }
            
        }
    }
}

