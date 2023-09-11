package com.example.pages.dynamic

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page("my/test/{}")
@Composable
fun Test2() {
    Text("Dynamic: Test2")
}