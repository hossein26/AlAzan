package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro4(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        val calculationMethod = listOf(
            "Shia Ithna Ashari, Leva Institute, Qum, Iran",
            "Shia Ithna Ashari, Leva Institute, Saveh, Iran",
            "Shia Ithna Ashari, Leva Institute, Tehran, Iran",
            "Shia Ithna Ashari, Leva Institute, Arak, Iran",
        )

        val calendarType = listOf(
            "Islamic (civil)",
            "Islamic (civil)"
        )

        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .padding(16.dp)
                        .padding(bottom = 100.dp)
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Calculation",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight(700)
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
                            painter = painterResource(id = R.drawable.ic_telescope),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = 48.dp)
                        )
                        Text(
                            text = "How should We calculate?",
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
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(24.dp),
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
                                            fontSize = 12.sp
                                        )
                                    ) { append("Calculation of Azan has many ") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append("different methods.") }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 12.sp
                                        )
                                    ) { append(" Each method provides different results. It is Your responsibility to search and use the right method.") }
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
                                text = "Calculation Method",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Spacer(modifier = modifier.padding(4.dp))
                            SimpleDropdownMenu(items = calculationMethod) { }
                            Spacer(modifier = modifier.padding(1.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .border(
                                        width = 1.dp,
                                        color = Color.LightGray,
                                        shape = RoundedCornerShape(8.dp)
                                    )
                                    .padding(8.dp),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        "Fajr Angle",
                                        modifier = Modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center,
                                    )
                                    Text(
                                        "16",
                                        modifier = Modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        "Fajr Angle",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        "Fajr Angle",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        "Fajr Angle",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
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
                                text = "Calendar",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(20.dp)
                            )
                            Spacer(modifier = modifier.padding(2.dp))
                            Text(
                                text = "The type of lunar calendar shown in main screen and widgets",
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier
                                    .fillMaxWidth()

                            )
                            Spacer(modifier = modifier.padding(4.dp))
                            SimpleDropdownMenu(items = calendarType) { }
                            Spacer(modifier = modifier.padding(1.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(shape = RoundedCornerShape(12.dp))
                                    .background(color = MaterialTheme.colorScheme.surfaceContainer)
                                    .padding(top = 12.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.information_slab_circle),
                                    contentDescription = null,
                                    modifier = modifier
                                        .padding(end = 6.dp)
                                        .size(24.dp),
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
                                                    fontSize = 14.sp,
                                                    fontWeight = FontWeight.Bold
                                                )
                                            ) { append("Attention!") }
                                            withStyle(
                                                style = SpanStyle(
                                                    color = MaterialTheme.colorScheme.onSurface,
                                                    fontSize = 12.sp
                                                )
                                            ) { append("\nThe app’s lunar calendar is pre-calculated and may not be accurate because it isn’t based on moon sightings. This especially important to note for the start and end of Ramadan.") }
                                        },
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier.padding(6.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate("adjustments")
                            }
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                    ) {
                        Text(
                            text = "Adjustments",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(24.dp)
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(6.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate("advance_calculation")
                            }
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                    ) {
                        Text(
                            text = "Advanced Calculation Settings",
                            modifier = Modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .padding(end = 6.dp)
                                .size(24.dp)
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier = modifier.padding(30.dp))

                }
                Footer(modifier.align(Alignment.BottomCenter)){
                    navController.navigate("intro7")
                }
            }
        }

    }

}




