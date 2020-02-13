plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(AndroidConfiguration.compileSdkVersion)

    defaultConfig {
        applicationId = AndroidConfiguration.applicationId
        minSdkVersion(AndroidConfiguration.minSdkVersion)
        targetSdkVersion(AndroidConfiguration.targetSdkVersion)

        versionCode = AndroidConfiguration.versionCode
        versionName = AndroidConfiguration.versionName
        testInstrumentationRunner = AndroidConfiguration.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(Libraries.kotlinStdlib)
    implementation(SupportLibraries.appCompat)
    implementation(SupportLibraries.ktx)

    implementation(SupportLibraries.constraint)
    implementation(SupportLibraries.cardView)
    implementation(SupportLibraries.recyclerView)

    implementation(DesignLibraries.material)

    testImplementation(TestLibraries.junit)
    androidTestImplementation(TestLibraries.junitExt)
}
