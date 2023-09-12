import com.varabyte.kobweb.gradle.library.util.configAsKobwebLibrary

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.library)
    alias(libs.plugins.kobwebx.markdown)
}

group = "com.example.lib"
version = "1.0-SNAPSHOT"

kotlin {
    configAsKobwebLibrary(includeServer = true, jsTargetName = "frontendLib", jvmTargetName = "backendLib")
    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
        }

        val frontendLibMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk)
                implementation(libs.silk.icons.fa)
                implementation(libs.kobwebx.markdown)
            }
        }
        val backendLibMain by getting {
            dependencies {
                implementation(libs.kobweb.api)
            }
        }
    }
}