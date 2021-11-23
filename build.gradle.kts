import org.gradle.api.JavaVersion.VERSION_16

plugins {
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.serialization") version "1.6.0"
    id("org.jetbrains.dokka") version "1.6.0"
    id("com.github.johnrengelman.shadow") version "7.1.0"
    id("org.jetbrains.qodana") version "0.1.13"
    id("maven-publish")
}

allprojects {

    group = "de.jet"
    version = "1.0-BETA-6"

    repositories {
        mavenCentral()
    }

}

java {
    sourceCompatibility = VERSION_16
    targetCompatibility = VERSION_16
}

tasks.dokkaHtmlMultiModule.configure {
    outputDirectory.set(buildDir.resolve("../docs/"))
}

tasks.dokkaGfmMultiModule.configure {
    outputDirectory.set(buildDir.resolve("../MDdocs/"))
}