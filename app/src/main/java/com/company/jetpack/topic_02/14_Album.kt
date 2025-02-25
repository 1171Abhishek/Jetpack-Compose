package com.company.jetpack.topic_02

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.jetpack.R

@Composable
fun AlbumFunction(modifier: Modifier = Modifier) {
    var imageChange by remember { mutableIntStateOf(1) }

    val imageResource = when (imageChange) {
        1 -> R.drawable.b1
        2 -> R.drawable.b2
        3 -> R.drawable.b3
        else -> R.drawable.b4
    }

    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier
                .size(300.dp, 420.dp)
                .shadow(2.dp)
        ) {
            Image(
                painterResource(imageResource),
                contentDescription = "Image of Bridge 1",
                modifier
                    .size(280.dp, 370.dp)
                    .align(Alignment.Center)
            )

            Row(
                modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomEnd),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Button(onClick = {
                    if (imageChange < 4) imageChange++ else imageChange = 1
                }) { Text("Previous") }
                Button(onClick = {
                    if (imageChange < 4) imageChange++ else imageChange = 1
                }) { Text("Next") }
            }


        }

    }
}

@Preview(showSystemUi = true)
@Composable
fun AlbumFunctionPreview() {
    AlbumFunction()
}