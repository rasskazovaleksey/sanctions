package com.github.rasskazovalexey.sanction

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Challenge",
        state = rememberWindowState(),
    ) {
        NavigationHost()
    }
}
