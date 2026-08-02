package com.sichef.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.sichef.app.core.theme.SiChefTheme
import com.sichef.app.features.onboarding.OnboardingScreen
import com.sichef.app.navigation.Screen

@Composable
fun App() {
    SiChefTheme {
        var currentScreen by remember { mutableStateOf<Screen>(Screen.Onboarding) }

        when (currentScreen) {
            is Screen.Onboarding -> {
                OnboardingScreen(
                    onNavigateToHome = {
                        currentScreen = Screen.Home
                    }
                )
            }
            is Screen.Home -> {
                // Aquí llamaremos a HomeScreen en el siguiente paso
            }
            else -> {}
        }
    }
}