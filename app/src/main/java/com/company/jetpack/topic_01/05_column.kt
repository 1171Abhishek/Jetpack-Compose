package com.company.jetpack.topic_01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ComposableFunction(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize() , verticalArrangement = Arrangement.Center ,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("1")
        Text("2")
        Text("3")
        Text("4")
    }
}

@Preview(showBackground = true)
@Composable
fun ComposableFunctionPreview() {
    ComposableFunction()
}