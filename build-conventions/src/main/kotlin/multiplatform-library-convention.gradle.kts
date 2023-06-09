plugins {
    kotlin("multiplatform") apply false
    id("com.android.library") apply false
    id("android-base") apply false
}

kotlin {
    jvm("desktop")
    js(IR) {
        browser()
    }
    ios()
    android()
}
