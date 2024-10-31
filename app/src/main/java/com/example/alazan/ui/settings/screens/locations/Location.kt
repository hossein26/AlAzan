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
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Location(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
            Column(
                modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .verticalScroll(rememberScrollState())
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
                            .requiredHeight(48.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_location),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .padding(horizontal = 12.dp)
                                .size(16.dp)
                        )

                        Text(
                            text = "Locations",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 22.sp,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }

                }
                Spacer(modifier.padding(8.dp))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 8.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Row {
                        Icon(
                            modifier = Modifier
                                .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                                .size(20.dp)
                                .align(Alignment.Top),
                            painter = painterResource(R.drawable.ic_info),
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
                Spacer(modifier.padding(8.dp))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(horizontal = 8.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(MaterialTheme.colorScheme.surfaceContainer),
                    contentAlignment = Alignment.Center
                ) {
                    Column {

                        Text(
                            text = "Locations List",
                            modifier
                                .padding(8.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface,
                            fontWeight = FontWeight(500)
                        )
                        Text(
                            text = "your location list is empty. please add new location",
                            modifier
                                .padding(12.dp),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )

                        Button(
                            onClick = {},
                            modifier
                                .padding(bottom = 8.dp)
                                .align(Alignment.CenterHorizontally),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                                contentColor = MaterialTheme.colorScheme.onPrimary
                            )
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(14.dp),
                                painter = painterResource(R.drawable.ic_plus),
                                contentDescription = ""
                            )

                            Text(
                                text = "Add New Location",
                                modifier
                                    .padding(start = 8.dp),
                                style = MaterialTheme.typography.labelLarge,
                                fontSize = 14.sp,

                                )
                        }
                    }
                }
            }
        }
    }



