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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun MonthlyView(navController: NavController,modifier: Modifier = Modifier) {
    AlAzanTheme {

        Box(
            modifier
                .fillMaxSize()
        ) {
            Column(
                modifier
                    .fillMaxSize()
                    .background(color = Color(0xFFF6FAFA))

            ) {

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(bottom = 8.dp)
                        .background(color = Color(0xFFEBEFEE)),

                    ) {

                    Icon(
                        modifier = Modifier
                            .padding(start = 12.dp, top = 12.dp , bottom = 12.dp)
                            .size(16.dp)
                            .align(Alignment.CenterVertically),
                        painter = painterResource(R.drawable.icon_back),
                        contentDescription = "",
                        tint = Color(0xFF181C1C),
                    )

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        horizontalArrangement = Arrangement.Center

                    ) {
                        Icon(
                            painter = painterResource(R.drawable.icon_calender),
                            contentDescription = "",
                            tint = Color(0xFF000000),
                            modifier = Modifier
                                .padding(12.dp)
                                .size(24.dp)
                                .align(Alignment.CenterVertically)
                        )

                        Text(
                            text = "Monthly view",
                            modifier
                                .align(Alignment.CenterVertically),
                            color = Color(0xFF181C1C),
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.titleMedium
                        )


                    Box(modifier = Modifier.size(24.dp)
                    )
                    }


                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 8.dp, end = 8.dp, bottom = 64.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color(0xFFEBEFEE)),
                ) {

                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween

                    ) {
                        OutlinedButton(
                            onClick = {},
                            modifier = Modifier
                                .padding(start = 8.dp, top = 8.dp, end = 8.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFF00585A)
                            )

                        ) {

                            Icon(
                                painter = painterResource(R.drawable.iconback),
                                contentDescription = "",
                                tint = Color(0xFF00585A),
                                modifier = Modifier
                                    .padding(end = 12.dp)
                            )
                            Text(
                                text = "Prev Month",
                                style = MaterialTheme.typography.labelLarge,
                                fontSize = 14.sp
                            )


                        }

                        OutlinedButton(
                            onClick = {},
                            modifier = Modifier
                                .padding(end = 8.dp, top = 8.dp, start = 8.dp),
                            colors = ButtonDefaults.outlinedButtonColors(
                                contentColor = Color(0xFF00585A)
                            )

                        ) {
                            Text(
                                text = "Next Month",
                                style = MaterialTheme.typography.labelLarge,
                                fontSize = 14.sp
                            )

                            Icon(
                                painter = painterResource(R.drawable.iconnext),
                                contentDescription = "",
                                tint = Color(0xFF00585A),
                                modifier = Modifier
                                    .padding(start = 12.dp)
                            )


                        }

                    }
                    Row(
                        modifier
                            .padding(start = 8.dp, end = 8.dp)
                            .fillMaxWidth()
                            .wrapContentHeight()
                    ) {
                        Button(
                            onClick = {},

                            modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            shape = RoundedCornerShape(16.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFECC622)
                            )

                        ) {
                            Text(
                                text = "1403, Tir",
                                color = Color(0xFF443700),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.SemiBold,
                                style = MaterialTheme.typography.titleMedium
                            )
                        }
                    }

                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(0.5f), textAlign = TextAlign.Center,
                            text = "Data",
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(), textAlign = TextAlign.Center,
                            text = "Fajr",
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(), textAlign = TextAlign.Center,
                            text = "Dhuhr",
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(), textAlign = TextAlign.Center,
                            text = "Asr",
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(), textAlign = TextAlign.Center,
                            text = "Maghrib",
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Text(
                            modifier = Modifier
                                .weight(0.5f)
                                .fillMaxWidth(), textAlign = TextAlign.Center,
                            text = "Isha",
                            color = Color(0xFF181C1C),
                            style = MaterialTheme.typography.bodyMedium
                        )

                    }
                    LazyColumn(
                        modifier
                            .fillMaxSize()
                            .padding(8.dp)

                    ) {
                        items(20) {
                            ItemList()
                        }

                    }


                }


            }


            Box(
                modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
                Row(
                    modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.Center


                ) {

                    Button(
                        onClick = {},
                        modifier
                            .wrapContentWidth(),
                        shape = RoundedCornerShape(100.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFECC622),

                            )
                    ) {
                        Text(
                            text = "Show This Month",
                            color = Color(0xFF443700),
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp,

                            )

                    }
                }


            }
        }


    }


}

@Composable
@Preview
fun ItemList() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(28.dp)
                .padding(2.dp),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Text(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                text = "1",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.labelMedium
            )

            Text(
                modifier = Modifier
                    .weight(0.5f)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = "03:59",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(0.5f),
                textAlign = TextAlign.Center,
                text = "03:59",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(0.5f),
                textAlign = TextAlign.Center,
                text = "03:59",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(0.5f),
                textAlign = TextAlign.Center,
                text = "03:59",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(0.5f),
                textAlign = TextAlign.Center,
                text = "03:59",
                color = Color(0xFF181C1C),
                style = MaterialTheme.typography.bodySmall
            )

        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .height(1.dp)
                .background(Color.LightGray)
        ) {

        }
    }

}
