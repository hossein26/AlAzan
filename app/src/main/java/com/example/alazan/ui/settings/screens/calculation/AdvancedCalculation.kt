package com.example.alazan.ui.settings.screens.calculation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.general_components.SimpleDropdownMenu
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun AdvancedCalculation(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {
        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .requiredHeight(48.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {

                Icon(
                    modifier = Modifier
                        .padding(start = 12.dp)
                        .size(16.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(R.drawable.icon_back),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,
                )

                Text(
                    text = "Advanced Calculation Settings",
                    color = MaterialTheme.colorScheme.onSurface,
                    fontSize = 22.sp,
                    style = MaterialTheme.typography.titleLarge,
                    textAlign = TextAlign.Center
                )

                Box(
                    modifier = Modifier
                        .size(24.dp)
                )

            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Rounding Method:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "Auto(Default)",
                        "Auto(Default)",
                        "Auto(Default)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Midnight Method:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "Sunset to Fajr(Default)",
                        "Sunset to Fajr(Default)",
                        "Sunset to Fajr(Default)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column{
                    Text(
                        text = "High Latitude:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "None (Automatic)",
                        "None (Automatic)",
                        "None (Automatic)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = "Asr Calculation:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "Shafi, Maliki, Hanbali (Default)",
                        "Shafi, Maliki, Hanbali (Default)",
                        "Shafi, Maliki, Hanbali (Default)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column{
                    Text(
                        text = "Polar Resolution:",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "Unresolved (Default)",
                        "Unresolved (Default)",
                        "Unresolved (Default)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }


            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Column{
                    Text(
                        text = "Shafaq",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        textAlign = TextAlign.Justify,
                        fontWeight = FontWeight(500),
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(2.dp))
                    Text(
                        text = "Shafaq is used by the Moon sighting Committee method to determine what type of twilight to use in" +
                                "order to determine the time for Isha.",
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                    Spacer(modifier.padding(4.dp))
                    val list2 = listOf(
                        "General (Default)",
                        "General (Default)",
                        "General (Default)"
                    )
                    SimpleDropdownMenu(
                        modifier
                            .height(52.dp), list2
                    )
                    { }
                }


            }


        }


    }
}

