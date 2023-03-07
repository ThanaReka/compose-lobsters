/*
 * Copyright © 2022 Harsh Shandilya.
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */
@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

plugins { id("dev.msfjarvis.claw.kotlin-jvm") }

dependencies {
  api(libs.crux)
  implementation(platform(libs.okhttp.bom))
  implementation(projects.model)
  implementation(libs.javax.inject)
  implementation(libs.jsoup)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.okhttp.core)
}
