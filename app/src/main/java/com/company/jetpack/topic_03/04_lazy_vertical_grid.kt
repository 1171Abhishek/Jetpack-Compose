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

/**
 * A grid is a layout system that arranges items in rows and columns for better organization,
 * alignment, and efficient use of space. In Jetpack Compose, grids are implemented using
 * `LazyVerticalGrid` and `LazyHorizontalGrid` to display lists efficiently. 🚀
 */
/*  2 x 2 Grid
[ Item 1 ]  [ Item 2 ]
[ Item 3 ]  [ Item 4 ]

3 x 2 Grid
[ Item 1 ]  [ Item 2 ]  [ Item 3 ]
[ Item 4 ]  [ Item 5 ]  [ Item 6 ]

 */

@Composable
fun GridFunction(modifier: Modifier = Modifier) {
//    LazyVerticalGrid

    LazyVerticalGrid(
//        Use LazyVerticalGrid to create a vertically scrolling grid.
//        GridCells.Fixed(n): Defines a fixed number of columns.

        columns = GridCells.Fixed(3) // 2 Column
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
fun GridFunctionPreview() {
    GridFunction()
}