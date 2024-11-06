package com.example.alazan.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.Button
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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.alazan.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun BottomSheetSample() {
    val sheetState = rememberModalBottomSheetState()
    val coroutineScope = rememberCoroutineScope()
    var selectedOption by remember { mutableStateOf("Select an option") }

    // List of options to show in the BottomSheet
    val options = listOf("Option 1", "Option 2", "Option 3", "Option 4")

    ModalBottomSheet(
        onDismissRequest = { coroutineScope.launch { sheetState.hide() } },
        sheetState = sheetState,
        dragHandle = { BottomSheetDefaults.DragHandle() } // Material 3 drag handle
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Please select an option",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            // Display each option
            options.forEach { option ->
                Text(
                    text = option,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            selectedOption = option
                            coroutineScope.launch { sheetState.hide() }
                        }
                        .padding(vertical = 12.dp)
                )
            }
        }
    }

    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .heightIn(min = 40.dp)
            .background(Color.Black)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color.Black)
                .width(272.dp)
                .align(Alignment.Center)
                .clickable { coroutineScope.launch { sheetState.show() } }
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(8.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "selectedItem",
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f),
                style = MaterialTheme.typography.labelLarge.copy(MaterialTheme.colorScheme.onPrimaryContainer)
            )
            Icon(
                tint = Color.White,
                painter = painterResource(
                    id = if (true
                    //expanded
                    ) {
                        R.drawable.arrow_drop_up
                    } else {
                        R.drawable.arrow_drop_down
                    }
                ),
                contentDescription = "Drop down",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 2.dp, start = 2.dp),
            )
        }
    }


}


        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun BottomSheetWithMaterial3() {
            val sheetState = rememberModalBottomSheetState()
            val coroutineScope = rememberCoroutineScope()
            var selectedOption by remember { mutableStateOf("Select an option") }

            // List of options to show in the BottomSheet
            val options = listOf("Option 1", "Option 2", "Option 3", "Option 4")

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Button(onClick = {
                    coroutineScope.launch { sheetState.show() }
                }) {
                    Text(text = selectedOption)
                }
            }

            // BottomSheet with Material 3
            ModalBottomSheet(
                onDismissRequest = { coroutineScope.launch { sheetState.hide() } },
                sheetState = sheetState,
                dragHandle = { BottomSheetDefaults.DragHandle() } // Material 3 drag handle
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Please select an option",
                        style = MaterialTheme.typography.titleLarge,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    // Display each option
                    options.forEach { option ->
                        Text(
                            text = option,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    selectedOption = option
                                    coroutineScope.launch { sheetState.hide() }
                                }
                                .padding(vertical = 12.dp)
                        )
                    }
                }
            }
        }

        @Preview
        @Composable
        fun PreviewBottomSheetWithMaterial3() {
            BottomSheetWithMaterial3()
        }


