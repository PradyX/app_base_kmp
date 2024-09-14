package com.prady.app.base.kmp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "app_base_kmp",
    ) {
        App()
    }
}