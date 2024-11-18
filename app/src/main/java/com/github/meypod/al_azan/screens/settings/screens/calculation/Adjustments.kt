package com.github.meypod.al_azan.screens.settings.screens.calculation

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.screens.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Adjustments(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.adjustments),
                    navController = navController
                )
            }
        ) { innerPadding ->
            Column(
                modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .padding(dimensionResource(R.dimen.item_content_padding))
            ) {
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        text = stringResource(R.string.adjustments_desc_1),
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    PrayerTimesGridScreen()
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        text = stringResource(R.string.adjustments_desc_2),
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.bodySmall,
                        textAlign = TextAlign.Justify,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        SmallFloatingActionButton(
                            modifier = modifier
                                .size(dimensionResource(R.dimen.plus_minus_size))
                                .shadow(
                                    elevation = dimensionResource(R.dimen.shadow_elevation_low),
                                    shape = MaterialTheme.shapes.medium
                                ),
                            containerColor = MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                            onClick = {}
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_plus),
                                contentDescription = stringResource(R.string.plus)
                            )
                        }
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .weight(3f)
                                .padding(horizontal = dimensionResource(R.dimen.padding_small))
                                .fillMaxWidth()
                                .height(dimensionResource(R.dimen.text_view_height))
                                .border(
                                    dimensionResource(R.dimen.item_border_width),
                                    MaterialTheme.colorScheme.outline,
                                    shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                                )
                        ) {
                            Text(
                                text = "0",
                                textDecoration = TextDecoration.Underline,
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        }
                        SmallFloatingActionButton(
                            modifier = modifier
                                .size(dimensionResource(R.dimen.plus_minus_size))
                                .shadow(
                                    elevation = dimensionResource(R.dimen.shadow_elevation_low),
                                    shape = MaterialTheme.shapes.medium
                                ),
                            containerColor = MaterialTheme.colorScheme.secondaryContainer,
                            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                            onClick = {}
                        ) {
                            Icon(
                                modifier = modifier.size(dimensionResource(R.dimen.minus_icon_size)),
                                painter = painterResource(R.drawable.ic_minus),
                                contentDescription = stringResource(R.string.minus)
                            )
                        }
                    }
                }
            }
        }
    }
}
@Composable
fun PrayerTimesGridScreen() {
    val prayerNames =
        listOf(
            stringResource(R.string.fajr),
            stringResource(R.string.sunrise),
            stringResource(R.string.dhuhr),
            stringResource(R.string.asr),
            stringResource(R.string.sunset),
            stringResource(R.string.maghrib),
            stringResource(R.string.isha),
            stringResource(R.string.midnight),
            )
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.space_adjustments_items)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.space_adjustments_items))
    ) {
        items(prayerNames.size) { index ->
            PrayerTimeRow(prayerName = prayerNames[index])
        }
        item {}
    }
}
@Composable
fun PrayerTimeRow(prayerName: String) {
    val count by remember { mutableIntStateOf(0) }
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
            fontWeight = FontWeight.Medium
        )
        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_small)))
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            SmallFloatingActionButton(
                modifier = Modifier
                    .size(dimensionResource(R.dimen.plus_minus_size))
                    .shadow(
                        elevation = dimensionResource(R.dimen.shadow_elevation_low),
                        shape = MaterialTheme.shapes.medium
                    ),
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.size(dimensionResource(R.dimen.plus_icon_size)),
                    painter = painterResource(R.drawable.ic_plus),
                    contentDescription = stringResource(R.string.plus)
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .height(dimensionResource(R.dimen.plus_minus_size))
                    .weight(3f)
                    .padding(horizontal = dimensionResource(R.dimen.padding_small))
                    .border(
                        dimensionResource(R.dimen.item_border_width),
                        MaterialTheme.colorScheme.outline,
                        shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                    )
            ) {
                Text(
                    text = count.toString(),
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.onSurface
                )
            }
            SmallFloatingActionButton(
                modifier = Modifier
                    .size(dimensionResource(R.dimen.plus_minus_size))
                    .shadow(
                        elevation = dimensionResource(R.dimen.shadow_elevation_low),
                        shape = MaterialTheme.shapes.medium
                    ),
                containerColor = MaterialTheme.colorScheme.secondaryContainer,
                contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
                onClick = {}
            ) {
                Icon(
                    modifier = Modifier.size(dimensionResource(R.dimen.minus_icon_size)),
                    painter = painterResource(R.drawable.ic_minus),
                    contentDescription = stringResource(R.string.minus)
                )
            }
        }
    }
}