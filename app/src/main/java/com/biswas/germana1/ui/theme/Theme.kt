package com.biswas.germana1.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = BrandYellow,
    onPrimary = BrandCharcoal,
    primaryContainer = BrandCharcoal,
    onPrimaryContainer = BrandYellow,
    secondary = BrandRed,
    onSecondary = Color.White,
    tertiary = BrandYellow,
    onTertiary = BrandCharcoal,
    background = Color(0xFF121212),
    onBackground = Color(0xFFEEEEEE),
    surface = Color(0xFF1E1E1E),
    onSurface = Color(0xFFEEEEEE),
    surfaceVariant = Color(0xFF2C2C2C),
    onSurfaceVariant = Color(0xFFCCCCCC)
)

private val LightColorScheme = lightColorScheme(
    primary = BrandCharcoal,
    onPrimary = Color.White,
    primaryContainer = BrandYellow,
    onPrimaryContainer = BrandCharcoal,
    secondary = BrandRed,
    onSecondary = Color.White,
    secondaryContainer = Color(0xFFFFEBEB),
    onSecondaryContainer = BrandRed,
    tertiary = BrandYellow,
    onTertiary = BrandCharcoal,
    background = BrandWarmBackground,
    onBackground = BrandCharcoal,
    surface = BrandSurfaceWhite,
    onSurface = BrandCharcoal,
    surfaceVariant = BrandSurface,
    onSurfaceVariant = BrandTextMuted
)

@Composable
fun GermanA1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Keep dynamicColor false to preserve locked brand identity on all devices
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
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