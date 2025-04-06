plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven { setUrl("https://m2.dv8tion.net/releases") }

    maven {
        setUrl("https://maven.lavalink.dev/releases")
    }

    maven { setUrl("https://jitpack.io") }

}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation(platform("org.junit:junit-bom:5.11.4"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    // 새로 추가/업데이트 한 라이브러리
    implementation("net.dv8tion:JDA:5.2.2")
    implementation ("com.sedmelluq:lavaplayer:1.3.77")
    implementation("dev.arbjerg:lavaplayer:2.2.2")
    implementation("dev.lavalink.youtube:common:1.11.2")

    // 로그 기록
    implementation("org.slf4j:slf4j-api:2.0.9")
    implementation("ch.qos.logback:logback-classic:1.5.6")
}

tasks.test {
    useJUnitPlatform()
}