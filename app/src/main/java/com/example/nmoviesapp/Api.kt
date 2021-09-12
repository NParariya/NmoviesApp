package com.example.nmoviesapp


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("movie/popular/")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "22f98a74039b606c9dd1e4a47df1eb07",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

}