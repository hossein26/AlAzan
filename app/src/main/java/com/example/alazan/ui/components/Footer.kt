package com.example.alazan.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.alazan.R


@Composable
fun Footer(
    modifier: Modifier = Modifier,
    onNextClick: () -> Unit,
    onBackClick: () -> Unit,
    onSkipClick: () -> Unit,
) {
    PatternBackgroundBox(
        modifier =
        modifier
            .fillMaxWidth()
            .height(dimensionResource(R.dimen.footer_height))
            .background(Color.Transparent)
            .padding(
                horizontal = dimensionResource(R.dimen.footer_horizontal_spacing),
                vertical = dimensionResource(R.dimen.footer_vertical_spacing)
            )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(
                dimensionResource(R.dimen.footer_vertical_spacing),
                Alignment.Top
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier
                    .fillMaxWidth(),
            ) {
                Button(
                    onClick = {
                        onBackClick()
                    },
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
                    modifier = modifier
                        .heightIn(min = dimensionResource(R.dimen.footer_button_height))
                        .widthIn(min = dimensionResource(R.dimen.footer_button_width))
                ) {
                    Text(
                        text = stringResource(R.string.back),
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
                TextButton(
                    onClick = {
                        onSkipClick()
                    },
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    modifier = modifier
                        .heightIn(min = dimensionResource(R.dimen.footer_button_height))
                        .widthIn(min = dimensionResource(R.dimen.footer_button_width))
                ) {
                    Text(
                        text = stringResource(R.string.skip),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = modifier.align(Alignment.CenterVertically)
                    )
                }
                Button(
                    onClick = { onNextClick() },
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiaryContainer),
                    modifier = modifier
                        .heightIn(min = dimensionResource(R.dimen.footer_button_height))
                        .widthIn(min = dimensionResource(R.dimen.footer_button_width))
                ) {
                    Text(
                        text = stringResource(R.string.next),
                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                        style = MaterialTheme.typography.labelLarge,
                    )
                }
            }
            Spacer(modifier)
            //IntroProgress
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen.progress_bar_height))
                    .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.progress_bar_corner_radius)))
                    .background(color = MaterialTheme.colorScheme.tertiary)
            )

        }
    }


}

