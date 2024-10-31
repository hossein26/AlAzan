package com.example.alazan.ui.settings.screens.calculation

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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun Adjustments(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {

        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Row(
                modifier
                    .fillMaxWidth()
                    .height(48.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

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

                Text(
                    text = "Adjustments",
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

            Spacer(modifier.padding(6.dp))

            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Number of minutes that will be added to the calculated\ntimes.",
                    fontSize = 12.sp,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Justify,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(Modifier.padding(4.dp))
                PrayerTimesGridScreen()

            }
            Spacer(modifier.padding(2.dp))
            Column(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Number of Days that will be added to the lunar calendar.",
                    fontSize = 12.sp,
                    style = MaterialTheme.typography.bodySmall,
                    textAlign = TextAlign.Justify,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Spacer(modifier.padding(4.dp))
                Row(
                    modifier.fillMaxWidth()
                        .height(40.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .requiredSize(40.dp)
                            .weight(0.5f)
                            .shadow(2.dp, shape = RoundedCornerShape(12.dp))
                            .background(
                                MaterialTheme.colorScheme.secondaryContainer,
                                shape = MaterialTheme.shapes.small
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(16.dp),
                            painter = painterResource(R.drawable.ic_add),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer,
                        )
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .weight(3f)
                            .padding(horizontal = 4.dp)
                            .fillMaxWidth()
                            .height(48.dp)
                            .border(1.dp, MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(8.dp))
                    ) {
                        Text(
                            text = "0",
                            textDecoration = TextDecoration.Underline,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Box(
                        modifier = Modifier
                            .requiredSize(40.dp)
                            .weight(0.5f)
                            .shadow(2.dp, shape = RoundedCornerShape(12.dp))
                            .background(
                                MaterialTheme.colorScheme.secondaryContainer,
                                shape = MaterialTheme.shapes.small
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            modifier = Modifier,
                            painter = painterResource(R.drawable.ic_remove),
                            contentDescription = "",
                            tint = MaterialTheme.colorScheme.onSecondaryContainer,
                        )
                    }

                }
            }


        }
    }

}


@Composable
fun PrayerTimesGridScreen() {
    val prayerNames = listOf("Fajr", "Sunrise", "Dhuhr", "Asr", "Sunset", "Maghrib", "Isha", "Midnight")

    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // Two columns for grid layout
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(prayerNames.size) { index ->
            PrayerTimeRow(prayerName = prayerNames[index])
        }
        item {
            Spacer(modifier = Modifier.padding(1.dp))
        }
    }
}

@Composable
fun PrayerTimeRow(prayerName: String) {
    var count by remember { mutableStateOf(0) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = prayerName,
            fontSize = 12.sp,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight(500)
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 8.dp)
        ) {
            // Plus Button
            Box(
                modifier = Modifier
                    .weight(1f)
                    .requiredSize(40.dp)
                    .shadow(6.dp, shape = RoundedCornerShape(12.dp))
                    .background(
                        MaterialTheme.colorScheme.secondaryContainer,
                        shape = MaterialTheme.shapes.small
                    ) // Set background color
                    .padding(12.dp)
                    .clickable { if (count > 0) count-- }, // Handle click to decrease count
                contentAlignment = Alignment.Center // Center the icon in the Box
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_add),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                )
            }

            // Counter Box
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(40.dp)
                    .weight(3f)
                    .padding(horizontal = 4.dp)
                    .border(1.dp, MaterialTheme.colorScheme.outline, shape = RoundedCornerShape(8.dp))
            ) {
                Text(
                    text = "0",
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }

            // Minus Button
            Box(
                modifier = Modifier
                    .requiredSize(40.dp)
                    .weight(1f)
                    .shadow(2.dp, shape = RoundedCornerShape(12.dp))
                    .background(
                        MaterialTheme.colorScheme.secondaryContainer,
                        shape = MaterialTheme.shapes.small
                    ) // Set background color
                    //.padding(12.dp)
                    .clickable { if (count > 0) count-- }, // Handle click to decrease count
                contentAlignment = Alignment.Center // Center the icon in the Box
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_remove),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSecondaryContainer,
                )
            }
        }
    }
}