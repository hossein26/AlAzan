package com.example.alazan

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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun AboutUs(navController: NavController, modifier: Modifier = Modifier) {

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
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Icon(
                    modifier = Modifier
                        .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                        .size(16.dp),
                    painter = painterResource(R.drawable.icon_back),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,

                    )

                Row(
                    modifier
                        .wrapContentWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Icon(
                        painter = painterResource(R.drawable.icon_info),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "About Us",
                        modifier
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleMedium
                    )

                }

                Box(modifier = Modifier.size(24.dp))


            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),
            ) {

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp, top = 8.dp, bottom = 4.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Column {

                        Text(
                            text = "Version",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "1.58.1",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }


                }

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Column {

                        Text(
                            text = "Home",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "Https://URL.something.gov",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.primary
                        )
                    }


                }
                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Column {

                        Text(
                            text = "License",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Text(
                            text = "AGPL-3.0",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }


                }


                HorizontalDivider(
                    modifier = Modifier
                        .padding(start = 8.dp, end = 8.dp),
                    thickness = 0.5.dp,
                    color = MaterialTheme.colorScheme.outline
                )


                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Column {

                        Text(
                            text = "Your Copyright Gratitude !",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                    }


                }


            }

        }
    }

}


