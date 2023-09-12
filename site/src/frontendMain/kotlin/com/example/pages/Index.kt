package com.example.pages

import androidx.compose.runtime.Composable
import com.example.*
import com.example.common.commonTest
import com.varabyte.kobweb.compose.css.AnimationIterationCount
import com.varabyte.kobweb.compose.css.functions.url
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.core.Page
import com.varabyte.kobweb.silk.components.animation.toAnimation
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s

@Page
@Composable
fun HomePage() {
    Column(Modifier.fillMaxSize()) {
        SpanText(commonTest())
        TestBox("red", RedBackgroundStyle.toModifier())
        TestBox("green", GreenBackgroundStyle.toModifier())
        TestBox("blue darker on hover", BlueDarkenOnHoverStyle.toModifier())
        TestBox("pink", RedBackgroundStyle.toModifier(LightRedVariant))
        TestBox("light green", GreenBackgroundStyle.toModifier(LightGreenVariant))
        TestBox("black", ReplacedByBlackStyle.toModifier())

        TestBox(
            "slide animation",
            Modifier
                .backgroundColor(Colors.Black)
                .animation(
                    SlideAnimation.toAnimation(duration = 5.s, iterationCount = AnimationIterationCount.Infinite)
                )
        )
        TestBox(
            "shrink animation",
            Modifier
                .backgroundColor(Colors.Black)
                .animation(
                    ShrinkAnimation.toAnimation(duration = 5.s, iterationCount = AnimationIterationCount.Infinite)
                )
        )

        TestBox("mainimage", Modifier.backgroundImage(url("/mainimage.png")).width(200.px))
        TestBox("libimage", Modifier.backgroundImage(url("/libimage.png")).width(200.px))
    }
}

@Composable
private fun TestBox(description: String, modifier: Modifier) {
    Box(Modifier.size(100.px).then(modifier)) {
        SpanText(description, Modifier.backgroundColor(Colors.White).color(Colors.Black))
    }
}