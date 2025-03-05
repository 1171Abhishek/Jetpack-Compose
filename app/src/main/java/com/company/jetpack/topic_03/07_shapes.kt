package com.company.jetpack.topic_03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Create Shapes.kt in ui.theme
 * and define your shapes in the Shapes object.
 */
@Composable
fun LearnShapes(modifier: Modifier = Modifier) {
    Box(
        modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box(modifier
            .size(50.dp)
            .clip(MaterialTheme.shapes.small) // access shapes from theme
            .background(Color.Green))
    }
}

@Preview(showSystemUi = true)
@Composable
fun LearnShapesPreview() {
    LearnShapes()
}