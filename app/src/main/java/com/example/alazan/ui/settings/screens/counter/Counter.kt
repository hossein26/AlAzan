package com.example.alazan.ui.settings.screens.counter

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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Counter(navController: NavController, modifier: Modifier = Modifier) {

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
                            painter = painterResource(R.drawable.icon_counter),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .padding(12.dp)
                                .size(20.dp)
                                .align(Alignment.CenterVertically)
                        )

                        Text(
                            text = "Qada Counter",
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

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(8.dp)

                ) {
                    Box(
                        modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .shadow(
                                elevation = 3.dp,
                                shape = RoundedCornerShape(12.dp),
                                clip = false
                            )
                            .clip(RoundedCornerShape(12.dp))
                            .background(MaterialTheme.colorScheme.surfaceContainer)
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.ic_clock),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .padding(12.dp)
                                .size(24.dp)
                                .align(Alignment.Center)
                        )

                    }
                    Text(
                        text = "Show Last Change Time",
                        modifier
                            .padding(start = 12.dp)
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.labelLarge
                    )
                }
                LazyColumn(
                    modifier
                        .fillMaxWidth()
                        .height(368.dp)
                        .padding(start = 8.dp, end = 8.dp, top = 4.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = MaterialTheme.colorScheme.surfaceContainer)
                ) {
                    items(20) {
                        LastChangeTime()
                    }

                }

                Button(
                    onClick = {},
                    modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(14.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF00585A)
                    )
                ) {
                    Text(
                        text = "Add Custom Counter",
                        color = Color(0xFFFFFFFF),
                        style = MaterialTheme.typography.labelLarge,
                        fontSize = 14.sp
                    )

                }


            }
        }
    }

}

@Composable
@Preview
fun LastChangeTime(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }
    Row(
        modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(start = 8.dp, end = 8.dp), verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Icon(
            painter = painterResource(R.drawable.ic_dots),
            contentDescription = "",
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier
                .padding(4.dp)
                .size(24.dp)
        )
        Box(
            modifier
                .padding(4.dp)
                .shadow(
                    elevation = 3.dp,
                    shape = RoundedCornerShape(12.dp),
                    clip = false
                )
                //.size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
        ) {

            Icon(
                painter = painterResource(R.drawable.ic_minus),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(12.dp)
                    .scale(scaleX = 0.7f, scaleY = 0.7f)
                    .size(16.dp)
                    .align(Alignment.Center)
            )

        }



        OutlinedTextField(
            value = value + "6",
            onValueChange = { value = it },
            label = { Text("Fajr", color = MaterialTheme.colorScheme.outline) },
            placeholder = { Text("00:00") },
            modifier = modifier
                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
                .weight(1f),
            textStyle = TextStyle(
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        )



        Box(
            modifier
                .wrapContentHeight()
                .wrapContentHeight()
                .padding(8.dp)
                .shadow(
                    elevation = 3.dp,
                    shape = RoundedCornerShape(12.dp),
                    clip = false
                )
                //.size(40.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
        ) {

            Icon(
                painter = painterResource(R.drawable.ic_plus),
                contentDescription = "",
                tint = MaterialTheme.colorScheme.onSecondaryContainer,
                modifier = Modifier
                    .padding(12.dp)
                    .size(16.dp)
                    .align(Alignment.Center)
            )

        }


    }

}


    
