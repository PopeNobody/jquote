plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    implementation("org.jsoup:jsoup:1.15.3")
    implementation("net.sf.cssbox:cssbox:1.0.0")
    implementation("net.sf.cssbox:swingbox:1.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
