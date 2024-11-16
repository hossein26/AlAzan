package com.github.meypod.al_azan.general_components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.github.meypod.al_azan.R

@Composable
fun SampleDivider(modifier: Modifier=Modifier){
    HorizontalDivider(
        modifier = modifier.padding(vertical = dimensionResource(R.dimen.padding_extra_medium)),
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.outlineVariant
    )
}