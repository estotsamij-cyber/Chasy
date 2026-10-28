plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.minimalface"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.minimalface"
        minSdk = 34
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release { isMinifyEnabled = false }
    }
}
