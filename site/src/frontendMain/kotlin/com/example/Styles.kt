package com.example

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.translateX
import com.varabyte.kobweb.silk.components.animation.Keyframes
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.addVariantBase
import com.varabyte.kobweb.silk.components.style.base
import com.varabyte.kobweb.silk.components.style.hover
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.theme.replaceComponentStyleBase
import org.jetbrains.compose.web.css.percent

val RedBackgroundStyle by ComponentStyle.base { Modifier.backgroundColor(Colors.Red) }
val GreenBackgroundStyle = ComponentStyle.base("green-background") { Modifier.backgroundColor(Colors.Green) }
val BlueDarkenOnHoverStyle by ComponentStyle {
    base { Modifier.backgroundColor(Colors.Blue) }
    hover { Modifier.backgroundColor(Colors.DarkBlue) }
}

val LightRedVariant by RedBackgroundStyle.addVariantBase { Modifier.backgroundColor(Colors.Pink) }
val LightGreenVariant = GreenBackgroundStyle.addVariantBase("light") { Modifier.backgroundColor(Colors.LightGreen) }

val ReplacedByBlackStyle by ComponentStyle.base { Modifier.backgroundColor(Colors.White) }

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.theme.replaceComponentStyleBase(ReplacedByBlackStyle) { Modifier.backgroundColor(Colors.Black) }
}

val SlideAnimation by Keyframes {
    from { Modifier.translateX(0.percent) }
    to { Modifier.translateX(100.percent) }
}

val ShrinkAnimation = Keyframes("shrink") {
    from { Modifier.scale(1f) }
    to { Modifier.scale(0.5f) }
}