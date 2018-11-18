plugins {
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
    testImplementation("junit:junit:4.12")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.7")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")
    implementation("com.fasterxml.jackson.core:jackson-core:2.9.7")
    implementation("com.google.guava:guava:11.0.2")


    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.0.1")
    implementation("org.slf4j:slf4j-api:1.7.25")
    testImplementation("junit:junit:4.12")

}
