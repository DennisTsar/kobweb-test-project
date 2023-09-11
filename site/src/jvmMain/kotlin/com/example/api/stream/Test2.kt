package com.example.api.stream

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.stream.ApiStream

@Api("my/test")
val y = ApiStream {
    it.stream.send("test2")
}