package com.example.api.base

import com.example.Globals
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText

@Api
fun test3(ctx: ApiContext) {
    ctx.res.setBodyText(Globals.test3)
}