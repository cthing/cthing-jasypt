apply(from = File(gradle.gradleUserHomeDir, "cthing-repositories.gradle.kts"))

plugins {
    `java-library`
    alias(libs.plugins.javaProject)
    alias(libs.plugins.yalocc)
    alias(libs.plugins.projectSite)
    alias(libs.plugins.dependencyAnalysis)
}

projectInfo {
    description.set("Provides custom configured Jasypt encryptors.")
    projectUrl.set("https://github.com/cthing/cthing-jasypt/")
    reportsUrl.set("https://dist-4.lan/repository/sites/cthing-jasypt-site/")
}

dependencies {
    api(libs.jasypt)

    testImplementation(libs.junitApi)
    testImplementation(libs.junitParams)
    testImplementation(libs.assertJ)

    testRuntimeOnly(libs.junitEngine)
}
