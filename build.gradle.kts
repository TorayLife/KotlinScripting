plugins {
    id("java")
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-scripting-jsr223:1.7.20")
    implementation("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation(kotlin("reflect"))
    runtimeOnly("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.6.4")
}
val myversion = 0.1
tasks {
    shadowJar {
        archiveBaseName.set("Kotlin-Scripting-$myversion")
        archiveVersion.set("")
        archiveClassifier.set("")

        destinationDirectory.set(file("build"))
    }
}