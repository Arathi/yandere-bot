plugins {
    val kotlinVersion = "1.4.10"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.serialization") version kotlinVersion

    id("net.mamoe.mirai-console") version "1.1.0"
}

group = "org.example"
version = "0.1.0"

repositories {
    mavenLocal()
    maven("https://maven.aliyun.com/repository/public")
    jcenter()
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
}