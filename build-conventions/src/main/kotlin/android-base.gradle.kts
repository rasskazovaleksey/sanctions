import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    namespace = "com.github.rasskazovalexey.sanction" + project.path.replace(":", ".")
    compileSdkVersion(33)

    defaultConfig {
        minSdk = 26
        targetSdk = 33
    }
}
