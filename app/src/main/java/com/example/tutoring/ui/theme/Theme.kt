package com.example.tutoring.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = NavyPrimary,
    secondary = AccentYellow,
    background = BackgroundLight,
    surface = BackgroundLight,
    onPrimary = BackgroundLight,
    onSecondary = NavyPrimary,
    onBackground = NavyPrimary,
    onSurface = NavyPrimary,
    error = ErrorRed
)

@Composable
fun TutoringAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme,
        typography = AppTypography,
        content = content
    )
}