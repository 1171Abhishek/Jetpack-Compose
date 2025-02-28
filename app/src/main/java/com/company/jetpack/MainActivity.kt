package com.company.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.company.jetpack.topic_03.GridFunction
import com.company.jetpack.topic_03.LazyHorizontalGridFunction
import com.company.jetpack.topic_03.LazyVerticalAdaptiveGrid
import com.company.jetpack.topic_03.LazyVerticalAdaptiveGridPreview
import com.company.jetpack.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LazyVerticalAdaptiveGrid(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


