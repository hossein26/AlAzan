package com.example.alazan.ui.settings.screens.reminder

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme



@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Reminder2(modifier: Modifier = Modifier) {

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
                        painter = painterResource(R.drawable.ic_clock_black),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = stringResource(R.string.reminders),
                        modifier
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleMedium
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
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(12.dp),
                        clip = false
                    )
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.reminders_label),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 10.dp, bottom = 4.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,

                        )
                    Text(
                        text = stringResource(R.string.reminders_text),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 16.sp,

                        )
                }
                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.onlyOnce),
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium,
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


            }



            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(12.dp),
                        clip = false
                    )
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.reminders_label),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 10.dp, bottom = 4.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,

                        )
                    Text(
                        text = stringResource(R.string.reminders_text),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 16.sp,

                        )
                }
                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.onlyOnce),
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,
                    )

                    var isChecked by remember { mutableStateOf(false) }
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


            }


            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(12.dp),
                        clip = false
                    )
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.reminders_label),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 10.dp, bottom = 4.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,

                        )
                    Text(
                        text = stringResource(R.string.reminders_text),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 16.sp,

                        )
                }
                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.weekDays),
                        modifier
                            .padding(end = 12.dp),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium,
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


            }


            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .shadow(
                        elevation = 3.dp,
                        shape = RoundedCornerShape(12.dp),
                        clip = false
                    )
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = stringResource(R.string.reminders_label),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 10.dp, bottom = 4.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 14.sp,

                        )
                    Text(
                        text = stringResource(R.string.reminders_text),
                        modifier
                            .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 10.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 16.sp,

                        )
                }
                Row(
                    modifier
                        .align(Alignment.CenterEnd),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                        text = stringResource(R.string.everyday),
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium,
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


            }



            Scaffold(
                floatingActionButton = {
                    FloatingActionButton(onClick = {  },
                        modifier = Modifier
                            .padding(12.dp)
                        ,containerColor = Color(0xFF008083)

                    ) {
                        Icon(painter = painterResource(R.drawable.ic_clock_plus),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF))
                    }
                },
                floatingActionButtonPosition = FabPosition.End
            ){

            }


        }
    }
}