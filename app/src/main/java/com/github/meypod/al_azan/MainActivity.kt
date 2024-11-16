package com.github.meypod.al_azan

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.general_components.Navigation.ABOUT_US
import com.github.meypod.al_azan.general_components.Navigation.ADJUSTMENTS
import com.github.meypod.al_azan.general_components.Navigation.ADVANCED
import com.github.meypod.al_azan.general_components.Navigation.ADVANCED_CALCULATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.BACKUP_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.CALCULATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.COUNTER
import com.github.meypod.al_azan.general_components.Navigation.FIX_PROBLEMS_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.INTERFACE_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.INTRO_1
import com.github.meypod.al_azan.general_components.Navigation.INTRO_2
import com.github.meypod.al_azan.general_components.Navigation.INTRO_3
import com.github.meypod.al_azan.general_components.Navigation.INTRO_4
import com.github.meypod.al_azan.general_components.Navigation.INTRO_7
import com.github.meypod.al_azan.general_components.Navigation.INTRO_8
import com.github.meypod.al_azan.general_components.Navigation.INTRO_9
import com.github.meypod.al_azan.general_components.Navigation.LOCATION_LIST
import com.github.meypod.al_azan.general_components.Navigation.LOCATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.general_components.Navigation.MONTHLY_VIEW
import com.github.meypod.al_azan.general_components.Navigation.QIBLA
import com.github.meypod.al_azan.general_components.Navigation.REMINDER
import com.github.meypod.al_azan.general_components.Navigation.SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.SOUND_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.WIDGET_SETTINGS
import com.github.meypod.al_azan.ui.intro.Intro1
import com.github.meypod.al_azan.ui.intro.Intro2
import com.github.meypod.al_azan.ui.intro.Intro3
import com.github.meypod.al_azan.ui.intro.Intro4
import com.github.meypod.al_azan.ui.intro.Intro7
import com.github.meypod.al_azan.ui.intro.Intro8
import com.github.meypod.al_azan.ui.intro.Intro9
import com.github.meypod.al_azan.ui.mainpage.MainScreen
import com.github.meypod.al_azan.ui.settings.screens.Settings
import com.github.meypod.al_azan.ui.settings.screens.backup.Backup
import com.github.meypod.al_azan.ui.settings.screens.calculation.Adjustments
import com.github.meypod.al_azan.ui.settings.screens.calculation.AdvancedCalculation
import com.github.meypod.al_azan.ui.settings.screens.calculation.Calculation
import com.github.meypod.al_azan.ui.settings.screens.counter.Counter
import com.github.meypod.al_azan.ui.settings.screens.fixproblem.Advanced
import com.github.meypod.al_azan.ui.settings.screens.fixproblem.FixProblems
import com.github.meypod.al_azan.ui.settings.screens.interfacesettings.InterfaceSettings
import com.github.meypod.al_azan.ui.settings.screens.locations.Location
import com.github.meypod.al_azan.ui.settings.screens.locations.LocationList
import com.github.meypod.al_azan.ui.settings.screens.quibla.Qibla
import com.github.meypod.al_azan.ui.settings.screens.reminder.Reminders
import com.github.meypod.al_azan.ui.settings.screens.sound.Sound
import com.github.meypod.al_azan.ui.settings.screens.widget.WidgetSetting
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED
            AlAzanTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = INTRO_1) {
        composable(INTRO_1) { Intro1(navController) }
        composable(INTRO_2) { Intro2(navController) }
        composable(INTRO_3) { Intro3(navController) }
        composable(INTRO_4) { Intro4(navController) }
        composable(INTRO_7) { Intro7(navController) }
        composable(INTRO_8) { Intro8(navController) }
        composable(INTRO_9) { Intro9(navController) }
        composable(MAIN_SCREEN) { MainScreen(navController) }
        composable(ADJUSTMENTS) { Adjustments(navController) }
        composable(REMINDER) { Reminders(navController) }
        composable(QIBLA) { Qibla(navController) }
        composable(COUNTER) { Counter(navController) }
        composable(SETTINGS) { Settings(navController) }
        composable(ABOUT_US) { AboutUs(navController) }
        composable(SOUND_SETTINGS) { Sound(navController) }
        composable(CALCULATION_SETTINGS) { Calculation(navController) }
        composable(LOCATION_SETTINGS) { Location(navController) }
        composable(FIX_PROBLEMS_SETTINGS) { FixProblems(navController) }
        composable(WIDGET_SETTINGS) { WidgetSetting(navController) }
        composable(BACKUP_SETTINGS) { Backup(navController) }
        composable(INTERFACE_SETTINGS) { InterfaceSettings(navController) }
        composable(ADVANCED_CALCULATION_SETTINGS) { AdvancedCalculation(navController) }
        composable(MONTHLY_VIEW) { MonthlyView(navController) }
        composable(ADVANCED) { Advanced(navController) }
        composable(LOCATION_LIST) { LocationList(navController = navController) }

    }
}

