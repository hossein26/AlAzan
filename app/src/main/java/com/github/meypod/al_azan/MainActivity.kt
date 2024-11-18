package com.github.meypod.al_azan

import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.Navigation.ABOUT_US
import com.github.meypod.al_azan.Navigation.ADJUSTMENTS
import com.github.meypod.al_azan.Navigation.ADVANCED
import com.github.meypod.al_azan.Navigation.ADVANCED_CALCULATION_SETTINGS
import com.github.meypod.al_azan.Navigation.AZAN_ALARM
import com.github.meypod.al_azan.Navigation.BACKUP_SETTINGS
import com.github.meypod.al_azan.Navigation.CALCULATION_SETTINGS
import com.github.meypod.al_azan.Navigation.COUNTER
import com.github.meypod.al_azan.Navigation.FIX_PROBLEMS_SETTINGS
import com.github.meypod.al_azan.Navigation.INTERFACE_SETTINGS
import com.github.meypod.al_azan.Navigation.INTRO_1
import com.github.meypod.al_azan.Navigation.INTRO_2
import com.github.meypod.al_azan.Navigation.INTRO_3
import com.github.meypod.al_azan.Navigation.INTRO_4
import com.github.meypod.al_azan.Navigation.INTRO_6
import com.github.meypod.al_azan.Navigation.INTRO_7
import com.github.meypod.al_azan.Navigation.INTRO_8
import com.github.meypod.al_azan.Navigation.INTRO_9
import com.github.meypod.al_azan.Navigation.LOCATION_LIST
import com.github.meypod.al_azan.Navigation.LOCATION_SETTINGS
import com.github.meypod.al_azan.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.Navigation.MONTHLY_VIEW
import com.github.meypod.al_azan.Navigation.MUAZZIN
import com.github.meypod.al_azan.Navigation.NOTIFICATION_SOUND
import com.github.meypod.al_azan.Navigation.QIBLA
import com.github.meypod.al_azan.Navigation.QIBLA_COMPOSE
import com.github.meypod.al_azan.Navigation.QIBLA_LOCATION
import com.github.meypod.al_azan.Navigation.REMINDER
import com.github.meypod.al_azan.Navigation.SETTINGS
import com.github.meypod.al_azan.Navigation.SOUND_SETTINGS
import com.github.meypod.al_azan.Navigation.WIDGET_SETTINGS
import com.github.meypod.al_azan.screens.aboutus.AboutUs
import com.github.meypod.al_azan.screens.alarm.AzanAlarm
import com.github.meypod.al_azan.screens.intro.Intro1
import com.github.meypod.al_azan.screens.intro.Intro2
import com.github.meypod.al_azan.screens.intro.Intro3
import com.github.meypod.al_azan.screens.intro.Intro4
import com.github.meypod.al_azan.screens.intro.Intro6
import com.github.meypod.al_azan.screens.intro.Intro7
import com.github.meypod.al_azan.screens.intro.Intro8
import com.github.meypod.al_azan.screens.intro.Intro9
import com.github.meypod.al_azan.screens.mainpage.MainScreen
import com.github.meypod.al_azan.screens.monthly_view.MonthlyView
import com.github.meypod.al_azan.screens.reminder.Reminders
import com.github.meypod.al_azan.screens.settings.screens.Settings
import com.github.meypod.al_azan.screens.settings.screens.backup.Backup
import com.github.meypod.al_azan.screens.settings.screens.calculation.Adjustments
import com.github.meypod.al_azan.screens.settings.screens.calculation.AdvancedCalculation
import com.github.meypod.al_azan.screens.settings.screens.calculation.Calculation
import com.github.meypod.al_azan.screens.settings.screens.counter.Counter
import com.github.meypod.al_azan.screens.settings.screens.fixproblem.Advanced
import com.github.meypod.al_azan.screens.settings.screens.fixproblem.FixProblems
import com.github.meypod.al_azan.screens.settings.screens.interfacesettings.InterfaceSettings
import com.github.meypod.al_azan.screens.settings.screens.locations.Location
import com.github.meypod.al_azan.screens.settings.screens.locations.LocationList
import com.github.meypod.al_azan.screens.settings.screens.quibla.Qibla
import com.github.meypod.al_azan.screens.settings.screens.quibla.QiblaCompose
import com.github.meypod.al_azan.screens.settings.screens.quibla.QiblaLocation
import com.github.meypod.al_azan.screens.settings.screens.sound.Muazzin
import com.github.meypod.al_azan.screens.settings.screens.sound.NotificationSound
import com.github.meypod.al_azan.screens.settings.screens.sound.SoundAndNotification
import com.github.meypod.al_azan.screens.settings.screens.widget.WidgetSetting
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

class MainActivity : ComponentActivity() {
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
        composable(INTRO_6) { Intro6(navController) }
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
        composable(SOUND_SETTINGS) { SoundAndNotification(navController) }
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
        composable(MUAZZIN) { Muazzin(navController) }
        composable(NOTIFICATION_SOUND) { NotificationSound(navController) }
        composable(QIBLA_LOCATION) { QiblaLocation(navController) }
        composable(QIBLA_COMPOSE) { QiblaCompose(navController) }
        composable(AZAN_ALARM) { AzanAlarm(navController) }
    }
}