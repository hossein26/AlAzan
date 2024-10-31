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
import com.example.alazan.ui.Quibla1
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
import com.example.alazan.ui.settings.screens.calculation.Calculation
import com.example.alazan.ui.settings.screens.counter.Counter
import com.example.alazan.ui.settings.screens.fixproblem.FixProblems
import com.example.alazan.ui.settings.screens.interfacesettings.InterfaceSettings
import com.example.alazan.ui.settings.screens.locations.Location
import com.example.alazan.ui.settings.screens.reminder.Reminder1
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

    NavHost(navController = navController, startDestination = "mainScreen") {
        composable("intro1") { Intro1(navController) }
        composable("intro2") { Intro2(navController) }
        composable("intro3") { Intro3(navController) }
        composable("intro4") { Intro4(navController) }
        composable("intro7") { Intro7(navController) }
        composable("intro8") { Intro8(navController) }
        composable("intro9") { Intro9(navController) }
        composable("mainScreen") { MainScreen(navController) }
        composable("adjustments") { Adjustments(navController) }
        composable("reminder") { Reminder1(navController) }
        composable("quibla") { Quibla1(navController) }
        composable("counter") { Counter(navController) }
        composable("settings") { Settings(navController) }
        composable("about_us") { AboutUs(navController) }
        //composable("about_us") { Interfac(navController) }
        composable("sound") { Sound(navController) }
        composable("calculation") { Calculation(navController) }
        composable("location") { Location(navController) }
        composable("fix_problems") { FixProblems(navController) }
        composable("widget_setting") { WidgetSetting(navController) }
        composable("backup") { Backup(navController) }
        composable("interface") { InterfaceSettings(navController) }

    }
}

