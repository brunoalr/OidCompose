package com.openimagedebugger.composeui

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication(
    title = "OidCompose",
    state = WindowState(size = DpSize.Unspecified)
) {
    App()
}