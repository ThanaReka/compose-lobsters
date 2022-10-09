@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

plugins {
  kotlin("jvm")
  id("dev.msfjarvis.claw.kotlin-library")
}

dependencies {
  api(projects.model)
  api(libs.retrofit.lib)
  api(libs.eithernet)
  implementation(libs.kotlinx.serialization.core)
  testImplementation(testFixtures(libs.eithernet))
  testImplementation(libs.kotlinx.coroutines.core)
  testImplementation(kotlin("test-junit"))
  testImplementation(libs.kotlinx.serialization.json)
  testImplementation(libs.retrofit.kotlinxSerializationConverter)
  testImplementation(libs.retrofit.mock)
}
