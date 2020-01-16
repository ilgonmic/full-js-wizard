plugins {
    kotlin("js") version "1.3.70-eap-42"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://kotlin.bintray.com/kotlin-js-wrappers")
    maven(url = "https://dl.bintray.com/kotlin/kotlinx.html") //necessary for kotlinx-html

    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap") // this is redundant for stable versions
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains", "kotlin-react", "16.9.0-pre.89-kotlin-1.3.60")
    implementation("org.jetbrains", "kotlin-react-dom", "16.9.0-pre.89-kotlin-1.3.60")
    implementation(npm("react", "16.12.0"))
    implementation(npm("react-dom", "16.12.0"))

    testImplementation(kotlin("test-js"))
}

kotlin.target.browser { }