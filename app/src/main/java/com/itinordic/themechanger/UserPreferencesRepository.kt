package com.itinordic.themechanger

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.*
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import com.itinordic.themechanger.data.UserPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserPreferencesRepository (
    //private val userPreferencesStore: DataStore<UserPreferences>,
    private val context: Context
    ) {
    companion object {
        private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "user_prefs")
        private val isDark = booleanPreferencesKey("isDark")
    }
    val getThemeMode: Flow<Boolean>
        get() = context.dataStore.data.map {
            it[isDark] ?: true
        }

    suspend fun setThemeMode(value: Boolean) {
        context.dataStore.edit { it[isDark] = value }
    }
}