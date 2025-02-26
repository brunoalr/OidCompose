package com.openimagedebugger.composeui

actual fun getPlatform(): Platform {
    return Platform(name = "Java ${System.getProperty("java.version")}")
}