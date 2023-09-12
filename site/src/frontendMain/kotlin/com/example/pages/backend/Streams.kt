package com.example.pages.backend

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.streams.rememberApiStream

@Page
@Composable
fun ApiStreams() {
    var test1 by remember { mutableStateOf("") }
    var test2 by remember { mutableStateOf("") }
    var test3 by remember { mutableStateOf("") }
    var test4 by remember { mutableStateOf("") }

    val stream1 = rememberApiStream("stream/test1") { test1 = it.text }
    val stream2 = rememberApiStream("stream/my/test") { test2 = it.text }
    val stream3 = rememberApiStream("stream/test3") { test3 = it.text }
    val stream4 = rememberApiStream("custom/test4") { test4 = it.text }

    LaunchedEffect(Unit) {
        stream1.send("x")
        stream2.send("x")
        stream3.send("x")
        stream4.send("x")
    }
    Column {
        SpanText("Test1: $test1")
        SpanText("Test2: $test2")
        SpanText("Test3: $test3")
        SpanText("Test4: $test4")
    }
}