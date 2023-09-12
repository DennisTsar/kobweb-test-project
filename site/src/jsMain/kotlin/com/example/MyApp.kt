package com.example

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.minHeight
import com.varabyte.kobweb.core.App
import com.varabyte.kobweb.core.init.InitKobweb
import com.varabyte.kobweb.core.init.InitKobwebContext
import com.varabyte.kobweb.silk.SilkApp
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.style.common.SmoothColorStyle
import com.varabyte.kobweb.silk.components.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Text

@App
@Composable
fun MyApp(content: @Composable () -> Unit) {
    SilkApp {
        Surface(SmoothColorStyle.toModifier().minHeight(100.vh)) {
            Column(Modifier.fillMaxSize()) {
                Row(Modifier.gap(0.5.cssRem)) {
                    A("/") {
                        Text("Home")
                    }
                    A("/base/test1") {
                        Text("Test1")
                    }
                    A("/base/test2-x") {
                        Text("Test2")
                    }
                    A("/base") {
                        Text("Test3")
                    }
                    A("/base/my/test/test4") {
                        Text("Test4")
                    }
                    A("/base/my/test/test5-x") {
                        Text("Test5")
                    }
                    A("/root/test/test6") {
                        Text("Test6")
                    }
                    A("/test7") {
                        Text("Test7")
                    }
                    // package mapping
                    A("/success/test1") {
                        Text("Mapped: Test1")
                    }
                    // dynamic
                    A("/dynamic/x") {
                        Text("Dynamic: Test1")
                    }
                    A("/dynamic/my/test/x") {
                        Text("Dynamic: Test2")
                    }
                    A("/custom/x") {
                        Text("Dynamic: Test3")
                    }
                    A("/test4/x/test4/y") {
                        Text("Dynamic: Test4")
                    }
                    A("/success/x/test1") {
                        Text("Mapped/Dynamic: Test1")
                    }
                    A("/success/x/x") {
                        Text("Mapped/Dynamic: Test2")
                    }
                    // backend
                    A("/backend/apis") {
                        Text("Apis")
                    }
                    A("/backend/streams") {
                        Text("Api Streams")
                    }
                    // lib
                    A("/lib/test1") {
                        Text("Lib: Test1")
                    }
                    // libtest
                    A("/libtest/test1") {
                        Text("LibTest: Test1")
                    }
                    //markdown
                    A("/markdown") {
                        Text("Markdown")
                    }
                    A("/lib/markdown") {
                        Text("Lib Markdown")
                    }
                }
                content()
            }
        }
    }
}

@InitKobweb
fun initKobweb() {
    println("init kobweb")
}

@InitKobweb
fun initKobweb2(ctx: InitKobwebContext) {
    ctx.router.setErrorHandler {
        Text("Custom Error: $it")
    }
}