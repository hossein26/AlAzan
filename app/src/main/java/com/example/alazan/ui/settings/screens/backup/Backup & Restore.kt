package com.example.alazan.ui.settings.screens.backup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun Backup(navController: NavController, modifier: Modifier = Modifier) {

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
                        painter = painterResource(R.drawable.icon_backup),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Backup & Restore",
                        modifier
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        style = MaterialTheme.typography.titleLarge
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
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer),

            ) {
                Column(
                    modifier
                        .padding(8.dp).fillMaxWidth(),
                ) {

                    Text(
                        text = "Create A Backup",
                        modifier
                            .padding(4.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Text(
                        text = "You can create a backup file from settings you already implemented and restore them any time.\n" +
                                "\n" +
                                "• Note that Custom sounds and muezzins will not be \n   exported",
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Box(
                        modifier
                            .height(50.dp)
                            .padding(4.dp)
                            .clip(RoundedCornerShape(100.dp))
                            .background(color = Color(0xFF00585A))
                            .align(Alignment.CenterHorizontally),

                        ) {
                        Icon(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .size(16.dp)
                                .align(Alignment.CenterStart),
                            painter = painterResource(R.drawable.ic_save),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF)
                        )

                        Text(
                            text = "Create A Backup",
                            modifier
                                .align(Alignment.Center)
                                .padding(start = 40.dp, end = 24.dp),
                            color = Color(0xFFFFFFFF),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                        )

                    }

                }

            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .padding(8.dp)

                ) {

                    Text(
                        text = "Restore",
                        modifier
                            .padding(4.dp),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall
                    )

                    Text(
                        text = "Restore your settings from a backup file.",
                        modifier
                            .padding(8.dp),
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )

                    Box(
                        modifier
                            .height(50.dp)
                            .padding(4.dp)
                            .clip(RoundedCornerShape(100.dp))
                            .background(color = Color(0xFF00585A))
                            .align(Alignment.CenterHorizontally),

                        ) {
                        Icon(
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .size(16.dp)
                                .align(Alignment.CenterStart),
                            painter = painterResource(R.drawable.ic_restore),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF)
                        )

                        Text(
                            text = "Restore Settings",
                            modifier
                                .align(Alignment.Center)
                                .padding(start = 40.dp, end = 24.dp),
                            color = Color(0xFFFFFFFF),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge
                        )

                    }

                }

            }
        }
    }

}