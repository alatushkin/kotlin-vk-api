import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.tasks.bundling.Jar
import java.util.Date

group = "name.alatushkin.utils"

plugins {
    java
    id("com.jfrog.bintray") version "1.8.1"
    `maven-publish`
    kotlin("jvm")
}
kotlin {

}


repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://dl.bintray.com/alatushkin/maven")
}

dependencies {
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.7")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.7")
    testImplementation("junit:junit:4.12")



    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
    implementation("org.slf4j:slf4j-api:1.7.25")
    implementation("name.alatushkin.utils:common-http-client:0.1")
}

val sourcesJar by tasks.creating(Jar::class) {
    classifier = "sources"
    from(java.sourceSets["main"].allSource)
}

publishing {

    repositories {
        maven {
            // change to point to your repo, e.g. http://my.org/repo
            url = uri("$buildDir/repo")
        }
    }
    publications {
        create("mavenJava", MavenPublication::class.java) {
            from(components["java"])
            artifact(sourcesJar)
            artifactId = "kotlin-vk-api"

        }
    }
}

bintray {
    user = project.properties["bintrayUser"]?.toString() ?: System.getenv("BINTRAY_USER")
    key = project.properties["bintrayKey"]?.toString() ?: System.getenv("BINTRAY_KEY")
    setPublications("mavenJava")
    publish = true
    override = true

    pkg(delegateClosureOf<BintrayExtension.PackageConfig> {
        repo = "maven"
        name = "kotlin-vk-api"
        setLicenses("Apache-2.0")
        vcsUrl = "https://github.com/alatushkin/kotlin-vk-api.git"

        version(delegateClosureOf<BintrayExtension.VersionConfig> {
            name = "${project.version}-snapshot"
            desc = "Vk api build snapshot"
            released = Date().toString()
            vcsTag = "${project.version}"
        })
    })
}