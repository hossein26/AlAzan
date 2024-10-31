package com.example.alazan.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun Progress(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .requiredHeight(height = 12.dp)
    ) {
        Box(
            modifier = Modifier
                .align(alignment = Alignment.CenterStart)
                .fillMaxWidth()
                .requiredHeight(height = 12.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .requiredHeight(height = 12.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterStart)
                            .fillMaxWidth()
                            .requiredHeight(height = 4.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(color = MaterialTheme.colorScheme.tertiary)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.CenterEnd)
                    .requiredSize(size = 4.dp)
            ) {
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.Center)
                        .requiredSize(size = 4.dp)
                        .clip(shape = RoundedCornerShape(26.dp))
                        .background(color = MaterialTheme.colorScheme.tertiaryContainer)
                )
            }
        }
    }
}