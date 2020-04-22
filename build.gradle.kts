plugins {
    kotlin("js") version "1.3.72"
    kotlin("plugin.serialization") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers")
    maven(url = "https://dl.bintray.com/kotlin/kotlinx.html") //necessary for kotlinx-html
    maven(url = "https://kotlin.bintray.com/kotlinx") //necessary for kotlinx-html
}

val kotlinJsWrappersPrefix = "pre.102-kotlin-1.3.72"

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx", "kotlinx-serialization-runtime-js", "0.20.0")
    implementation("org.jetbrains", "kotlin-react", "16.13.1-$kotlinJsWrappersPrefix")
    implementation("org.jetbrains", "kotlin-extensions", "1.0.1-$kotlinJsWrappersPrefix")
    implementation("org.jetbrains", "kotlin-react-dom", "16.13.1-$kotlinJsWrappersPrefix")
    implementation(npm("react", "16.13.0"))
    implementation(npm("react-dom", "16.13.0"))
    implementation(npm("styled-components", "5.0.0"))
    implementation(npm("inline-style-prefixer", "5.1.0"))
    implementation(npm("svg-inline-loader", "0.8.0"))

    testImplementation(kotlin("test-js"))
}

kotlin {
    target {
        browser {
        }

        useCommonJs()
    }
}