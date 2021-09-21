pluginManagement {
    repositories {
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("https://cache-redirector.jetbrains.com/maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
        mavenLocal()
        // ... other repos
        maven("https://maven.pkg.jetbrains.space/public/p/jb-coverage/maven")
    }
}
rootProject.name = "test-kover-xml"
