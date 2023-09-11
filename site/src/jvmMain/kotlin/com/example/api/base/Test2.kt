package com.example.api.base

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText

@Api("test2-x")
fun test2(ctx: ApiContext) {
    ctx.res.setBodyText("test2")
}