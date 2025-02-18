package com.company.jetpack.topic_01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaddingFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Without Padding", fontSize = 30.sp, modifier = Modifier.background(Color.Cyan))
        Text("With Padding", fontSize = 30.sp, modifier = Modifier.background(Color.Cyan).padding(20.dp))
        Text("Padding First", fontSize = 30.sp, modifier = Modifier.padding(20.dp).background(Color.Cyan))
        Text("Padding Last", fontSize = 30.sp, modifier = Modifier.background(Color.Cyan).padding(20.dp))

        /* There is also top , bottom , start , end padding */
    }
}

@Preview(showSystemUi = true)
@Composable
fun PaddingFunctionPreview() {
    PaddingFunction()
}