package com.sichef.app.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = BrandColors.Orange,
    secondary = BrandColors.Purple,
    tertiary = BrandColors.Cyan,
    background = DarkBackground,
    surface = DarkSurface,
    onPrimary = LightBackground,
    onBackground = DarkTextPrimary,
    onSurface = DarkTextPrimary
)

private val LightColorScheme = lightColorScheme(
    primary = BrandColors.Orange,
    secondary = BrandColors.Purple,
    tertiary = BrandColors.Cyan,
    background = LightBackground,
    surface = LightSurface,
    onPrimary = LightBackground,
    onBackground = LightTextPrimary,
    onSurface = LightTextPrimary
)

@Composable
fun SiChefTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        content = content
    )
}