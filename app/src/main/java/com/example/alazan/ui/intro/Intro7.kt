package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.settings.screens.sound.SoundDialog
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro7(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        val azanNotifList = listOf(
            "Fajr", "Sunrise", "Dhuhr", "Asr", "Sunset", "Maghrib", "Isha", "Midnight", "Tahajjud"
        )
        var showDialog by remember { mutableStateOf(false) }
        PatternBackgroundBox {

            if (showDialog) {
                SoundDialog(){
                    showDialog = false
                }
            }

            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(16.dp)
                        //.padding(bottom = 100.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Azan & Notification",
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight(700)
                        ),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(8.dp)
                    )
                    Row(
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_mdi_talk),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                        )
                        Spacer(modifier.padding(horizontal = 2.dp))
                        Text(
                            text = "Who Is Your Favorite Muazzin?\n" +
                                    "When Should We Play Azan?",
                            color = MaterialTheme.colorScheme.onBackground,
                            style = MaterialTheme.typography.labelMedium.copy(
                                fontWeight = FontWeight(700),
                                fontSize = 16.sp,
                                lineHeight = 24.sp
                            ),
                            modifier = Modifier
                                .padding(8.dp),
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                    ) {
                        Column {
                            Text(
                                text = "Muazzin",
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Text(
                                text = "Ragheb Mustafa Ghalwash",
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.primaryContainer)
                            )
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(24.dp)
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(6.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                    ) {
                        Column {
                            Text(
                                text = "Notification Sound",
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.titleSmall.copy(
                                    MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Text(
                                text = "Bling!",
                                modifier = Modifier
                                    .fillMaxWidth(),
                                style = MaterialTheme.typography.labelMedium.copy(color = MaterialTheme.colorScheme.primaryContainer)
                            )
                        }

                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(24.dp)
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(6.dp))
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
                                    AzanAndNotifItem(item){
                                        showDialog = true
                                    }
                                }
                            }
                            Row {
                                Icon(
                                    painter = painterResource(R.drawable.information_slab_circle_gray),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onSurface,
                                )
                                Text(
                                    "Tahajjud is last third part of the night",
                                    style = MaterialTheme.typography.labelSmall.copy(color = MaterialTheme.colorScheme.onSurface),
                                    modifier = modifier.align(Alignment.CenterVertically).padding(horizontal = 4.dp)
                                )
                            }
                        }

                    }
                    Spacer(modifier = modifier.padding(60.dp))

                }
                Footer(modifier.align(Alignment.BottomCenter)){
                    navController.navigate("intro8")
                }
            }
        }

    }

}

@Composable
fun AzanAndNotifItem(title: String, showDialog: () -> Unit) {
    var notifState by remember { mutableStateOf(ToggleableState.Off) }
    var azanState by remember { mutableStateOf(ToggleableState.Off) }
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth().padding(horizontal = 2.dp)
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
                    Text(
                        text = "Notification",
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 1.33.em,
                        style = MaterialTheme.typography.bodySmall
                    )
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
                Row(
                    verticalAlignment = Alignment.CenterVertically,

                ) {
                    Text(
                        text = "Azan",
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 1.33.em,
                        style = MaterialTheme.typography.bodySmall
                    )
                    TriStateCheckbox(
                        state = azanState, // وضعیت چک‌باکس
                        onClick = {
                            azanState = when (azanState) {
                                ToggleableState.On -> ToggleableState.Off // از Checked به Unchecked
                                ToggleableState.Off -> ToggleableState.Indeterminate // از Unchecked به Indeterminate
                                ToggleableState.Indeterminate -> ToggleableState.On // از Indeterminate به Checked
                            }
                        }
                    )
                }
                Icon(
                    painter = painterResource(id = R.drawable.ic_settings),
                    contentDescription = "Icons/settings_filled_24px",
                    tint = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.clickable {
                        showDialog()
                    }
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.fillMaxWidth(),
            thickness = 0.2.dp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}




