package com.github.meypod.al_azan.general_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleBottomSheetMenu(
    modifier: Modifier = Modifier,
    items: List<String>,
    onItemSelected: (String) -> Unit,
) {
    // State for managing the bottom sheet visibility
    var showBottomSheet by remember { mutableStateOf(false) }
    // State for storing the selected item
    var selectedItem by remember { mutableStateOf(items.firstOrNull() ?: "") }

    AlAzanTheme {
        // Box layout to trigger bottom sheet
        Box(
            modifier = modifier
                .fillMaxWidth()
                .heightIn(min = dimensionResource(R.dimen.bottom_sheet_height))
                .border(
                    width = 0.5.dp,
                    color = MaterialTheme.colorScheme.outline,
                    shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                )
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .clickable { showBottomSheet = true }
                    ,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = selectedItem,
                    modifier = Modifier
                        .padding(dimensionResource(R.dimen.text_padding)),
                    style = MaterialTheme.typography.labelLarge.copy(
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                )
                Icon(
                    tint = MaterialTheme.colorScheme.onSurfaceVariant,
                    painter = painterResource(id = R.drawable.arrow_drop_down),
                    contentDescription = "Drop down",
                    modifier = Modifier.size(dimensionResource(R.dimen.icon_size_small)).padding(end = dimensionResource(R.dimen.padding_small))
                )
            }

            // BottomSheet content
            if (showBottomSheet) {
                ModalBottomSheet(
                    onDismissRequest = { showBottomSheet = false },
                    sheetState = rememberModalBottomSheetState()
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(dimensionResource(R.dimen.bottom_sheet_item_padding)),
                    ) {
                        items.forEach { item ->
                                Text(
                                    text = item,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .heightIn(min = dimensionResource(R.dimen.bottom_sheet_item_height))
                                        .padding(dimensionResource(R.dimen.text_padding))
                                        .clickable {
                                            selectedItem = item
                                            showBottomSheet = false
                                            onItemSelected(item)
                                        },
                                    style = MaterialTheme.typography.bodyLarge.copy(
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontSize = 16.sp
                                    )
                                )

                        }
                        Spacer(Modifier.padding(dimensionResource(R.dimen.bottom_sheet_bottom_spacer)))
                    }
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleBottomSheetMenuIntro(
    modifier: Modifier = Modifier,
    items: List<String>,
    onItemSelected: (String) -> Unit,
) {
    // State for managing the bottom sheet visibility
    var showBottomSheet by remember { mutableStateOf(false) }
    // State for storing the selected item
    var selectedItem by remember { mutableStateOf(items.firstOrNull() ?: "") }

    AlAzanTheme {
        // Box layout to trigger bottom sheet
        Box(
            modifier = modifier
                .width(dimensionResource(R.dimen.bottom_sheet_width_intro))
                .heightIn(min = dimensionResource(R.dimen.bottom_sheet_height))
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    .background(Color.Transparent)
                    .fillMaxWidth()
                    .clickable { showBottomSheet = true }
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = selectedItem,
                    modifier = modifier
                        .padding(dimensionResource(R.dimen.text_padding))
                        .weight(1f),
                    style = MaterialTheme.typography.labelLarge.copy(
                        color = MaterialTheme.colorScheme.onPrimaryContainer
                    )
                )
                Icon(
                    tint = MaterialTheme.colorScheme.onPrimaryContainer,
                    painter = painterResource(id = R.drawable.arrow_drop_down),
                    contentDescription = "Drop down",
                    modifier = Modifier.size(dimensionResource(R.dimen.icon_size_small))
                )
            }

            // BottomSheet content
            if (showBottomSheet) {
                ModalBottomSheet(
                    onDismissRequest = { showBottomSheet = false },
                    sheetState = rememberModalBottomSheetState(
                        //initialValue = ModalBottomSheetValue.Expanded
                    )
                ) {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(dimensionResource(R.dimen.bottom_sheet_item_padding)),
                    ) {
                        items.forEach { item ->
                            Text(
                                text = item,
                                modifier = modifier
                                    .fillMaxWidth()
                                    .heightIn(min = dimensionResource(R.dimen.bottom_sheet_item_height))
                                    .padding(dimensionResource(R.dimen.text_padding))
                                    .clickable {
                                        selectedItem = item
                                        showBottomSheet = false
                                        onItemSelected(item)
                                    },
                                style = MaterialTheme.typography.bodyLarge.copy(
                                    color = MaterialTheme.colorScheme.onSurface,
                                    fontSize = 16.sp
                                )
                            )

                        }
                        Spacer(modifier.padding(dimensionResource(R.dimen.bottom_sheet_bottom_spacer)))
                    }
                }
            }
        }
    }
}
