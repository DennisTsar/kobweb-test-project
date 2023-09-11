package com.example.api.base

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText


@Api("my/test/")
fun test4(ctx: ApiContext) {
    ctx.res.setBodyText("test4")
}