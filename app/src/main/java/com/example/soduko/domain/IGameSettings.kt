package com.example.soduko.domain

import java.lang.Exception

interface IGameSettings {
    suspend fun getSettings(): SettingsStorage
    suspend fun updateSettings(settings: Settings): SettingsStorage
}

sealed class SettingsStorage{
    data class OnSuccess(val settings: Settings): SettingsStorage()
    data class OnError(val exception: Exception) : SettingsStorage()
}