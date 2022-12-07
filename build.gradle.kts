plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
}

dependencies {
    runtimeOnly("org.jetbrains.kotlin:kotlin-scripting-jsr223:1.7.20")
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.6.4")
}

tasks {
    shadowJar {
        archiveBaseName.set("Kotlin-Scripting")
        archiveVersion.set("")
        archiveClassifier.set("")

        destinationDirectory.set(file("build"))
    }
}