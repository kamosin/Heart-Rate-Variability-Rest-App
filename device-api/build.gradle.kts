/*
 * This file was generated by the Gradle 'init' task.
 */

dependencies{
    implementation("org.springframework:spring-web")
    implementation("org.springframework:spring-webmvc")
    implementation(project(":heartbeat-service"))
}

plugins {
    id("pl.kamil.hrv.java-library-conventions")
}
