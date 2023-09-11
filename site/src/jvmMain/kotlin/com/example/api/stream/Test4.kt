package com.example.api.stream

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.stream.ApiStream

@Api("/custom/")
val y2 = object : ApiStream() {
    override suspend fun onTextReceived(ctx: TextReceivedContext) {
        ctx.stream.send("test4")
    }
}