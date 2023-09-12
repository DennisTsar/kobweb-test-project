package com.example

import com.varabyte.kobweb.api.init.InitApi
import com.varabyte.kobweb.api.init.InitApiContext

object Globals {
    var test3 = ""
}

@InitApi
fun init(@Suppress("UNUSED_PARAMETER") ctx: InitApiContext) {
    Globals.test3 = "test3"
}