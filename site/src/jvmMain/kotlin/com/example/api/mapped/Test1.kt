package com.example.api.mapped

import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText

@Api
fun test1(ctx: ApiContext) {
    ctx.res.setBodyText("mapped/test1")
}