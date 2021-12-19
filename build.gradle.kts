import com.cthing.gradle.plugins.core.ProjectInfoExtension

plugins {
    `java-library`
}

buildscript {
    dependencies {
        classpath("com.cthing:gradle-core-plugins:0.1.0-+")
        classpath("com.cthing:gradle-yalocc-plugin:0.1.0-+")
        classpath("com.cthing:gradle-project-site-plugin:0.1.0-+")
        classpath("com.cthing:gradle-dependency-analysis-plugin:0.1.0-+")
    }
}

apply {
    plugin("com.cthing.java-project")
    plugin("com.cthing.yalocc")
    plugin("com.cthing.project-site")
    plugin("com.cthing.dependency-analysis")
}

configure<ProjectInfoExtension> {
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
