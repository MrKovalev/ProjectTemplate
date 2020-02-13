buildscript {

    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Classpath.gradle)
        classpath(Classpath.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete(rootProject.buildDir)
}
