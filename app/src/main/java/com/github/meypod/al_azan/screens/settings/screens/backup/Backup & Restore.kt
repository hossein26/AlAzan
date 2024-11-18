package com.github.meypod.al_azan.screens.settings.screens.backup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.screens.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Backup(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    stringResource(R.string.backup_and_restore),
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
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding)),
                ) {
                    Column(
                        modifier
                            .fillMaxWidth(),
                    ) {

                        Text(
                            text = stringResource(R.string.create_backup),
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Text(
                            text = stringResource(R.string.create_backup_desc_1),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Row {
                            Text(
                                text = stringResource(R.string.dot),
                                fontSize = 16.sp,
                                color = MaterialTheme.colorScheme.onSurfaceVariant
                            )
                            Text(
                                text = stringResource(R.string.create_backup_desc_2),
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Button(
                            modifier = modifier.align(Alignment.CenterHorizontally),
                            onClick = {}
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(dimensionResource(R.dimen.icon_size_button)),
                                    painter = painterResource(R.drawable.ic_save),
                                    contentDescription = stringResource(R.string.create_backup),
                                    tint = MaterialTheme.colorScheme.onPrimary
                                )
                                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                                Text(
                                    text = stringResource(R.string.create_backup),
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    fontSize = 14.sp,
                                    style = MaterialTheme.typography.labelLarge,
                                )
                            }
                        }
                    }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Box(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                        .background(MaterialTheme.colorScheme.surfaceContainer)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Column(
                        modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = stringResource(R.string.restore),
                            color = MaterialTheme.colorScheme.onSurface,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.titleSmall
                        )
                        Text(
                            text = stringResource(R.string.restore_desc),
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))
                        Button(
                            modifier = modifier.align(Alignment.CenterHorizontally),
                            onClick = {

                            }
                        ) {
                            Icon(
                                modifier = Modifier
                                    .size(dimensionResource(R.dimen.icon_size_button)),
                                painter = painterResource(R.drawable.ic_restore),
                                contentDescription = stringResource(R.string.restore_settings),
                                tint = MaterialTheme.colorScheme.onPrimary
                            )
                            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                            Text(
                                text = stringResource(R.string.restore_settings),
                                color = MaterialTheme.colorScheme.onPrimary,
                                fontSize = 14.sp,
                                style = MaterialTheme.typography.labelLarge
                            )
                        }
                    }
                }
            }
        }
    }
}