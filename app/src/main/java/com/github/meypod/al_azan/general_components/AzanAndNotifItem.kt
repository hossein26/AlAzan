package com.github.meypod.al_azan.general_components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.github.meypod.al_azan.R

@Composable
fun AzanAndNotifItem(
    title: String,
    showDialog: () -> Unit,
) {
    val fontScale = LocalDensity.current.fontScale
    val isCompact = fontScale >= 1.4f
    Column {
        if (isCompact) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                TitleRow(title)
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    NotificationRow()
                    AzanRow()
                    SettingsIcon(showDialog)
                }
            }
        } else {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                TitleRow(title)
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    NotificationRow()
                    AzanRow()
                    SettingsIcon(showDialog)
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(vertical = dimensionResource(R.dimen.padding_extra_small)),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outlineVariant
        )
    }
}
@Composable
fun TitleRow(title: String) {
    Text(
        text = title,
        color = MaterialTheme.colorScheme.onSurface,
        style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Medium),
    )
}
@Composable
fun NotificationRow() {
    var notifState by remember { mutableStateOf(ToggleableState.Off) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = stringResource(R.string.notification),
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodySmall
        )
        TriStateCheckbox(
            state = notifState,
            onClick = {
                notifState = when (notifState) {
                    ToggleableState.On -> ToggleableState.Off
                    ToggleableState.Off -> ToggleableState.Indeterminate
                    ToggleableState.Indeterminate -> ToggleableState.On
                }
            }
        )
    }
}
@Composable
fun AzanRow() {
    var azanState by remember { mutableStateOf(ToggleableState.Off) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = stringResource(R.string.azan),
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.bodySmall
        )
        TriStateCheckbox(
            state = azanState,
            onClick = {

                azanState = when (azanState) {
                    ToggleableState.On -> ToggleableState.Off
                    ToggleableState.Off -> ToggleableState.Indeterminate
                    ToggleableState.Indeterminate -> ToggleableState.On
                }

            }
        )
    }
}
@Composable
fun SettingsIcon(showDialog: () -> Unit) {
    Icon(
        painter = painterResource(id = R.drawable.ic_settings),
        contentDescription = stringResource(R.string.settings),
        tint = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier
            .size(dimensionResource(R.dimen.icon_medium))
            .clickable { showDialog() }
    )
}