plugins {
    kotlin("js") version "1.3.70-eap-42"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap") // this is redundant for stable versions
}

dependencies {
    implementation(kotlin("stdlib-js"))
    testImplementation(kotlin("test-js"))
}

kotlin.target.browser { }