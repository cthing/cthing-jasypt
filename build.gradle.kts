plugins {
    `java-library`
    id("com.cthing.java-project") version("0.1.0-+")
    id("com.cthing.yalocc") version("0.1.0-+")
    id("com.cthing.project-site") version("0.1.0-+")
    id("com.cthing.dependency-analysis") version("0.1.0-+")
}

projectInfo {
    description.set("Provides custom configured Jasypt encryptors.")
    projectUrl.set("https://github.com/baron1405/cthing-jasypt/")
    reportsUrl.set("https://dist-3.lan/repository/sites/cthing-jasypt-site/")
}

dependencies {
    api("org.jasypt:jasypt:1.9.3")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
    testImplementation("org.assertj:assertj-core:3.21.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}
