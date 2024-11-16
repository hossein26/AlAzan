package com.github.meypod.al_azan.ui.settings.screens.locations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Composable
@Preview
fun LocationListDialog(modifier: Modifier = Modifier) {
    AlAzanTheme {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(dimensionResource(R.dimen.card_content_padding))
                .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius))),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(dimensionResource(R.dimen.shadow_elevation_low))
        ) {
            Column(
                modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Row(
                    modifier
                        .fillMaxWidth().padding(dimensionResource(R.dimen.padding_large)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Set As Default",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Icon(
                        painter = painterResource(R.drawable.ic_check),
                        modifier = Modifier
                            .size(dimensionResource(R.dimen.icon_extra_medium)),
                        contentDescription = ""
                    )
                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(horizontal = dimensionResource(R.dimen.padding_large)),
                    thickness = 1.dp,
                    color = Color(0xFFBDC9C9)
                )
                Row(
                    modifier
                        .fillMaxWidth().padding(dimensionResource(R.dimen.padding_large)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Delete Location",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.error
                    )
                    Icon(
                        painter = painterResource(R.drawable.icon_delete),
                        modifier = Modifier
                            .size(dimensionResource(R.dimen.icon_extra_medium)),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.error
                    )
                }
                   
            }
        }
    }
}