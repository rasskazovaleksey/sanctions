import java.util.*

plugins {
    `kotlin-dsl`
    alias(libs.plugins.ben.manes.versions)
    alias(libs.plugins.version.catalog.update)
}

dependencies {
    implementation(libs.android.gradle.plugin)
    implementation(libs.detekt.gradle.plugin)
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.kotlin.serialization)
    implementation(libs.ktlint.gradle.plugin)
    implementation(libs.mobile.multiplatform.plugin)
    implementation(
        group = libs.plugins.ben.manes.versions.get().pluginId,
        name = libs.plugins.ben.manes.versions.get().pluginId + ".gradle.plugin",
        version = libs.plugins.ben.manes.versions.get().version.toString(),
    )
    implementation(
        group = libs.plugins.version.catalog.update.get().pluginId,
        name = libs.plugins.version.catalog.update.get().pluginId + ".gradle.plugin",
        version = libs.plugins.version.catalog.update.get().version.toString(),
    )
}
