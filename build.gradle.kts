plugins {

    //trick: for the same plugin versions in all sub-modules
    kotlin("jvm") apply false
    kotlin("multiplatform") apply false
    id("org.jetbrains.compose") apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}