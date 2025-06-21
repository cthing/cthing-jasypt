import org.cthing.projectversion.BuildType
import org.cthing.projectversion.ProjectVersion

apply(from = File(gradle.gradleUserHomeDir, "cthing-repositories.gradle.kts"))

plugins {
    `java-library`
    alias(libs.plugins.javaProject)
    alias(libs.plugins.locc)
}

version = ProjectVersion("0.2.0", BuildType.snapshot)
group = "com.cthing"
description = "Provides custom configured Jasypt encryptors."

dependencies {
    api(libs.jasypt)

    testImplementation(libs.junitApi)
    testImplementation(libs.junitParams)
    testImplementation(libs.assertJ)

    testRuntimeOnly(libs.junitEngine)
    testRuntimeOnly(libs.junitLauncher)
}
