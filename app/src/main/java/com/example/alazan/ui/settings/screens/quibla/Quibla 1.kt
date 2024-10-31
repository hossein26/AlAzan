package com.example.alazan.ui

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
import androidx.compose.material3.Card
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
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Quibla1(navController: NavController, modifier: Modifier = Modifier) {

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
                            painter = painterResource(R.drawable.icon_compass),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier
                                .padding(12.dp)
                                .size(20.dp)
                                .align(Alignment.CenterVertically)
                        )

                        Text(
                            text = "Quibla",
                            modifier
                                .align(Alignment.CenterVertically),
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.titleMedium
                        )

                        Box(
                            modifier = Modifier.size(24.dp)
                        )
                    }


                }



                Row(
                    modifier = Modifier
                        .wrapContentHeight()
                        .fillMaxWidth()
                        .padding(start = 8.dp, end = 8.dp)
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = MaterialTheme.colorScheme.surfaceContainer),
                    //verticalAlignment = Alignment.CenterVertically
                ) {

                    Icon(
                        painter = painterResource(R.drawable.ic_info),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)

                    )



                    Column(
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight()
                            .padding(8.dp)
                        //.background(Color.Cyan),
                    ) {

                        Text(
                            text = "Disclaimer",
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall
                        )

                        Text(
                            text = "Note that due to software and hardware errors, Quibla direction shown by this app, particularly in “Compass Mode”, can be wrong." +
                                    "\nOther magnetic devices and your compass may " +
                                    "need calibration. ",
                            //textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }

                }
                Button(
                    onClick = {},
                    modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )

                ) {
                    Text(
                        text = "I Understand",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.labelLarge

                    )
                }

                Card(
                    onClick = {},
                    modifier
                        .wrapContentWidth()
                        .wrapContentHeight()

                ) { }


            }


        }
    }


}



