package com.company.jetpack.topic_03

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyVerticalAdaptiveGrid(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
//        If you want the number of columns to adjust based on screen width, use GridCells.Adaptive(minSize).
//        in verticalScrollGrid -> minSize set -> width of each column
//        in horizontalScrollGrid -> minSize set -> height of each row

        columns = GridCells.Adaptive(minSize = 100.dp)
    ) {
        items(100) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .padding(4.dp)
                    .background(Color.Black, RoundedCornerShape(10)),
                contentAlignment = Alignment.Center
            ) {
                var number by remember { mutableIntStateOf(1) }
                val colorVariable = when (number) {
                    1 -> Color.White
                    2 -> Color.Green
                    3 -> Color.Cyan
                    else -> Color.Magenta
                }
                Text(
                    "This is $it",
                    modifier.clickable { number = (1..4).random() },
                    color = colorVariable
                )

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyVerticalAdaptiveGridPreview() {
    LazyVerticalAdaptiveGrid()
}