buildscript {
    dependencies {
        classpath(":build-conventions")
    }
}

plugins {
    id("configuration-detekt")
    id("configuration-version-catalog-update")
}

subprojects {
    apply(plugin = "configuration-ktlint")
    setupJavaTarget(this)
}

fun setupJavaTarget(project: Project) {
    project.tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}
