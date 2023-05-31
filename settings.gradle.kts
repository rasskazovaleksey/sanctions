rootProject.name = "android-code-challenge-rasskazov"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

@Suppress("UnstableApiUsage") dependencyResolutionManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

includeBuild("build-conventions")

include(":app")

include(
    ":presentation:theme",
    ":presentation:widget",
    ":presentation:screen",
)

include(
    ":data",
)
