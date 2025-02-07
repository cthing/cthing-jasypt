apply(from = File(gradle.gradleUserHomeDir, "cthing-settings.gradle.kts"))

rootProject.name = "cthing-jasypt"

pluginManagement {
    repositories {
        mavenLocal()
        gradlePluginPortal()
    }
}
