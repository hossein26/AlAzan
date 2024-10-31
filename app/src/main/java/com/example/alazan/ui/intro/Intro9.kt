package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro9(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = modifier
                        .align(Alignment.TopCenter)
                        .verticalScroll(rememberScrollState())
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Battery Settings",
                        color = MaterialTheme.colorScheme.onBackground,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 28.sp,
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(8.dp)
                    )
                    Row(
                        modifier = Modifier
                            .padding(top = 16.dp, bottom = 20.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_battery),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                        )
                        Text(
                            text = "Why Did It Stop?\n" +
                                    "Keep Running!",
                            color = MaterialTheme.colorScheme.onBackground,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                letterSpacing = 0.15.sp
                            ),
                            modifier = Modifier
                                .padding(8.dp),
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(12.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Help The App Keep Running",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight(500)
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Spacer(modifier = modifier.padding(6.dp))
                            Text(
                                text = "In order to app keep working perfectly, you need to allow it be running in the background or battery optimization settings on your phone will close the app after a few minutes. \n" +
                                        "To to so follow steps below:\n" +
                                        "  1- Hit the button below to open battery optimization settings.\n" +
                                        "  2- Find the Al-Azan App in the list.\n" +
                                        "  3- Disable the Power Optimization For Al-Azan\n" +
                                        "  4- You Are Done",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp),
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Spacer(modifier = modifier.padding(8.dp))
                            Column(
                                modifier = modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Row {
                                    Text("State: ", style = MaterialTheme.typography.labelLarge.copy(
                                        color = MaterialTheme.colorScheme.onSurface
                                    ))
                                    Text(
                                        "Enabled",
                                        style = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.error)
                                    )
                                }
                                Button(
                                    onClick = {

                                    },
                                    shape = RoundedCornerShape(100.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                                    contentPadding = PaddingValues(
                                        start = 16.dp,
                                        top = 10.dp,
                                        end = 24.dp,
                                        bottom = 10.dp
                                    ),
                                    modifier = Modifier
                                        .padding(top = 6.dp)
                                        .requiredHeight(height = 40.dp)
                                        .wrapContentWidth()
                                        .align(Alignment.CenterHorizontally)
                                ) {
                                    Text(
                                        text = "Open Battery Optimization Settings",
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.labelLarge,
                                        modifier = Modifier
                                            .wrapContentHeight(align = Alignment.CenterVertically)
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier.padding(6.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(12.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Power Manager Settings",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight(500)
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Spacer(modifier = modifier.padding(6.dp))
                            Text(
                                text = "Some devices need extra settings inside the Power Manager to let the app keeps running in the background. If you fixed previous step and still facing problem, use these steps:\n" +
                                        "  1- Hit the button below to open Power Manager\n" +
                                        "  2- Find the Al-Azan App in the list.\n" +
                                        "  3- Disable the Power Saving For Al-Azan\n" +
                                        "  4- You Are Done",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 4.dp),
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    color = MaterialTheme.colorScheme.onSurface
                                )
                            )
                            Spacer(modifier = modifier.padding(8.dp))
                            Column(
                                modifier = modifier.fillMaxWidth(),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Button(
                                    onClick = {

                                    },
                                    shape = RoundedCornerShape(100.dp),
                                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                                    contentPadding = PaddingValues(
                                        start = 16.dp,
                                        top = 10.dp,
                                        end = 24.dp,
                                        bottom = 10.dp
                                    ),
                                    modifier = Modifier
                                        .padding(top = 6.dp)
                                        .requiredHeight(height = 40.dp)
                                        .wrapContentWidth()
                                        .align(Alignment.CenterHorizontally)
                                ) {
                                    Text(
                                        text = "Open Power Manager Settings",
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.labelLarge,
                                        modifier = Modifier
                                            .wrapContentHeight(align = Alignment.CenterVertically)
                                    )
                                }
                            }
                            Spacer(modifier = modifier.padding(8.dp))
                            Row {
                                Icon(
                                    modifier = modifier.padding(end = 5.dp),
                                    painter = painterResource(R.drawable.information_slab_circle_gray),
                                    contentDescription = "",
                                    tint = MaterialTheme.colorScheme.onSurfaceVariant
                                )
                                Text(
                                    "Samsung devices have their own custom Power Manager called “Device Care”.\n" +
                                            "\n" +
                                            "For Samsung users:\n" +
                                            "  1- Hit the button to open Battery Menu.\n" +
                                            "  2- Open “Background usage limits”\n" +
                                            "  3- open “Never auto sleeping apps”\n" +
                                            "  4- Hit the “+” button on top\n" +
                                            "  5- Find and add the “Al-Azan” app.\n" +
                                            "  6- You are done.\n" +
                                            "\n" +
                                            "Note: If you didn’t find the app in the list you probably don’t need to do this part. ",
                                    style = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurfaceVariant),
                                    modifier = modifier.align(Alignment.CenterVertically).padding(horizontal = 4.dp)
                                )
                            }
                        }
                    }
                    Spacer(modifier.padding(30.dp))
                    Column(
                        modifier = modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row {
                            Text("State: ", style = MaterialTheme.typography.labelLarge)
                            Text(
                                "Enabled",
                                style = MaterialTheme.typography.labelLarge.copy(color = MaterialTheme.colorScheme.error)
                            )
                        }
                    }

                }
                Footer(modifier.align(Alignment.BottomCenter)){
                    navController.navigate("mainScreen")
                }

            }

        }

    }

}

