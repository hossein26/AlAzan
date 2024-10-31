package com.example.alazan.ui.settings.screens.reminder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
@Preview
fun ReminderDialogEdite(modifier: Modifier = Modifier) {
    AlAzanTheme {

        Dialog(
            onDismissRequest = { },

            )
        {

            Card(
                modifier = Modifier
                    .width(154.dp)
                    .wrapContentHeight()
                    .padding(8.dp)
                    .clip(RoundedCornerShape(28.dp))
                    .background(Color(0xFFE5E9E8)),
                shape = MaterialTheme.shapes.medium,
                elevation = CardDefaults.cardElevation(16.dp)
            ) {

                Column(

                ) {
                    Row(
                        modifier
                            .wrapContentHeight()
                            .fillMaxWidth()
                            .padding(top =18.dp, start = 12.dp , end = 12. dp, bottom = 12.dp),

                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Edite",
                            modifier
                                .padding(start = 12.dp),
                            color = Color(0xFF181C1C),
                            fontSize = 14.sp,

                            )
                        Icon(
                            painter = painterResource(R.drawable.icon_pen),
                            contentDescription = "",
                            modifier
                                .padding(end = 12.dp),
                        )
                    }


                    HorizontalDivider(
                        modifier = Modifier
                            .wrapContentWidth()
                            .padding(start = 12.dp, end = 12.dp),
                        thickness = 1.dp,
                        color = Color(0xFFBDC9C9)
                    )

                    Row(
                        modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(top =12    .dp, start = 12.dp , end = 12. dp, bottom = 18.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Delete",
                            modifier
                                .padding(start = 12.dp),
                            color = Color(0xFFBA1A1A),
                            fontSize = 14.sp,

                            )
                        Icon(
                            painter = painterResource(R.drawable.icon_delete),
                            contentDescription = "",
                            modifier
                                .padding(end = 12.dp),
                            tint = Color(0xFFBA1A1A),


                            )
                    }


                }


            }

        }
    }
}
