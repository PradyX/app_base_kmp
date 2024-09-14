package com.prady.app.base.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform