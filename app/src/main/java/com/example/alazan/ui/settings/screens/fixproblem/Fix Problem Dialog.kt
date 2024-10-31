package com.example.alazan.ui.settings.screens.fixproblem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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


fun FixProblemDialog(modifier: Modifier = Modifier) {

    AlAzanTheme {

        Dialog(
            onDismissRequest = { },

            )
        {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .clip(RoundedCornerShape(28.dp)),
                shape = MaterialTheme.shapes.medium,
                elevation = CardDefaults.cardElevation(16.dp)
            ) {


                Column(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        //.padding(12.dp)
                        .safeContentPadding()
                        .clip(RoundedCornerShape(28.dp))
                        .background(Color(0xFFE5E9E8)),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF00585A),
                            contentColor = Color.White
                        ), modifier = Modifier
                            .padding(bottom = 12.dp)
                            .padding(top = 14.dp)

                    ) {

                        Icon(
                            painter = painterResource(R.drawable.clockoff),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .padding(end = 12.dp)
                        )
                        Text(
                            text = "Dismiss and Silent 15m",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp
                        )

                    }


                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF00585A),
                            contentColor = Color.White
                        ), modifier = Modifier
                            .padding(bottom = 12.dp)

                    ) {

                        Icon(
                            painter = painterResource(R.drawable.snooze),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .padding(end = 12.dp)
                        )
                        Text(
                            text = "Snooze 15m",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp
                        )

                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF00585A),
                            contentColor = Color.White
                        ),
                        modifier = Modifier
                            .padding(bottom = 12.dp)

                    ) {

                        Icon(
                            painter = painterResource(R.drawable.snooze),
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF),
                            modifier = Modifier
                                .padding(end = 12.dp)
                        )
                        Text(
                            text = "Snooze 30m",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp
                        )

                    }

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFC9EDEE),
                            contentColor = Color(0xFF2E5051)
                        ),
                        elevation = ButtonDefaults.buttonElevation(
                            defaultElevation = 2.dp
                        ),
                        modifier = Modifier
                            .clip(RoundedCornerShape(8.dp))
                            .padding(bottom = 12.dp)

                    )
                    {

                        Text(
                            text = "Just Dismiss",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp
                        )

                    }

                }
            }
        }
    }
}




