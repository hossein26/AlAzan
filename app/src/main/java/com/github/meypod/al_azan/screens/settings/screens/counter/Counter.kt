package com.github.meypod.al_azan.screens.settings.screens.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.screens.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Counter(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.qada_counter),
                    navController = navController,
                    icon = R.drawable.ic_counter
                )
            }
        ) { innerPadding ->
            Box(modifier.fillMaxSize()) {
                Column(
                    modifier
                        .padding(innerPadding)
                        .fillMaxSize()
                        .background(
                            MaterialTheme.colorScheme.background, shape = RoundedCornerShape(
                                dimensionResource(R.dimen.card_radius)
                            )
                        )
                        .padding(dimensionResource(R.dimen.item_content_padding))
                ) {
                    Row(
                        modifier
                            .background(
                                MaterialTheme.colorScheme.surfaceContainer,
                                shape = RoundedCornerShape(
                                    dimensionResource(R.dimen.item_border_radius)
                                )
                            )
                            .fillMaxWidth()
                            .padding(
                                horizontal = dimensionResource(R.dimen.card_content_padding),
                                vertical = dimensionResource(R.dimen.padding_small)
                            )
                    ) {
                        SwitchWithText(
                            "Show Last Change Time",
                            onCheckedChange = {},
                            isChecked = false
                        )
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    LazyColumn(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                    ) {
                        items(6) {index->

                            LastChangeTime()
                            if (index != 5) {
                                HorizontalDivider(
                                    thickness = 1.dp,
                                    color = MaterialTheme.colorScheme.outlineVariant
                                )
                            }
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                }
                FloatingActionButton(
                    modifier = Modifier
                        .padding(end = dimensionResource(R.dimen.fab_padding), bottom = WindowInsets.navigationBars.asPaddingValues().calculateBottomPadding() +
                                dimensionResource(R.dimen.fab_padding))
                        .align(Alignment.BottomEnd),
                    onClick = {}
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_fab_counter),
                        contentDescription = ""
                    )
                }
            }
        }
    }
}
@Composable
fun LastChangeTime(modifier: Modifier = Modifier) {
    val value by remember { mutableStateOf("") }
    Row(
        modifier
            .wrapContentHeight()
            .padding(dimensionResource(R.dimen.item_content_padding)),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_dots),
            contentDescription = "Move",
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.size(dimensionResource(R.dimen.icon_medium))
        )
        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
        SmallFloatingActionButton(
            modifier = Modifier
                .size(dimensionResource(R.dimen.fab_size))
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
        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
        Box(
            modifier
                .weight(1f)
                .fillMaxWidth()
                .height(64.dp)
                .offset(y = -4.dp)
        ) {
            OutlinedTextField(
                value = value + 6,
                onValueChange = {},
                label = { Text("Fajr", color = MaterialTheme.colorScheme.outline) },
                modifier = modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    color = MaterialTheme.colorScheme.onSurface
                ),
                shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius)),
                singleLine = true,
                trailingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.ic_clean),
                        contentDescription = "clean",
                        tint = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            )
        }
        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
        SmallFloatingActionButton(
            modifier = Modifier
                .size(dimensionResource(R.dimen.fab_size))
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
    }
}