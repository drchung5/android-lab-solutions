package com.example.rest

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

const val BASE_URL = "http://192.168.7.194:8000/"

interface TeamService {

    @GET("teams")
    suspend fun getTeams(): List<Team>

    @POST("teams")
    suspend fun addTeam(@Body team: Team): Unit

    companion object {
        var teamService: TeamService? = null
        fun getInstance(): TeamService {
            if (teamService == null) {
                teamService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(TeamService::class.java)
            }
            return teamService!!
        }
    }
}