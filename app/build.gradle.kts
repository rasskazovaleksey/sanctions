plugins {
    id("multiplatform-application-convention")
    alias(libs.plugins.jetbrains.compose)
}

compose {
    kotlinCompilerPlugin.set(libs.compose.compiler.get().toString())
}

dependencies {
    @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
    commonMainImplementation(compose.material3)
    commonMainImplementation(compose.foundation)
    commonMainImplementation(compose.runtime)

    desktopMainImplementation(compose.desktop.currentOs)
    jsMainImplementation(compose.web.core)
    androidMainImplementation(libs.androidx.activity.compose)

    commonMainImplementation(project(":presentation:screen"))
    commonMainImplementation(project(":presentation:widget"))
    commonMainImplementation(project(":presentation:theme"))
}

compose.desktop {
    application {
        mainClass = "com.github.rasskazovalexey.sanction.MainKt"
    }
}

compose.experimental {
    uikit.application {
        bundleIdPrefix = "com.github.rasskazovalexey.sanction"
        projectName = "challenge"
        deployConfigurations {
            simulator(id = "IPhone13Pro") {
                device = org.jetbrains.compose.experimental.dsl.IOSDevices.IPHONE_13_PRO
            }
        }
    }
    web.application {}
}
