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
            // TOOD: Module level tasks doesn't use kotlinOptions.jvmTarget = 11 https://stackoverflow.com/a/75158443/253468
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }
}
