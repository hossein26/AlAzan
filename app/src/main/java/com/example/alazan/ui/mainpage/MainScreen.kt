package com.example.alazan.ui.mainpage

import android.os.Build
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.CustomOutlinedTextFieldWithLabel
import com.example.alazan.ui.components.PatternBackgroundBox
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavController, modifier: Modifier = Modifier) {

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val currentDate = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy"))
    } else {
        TODO("VERSION.SDK_INT < O")
    }

    val darkenedSurfaceContainer = lerp(
        MaterialTheme.colorScheme.surfaceContainer,
        Color.Black, // Blend with black to darken
        0.05f // Darken by 20%, adjust for desired effect
    )

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            // Drawer content goes here
            Column(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .width(249.dp)
                    .offset(y = 24.dp)
                    .fillMaxHeight()
                    .padding(horizontal = 8.dp)
            ) {
                Box(
                    modifier = modifier
                        .height(44.dp)
                        .fillMaxWidth(),
                    contentAlignment = Alignment.CenterEnd,
                ) {
                    IconButton( onClick = {
                        scope.launch {
                            drawerState.close()
                        }
                    }) {
                        Icon(
                            painter = painterResource(R.drawable.ic_prev_page),
                            contentDescription = "back",
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("reminder")
                        }
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_clock),
                        contentDescription = "Reminder",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.width(6.dp))
                    Text("Reminder", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface)
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("quibla")
                        }
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_quibla),
                        contentDescription = "Quibla",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.width(6.dp))
                    Text("Quibla", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface)
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("counter")
                        }
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_counter),
                        contentDescription = "Counter",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.width(6.dp))
                    Text("Counter", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface)
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("settings")
                        }
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_settings),
                        contentDescription = "Settings",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.width(6.dp))
                    Text("Settings", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface)
                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .clickable {
                            navController.navigate("about_us")
                        }
                        .padding(vertical = 16.dp, horizontal = 8.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_information_outlined),
                        contentDescription = "About Us",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.width(6.dp))
                    Text("About Us", style = MaterialTheme.typography.bodyLarge, color = MaterialTheme.colorScheme.onSurface)
                }
            }
        },
        content = {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Row(
                                modifier = Modifier
                                    .background(MaterialTheme.colorScheme.surface)
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp)
                                    ,
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.ic_calendar),
                                    contentDescription = "calendar",
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.padding(horizontal = 6.dp))
                                Text(
                                    text = currentDate, // Display the current date
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                )
                            }
                        },
                        navigationIcon = {
                            IconButton(onClick = {
                                scope.launch {
                                    drawerState.open() // Open the drawer when clicked
                                }
                            }) {
                                Icon(Icons.Default.Menu, contentDescription = "Menu")
                            }
                        },
                        actions = {
                            IconButton(onClick = { /* Handle next day */ }) {

                            }
                        },
                        modifier = Modifier.background(MaterialTheme.colorScheme.surface).shadow(elevation = 4.dp)
                    )
                },
                content = { innerPadding ->
                    // Main content goes here
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(MaterialTheme.colorScheme.background)
                    ) {
                        PrayerTime(modifier)
                    }
                }
            )
        }
    )
}


@Composable
fun PrayerTime(modifier: Modifier) {
    // Data for prayer times
    val prayerTimes = listOf(
        "Fajr" to "03:45",
        "Sunrise" to "05:45",
        "Dhuhr" to "12:30",
        "Asr" to "15:45",
        "Sunset" to "18:30",
        "Maghrib" to "18:45",
        "Isha" to "19:30",
        "Midnight" to "23:45",
        "Tahajjud" to "02:45"
    )


    val currentTime = remember {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalTime.now()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }
    val formatter = DateTimeFormatter.ofPattern("HH:mm")

    // Find the closest prayer time
    val closestTime = prayerTimes.filter {
        LocalTime.parse(it.second.toString(), formatter).isAfter(currentTime)
    }.minByOrNull {
        LocalTime.parse(it.second.toString(), formatter)
            .toSecondOfDay() - currentTime.toSecondOfDay()
    } ?: prayerTimes.last() // If no upcoming prayer, take the last prayer

    var highlightFound = false

    Column(modifier = Modifier.fillMaxSize().shadow(elevation = 1.dp)) {
        Spacer(modifier.padding(1.dp))
        PatternBackgroundBox(
            kind = 1,
            modifier = modifier
                .fillMaxWidth()
                .height(198.dp)

        ) {
            Box(
                modifier

                    .fillMaxWidth()
                    .height(198.dp)
                    .padding(12.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.TopStart),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row {
                        Box(
                            modifier = modifier
                                .size(40.dp)
                                .clip(
                                    CircleShape
                                )
                                .background(MaterialTheme.colorScheme.secondaryContainer),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_prev_page),
                                contentDescription = "next page",
                                tint = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        }
                        Spacer(modifier.padding(horizontal = 4.dp))
                        Text(
                            "Prev\nDay",
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                    }
                    Row {
                        Text(
                            "Next\nDay",
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight(600),
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier.padding(horizontal = 4.dp))
                        Box(
                            modifier = modifier
                                .size(40.dp)
                                .clip(
                                    CircleShape
                                )
                                .background(MaterialTheme.colorScheme.secondaryContainer),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_next_page),
                                contentDescription = "next page",
                                tint = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .align(Alignment.Center)
                ) {
                    Text(
                        "Monday",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight(500),
                        modifier = modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier.padding(2.dp))
                    Text(
                        "Shawwal 15, 1445 AH",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight(500),
                        modifier = modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
                // Location and Next Prayer
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .align(Alignment.BottomCenter),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = modifier.align(Alignment.CenterVertically),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(15.dp),
                            painter = painterResource(R.drawable.ic_find_location),
                            contentDescription = "city",
                            tint = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Spacer(modifier.padding(horizontal = 4.dp))
                        Text(
                            text = "Tehran",
                            textDecoration = TextDecoration.Underline,
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontWeight = FontWeight(500)
                        )
                    }
                    Row {
                        CustomOutlinedTextFieldWithLabel(
                            label = "Next Prayer:",
                            value = "-00:18:36",
                            onValueChange = {},
                        )
                    }


                }
            }
        }


        // Prayer times list
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .offset(y = -24.dp)
                ,
            contentPadding = PaddingValues(8.dp)
        ) {
            items(prayerTimes.size) { index ->
                val prayer = prayerTimes[index]
                val time = LocalTime.parse(prayer.second.toString(), formatter)

                // Check if the current prayer is the closest
                val isClosest = prayer == closestTime
                // val highlight = currentTime == prayerLocalTime
                //val isAfterHighlight = currentTime.isAfter(prayerLocalTime)

                // Parse prayerTime into LocalTime format for comparison
                val prayerLocalTime =
                    LocalTime.parse(prayer.second, DateTimeFormatter.ofPattern("HH:mm"))
                val isAfterHighlight = !highlightFound && currentTime.isBefore(prayerLocalTime)

                // After the first highlighted prayer, mark remaining as after highlight
                val highlight = highlightFound
                if (isAfterHighlight) highlightFound = true

                //shape of list
                val roundedCornerShape = when (index) {
                    prayerTimes.indices.first -> RoundedCornerShape(
                        topStart = 16.dp,
                        topEnd = 16.dp
                    )

                    prayerTimes.indices.last -> RoundedCornerShape(
                        bottomEnd = 16.dp,
                        bottomStart = 16.dp
                    )

                    else -> RoundedCornerShape(0.dp)
                }

                val applyBorder =
                    prayer.first == "Sunrise" || prayer.first == "Sunset" || prayer.first == "Midnight" || prayer.first == "Tahajjud"
                ConditionalRoundedDottedBorderRow(
                    prayerName = prayer.first,
                    prayerTime = prayer.second,
                    highlight = isAfterHighlight,
                    isBeforeHighlight = highlight,
                    clip = roundedCornerShape,
                    applyBorder = applyBorder
                )
            }
        }
    }
}


@Composable
fun ConditionalRoundedDottedBorderRow(
    prayerName: String,
    prayerTime: String,
    highlight: Boolean,
    isBeforeHighlight: Boolean,
    clip: RoundedCornerShape,
    applyBorder: Boolean, // Flag to conditionally apply the dotted border
) {
    val backgroundColor = when {
        highlight -> MaterialTheme.colorScheme.onTertiary
        isBeforeHighlight -> MaterialTheme.colorScheme.secondaryContainer
        else -> MaterialTheme.colorScheme.surfaceVariant
    }
    val textStyle = when {
        highlight -> MaterialTheme.typography.bodyLarge.copy(
            color = MaterialTheme.colorScheme.onTertiaryContainer,
            fontWeight = FontWeight.SemiBold
        )

        isBeforeHighlight -> MaterialTheme.typography.bodyLarge.copy(MaterialTheme.colorScheme.onSecondaryContainer)
        else -> MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.outline)
    }
    Row(
        modifier = Modifier

            .clip(clip)

            .fillMaxWidth()
            .background(
                backgroundColor
            )
            .padding(8.dp)

            .then(
                if (applyBorder) {
                    Modifier.drawBehind {
                        // Set up the paint for the dotted border
                        val strokeWidth = 2f
                        val dashWidth = 20f
                        val dashGap = 20f
                        val paint = android.graphics
                            .Paint()
                            .apply {
                                color = (0xFF6E7979).toInt()
                                style = android.graphics.Paint.Style.STROKE
                                pathEffect = android.graphics.DashPathEffect(
                                    floatArrayOf(dashWidth, dashGap), 0f
                                )
                                this.strokeWidth = strokeWidth
                            }

                        // Define the rectangle for the border
                        val borderRect = android.graphics.RectF(
                            0f + strokeWidth / 2,
                            0f + strokeWidth / 2,
                            size.width - strokeWidth / 2,
                            size.height - strokeWidth / 2
                        )

                        // Draw the dotted border
                        drawContext.canvas.nativeCanvas.drawRoundRect(
                            borderRect, 30f, 30f, paint
                        )
                    }
                } else {
                    Modifier // No border if `applyBorder` is false
                }
            )

            .padding(12.dp), // Add padding inside the border
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = prayerName, style = textStyle)
        Text(text = prayerTime, style = textStyle)
    }
}




