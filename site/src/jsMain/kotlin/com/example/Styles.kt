package com.example

import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.scale
import com.varabyte.kobweb.compose.ui.modifiers.translateX
import com.varabyte.kobweb.silk.init.InitSilk
import com.varabyte.kobweb.silk.init.InitSilkContext
import com.varabyte.kobweb.silk.style.*
import com.varabyte.kobweb.silk.style.animation.Keyframes
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.theme.replaceStyleBase
import org.jetbrains.compose.web.css.percent

val RedBackgroundStyle = CssStyle.base { Modifier.backgroundColor(Colors.Red) }

interface GreenBackgroundKind : ComponentKind

val GreenBackgroundStyle = CssStyle.base<GreenBackgroundKind> { Modifier.backgroundColor(Colors.Green) }
val BlueDarkenOnHoverStyle = CssStyle {
    base { Modifier.backgroundColor(Colors.Blue) }
    hover { Modifier.backgroundColor(Colors.DarkBlue) }
}

val LightRedVariant = RedBackgroundStyle.extendedByBase { Modifier.backgroundColor(Colors.Pink) }
val LightGreenVariant = GreenBackgroundStyle.addVariantBase { Modifier.backgroundColor(Colors.LightGreen) }

val ReplacedByBlackStyle = CssStyle.base { Modifier.backgroundColor(Colors.White) }

@InitSilk
fun initStyles(ctx: InitSilkContext) {
    ctx.theme.replaceStyleBase(ReplacedByBlackStyle) { Modifier.backgroundColor(Colors.Black) }
}

val SlideAnimation = Keyframes {
    from { Modifier.translateX(0.percent) }
    to { Modifier.translateX(100.percent) }
}

val ShrinkAnimation = Keyframes {
    from { Modifier.scale(1f) }
    to { Modifier.scale(0.5f) }
}