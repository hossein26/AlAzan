package com.example.alazan.ui.settings.screens.calculation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Calculation(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        Scaffold(
            topBar = {

                    Row(
                        modifier
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .fillMaxWidth()
                            .height(48.dp)
                            .padding(top = 24.dp)
                            ,

                        ) {

                        Icon(
                            modifier = Modifier
                                .padding(start = 8.dp, top = 12.dp, bottom = 12.dp)
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
                                painter = painterResource(R.drawable.ic_calculation),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier
                                    .padding(12.dp)
                                    .size(20.dp)
                                    .align(Alignment.CenterVertically)
                            )

                            Text(
                                text = "Calculations",
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

            }
        ) { innerPadding ->
            Column(
                modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(MaterialTheme.colorScheme.background)
            ) {

                Box(
                    modifier
                        .padding(top = 24.dp)
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceContainer)

                ) {
                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                                .size(20.dp)
                                .align(Alignment.Top),
                            painter = painterResource(R.drawable.ic_info_gray),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                        Spacer(modifier = modifier.padding(2.dp))
                        Column(
                            modifier
                                .padding(8.dp)
                        ) {
                            Text(
                                text = "Be Aware",
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.titleSmall,
                                color = MaterialTheme.colorScheme.onSurface,
                                fontWeight = FontWeight(500)
                            )
                            Text(
                                text = "Calculation of Azan has many different methods. Each\n" +
                                        "method provides different results. It is Your\n" +
                                        "responsibility to search and use the right method.",
                                fontSize = 12.sp,
                                style = MaterialTheme.typography.bodySmall.copy(
                                    lineHeight = 16.sp
                                ),
                                color = MaterialTheme.colorScheme.onSurfaceVariant
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
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Calculation Method",
                            modifier
                                .padding(8.dp),
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight(500)
                            )
                        )
                        val list1 = listOf(
                            "Shia Ithna Ashari, Leva Institute, Qum, Iran",
                            "Shia Ithna Ashari, Leva Institute, Qum, Iran",
                            "Shia Ithna Ashari, Leva Institute, Qum, Iran"
                        )
                        SimpleDropdownMenu(
                            modifier
                                .height(52.dp), list1
                        ) { }

                        Spacer(modifier.padding(2.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .border(1.dp, Color.LightGray, shape = RoundedCornerShape(8.dp))
                                .background(Color.Transparent),
                            horizontalArrangement = Arrangement.SpaceBetween,

                            ) {

                            Column(
                                modifier.fillMaxWidth().weight(1f)
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Fajr Angle",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight(600)
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "16",
                                    modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 8.dp),
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 14.sp,
                                    textDecoration = TextDecoration.Underline
                                )
                            }
                            Column(
                                modifier.weight(1f).fillMaxWidth()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Isha Angle",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight(600)
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "14",
                                    modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 8.dp),
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 14.sp,
                                    textDecoration = TextDecoration.Underline
                                )
                            }
                            Column(
                                modifier.weight(1f).fillMaxWidth()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Isha Interval",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight(600)
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "0",
                                    modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 8.dp),
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 14.sp,
                                    textDecoration = TextDecoration.Underline
                                )
                            }

                            Column(
                                modifier.weight(1.2f).fillMaxWidth()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Maghrib Angle",
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 12.sp,
                                    style = MaterialTheme.typography.labelMedium.copy(
                                        fontWeight = FontWeight(600)
                                    ),
                                    textAlign = TextAlign.Center
                                )
                                Text(
                                    text = "4",
                                    modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(top = 8.dp),
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 14.sp,
                                    textDecoration = TextDecoration.Underline
                                )
                            }


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
                            .padding(8.dp)
                    ) {
                        Text(
                            text = "Calendar",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall.copy(
                                fontWeight = FontWeight(500)
                            ),
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(2.dp))
                        Text(
                            text = "The type of lunar calendar shown in main screen and widgets",
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier.padding(4.dp))
                        val list2 = listOf(
                            "Islamic (civil)",
                            "Islamic (civil)",
                            "Islamic (civil)"
                        )
                        SimpleDropdownMenu(
                            modifier
                                .height(52.dp), list2
                        ) { }

                        Row {
                            Icon(
                                modifier = Modifier
                                    .padding(start = 8.dp, top = 12.dp, bottom = 12.dp)
                                    .size(20.dp)
                                    .align(Alignment.Top),
                                painter = painterResource(R.drawable.ic_info_gray),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface,
                            )
                            Spacer(modifier.padding(2.dp))
                            Column(
                                modifier
                                    .padding(8.dp)
                            ) {
                                Text(
                                    text = "Attention!",
                                    fontSize = 14.sp,
                                    style = MaterialTheme.typography.titleSmall,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = "The app’s lunar calendar is pre-calculated and may not" +
                                            " be accurate because it isn’t based on moon sightings. " +
                                            "This especially important to note for the start and end of Ramadan.",
                                    fontSize = 12.sp,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                            }
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

                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Adjustments",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(R.drawable.ic_nav_naxt),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
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

                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Advanced Calculation Settings",
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.onSurface,
                            style = MaterialTheme.typography.titleSmall
                        )

                        Icon(
                            modifier = Modifier
                                .size(24.dp),
                            painter = painterResource(R.drawable.ic_nav_naxt),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                    }
                }

            }
        }


    }
}


