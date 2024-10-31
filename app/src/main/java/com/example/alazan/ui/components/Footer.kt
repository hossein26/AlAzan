package com.example.alazan.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em

@Composable
fun Footer(modifier: Modifier = Modifier, onClick: () -> Unit) {
    PatternBackgroundBox(modifier =
        modifier.fillMaxWidth()
            .height(120.dp)
            //.padding(16.dp)
            //.padding(top = 24.dp)
            //.padding(bottom = 16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier
                .padding(bottom = 24.dp)
                //.background(Color(0xFF00585A))

        ){
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        horizontal = 16.dp,
                        vertical = 10.dp,
                    ),
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = modifier
                        .requiredHeight(height = 40.dp)
                        .width(80.dp)
                ) {
                    Text(
                        text = "Back",
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        textAlign = TextAlign.Center,
                        lineHeight = 1.43.em,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                }
                TextButton(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    contentPadding = PaddingValues(horizontal = 12.dp, vertical = 10.dp),
                    modifier = modifier
                        .requiredHeight(height = 40.dp)
                        .width(52.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(
                                8.dp,
                                Alignment.CenterHorizontally
                            ),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = modifier
                                .fillMaxSize()
                        ) {
                            Text(
                                text = "Skip",
                                color = MaterialTheme.colorScheme.onPrimaryContainer,
                                textAlign = TextAlign.Center,
                                lineHeight = 1.43.em,
                                style = MaterialTheme.typography.labelLarge,
                                modifier = modifier
                                    .wrapContentHeight(align = Alignment.CenterVertically)
                            )
                        }
                    }
                }
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(100.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer),
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 10.dp),
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
                        .width(80.dp)
                ) {
                    Text(
                        text = "Next",
                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .clickable { onClick() }
                    )
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                Progress()
            }
        }
    }




}

