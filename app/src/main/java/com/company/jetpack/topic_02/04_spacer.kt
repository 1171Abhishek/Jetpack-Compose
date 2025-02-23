package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//Spacer can be used to add space between two elements. vertically as well as horizontally.
@Composable
fun SpacerFunction(modifier: Modifier = Modifier) {
    Column {
        Column(
            modifier
                .weight(1f)
                .fillMaxWidth(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("This is text 1")
            Spacer(modifier.height(10.dp))
            Text("This is text 2")
        }
        Column(
            modifier
                .weight(1f)
                .fillMaxWidth(), verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("This is text 3")
            Spacer(modifier.height(10.dp))
            Text("This is text 4")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun SpacerFunctionPreview() {
    SpacerFunction()
}