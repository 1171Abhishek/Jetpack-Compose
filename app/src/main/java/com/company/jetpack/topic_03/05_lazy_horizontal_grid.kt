package com.company.jetpack.topic_03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyHorizontalGridFunction(modifier: Modifier = Modifier) {
    LazyHorizontalGrid(
//        If you need a horizontally scrolling grid, use LazyHorizontalGrid.
//        Uses rows = GridCells.Fixed(n) instead of columns.
        rows = GridCells.Fixed(3)
    ) {
        items(100) {
            Box(modifier.size(100.dp).padding(4.dp).background(Color.Black)){
                Text(
                    text = "Item $it", color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }

        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun LazyHorizontalGridFunctionPreview() {
    LazyHorizontalGridFunction()
}