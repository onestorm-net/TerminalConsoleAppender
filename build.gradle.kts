plugins {
    `java-library`
    id("org.cadixdev.licenser") version "0.6.1"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.apache.logging.log4j:log4j-core:2.23.1")
    api("org.jline:jline-reader:3.26.2")
    implementation("org.jetbrains:annotations:24.0.0")
}

tasks.withType<JavaCompile> {
    options.release.set(21)
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.jar {
    manifest {
        attributes("Automatic-Module-Name" to "net.minecrell.terminalconsole")
    }
}