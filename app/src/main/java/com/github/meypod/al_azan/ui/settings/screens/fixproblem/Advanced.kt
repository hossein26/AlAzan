package com.github.meypod.al_azan.ui.settings.screens.fixproblem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SwitchWithText
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar

@Preview
@Composable
fun Advanced(navController: NavController = rememberNavController(), modifier: Modifier= Modifier){
    Scaffold(
        topBar ={
            SampleTopAppBar(
                stringResource(R.string.advanced),
                navController = navController
            )
        }
    ) { innerPadding ->
        Column(
            modifier
                .padding(innerPadding)
                .padding(dimensionResource(R.dimen.item_content_padding))
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .padding(dimensionResource(R.dimen.card_content_padding))
        ) {
            Text(stringResource(R.string.adaptive_charging), style = MaterialTheme.typography.titleSmall, color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            Text(stringResource(R.string.adaptive_charging_desc), style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface)
            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
            Row {
                Icon(
                    modifier = Modifier.align(Alignment.CenterVertically)
                        .size(dimensionResource(R.dimen.icon_info_size)),
                    painter = painterResource(R.drawable.ic_info_gray),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_icon_text)))
                Text(
                    text = stringResource(R.string.adaptive_charging_info),
                    fontSize = 14.sp,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items_medium)))
            SwitchWithText(
                title = stringResource(R.string.adaptive_charging_switch),
                description = "",
                isChecked = false,
                onCheckedChange = {},
            )
        }
    }
}