plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    kotlin("plugin.serialization") version "1.7.10"

    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")

    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.google.guava:guava:30.1.1-jre")

    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    implementation("com.google.guava:guava:30.1.1-jre")
    implementation("net.dv8tion:JDA:5.0.0-alpha.16")
    implementation("org.yaml:snakeyaml:1.30")
    implementation("net.mamoe.yamlkt:yamlkt:0.10.2")
    implementation("com.beust:klaxon:5.5")
}

application {
    mainClass.set("core.Bot")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
