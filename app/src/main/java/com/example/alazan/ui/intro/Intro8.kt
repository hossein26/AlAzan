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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.general_components.SwitchWithText
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro8(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        var isChecked by remember { mutableStateOf(true) }
        val vibrationMode = listOf(
            "Once", "Twice"
        )
        val upcommingAlarm = listOf(
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
                        .padding(16.dp)
                        .padding(bottom = 100.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Notification",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
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
                            .padding(top = 16.dp, bottom = 20.dp, start = 20.dp, end = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_alarm),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = 36.dp)
                        )
                        Spacer(modifier.padding(horizontal = 2.dp))
                        Text(
                            text = "Let Us Remind Your PrayerTimes As You Like.",
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight(700)
                            ),
                            modifier = Modifier
                                .padding(8.dp),
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(12.dp)
                    ) {
                        Text(
                            text = "Vibration Mode",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Text(
                            text = "Should phone vibrate when Azan or reminders start playing ?",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Spacer(modifier.padding(6.dp))
                        SimpleDropdownMenu(items = vibrationMode) {}
                    }
                    Spacer(modifier.padding(6.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        SwitchWithText(
                            title = "Show “Upcoming Alarm” Notification",
                            description = "If enabled, a notification will be shown around one hour before any prayer time or reminder that has sound  ",
                            onCheckedChange = {checked ->
                                isChecked = checked
                            },
                            isChecked = isChecked
                        )
                        SwitchWithText(
                            title = "Show “Next” in Notification",
                            description = "If enabled, when a notification is shown, it will contain info for the next prayer time ",
                            onCheckedChange = {},
                            isChecked = true
                        )
                        Spacer(modifier.padding(6.dp))
                        Text(
                            text = "Custom upcoming alarm time",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Text(
                            text = "Adjust when “Upcoming Alarm” notification will be shown. Both Azan and reminder.",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant)
                        )
                        Spacer(modifier.padding(6.dp))
                        SimpleDropdownMenu(items = upcommingAlarm) {}
                    }
                    Spacer(modifier.padding(6.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        SwitchWithText(
                            title = "Bypass “Do not Disturb”",
                            description = "Should app still play Azan when “Do not Disturb” is active ?",
                            onCheckedChange = {},
                            isChecked = true
                        )
                        SwitchWithText(
                            title = "Use headphones when available",
                            description = "When using headphones, all audio will play only on headphones.",
                            onCheckedChange = {},
                            isChecked = true
                        )
                        SwitchWithText(
                            title = "Volume button Stops Azan",
                            description = "Azan stops playing when the volume button is pressed.",
                            onCheckedChange = {},
                            isChecked = true
                        )
                        SwitchWithText(
                            title = "Don’t Show Alarm Screen",
                            description = "When enabled, the screen will remain off when Azan or reminder starts playing, and alarm screen won’t be shown.",
                            onCheckedChange = {},
                            isChecked = true
                        )
                    }
                    Spacer(modifier = modifier.padding(30.dp))
                }
                Footer(modifier.align(Alignment.BottomCenter)){
                    navController.navigate("intro9")
                }
            }
        }

    }

}






