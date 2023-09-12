package com.example.pages.dynamic

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Text

@Page("/test4/{id}/test4/{}")
@Composable
fun Test4() {
    Text("Dynamic: Test4")
}