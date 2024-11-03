package com.example.alazan.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF76D5D8),
    onPrimary = Color(0xFF003738),
    primaryContainer = Color(0xFF008083),
    onPrimaryContainer = Color(0xFFFFFFFF),

    secondary = PurpleGrey80,
    secondaryContainer = Color(0xFF224445),
    onSecondaryContainer = Color(0xFFB6DADA),

    tertiary = Color(0xFF705D00),
    tertiaryContainer = Color(0xFFDDB90B),
    onTertiaryContainer = Color(0xFF382D00),

    onTertiary = Color(0xFFFFE175),

    onSurface = Color(0xFFDFE3E3),
    surfaceVariant = Color(0xFF3E4949),
    surfaceContainer = Color(0xFF262B2B),
    surfaceContainerHigh = Color(0xFF313636),
    onSurfaceVariant = Color(0xFFBDC9C9),

    background = Color(0xFF101414),

    outline = Color(0xFF879393),
    error = Color(0xFFF87363),

    inversePrimary = Color(0xFF008083),
    inverseSurface = Color(0xFF262B2B),

    surfaceTint = Color(0xFF00585A)

)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF00585A),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF008083),
    onPrimaryContainer = Color(0xFFFFFFFF),

    secondary = textColor,
    secondaryContainer = Color(0xFFC9EDEE),
    onSecondaryContainer = Color(0xFF2E5051),

    tertiary = Color(0xFF705D00),
    tertiaryContainer = Color(0xFFECC622),
    onTertiaryContainer = Color(0xFF443700),

    onTertiary = Color(0xFFFFE175),

    surfaceContainer = Color(0xFFEBEFEE),
    surfaceContainerHigh = Color(0xFFDFE3E3),
    surfaceVariant = surfaceVariant,
    onSurfaceVariant = onSurfaceVariant,
    onSurface = Color(0xFF181C1C),

    background = Color(0xFFFDFDFD),
    onBackground = onPrimaryColor,

    error = Color(0xFFBA1A1A),
    outline = Color(0xFF6E7979),


    inversePrimary = Color(0xFF008083),
    inverseSurface = Color(0xFF00585A),

    surfaceTint = Color(0xFF00585A)
)

@Composable
fun AlAzanTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}