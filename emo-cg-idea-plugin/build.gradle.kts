plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
    id("org.jetbrains.intellij") version "1.5.2"
}
// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2021.2")
    type.set("IC") // Target IDE Platform

    plugins.set(listOf("java"))
}

dependencies {
    implementation(project(":emo-cg-pmd"))
    implementation("org.javassist:javassist:3.29.1-GA")
    implementation("org.freemarker:freemarker:2.3.31")
}

tasks {

    patchPluginXml {
        sinceBuild.set("212")
        untilBuild.set("222.*")
    }
    // Set the JVM compatibility versions
    withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "11"
    }
}
