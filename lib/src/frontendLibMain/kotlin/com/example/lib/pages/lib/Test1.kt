package com.example.lib.pages.lib

import androidx.compose.runtime.*
import com.varabyte.kobweb.browser.api
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Test1() {
    var libApi by remember { mutableStateOf("") }
    var mainApi by remember { mutableStateOf("") }
    Text("lib: Test1; libApi/test1=$libApi; mainApi/test1=$mainApi")
    LaunchedEffect(Unit) {
        libApi = window.api.get("/lib/test1").decodeToString()
        mainApi = window.api.get("/base/test1").decodeToString()
    }
}