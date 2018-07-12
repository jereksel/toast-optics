import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java
    kotlin("jvm") version "1.2.51"
    kotlin("kapt") version "1.2.51"
}

group = "com.jereksel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val arrow_version = "0.7.2"

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile("io.arrow-kt:arrow-optics:$arrow_version")
    kapt("io.arrow-kt:arrow-annotations-processor:$arrow_version")

    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}