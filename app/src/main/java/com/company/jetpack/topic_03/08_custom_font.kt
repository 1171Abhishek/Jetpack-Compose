package com.company.jetpack.topic_03

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * There are 2 ways to add custom fonts in compose
 * 1.Using Google Fonts (via Dependencies) -> Easy
 * 2.Using Custom Fonts from res/font (Local Font Files)
 */
@Composable
fun LearnCustomFont(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            "Hello this is delius font",
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun LearnCustomFontPreview() {
    LearnCustomFont()
}