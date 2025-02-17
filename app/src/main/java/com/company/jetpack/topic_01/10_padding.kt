package com.company.jetpack.topic_01

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
        Box(
            modifier
                .size(300.dp)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Column {
                Text(
                    "Without Padding", color = Color.Black,
                    modifier = modifier.background(Color.White), fontSize = 30.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    "With Padding", color = Color.Black,
                    modifier = modifier
                        .background(Color.White)
                        .padding(30.dp), fontSize = 30.sp
                )
            }
        }

        Box(
            modifier
                .size(300.dp)
                .background(Color.Cyan), contentAlignment = Alignment.Center
        ) {
            Column {
                Text(
                    "Padding First", color = Color.Black,
                    modifier = modifier
                        .padding(20.dp)
                        .background(Color.White),
                    fontSize = 30.sp
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    "Padding Last", color = Color.Black,
                    modifier = modifier
                        .background(Color.White)
                        .padding(16.dp), fontSize = 30.sp
                )
            }
        }

        /* There is also top , bottom , start , end padding */


    }
}

@Preview(showSystemUi = true)
@Composable
fun PaddingFunctionPreview() {
    PaddingFunction()
}