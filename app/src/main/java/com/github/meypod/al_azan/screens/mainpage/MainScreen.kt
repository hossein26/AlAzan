package com.github.meypod.al_azan.screens.mainpage

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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
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
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.Navigation.ABOUT_US
import com.github.meypod.al_azan.Navigation.COUNTER
import com.github.meypod.al_azan.Navigation.MONTHLY_VIEW
import com.github.meypod.al_azan.Navigation.QIBLA
import com.github.meypod.al_azan.Navigation.REMINDER
import com.github.meypod.al_azan.Navigation.SETTINGS
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.IslamicPatternBackground
import com.github.meypod.al_azan.general_components.OutlinedTextFieldWithLabel
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val fontScale = LocalConfiguration.current.fontScale
    val topBarHeight = if (fontScale >= 1.5f) 90.dp else 72.dp
    val iconSize = if (fontScale >= 1.5f) 36.dp else 24.dp
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val currentDate = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMM yyyy"))
    } else {
        TODO("VERSION.SDK_INT < O")
    }
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            val navItems = listOf(
                NavItem(R.drawable.ic_clock, R.string.reminders, REMINDER),
                NavItem(R.drawable.ic_qibla, R.string.qibla, QIBLA),
                NavItem(R.drawable.ic_counter, R.string.counter, COUNTER),
                NavItem(R.drawable.ic_settings, R.string.settings, SETTINGS),
                NavItem(R.drawable.ic_information_outlined, R.string.about_us, ABOUT_US)
            )
            SampleNavigationDrawer(
                navItems = navItems,
                navController = navController,
                scope = scope,
                drawerState = drawerState
            )
        },
        content = {
            Scaffold(
                topBar = {
                    CenterAlignedTopAppBar(
                        title = {
                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .background(MaterialTheme.colorScheme.surface)
                                    .clickable {
                                        navController.navigate(MONTHLY_VIEW)
                                    },
                                horizontalArrangement = Arrangement.Center,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier.size(dimensionResource(R.dimen.icon_size_small)),
                                    painter = painterResource(R.drawable.ic_calendar),
                                    contentDescription = stringResource(R.string.calendar),
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                                Spacer(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                                Text(
                                    text = currentDate,
                                    style = MaterialTheme.typography.bodyMedium.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    )
                                )
                            }
                        },
                        navigationIcon = {
                            Column(
                                modifier = modifier.fillMaxHeight(),
                                verticalArrangement = Arrangement.Center
                            ) {
                                IconButton(onClick = {
                                    scope.launch {
                                        drawerState.open() // Open the drawer when clicked
                                    }
                                }) {
                                    Icon(
                                        modifier = modifier.size(iconSize),
                                        imageVector = Icons.Default.Menu,
                                        contentDescription = stringResource(R.string.menu)
                                    )
                                }
                            }

                        },
                        modifier = Modifier
                            .height(topBarHeight)
                            .background(MaterialTheme.colorScheme.surface)
                            .shadow(elevation = dimensionResource(R.dimen.shadow_elevation_low))
                    )
                },
                content = { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                            .background(MaterialTheme.colorScheme.background)
                    ) {
                        PrayerTime(modifier, navController)
                    }
                }
            )
        }
    )
}
@Composable
fun PrayerTime(modifier: Modifier, navController: NavController) {
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
    var highlightFound = false
    val currentTime = remember {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalTime.now()
        } else {
            TODO("VERSION.SDK_INT < O")
        }
    }
    val formatter = DateTimeFormatter.ofPattern("HH:mm")
    val closestTime = prayerTimes.filter {
        LocalTime.parse(it.second, formatter).isAfter(currentTime)
    }.minByOrNull {
        LocalTime.parse(it.second, formatter)
            .toSecondOfDay() - currentTime.toSecondOfDay()
    } ?: prayerTimes.last()
    Column{
        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
        IslamicPatternBackground(
            modifier = modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            color = Color(0xFF008083)
        ) {
            Column(
                modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(R.dimen.padding_card))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = modifier
                                .size(dimensionResource(R.dimen.circle_button_size))
                                .clip(
                                    CircleShape
                                )
                                .background(MaterialTheme.colorScheme.secondaryContainer),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_prev_page),
                                contentDescription = stringResource(R.string.perv_page),
                                tint = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        }
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            stringResource(R.string.prev_day),
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Center
                        )
                    }
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            stringResource(R.string.next_day),
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.labelLarge,
                            fontWeight = FontWeight.SemiBold,
                            textAlign = TextAlign.Center
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                        Box(
                            modifier = modifier
                                .size(dimensionResource(R.dimen.circle_button_size))
                                .clip(
                                    CircleShape
                                )
                                .background(MaterialTheme.colorScheme.secondaryContainer),
                            contentAlignment = Alignment.Center,
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_next_page),
                                contentDescription = stringResource(R.string.next_page),
                                tint = MaterialTheme.colorScheme.onSecondaryContainer
                            )
                        }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier = Modifier
                ) {
                    Text(
                        "Monday",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Medium,
                        modifier = modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                    Text(
                        "Shawwal 15, 1445 AH",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Medium,
                        modifier = modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = modifier.align(Alignment.CenterVertically),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            modifier = modifier.size(dimensionResource(R.dimen.icon_size_button)),
                            painter = painterResource(R.drawable.ic_find_location),
                            contentDescription = stringResource(R.string.city),
                            tint = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            text = "Tehran",
                            textDecoration = TextDecoration.Underline,
                            style = MaterialTheme.typography.labelMedium,
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            fontWeight = FontWeight.Medium,
                        )
                    }
                    Box{
                        OutlinedTextFieldWithLabel(
                            value = "-00:18:36",
                            onValueChange = {},
                            label = "Next Prayer:"
                        )
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
            }
        }
        // Prayer times list
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .offset(y = dimensionResource(R.dimen.list_offset)),
            contentPadding = PaddingValues(dimensionResource(R.dimen.item_content_padding))
        ) {
            items(prayerTimes.size) { index ->
                val prayer = prayerTimes[index]
                val prayerLocalTime =
                    LocalTime.parse(prayer.second, DateTimeFormatter.ofPattern("HH:mm"))
                val isAfterHighlight = !highlightFound && currentTime.isBefore(prayerLocalTime)
                val highlight = highlightFound
                if (isAfterHighlight) highlightFound = true
                val roundedCornerShape = when (index) {
                    prayerTimes.indices.first -> RoundedCornerShape(
                        topStart = dimensionResource(R.dimen.card_radius),
                        topEnd = dimensionResource(R.dimen.card_radius)
                    )
                    prayerTimes.indices.last -> RoundedCornerShape(
                        bottomEnd = dimensionResource(R.dimen.card_radius),
                        bottomStart = dimensionResource(R.dimen.card_radius)
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
    applyBorder: Boolean,
) {
    val backgroundColor = when {
        //highlight -> MaterialTheme.colorScheme.onTertiary
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
            .then(
                if (highlight) {
                    Modifier
                        .clip(
                            RoundedCornerShape(
                                topStart = dimensionResource(R.dimen.corner_radius_large),
                                topEnd = dimensionResource(R.dimen.corner_radius_large)
                            )
                        )
                        .background(
                            MaterialTheme.colorScheme.onTertiary
                        )
                } else {
                    Modifier
                }
            )
            .padding(dimensionResource(R.dimen.spacer_items))
            .then(
                if (applyBorder) {
                    val strokeColor = MaterialTheme.colorScheme.outline.toArgb()
                    Modifier.drawBehind {
                        // Set up the paint for the dotted border
                        val strokeWidth = 2f
                        val dashWidth = 20f
                        val dashGap = 20f
                        val paint = android.graphics
                            .Paint()
                            .apply {
                                color = strokeColor
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
            .padding(dimensionResource(R.dimen.list_item_stroke_padding)), // Add padding inside the border
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = prayerName, style = textStyle)
        Text(text = prayerTime, style = textStyle)
    }
}