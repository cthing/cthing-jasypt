@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    `java-library`
    alias(libs.plugins.javaProject)
    alias(libs.plugins.yalocc)
    alias(libs.plugins.projectSite)
    alias(libs.plugins.dependencyAnalysis)
}

projectInfo {
    description.set("Provides custom configured Jasypt encryptors.")
    projectUrl.set("https://github.com/baron1405/cthing-jasypt/")
    reportsUrl.set("https://dist-3.lan/repository/sites/cthing-jasypt-site/")
}

dependencies {
    api(libs.jasypt)

    testImplementation(libs.junitApi)
    testImplementation(libs.junitParams)
    testImplementation(libs.assertJ)

    testRuntimeOnly(libs.junitEngine)
}
