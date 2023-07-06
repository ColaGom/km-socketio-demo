plugins {
    kotlin("multiplatform") version "1.8.20"
}

group = "kr.alphaca"
version = "1.0-SNAPSHOT"

kotlin {
    jvm()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlin:kotlin-stdlib-common")
            }
        }
        val jvmMain by getting {
            dependsOn(commonMain)

            dependencies {
                implementation("io.socket:socket.io-client:2.1.0")
            }
        }
    }
}
