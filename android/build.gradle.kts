/*
 * Copyright © 2021-2022 Harsh Shandilya.
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */
@file:Suppress("DSL_SCOPE_VIOLATION", "UnstableApiUsage")

import dagger.hilt.android.plugin.HiltExtension

plugins {
  id("dev.msfjarvis.claw.android-application")
  id("dev.msfjarvis.claw.rename-artifacts")
  id("dev.msfjarvis.claw.kotlin-android")
  id("dev.msfjarvis.claw.versioning-plugin")
  alias(libs.plugins.hilt)
  alias(libs.plugins.napt)
}

// Hilt's aggregating task fails with NAPT
extensions.getByType<HiltExtension>().enableAggregatingTask = false

android {
  namespace = "dev.msfjarvis.claw.android"
  defaultConfig { applicationId = "dev.msfjarvis.claw.android" }
  buildFeatures { compose = true }
  composeOptions {
    useLiveLiterals = false
    kotlinCompilerExtensionVersion = libs.versions.composeCompiler.get()
  }
  buildTypes {
    create("benchmark") {
      signingConfig = signingConfigs.getByName("debug")
      matchingFallbacks += listOf("release")
      isDebuggable = false
    }
  }
  lint {
    abortOnError = false
    checkReleaseBuilds = false
    warningsAsErrors = false
    disable.add("DialogFragmentCallbacksDetector")
    baseline = file("lint-baseline.xml")
  }
}

dependencies {
  implementation(platform(libs.androidx.compose.bom))
  annotationProcessor(libs.androidx.hilt.compiler)
  annotationProcessor(libs.dagger.hilt.compiler)
  implementation(projects.api)
  implementation(projects.common)
  implementation(projects.coroutineUtils)
  implementation(projects.database)
  implementation(projects.metadataExtractor)
  implementation(projects.model)
  implementation(libs.accompanist.swiperefresh)
  implementation(libs.accompanist.sysuicontroller)
  implementation(libs.androidx.activity.compose)
  implementation(libs.androidx.compose.material3)
  implementation(libs.androidx.core.splashscreen)
  implementation(libs.androidx.hilt.work)
  implementation(libs.androidx.lifecycle.compose)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.paging.compose)
  implementation(libs.androidx.work.runtime.ktx)
  implementation(libs.coil)
  implementation(libs.copydown)
  implementation(libs.dagger.hilt.android)
  implementation(libs.kotlinx.coroutines.core)
  implementation(libs.kotlinx.serialization.json)
  implementation(libs.material.motion.core)
  implementation(libs.material.motion.navigation)
  implementation(libs.okhttp.loggingInterceptor)
  implementation(libs.retrofit.kotlinxSerializationConverter)
  implementation(libs.sqldelight.extensions.coroutines)
}
