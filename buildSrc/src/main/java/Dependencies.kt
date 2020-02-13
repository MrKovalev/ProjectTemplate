object Versions {
    const val kotlin = "1.3.50"
    const val gradle = "3.5.3"

    const val appCompat = "1.1.0"
    const val ktx = "1.2.0"
    const val constraint = "1.1.3"

    const val junit = "4.12"
    const val junitExt = "1.1.1"

    const val cardView = "1.0.0"
    const val recyclerView = "1.0.0"
    const val material = "1.2.0-alpha02"
}

object Classpath {
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libraries {
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
}

object SupportLibraries {
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
}

object DesignLibraries {
    const val material = "com.google.android.material:material:${Versions.material}"
}