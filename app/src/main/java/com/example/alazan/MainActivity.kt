package com.example.alazan

import android.annotation.SuppressLint
import android.content.pm.ActivityInfo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.luminance
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.alazan.general_components.Navigation.ABOUT_US
import com.example.alazan.general_components.Navigation.ADJUSTMENTS
import com.example.alazan.general_components.Navigation.CALCULATION
import com.example.alazan.general_components.Navigation.COUNTER
import com.example.alazan.general_components.Navigation.INTRO_1
import com.example.alazan.general_components.Navigation.INTRO_2
import com.example.alazan.general_components.Navigation.INTRO_3
import com.example.alazan.general_components.Navigation.INTRO_4
import com.example.alazan.general_components.Navigation.INTRO_7
import com.example.alazan.general_components.Navigation.INTRO_8
import com.example.alazan.general_components.Navigation.INTRO_9
import com.example.alazan.general_components.Navigation.LOCATION
import com.example.alazan.general_components.Navigation.MAIN_SCREEN
import com.example.alazan.general_components.Navigation.QIBLA
import com.example.alazan.general_components.Navigation.REMINDER
import com.example.alazan.general_components.Navigation.SETTINGS
import com.example.alazan.general_components.Navigation.SOUND
import com.example.alazan.ui.Quibla
import com.example.alazan.ui.intro.Intro1
import com.example.alazan.ui.intro.Intro2
import com.example.alazan.ui.intro.Intro3
import com.example.alazan.ui.intro.Intro4
import com.example.alazan.ui.intro.Intro7
import com.example.alazan.ui.intro.Intro8
import com.example.alazan.ui.intro.Intro9
import com.example.alazan.ui.mainpage.MainScreen
import com.example.alazan.ui.settings.Settings
import com.example.alazan.ui.settings.screens.backup.Backup
import com.example.alazan.ui.settings.screens.calculation.Adjustments
import com.example.alazan.ui.settings.screens.calculation.AdvancedCalculation
import com.example.alazan.ui.settings.screens.calculation.Calculation
import com.example.alazan.ui.settings.screens.counter.Counter
import com.example.alazan.ui.settings.screens.fixproblem.FixProblems
import com.example.alazan.ui.settings.screens.interfacesettings.InterfaceSettings
import com.example.alazan.ui.settings.screens.locations.Location
import com.example.alazan.ui.settings.screens.reminder.Reminder
import com.example.alazan.ui.settings.screens.sound.Sound
import com.example.alazan.ui.settings.screens.widget.WidgetSetting
import com.example.alazan.ui.theme.AlAzanTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
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
    val systemUiController = rememberSystemUiController()
    val useDarkIcons = MaterialTheme.colorScheme.primary.luminance() > 0.5f

    systemUiController.setStatusBarColor(
        color = MaterialTheme.colorScheme.inverseSurface,
        //darkIcons = useDarkIcons
    )
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "intro1") {
        composable(INTRO_1) { Intro1(navController) }
        composable(INTRO_2) { Intro2(navController) }
        composable(INTRO_3) { Intro3(navController) }
        composable(INTRO_4) { Intro4(navController) }
        composable(INTRO_7) { Intro7(navController) }
        composable(INTRO_8) { Intro8(navController) }
        composable(INTRO_9) { Intro9(navController) }
        composable(MAIN_SCREEN) { MainScreen(navController) }
        composable(ADJUSTMENTS) { Adjustments(navController) }
        composable(REMINDER) { Reminder(navController) }
        composable(QIBLA) { Quibla(navController) }
        composable(COUNTER) { Counter(navController) }
        composable(SETTINGS) { Settings(navController) }
        composable(ABOUT_US) { AboutUs(navController) }
        composable(SOUND) { Sound(navController) }
        composable(CALCULATION) { Calculation(navController) }
        composable(LOCATION) { Location(navController) }
        composable("fix_problems") { FixProblems(navController) }
        composable("widget_setting") { WidgetSetting(navController) }
        composable("backup") { Backup(navController) }
        composable("interface") { InterfaceSettings(navController) }
        composable("advance_calculation") { AdvancedCalculation(navController) }
        composable("monthly_view") { MonthlyView(navController) }

    }
}

