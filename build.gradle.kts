plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
    id("kotlinx-kover") version "0.2.0"
}

group = "com.jetbrains"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()

    extensions.configure(kotlinx.kover.KoverTaskExtension::class) {
        useJacoco = false
    }
}


