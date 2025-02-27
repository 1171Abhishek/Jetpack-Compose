package com.company.jetpack.topic_03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

/**
 * LazyColumn is a composable used to display a scrollable list efficiently.
 * It loads only the visible items, making it memory-efficient.
 * item -> Single item
 * items -> Multiple items
 */

@Composable
fun LazyColumnFunction(modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxSize() , verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {
//        Single item
        item {
            Text("Hello First Single item" , fontSize = 32.sp)
        }

//        Multiple items
        items(105) {
            Text("Hello Multiple items $it", fontSize = 32.sp)
        }

//        Single item
        item {
            Text("Hello First Single item", fontSize = 32.sp)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnFunctionPreview() {
    LazyColumnFunction()
}