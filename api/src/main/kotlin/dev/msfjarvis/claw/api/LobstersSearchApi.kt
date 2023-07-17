/*
 * Copyright © 2023 Harsh Shandilya.
 * Use of this source code is governed by an MIT-style
 * license that can be found in the LICENSE file or at
 * https://opensource.org/licenses/MIT.
 */
package dev.msfjarvis.claw.api

import com.slack.eithernet.ApiResult
import dev.msfjarvis.claw.model.LobstersPost
import retrofit2.http.GET
import retrofit2.http.Query

interface LobstersSearchApi {
  @GET("/search?q={query}&what=stories&order=newest&page={page}")
  suspend fun searchPosts(
    @Query("query") searchQuery: String,
    @Query("page") page: Int,
  ): ApiResult<List<LobstersPost>, Unit>
}
