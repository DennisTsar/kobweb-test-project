package com.example.pages.backend

import androidx.compose.runtime.*
import com.varabyte.kobweb.browser.api
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import kotlinx.browser.window
import kotlinx.coroutines.async

@Page
@Composable
fun Apis() {
    var test1 by remember { mutableStateOf("") }
    var test2 by remember { mutableStateOf("") }
    var test3 by remember { mutableStateOf("") }
    var test4 by remember { mutableStateOf("") }
    var test5 by remember { mutableStateOf("") }
    var test6 by remember { mutableStateOf("") }
    var test7 by remember { mutableStateOf("") }
    var test8 by remember { mutableStateOf("") }
    LaunchedEffect(Unit) {
        test1 = async { window.api.get("/base/test1") }.await().decodeToString()
        test2 = async { window.api.get("/base/test2-x") }.await().decodeToString()
        test3 = async { window.api.get("/base/test3") }.await().decodeToString()
        test4 = async { window.api.get("/base/my/test/test4") }.await().decodeToString()
        test5 = async { window.api.get("/base/my/test/test5-x") }.await().decodeToString()
        test6 = async { window.api.get("/root/test/test6") }.await().decodeToString()
        test7 = async { window.api.get("/test7") }.await().decodeToString()
        test8 = async { window.api.get("/success/test1") }.await().decodeToString()
    }
    Column {
        SpanText("Test1: $test1")
        SpanText("Test2: $test2")
        SpanText("Test3: $test3")
        SpanText("Test4: $test4")
        SpanText("Test5: $test5")
        SpanText("Test6: $test6")
        SpanText("Test7: $test7")
        SpanText("mapped/test1: $test8")
    }
}