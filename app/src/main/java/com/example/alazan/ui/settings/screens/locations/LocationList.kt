package com.example.alazan.ui.settings.screens.locations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun LocationList(modifier: Modifier = Modifier) {
    AlAzanTheme {
        Box(
            modifier
                .fillMaxSize()
        ) {
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
                            painter = painterResource(R.drawable.ic_location),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .padding(12.dp)
                                .size(20.dp)
                                .align(Alignment.CenterVertically)
                        )

                        Text(
                            text = "Locations",
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
                        Text(
                            text = "We need your location to calculate Azan for you." +
                                    "Just hit the “Add New Location” button below to add your location." +
                                    "You can add multiple locations",
                            modifier
                                .padding(10.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }


                }
                Text(
                    text = "Locations List",
                    modifier
                        .padding(start = 12.dp, top = 12.dp, end = 12.dp),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.titleSmall,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .padding(horizontal = 8.dp),
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer),
                    elevation = CardDefaults.cardElevation(6.dp),
                    shape = RoundedCornerShape(0.dp)

                ) {

                    Row(
                        modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Icon(
                                painter = painterResource(R.drawable.ic_dots),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier
                                    .padding(4.dp)
                                    .size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(8.dp))
                            Column {
                                Text(
                                    text = "Iran, Shahriyar",
                                    modifier
                                        .padding(
                                            start = 8.dp,
                                            top = 8.dp,
                                            bottom = 2.dp
                                        ),
                                    fontSize = 16.sp,
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = "X:35.658°  Y:51.05775°",
                                    modifier
                                        .padding(
                                            start = 8.dp,
                                            top = 2.dp,
                                            bottom = 8.dp
                                        ),
                                    fontSize = 14.sp,
                                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                                    style = MaterialTheme.typography.bodyMedium
                                )
                            }
                        }
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_check),
                                modifier = Modifier
                                    .padding(4.dp)
                                    .size(24.dp),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = Modifier.width(8.dp))

                            Icon(
                                painter = painterResource(R.drawable.ic_3dot),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.onSurface,
                                modifier = Modifier
                                    .padding(8.dp)
                                    .requiredSize(18.dp)
                                    .align(Alignment.CenterVertically)
                            )
                        }

                    }

                    HorizontalDivider(
                        modifier = Modifier
                            .fillMaxWidth(),
                        thickness = 1.dp,
                        color = Color(0xFFBDC9C9)
                    )
                }


            }



            FloatingActionButton(
                onClick = { },
                modifier = Modifier
                    .padding(24.dp)
                    .align(Alignment.BottomEnd),
                containerColor = MaterialTheme.colorScheme.primaryContainer

            )
            {
                Icon(
                    modifier = Modifier
                        .size(16.dp),
                    painter = painterResource(R.drawable.ic_plus),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onPrimaryContainer,
                )
            }
        }
    }

}

