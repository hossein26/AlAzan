package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.LocationDialog
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro3(navController: NavController, modifier: Modifier = Modifier) {
    var showLocationDialog by remember { mutableStateOf(false) }

    AlAzanTheme {

        if (showLocationDialog) {

            Dialog(

                onDismissRequest = { showLocationDialog = false },
                properties = DialogProperties(
                    usePlatformDefaultWidth = false,
                )
            ) {
                LocationDialog()
            }


        }

        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = modifier
                        .align(Alignment.TopCenter)
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Location",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight(700),
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
                            painter = painterResource(id = R.drawable.vaadin_globe),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                        )
                        Spacer(modifier.padding(horizontal = 2.dp))
                        Text(
                            text = "What’s your Horizon ?",
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight(700)
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
                        Icon(
                            painter = painterResource(id = R.drawable.information_slab_circle),
                            contentDescription = null,
                            modifier = modifier.padding(end = 6.dp),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp
                                        )
                                    ) { append("We need your location to ") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append("calculate Azan") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp
                                        )
                                    ) { append(" for you. \nJust hit the ") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append("“Add New Location”") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp
                                        )
                                    ) { append(" button below to add your location.\n") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append("You can add more locations any time.") }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                    Spacer(modifier.padding(6.dp))
                    Box(
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
                                text = "Locations List",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight(500)
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Text(
                                text = "your location list is empty. please add new location",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .height(40.dp)
                                    .padding(top = 12.dp)
                            )
                            Row {

                            }
                            Button(
                                onClick = {
                                    showLocationDialog = true
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
                                    .width(182.dp)
                                    .align(Alignment.CenterHorizontally)
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
                                        painter = painterResource(id = R.drawable.ic_plus),
                                        contentDescription = "icon",
                                        modifier = Modifier
                                            .requiredSize(size = 18.dp),
                                        colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(MaterialTheme.colorScheme.onPrimary),

                                    )
                                    Text(
                                        text = "Add New Location",
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
                }
                Footer(modifier.align(Alignment.BottomCenter)){
                    navController.navigate("intro4")
                }
            }
        }

    }

}

