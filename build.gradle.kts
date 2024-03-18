plugins {
    id("java")
}

group = "com.sursindmitry"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val springBootVersion = "3.2.3"

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")
}

tasks.test {
    useJUnitPlatform()
}