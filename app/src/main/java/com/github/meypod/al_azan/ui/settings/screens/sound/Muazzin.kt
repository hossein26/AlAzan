package com.github.meypod.al_azan.ui.settings.screens.sound

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleDivider
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Muazzin(navController: NavController = rememberNavController()) {
    val listOfMuazzins = listOf(
        "Masjid An Nabawi",
        "Ragheb Mustafa Ghalvash",
        "Abdul-Basit Abdus-Samad",
        "Moazen Zade",
    )
    AlAzanTheme {
        Scaffold(
            topBar = {
                SampleTopAppBar(
                    title = stringResource(R.string.muazzin),
                    navController = navController
                )
            }
        ) {
            Column(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .padding(dimensionResource(R.dimen.item_content_padding))
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .background(
                            MaterialTheme.colorScheme.surfaceContainer, shape = RoundedCornerShape(
                                dimensionResource(R.dimen.card_radius)
                            )
                        )
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    LazyColumn(
                        modifier = Modifier
                            .heightIn(max = dimensionResource(R.dimen.max_width))
                    ) {
                        items(listOfMuazzins) {
                            ItemOfMuazzins(it)
                        }
                    }
                }
                Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            MaterialTheme.colorScheme.surfaceContainer, shape = RoundedCornerShape(
                                dimensionResource(R.dimen.card_radius)
                            )
                        )
                        .padding(dimensionResource(R.dimen.card_content_padding))
                ) {
                    Text(
                        "My Muazzins",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Column(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(dimensionResource(R.dimen.card_content_padding)),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "You haven’t add any yet.",
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                        Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items)))
                        Button(
                            onClick = {

                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary,
                                contentColor = MaterialTheme.colorScheme.onPrimary
                            )
                        ){
                            Icon(
                                painter = painterResource(R.drawable.ic_add),
                                contentDescription = null,
                            )
                            Spacer(modifier = Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                            Text(
                                "Add From Local Files",
                                style = MaterialTheme.typography.bodyMedium.copy(
                                    fontWeight = FontWeight.Medium
                                ),
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ItemOfMuazzins(text: String) {
    var selectItem by remember { mutableStateOf(false) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.card_content_padding))
            .clickable {
                selectItem = true
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onSurface,
            fontSize = 16.sp
        )
        if (selectItem) {
            Icon(
                painter = painterResource(R.drawable.ic_done),
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }

    }

    SampleDivider()
}