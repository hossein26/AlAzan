package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro2(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        PatternBackgroundBox{
            Box(
                modifier = modifier.fillMaxSize()
            ) {
                Column(
                    modifier = modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                        .padding(16.dp)
                        .offset(y = (-32).dp)
                ) {
                    Text(
                        text = "Thank you for choosing us",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                    Spacer(modifier.padding(4.dp))
                    Text(
                        text = "In order to the app works correctly, you need to set some settings so we can calculate the exact time of the prayer times for you. ",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        lineHeight = 1.5.em,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }

                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(bottom = 150.dp, start = 18.dp, end = 18.dp)
                        .align(Alignment.BottomCenter)
                ) {
                    Text(
                        text = "If you have a backup file from before you can load it here.",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                    Spacer(modifier.padding(1.dp))
                    Button(
                        onClick = {

                        },
                        shape = RoundedCornerShape(100.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
                        contentPadding = PaddingValues(
                            start = 16.dp,
                            top = 10.dp,
                            end = 24.dp,
                            bottom = 10.dp
                        ),
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                            .width(175.dp)
                    ) {

                        Row(
                            horizontalArrangement = Arrangement.spacedBy(
                                8.dp,
                                Alignment.CenterHorizontally
                            ),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxSize()
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_upload),
                                contentDescription = "icon",
                                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSecondaryContainer),
                                modifier = Modifier
                                    .requiredSize(size = 18.dp)
                            )
                            Text(
                                text = "Load Backup File",
                                color = MaterialTheme.colorScheme.onSecondaryContainer,
                                textAlign = TextAlign.Center,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = Modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically)
                            )
                        }
                    }
                }
                Footer(
                    modifier.align(Alignment.BottomCenter)
                ) {
                    navController.navigate("intro3")
                }
            }
        }
    }
}

