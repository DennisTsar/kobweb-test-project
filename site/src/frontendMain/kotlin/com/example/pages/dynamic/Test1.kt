package com.example.pages.dynamic

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page("{}")
@Composable
fun Test1() {
    Text("Dynamic: Test1")
}