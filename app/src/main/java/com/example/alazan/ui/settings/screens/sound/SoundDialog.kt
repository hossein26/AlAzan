package com.example.alazan.ui.settings.screens.sound

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun SoundDialog(modifier: Modifier = Modifier,onDismiss :() -> Unit) {

    AlAzanTheme {
        var value by remember { mutableStateOf("") }

        // menu 1
        var expanded1 by remember { mutableStateOf(false) }
        var selectedOption1 by remember { mutableStateOf("5 min") }
        val items1 = listOf("5 min", "10 min", "15 min")
        val customMuazzin = listOf("Default", "Abdolbaset")

        // menu 2
        var expanded2 by remember { mutableStateOf(false) }
        var selectedOption2 by remember { mutableStateOf("Before") }
        val items2 = listOf("Before", "After")

        // menu 3
        var expanded3 by remember { mutableStateOf(false) }
        var selectedOption3 by remember { mutableStateOf("Fajr") }
        val options3 = listOf("Data", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")
        Dialog(
            onDismissRequest = { onDismiss() },

            )
        {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    //.padding(8.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer),
                shape = MaterialTheme.shapes.medium,
                elevation = CardDefaults.cardElevation(16.dp)
            ) {

                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(28.dp))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(16.dp)
                ) {
                    Text(
                        text = "Custom Muazzin",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Spacer(modifier.padding(3.dp))

                    SimpleDropdownMenu(
                        items = customMuazzin,
                        //modifier = Modifier
                    ) { }


                    HorizontalDivider(
                        modifier = Modifier
                            .padding(vertical = 8.dp),
                        thickness = 1.dp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Text(
                        text = "Azan",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 8.dp),
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Sunday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Monday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Tuesday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }


                    }

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Wednesday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Thursday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Friday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }


                    }


                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 8.dp),
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.tertiaryContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Saturday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onTertiaryContainer
                            )
                        }
                    }

                    HorizontalDivider(
                        modifier = Modifier
                            .padding(8.dp),
                        thickness = 1.dp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Text(
                        text = "Custom Notification:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(3.dp))
                    // menu 4
                    var expanded4 by remember { mutableStateOf(false) }
                    var selectedOption4 by remember { mutableStateOf("Default (Notification)") }
                    val options4 = listOf("Data", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")

                    SimpleDropdownMenu(items = options4) { }

                    HorizontalDivider(
                        modifier = Modifier
                            .padding(vertical = 8.dp),
                        thickness = 1.dp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                    Text(
                        text = "Notifications",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 8.dp),
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Sunday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Monday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Tuesday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }


                    }

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding( end = 8.dp),
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Wednesday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Thursday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }

                        Box(
                            modifier
                                .clickable { }
                                .padding(end = 6.dp)
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Friday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }


                    }


                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 8.dp),
                    )
                    {

                        Box(
                            modifier
                                .clickable { }
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .clip(shape = RoundedCornerShape(8.dp))
                                .background(MaterialTheme.colorScheme.inversePrimary),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Saturday",
                                modifier = Modifier
                                    .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                    }

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(top = 24.dp, end = 8.dp, bottom = 24.dp),
                        horizontalArrangement = Arrangement.End
                    )
                    {

                        OutlinedButton(
                            onClick = {},
                            modifier
                                .wrapContentWidth()
                                .wrapContentHeight()
                                .padding(end = 8.dp),

                            ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Cancel",
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color(0xFFBA1A1A)
                            )
                        }


                        Button(
                            onClick = {},
                            modifier
                                .wrapContentWidth()
                                .wrapContentHeight(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF008083)
                            )

                        ) {
                            Text(
                                textAlign = TextAlign.Center,
                                text = "Confirm",
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge,
                                color = Color(0xFFFFFFFF)
                            )
                        }
                    }


                }
            }
        }
    }
}










