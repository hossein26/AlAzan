package com.example.alazan.ui.settings.screens.reminder

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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun Reminder(navController: NavController, modifier: Modifier = Modifier) {

    var showReminderDialog by remember { mutableStateOf(false) }


    AlAzanTheme {

        if (showReminderDialog) {
            ReminderDialog(){
                showReminderDialog = false
            }
        }
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
                        text = "Reminders",
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

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, top = 4.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = MaterialTheme.colorScheme.surfaceContainer)
            ) {

                Row(
                    modifier
                        .wrapContentHeight()
                        .wrapContentWidth()
                        .padding(4.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        text = "You don’t have any reminder.",
                        modifier
                            .padding(top = 12.dp),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,

                        )

                }

                Button(
                    onClick = {
                        showReminderDialog = true
                    },
                    modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF00585A)
                    )
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_clock_plus),
                        contentDescription = "",
                        tint = Color(0xFFFFFFFF),
                        modifier = Modifier
                            .padding(end = 8.dp)
                            .size(18.dp)
                    )


                    Text(
                        text = "Add A Reminder",
                        color = Color(0xFFFFFFFF),
                        style = MaterialTheme.typography.labelLarge,
                        fontSize = 14.sp
                    )

                }
            }


        }

    }


}