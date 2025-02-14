package com.company.jetpack.topic_01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
 textAlign ->set the horizontal alignment of the text within a Text composable surface area.
 */
/*
Prefer usage - start and end not left  and right
 */
@Composable
fun TextAlignFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Hello", fontSize = 30.sp, modifier = Modifier
                .background(Color.Green)
                .width(300.dp), textAlign = TextAlign.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextAlignFunctionPreview() {
    TextAlignFunction()
}