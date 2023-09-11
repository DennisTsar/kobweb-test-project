package com.example.api.stream

import com.varabyte.kobweb.api.stream.ApiStream

val x = ApiStream {
    it.stream.send("test1")
}