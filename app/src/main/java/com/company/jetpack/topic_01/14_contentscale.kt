package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.jetpack.R

/*
contentScale.Crop -> Image in Center and crop the image into the available space.
contentScale.FillHeight -> Fill height while maintaining aspect ratio.
contentScale.FillWidth -> Fill width while maintaining aspect ratio.
contentScale.Fit -> Fit the image into the available space while maintaining aspect ratio.
                 -> If image is larger than available space, it will be cropped.
                 -> If image is smaller than available space, it will be stretched.
contentScale.FillBounds -> Fill the available space with the image without maintaining aspect ratio.

 */
@Composable
fun ContentScaleFunction(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier
                .size(250.dp)
                .border(2.dp, color = Color.Black)
                .background(color = Color(0xFFDFBB86))
        ) {
            Image(painterResource(R.drawable.cat1) , contentDescription = null ,
                contentScale = ContentScale.FillBounds
            )
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PreviewContentScaleFunction() {
    ContentScaleFunction()
}