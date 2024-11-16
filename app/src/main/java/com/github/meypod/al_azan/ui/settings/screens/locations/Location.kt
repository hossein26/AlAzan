package com.github.meypod.al_azan.ui.settings.screens.locations

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.components.LocationDialog
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Location(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    var showDialog by remember { mutableStateOf(false) }
    AlAzanTheme {
        if (showDialog) {
            LocationDialog()
        }
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.locations) ,
                    icon = R.drawable.ic_location,
                    navController = navController
                )
            }
        ) {
            Column(
                modifier
                    .padding(it)
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background)
                    .verticalScroll(rememberScrollState())
                    .padding(dimensionResource(R.dimen.item_content_padding))
            ) {
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding)),
                    contentAlignment = Alignment.Center
                ) {
                    Row {
                        Icon(
                            modifier = Modifier
                                .size(dimensionResource(R.dimen.icon_info_size)),
                            painter = painterResource(R.drawable.ic_info),
                            contentDescription = stringResource(R.string.info),
                            tint = MaterialTheme.colorScheme.onSurface,
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            modifier = modifier.widthIn(max = dimensionResource(R.dimen.max_width_text)),
                            text = stringResource(R.string.locations_desc),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }

                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding)),
                ) {
                    Text(
                        text = stringResource(R.string.locations_list),
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface,
                        fontWeight = FontWeight.Medium
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Text(
                        modifier = modifier.padding(horizontal = dimensionResource(R.dimen.text_padding)),
                        text = stringResource(R.string.locations_list_desc),
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Button(
                        onClick = {
                            showDialog = true
                        },
                        modifier
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.onPrimary
                        )
                    ) {
                        Icon(
                            modifier = Modifier
                                .size(dimensionResource(R.dimen.plus_icon_size)),
                            painter = painterResource(R.drawable.ic_plus),
                            contentDescription = ""
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                        Text(
                            text = stringResource(R.string.add_new_location),
                            style = MaterialTheme.typography.labelLarge,)
                    }

                }
            }
        }

    }
}



