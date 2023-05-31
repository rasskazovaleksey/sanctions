plugins {
    id("multiplatform-library-convention")
    // TODO: shall be implemented via version catalog
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.21"
}

dependencies {
    commonMainImplementation(libs.ktor.client.core)
    commonMainImplementation(libs.ktor.client.logging)
    commonMainImplementation(libs.ktor.serialization.kotlinx.json)
    commonMainImplementation(libs.ktor.client.content.negotiation)

    androidMainImplementation(libs.ktor.client.cio)
    desktopMainImplementation(libs.ktor.client.cio)
    iosMainImplementation(libs.ktor.client.cio)
    jsMainImplementation(libs.ktor.client.js)

    commonTestImplementation("org.jetbrains.kotlin:kotlin-test")
    commonTestImplementation(libs.ktor.client.mock)
}
