package com.github.meypod.al_azan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun MonthlyView(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val scrollState = rememberLazyListState()
    val listHeader = listOf(
        "Date",
        stringResource(R.string.fajr),
        stringResource(R.string.dhuhr),
        stringResource(R.string.asr),
        stringResource(R.string.maghrib),
        stringResource(R.string.isha),
    )
    val azanTimeList = listOf(
        AzanTime(1, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(2, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(3, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(4, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(5, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(6, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(7, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(8, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(9, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(10, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(11, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(12, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(13, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(14, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(15, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(16, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(1, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(2, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(3, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(4, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(5, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(6, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(7, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(8, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(9, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(10, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(11, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(12, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(13, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(14, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(15, "04:30", "04:30", "04:30", "04:30", "04:30"),
        AzanTime(16, "04:30", "04:30", "04:30", "04:30", "04:30"),
    )
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = "Monthly View",
                    navController = navController,
                    icon = R.drawable.icon_calender
                )
            }
        ) {
            Box (
                modifier
                    .padding(it)
                    .padding(dimensionResource(R.dimen.item_content_padding))

            ) {
                Column(
                    modifier = Modifier
                        .padding(bottom = dimensionResource(R.dimen.last_card_padding_intro))
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(color = MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))

                        ,
                ) {
                    Row(
                        modifier = modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        OutlinedButton(
                            onClick = {

                            },
                        ) {
                            Icon(
                                modifier = modifier.size(dimensionResource(R.dimen.icon_size_button)),
                                painter = painterResource(R.drawable.iconback),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primary,
                            )
                            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                            Text(
                                text = "Prev Month",
                                style = MaterialTheme.typography.labelLarge,
                            )
                        }
                        OutlinedButton(
                            onClick = {

                            },
                        ) {
                            Text(
                                text = "Next Month",
                                style = MaterialTheme.typography.labelLarge,
                            )
                            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                            Icon(
                                modifier = modifier.size(dimensionResource(R.dimen.icon_size_button)),
                                painter = painterResource(R.drawable.icon_next),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primary,
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_items_small)))
                    Button(
                        onClick = {},
                        modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.secondaryContainer
                        )

                    ) {
                        Text(
                            text = "1403, Tir",
                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            style = MaterialTheme.typography.titleMedium
                        )
                    }
                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    ItemListHeader(
                        listHeader
                    )
                    Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(

                    ){
                        LazyColumn(
                            modifier = modifier.fillMaxWidth(),
                            state = scrollState
                        ) {
                            items(azanTimeList) { azanTime ->
                                ItemList(azanTime)
                            }
                        }
                    }
                }
                Button(
                    modifier = modifier.align(Alignment.BottomCenter),
                    onClick = {},
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.tertiaryContainer,

                        )
                ) {
                    Text(
                        text = "Show This Month",
                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                        style = MaterialTheme.typography.labelLarge)

                }
            }

        }
    }
}

@Composable
fun ItemListHeader(listHeader: List<String>) {
    Row(
        Modifier.fillMaxWidth()
    ) {
        listHeader.forEach {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(), textAlign = TextAlign.Center,
                text = it,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Medium
                )
            )
        }
    }
}

@Composable
fun ItemList(itemList: AzanTime) {
    Column(
        Modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Text(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = itemList.date.toString(),
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.labelMedium.copy(
                    fontWeight = FontWeight.SemiBold
                ),
            )

            Text(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                text = itemList.fajr,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.Center,
                text = itemList.dhuhr,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.Center,
                text = itemList.asr,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.Center,
                text = itemList.maghrib,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                modifier = Modifier
                    .weight(1f),
                textAlign = TextAlign.Center,
                text = itemList.isha,
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall
            )

        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = dimensionResource(R.dimen.padding_low_medium)),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outlineVariant
        )
    }
}

data class AzanTime(
    val date: Int,
    val fajr: String,
    val dhuhr: String,
    val asr: String,
    val maghrib: String,
    val isha: String,
)
