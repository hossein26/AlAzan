package com.github.meypod.al_azan.ui.alarm

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun AlarmDialog() {
    AlAzanTheme {
        Column(
            Modifier
                .padding(dimensionResource(R.dimen.dialog_screen_padding))
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(dimensionResource(R.dimen.dialog_border_radius)))
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .padding(dimensionResource(R.dimen.dialog_content_padding)),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
            ) {
                Icon(
                    painter = painterResource(R.drawable.clockoff),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = "Dismiss and Silent 15m",
                    style = MaterialTheme.typography.labelLarge,
                )
            }
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.snooze),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = "Snooze 15m",
                    style = MaterialTheme.typography.labelLarge,
                )
            }
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                )
            ) {
                Icon(
                    painter = painterResource(R.drawable.snooze),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onPrimary,
                )
                Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = "Snooze 30m",
                    style = MaterialTheme.typography.labelLarge,
                )
            }
            Spacer(Modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.secondaryContainer,
                    contentColor = MaterialTheme.colorScheme.onSecondaryContainer
                ),
                elevation = ButtonDefaults.buttonElevation(
                    defaultElevation = dimensionResource(R.dimen.shadow_elevation_medium)
                )
            )
            {
                Text(
                    text = "Just Dismiss",
                    style = MaterialTheme.typography.labelLarge,
                )
            }
        }
    }
}

