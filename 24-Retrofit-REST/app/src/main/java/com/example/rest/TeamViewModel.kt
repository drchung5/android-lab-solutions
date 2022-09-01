package com.example.rest

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class TeamViewModel : ViewModel() {
    private val _teamList = mutableStateListOf<Team>()
    val teamList: List<Team> get() = _teamList


    fun getTeams() {
        viewModelScope.launch {
            val teamService = TeamService.getInstance()
            try {
                _teamList.clear()
                _teamList.addAll(teamService.getTeams())
            } catch (e: Exception) {
            }
        }
    }

    fun addTeam(team: Team) {
        viewModelScope.launch {
            val teamService = TeamService.getInstance()
            try {
                teamService.addTeam(team)
                _teamList.clear()
                _teamList.addAll(teamService.getTeams())
            } catch (e: Exception) {
            }
        }
    }
}