package com.example.pages.dynamic

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page("/custom/{}")
@Composable
fun Test3() {
    Text("Dynamic: Test3")
}