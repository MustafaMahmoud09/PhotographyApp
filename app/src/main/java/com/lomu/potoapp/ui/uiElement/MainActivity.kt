package com.lomu.potoapp.ui.uiElement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.lomu.potoapp.ui.uiElement.screen.navigation.App
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}
/**
 * recommended google architecture
 * DATA LAYER ,DEAL WITH DATA SOURCE TO GET DATA ,AND PROVIDE DATA TO APP AS SINGLE SOURCE
 * DOMAIN LAYER (OPTIONALITY)
 * UI LAYER  :
 *
 * **/

/**
 * JETPACK COMPOSE ::DONE
 * HILT INJECTION ::DONE
 * RETROFIT ::DONE
 * ROOM DATABASE ::DONE
 * CACHING ::DONE
 * LINKED ::DONE
 ***/
