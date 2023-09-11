package com.example.api.stream

import com.varabyte.kobweb.api.stream.ApiStream

val x2 = object : ApiStream() {
    override suspend fun onTextReceived(ctx: TextReceivedContext) {
        ctx.stream.send("test3")
    }
}