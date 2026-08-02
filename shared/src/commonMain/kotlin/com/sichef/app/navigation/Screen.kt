package com.sichef.app.navigation

sealed class Screen(val route: String) {
    object Onboarding : Screen("onboarding")
    object Home : Screen("home")
    object ChefDetail : Screen("chef_detail/{chefId}") {
        fun createRoute(chefId: String) = "chef_detail/$chefId"
    }
}