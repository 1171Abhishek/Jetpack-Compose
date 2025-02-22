package com.company.jetpack.topic_01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PractiseFour(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(
            modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Column(
                modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Text composable" , fontWeight = FontWeight.Bold)
                Text(
                    "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
            Column(
                modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Image composable" , fontWeight = FontWeight.Bold)
                Text(
                    "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
        Row(
            modifier
                .weight(1f)
                .fillMaxWidth()
        ) {
            Column(
                modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Row composable" , fontWeight = FontWeight.Bold)
                Text(
                    "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
            Column(
                modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Column composable", fontWeight = FontWeight.Bold)
                Text(
                    "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }

    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewPractiseFour(modifier: Modifier = Modifier) {
    PractiseFour()
}