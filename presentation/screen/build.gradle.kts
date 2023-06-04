plugins {
    id("multiplatform-library-convention")
    alias(libs.plugins.jetbrains.compose)
}

compose {
    kotlinCompilerPlugin.set(libs.compose.compiler.get().toString())
}

dependencies {
    @OptIn(org.jetbrains.compose.ExperimentalComposeLibrary::class)
    commonMainImplementation(compose.material3)
    commonMainImplementation(project(":presentation:widget"))
}
