package com.company.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.company.jetpack.topic_02.AlbumFunction
import com.company.jetpack.topic_02.CustomTipCalculator
import com.company.jetpack.topic_02.DiceRollerApp
import com.company.jetpack.topic_02.ImeActionFunction
import com.company.jetpack.topic_02.SimpleTipCalculator
import com.company.jetpack.topic_02.SwitchButtonFunction
import com.company.jetpack.topic_02.TextFieldStyle
import com.company.jetpack.topic_02.UserInputFunction
import com.company.jetpack.topic_03.ScrollFunction
import com.company.jetpack.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ScrollFunction(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


