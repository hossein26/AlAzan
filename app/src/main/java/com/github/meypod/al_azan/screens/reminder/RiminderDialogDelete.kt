package com.github.meypod.al_azan.screens.reminder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Composable
@Preview
fun ReminderDialogDelete(modifier: Modifier = Modifier) {
    AlAzanTheme {

        Dialog(
            onDismissRequest = { },

            )
        {

            Card(
                modifier = Modifier
                    .wrapContentWidth()
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainerHigh),
                shape = MaterialTheme.shapes.medium,
                elevation = CardDefaults.cardElevation(16.dp)
            ) {

                Column(

                    modifier
                        .padding(12.dp)
                ) {


                    Text(
                        text = "Deleting Reminder",
                        modifier
                            .padding(start = 12.dp, top = 12.dp, bottom = 6.dp),
                        color = Color(0xFF181C1C),
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.headlineSmall

                    )


                    Text(
                        text = "Are you sure you want to delete the\nReminder ?",
                        modifier
                            .padding(start = 12.dp, top = 6.dp, bottom = 12.dp, end = 12.dp),
                        color = Color(0xFF4C5E5E),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )


                    Row(
                        modifier
                            .wrapContentHeight()
                            .padding(12.dp)
                            .align(Alignment.End),

                        ) {
                        Text(
                            text = "Delete",
                            modifier
                                .padding(start = 24.dp, end = 24.dp),
                            textAlign = TextAlign.Center,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFFBA1A1A),
                        )
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Cancel",
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            color = Color(0xFF00585A)
                        )
                    }
                }

            }

        }
    }
}

