package com.itinordic.themechanger

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.datastore.preferences.preferencesDataStore
import com.itinordic.themechanger.ui.HomeScreen
import com.itinordic.themechanger.ui.sections.isDark
import com.itinordic.themechanger.ui.theme.ThemeChangerTheme




@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    //lateinit var themeChanger : UserPreferencesRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //themeChanger = UserPreferencesRepository(this)

        setContent {
            ThemeChangerTheme(darkTheme = isDark.value) {
                HomeScreen()
            }
        }
    }

}



//Google Docs Code
//private const val USER_PREFERENCES_NAME = "user_prefs"
//
//private val Context.dataStore by preferencesDataStore(
//    name = USER_PREFERENCES_NAME
//)
//UserPreferencesRepository(dataStore, this)
//
//val userPreferencesFlow: Flow<UserPreferences> = dataStore.data
//    .catch { exception ->
//        // dataStore.data throws an IOException when an error is encountered when reading data
//        if (exception is IOException) {
//            emit(emptyPreferences())
//        } else {
//            throw exception
//        }
//    }.map { preferences ->
//        // Get our dark theme value, defaulting to false if not set:
//        val isDark = preferences[PreferencesKeys.IS_DARK]?: false
//        UserPreferences(isDark)
//    }
//
//suspend fun updateThemeMode(isDark: Boolean) {
//    dataStore.edit { preferences ->
//        preferences[PreferencesKeys.IS_DARK] = isDark
//    }
//}