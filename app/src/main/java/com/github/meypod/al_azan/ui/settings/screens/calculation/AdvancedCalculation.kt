package com.github.meypod.al_azan.ui.settings.screens.calculation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun AdvancedCalculation(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.advanced_calculation_settings),
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
                    Column {
                        Text(
                            text = stringResource(R.string.rounding_method),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "Auto(Default)",
                            "Auto(Default)",
                            "Auto(Default)"
                        )
                        SampleBottomSheetMenu(
                            items = list2
                        ) { }
                    }
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
                    Column {
                        Text(
                            text = stringResource(R.string.midnight_method),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "Sunset to Fajr(Default)",
                            "Sunset to Fajr(Default)",
                            "Sunset to Fajr(Default)"
                        )
                        SampleBottomSheetMenu(
                            items = list2
                        ) { }
                    }
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
                    Column {
                        Text(
                            text = stringResource(R.string.high_lat),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "None (Automatic)",
                            "None (Automatic)",
                            "None (Automatic)"
                        )
                        SampleBottomSheetMenu(items = list2) { }
                    }
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
                    Column {
                        Text(
                            text = stringResource(R.string.asr_calculation),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "Shafi, Maliki, Hanbali (Default)",
                            "Shafi, Maliki, Hanbali (Default)",
                            "Shafi, Maliki, Hanbali (Default)"
                        )
                        SampleBottomSheetMenu(
                            items = list2
                        ) { }
                    }
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
                    Column {
                        Text(
                            text = stringResource(R.string.polar_resolution),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "Unresolved (Default)",
                            "Unresolved (Default)",
                            "Unresolved (Default)"
                        )
                        SampleBottomSheetMenu(
                            items = list2
                        ) { }
                    }
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
                    Column {
                        Text(
                            text = stringResource(R.string.shafaq),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall,
                            textAlign = TextAlign.Justify,
                            fontWeight = FontWeight.Medium,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                        Text(
                            modifier = modifier.width(dimensionResource(R.dimen.max_width)),
                            text = stringResource(R.string.shafaq_desc),
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium,
                            textAlign = TextAlign.Justify,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
                        val list2 = listOf(
                            "General (Default)",
                            "General (Default)",
                            "General (Default)"
                        )
                        SampleBottomSheetMenu(
                            items = list2
                        ) { }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.last_card_padding_intro)))
            }
        }
    }
}

