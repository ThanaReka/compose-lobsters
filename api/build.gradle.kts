/*
 * Copyright © 2021-2022 Harsh Shandilya.
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */
@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

plugins {
  kotlin("jvm")
  id("dev.msfjarvis.claw.kotlin-library")
  alias(libs.plugins.anvil)
}

anvil { generateDaggerFactories.set(true) }

dependencies {
  api(projects.model)
  api(libs.retrofit)
  api(libs.eithernet)
  implementation(projects.diScopes)
  implementation(libs.dagger)
  implementation(libs.javax.inject)
  testImplementation(testFixtures(libs.eithernet))
  testImplementation(kotlin("test-junit"))
  testImplementation(libs.kotlinx.coroutines.core)
  testImplementation(libs.kotlinx.serialization.json)
  testImplementation(libs.retrofit.kotlinxSerializationConverter)
}
