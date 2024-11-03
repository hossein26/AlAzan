package com.example.alazan.ui.settings.screens.reminder

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReminderDialog(modifier: Modifier = Modifier, onDismiss: () -> Unit) {


    var value by remember { mutableStateOf("") }
    Dialog(
        onDismissRequest = { onDismiss() },

        )
    {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp)
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

            ) {

                OutlinedTextField(
                    value = value + "Give me a name",
                    onValueChange = { value = it },
                    label = { Text("Lable") },
                    placeholder = {
                        Text(
                            "00:00",
                            style = TextStyle(
                                fontSize = 12.sp,
                                fontFamily = MaterialTheme.typography.bodySmall.fontFamily,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                        )
                    },
                    modifier = modifier
                        .height(70.dp)
                        .padding(start = 18.dp, end = 18.dp, top = 12.dp, bottom = 4.dp),
                    textStyle = TextStyle(
                        fontSize = 12.sp,
                        fontStyle = MaterialTheme.typography.bodyLarge.fontStyle,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                )

                HorizontalDivider(
                    modifier = Modifier
                        .padding(8.dp),
                    thickness = 1.dp,
                    color = Color(0xFFBDC9C9)
                )
                Text(
                    text = "Time",
                    modifier
                        .padding(start = 18.dp, end = 18.dp),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )


                // menu 1
                var expanded1 by remember { mutableStateOf(false) }
                var selectedOption1 by remember { mutableStateOf("5 min") }
                val options1 = listOf("5 min", "10 min", "15 min")

                // menu 2
                var expanded2 by remember { mutableStateOf(false) }
                var selectedOption2 by remember { mutableStateOf("Before") }
                val options2 = listOf("Before", "After")

                // menu 3
                var expanded3 by remember { mutableStateOf(false) }
                var selectedOption3 by remember { mutableStateOf("Fajr") }
                val options3 = listOf("Data", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 16.dp, end = 16.dp)
                ) {


                    // DropdownMenu 1
                    ExposedDropdownMenuBox(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(52.dp)
                            .weight(1f),
                        expanded = expanded1,
                        onExpandedChange = { expanded1 = !expanded1 }
                    ) {
                        OutlinedTextField(
                            value = selectedOption1,
                            onValueChange = { },
                            readOnly = true,
                            label = { Text("") },
                            modifier = Modifier
                                .padding(end = 8.dp),
                            colors = OutlinedTextFieldDefaults.colors(
                                MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            textStyle = TextStyle(
                                fontSize = 12.sp,
                                fontStyle = MaterialTheme.typography.labelLarge.fontStyle,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                            ),

                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded1)
                                Icon(
                                    imageVector = Icons.Default.ArrowDropDown,
                                    contentDescription = "",
                                    tint = Color(0xFF4C5E5E),
                                    modifier = Modifier.size(8.dp)
                                )

                            },
                        )

                        DropdownMenu(
                            expanded = expanded1,
                            onDismissRequest = { expanded1 = true },
                            modifier = Modifier
                                .wrapContentWidth()
                                .padding(1.dp)
                        ) {
                            options1.forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        selectedOption1 = option
                                        expanded1 = true
                                    }
                                )
                            }
                        }
                    }


                    // DropdownMenu 2
                    ExposedDropdownMenuBox(
                        modifier = Modifier
                            .wrapContentWidth()
                            .height(52.dp)
                            .weight(1f),
                        expanded = expanded2,
                        onExpandedChange = { expanded2 = !expanded2 }
                    ) {
                        OutlinedTextField(
                            value = selectedOption2,
                            onValueChange = { },
                            readOnly = true,
                            label = { Text("") },
                            modifier = Modifier,
                            textStyle = TextStyle(
                                fontSize = 12.sp,
                                fontStyle = MaterialTheme.typography.labelLarge.fontStyle,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            colors = OutlinedTextFieldDefaults.colors(
                                MaterialTheme.colorScheme.onSurfaceVariant
                            ),
                            trailingIcon = {
                                ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded2)
                                Icon(
                                    imageVector = Icons.Default.ArrowDropDown,
                                    contentDescription = "",
                                    tint = Color(0xFF4C5E5E),
                                    modifier = Modifier.size(8.dp)
                                )
                            }
                        )

                        DropdownMenu(
                            expanded = expanded2,
                            onDismissRequest = { expanded2 = false },
                            modifier = Modifier
                                .wrapContentWidth()
                                .height(40.dp)
                        ) {
                            options2.forEach { option ->
                                DropdownMenuItem(
                                    text = { Text(option) },
                                    onClick = {
                                        selectedOption2 = option
                                        expanded2 = false
                                    }
                                )
                            }
                        }
                    }
                }

                // DropdownMenu 3
                ExposedDropdownMenuBox(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .padding(start = 8.dp, end = 8.dp),
                    expanded = expanded3,
                    onExpandedChange = { expanded3 = !expanded3 }
                ) {
                    OutlinedTextField(
                        value = selectedOption3,
                        onValueChange = { },
                        readOnly = true,
                        label = { Text("") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            MaterialTheme.colorScheme.onSurfaceVariant
                        ),
                        textStyle = TextStyle(
                            fontSize = 12.sp,
                            textAlign = TextAlign.Center,
                            fontStyle = MaterialTheme.typography.labelLarge.fontStyle,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        ),

                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded3)
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "",
                                tint = Color(0xFF4C5E5E),
                                modifier = Modifier.size(8.dp)
                            )

                        },
                    )

                    DropdownMenu(
                        expanded = expanded3,
                        onDismissRequest = { expanded3 = false },
                        modifier = Modifier
                            .wrapContentWidth()
                            .heightIn(52.dp)
                    ) {
                        options3.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    selectedOption3 = option
                                    expanded3 = false
                                }
                            )
                        }
                    }
                }

                HorizontalDivider(
                    modifier = Modifier
                        .padding(8.dp),
                    thickness = 1.dp,
                    color = Color(0xFFBDC9C9)
                )

                Text(
                    text = "Sound",
                    modifier
                        .padding(start = 18.dp, end = 18.dp),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )

                // menu 4
                var expanded4 by remember { mutableStateOf(false) }
                var selectedOption4 by remember { mutableStateOf("Default (Notification)") }
                val options4 = listOf("Data", "Fajr", "Dhuhr", "Maghrib", "Isha", "Asr")

                // DropdownMenu 4
                ExposedDropdownMenuBox(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp)
                        .padding(start = 8.dp, end = 8.dp),
                    expanded = expanded4,
                    onExpandedChange = { expanded4 = !expanded4 }
                ) {
                    OutlinedTextField(
                        value = selectedOption4,
                        onValueChange = { },
                        readOnly = true,
                        label = { Text("") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.dp, end = 8.dp),
                        colors = OutlinedTextFieldDefaults.colors(
                            MaterialTheme.colorScheme.onSurfaceVariant
                        ),
                        textStyle = TextStyle(
                            fontSize = 12.sp,
                            textAlign = TextAlign.Start,
                            fontStyle = MaterialTheme.typography.labelLarge.fontStyle,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        ),

                        trailingIcon = {
                            ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded4)
                            Icon(
                                imageVector = Icons.Default.ArrowDropDown,
                                contentDescription = "",
                                tint = Color(0xFF4C5E5E),
                                modifier = Modifier.size(8.dp)
                            )

                        },
                    )

                    DropdownMenu(
                        expanded = expanded4,
                        onDismissRequest = { expanded4 = false },
                        modifier = Modifier
                            .wrapContentWidth()
                            .heightIn(52.dp)
                    ) {
                        options4.forEach { option ->
                            DropdownMenuItem(
                                text = { Text(option) },
                                onClick = {
                                    selectedOption4 = option
                                    expanded4 = false
                                }
                            )
                        }
                    }
                }

                HorizontalDivider(
                    modifier = Modifier
                        .padding(8.dp),
                    thickness = 1.dp,
                    color = Color(0xFFBDC9C9)
                )

                Text(
                    text = "Options",
                    modifier
                        .padding(start = 18.dp, end = 18.dp),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Only Once",
                        modifier
                            .padding(start = 10.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
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
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                )
                {

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Sunday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Monday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Tuesday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }


                }

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp),
                    horizontalArrangement = Arrangement.Center
                )
                {

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Wednesday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Thursday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }

                    Box(
                        modifier
                            .clickable { }
                            .padding(end = 6.dp)
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Friday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
                        )
                    }


                }


                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.Center
                )
                {

                    Box(
                        modifier
                            .clickable { }
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(Color(0xFF008083)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Saturday",
                            modifier = Modifier
                                .padding(start = 8.dp, end = 8.dp, top = 6.dp, bottom = 6.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFFFFFFF)
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











