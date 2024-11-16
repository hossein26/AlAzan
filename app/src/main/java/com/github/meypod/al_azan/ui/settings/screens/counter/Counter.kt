package com.github.meypod.al_azan.ui.settings.screens.counter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
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
                            MaterialTheme.colorScheme.surfaceContainer, shape = RoundedCornerShape(
                                dimensionResource(R.dimen.item_border_radius)
                            )
                        )
                        .fillMaxWidth()
                        .height(48.dp)
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    SwitchWithText(
                        "Show Last Change Time",
                        "",
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
                    items(6) {
                        LastChangeTime()
                    }
                    item { Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small))) }
                }
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_large)))
                Button(
                    onClick = {},
                    modifier
                        .align(Alignment.CenterHorizontally),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary
                    )
                ) {
                    Text(
                        text = "Add Custom Counter",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.labelLarge,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }

}


@Composable
fun LastChangeTime(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }
    Row(
        modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(R.drawable.ic_dots),
            contentDescription = "Move",
            tint = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.size(24.dp)
        )
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

//        TextField(
//            value = value + 5,
//            onValueChange = { value = it },
//            label = { Text("Password") },
//            isError = true,
//            modifier = modifier.border(width = 1.dp, color = Color.Red),
//            supportingText = {
//                Text(
//                    "Must be at least 8 characters",
//                    color = Color.Gray
//                )
//            }
//        )

        OutlinedTextField(
            value = value + 6,
            onValueChange = {},
            label = { Text("Fajr", color = MaterialTheme.colorScheme.outline) },
            modifier = modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(8.dp),
            textStyle = TextStyle(
                fontSize = 14.sp,
                lineHeight = 20.sp,
                color = MaterialTheme.colorScheme.onSurface
            ),
            singleLine = true
        )

//        TextField(
//            value = value + "6",
//            onValueChange = { value = it },
//            label = { Text("Fajr", color = MaterialTheme.colorScheme.outline) },
//            placeholder = { Text("00:00") },
//            modifier = modifier
//                .heightIn(min = 40.dp, max = 80.dp)
//                .padding(start = 8.dp, end = 8.dp, top = 4.dp, bottom = 4.dp)
//                .weight(1f),
//            shape = RoundedCornerShape(4.dp),
//            textStyle = TextStyle(
//                fontSize = 14.sp,
//                color = MaterialTheme.colorScheme.onSurface
//            ),
//
//            supportingText = {
//                Text(
//                    "Must be at least 8 characters",
//                    color = MaterialTheme.colorScheme.outline
//                )
//            },
//            singleLine = true,
//
//        )

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


    }

}


    
