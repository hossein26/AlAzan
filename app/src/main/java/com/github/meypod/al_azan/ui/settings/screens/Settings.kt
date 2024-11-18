package com.github.meypod.al_azan.ui.settings.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.BACKUP_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.CALCULATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.FIX_PROBLEMS_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.INTERFACE_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.LOCATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.SOUND_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.WIDGET_SETTINGS
import com.github.meypod.al_azan.ui.settings.components.SampleTopAppBar
import com.github.meypod.al_azan.ui.settings.components.SettingItem
import com.github.meypod.al_azan.ui.settings.components.SettingsList

@Preview
@Composable
fun Settings(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val settingItems = listOf(
        SettingItem(R.drawable.ic_interface_settings, stringResource(R.string.interface_settings), INTERFACE_SETTINGS),
        SettingItem(R.drawable.ic_sound_settings, stringResource(R.string.sound_and_notification), SOUND_SETTINGS),
        SettingItem(R.drawable.ic_caculation_settings, stringResource(R.string.calculation), CALCULATION_SETTINGS),
        SettingItem(R.drawable.ic_location_settings, stringResource(R.string.locations), LOCATION_SETTINGS),
        SettingItem(R.drawable.ic_fix_settings, stringResource(R.string.fix_problems), FIX_PROBLEMS_SETTINGS),
        SettingItem(R.drawable.ic_widget_settings, stringResource(R.string.widget_settings), WIDGET_SETTINGS),
        SettingItem(R.drawable.ic_backup_settings, stringResource(R.string.backup_and_restore), BACKUP_SETTINGS)
    )
    Scaffold(
        topBar = {
            SampleTopAppBar(stringResource(R.string.settings), navController = navController)
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.surfaceContainer)
                .padding(innerPadding)
                .padding(dimensionResource(R.dimen.settings_Item_content_padding))

        ){
            SettingsList(
                settingItems = settingItems,
                navController = navController
            )
        }

    }

}




