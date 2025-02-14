package com.company.jetpack.topic_01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun RowFunction(modifier: Modifier = Modifier) {
    Row(modifier.fillMaxSize() , verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.Center) {
        Text("1")
        Text("2")
        Text("3")
        Text("4")
    }
}

@Preview(showSystemUi = true)
@Composable
fun RowFunctionPreview() {
    RowFunction()
}