package com.example.pages.libtest

import androidx.compose.runtime.*
import com.varabyte.kobweb.browser.api
import com.varabyte.kobweb.core.Page
import kotlinx.browser.window
import org.jetbrains.compose.web.dom.Text

@Page
@Composable
fun Test1() {
    var libApi by remember { mutableStateOf("") }
    Text("libApi/test1=$libApi")
    LaunchedEffect(Unit) {
        libApi = window.api.get("/lib/test1").decodeToString()
    }
}