package com.sichef.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform