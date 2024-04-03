apply(from = File(gradle.gradleUserHomeDir, "cthing-repositories.gradle.kts"))

plugins {
    `java-library`
    alias(libs.plugins.javaProject)
    alias(libs.plugins.locc)
    alias(libs.plugins.projectSite)
}

projectInfo {
    description = "Provides custom configured Jasypt encryptors."
    projectUrl = "https://github.com/cthing/cthing-jasypt/"
    reportsUrl = "https://dist-4.lan/repository/sites/cthing-jasypt-site/"
}

dependencies {
    api(libs.jasypt)

    testImplementation(libs.junitApi)
    testImplementation(libs.junitParams)
    testImplementation(libs.assertJ)

    testRuntimeOnly(libs.junitEngine)
    testRuntimeOnly(libs.junitLauncher)
}
