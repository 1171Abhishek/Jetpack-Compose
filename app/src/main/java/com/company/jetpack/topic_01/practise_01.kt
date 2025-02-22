package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.company.jetpack.R

@Composable
fun PractiseOne(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
        Image(
            painterResource(R.drawable.androidparty),
            contentDescription = null,
            alpha = .5f ,
            contentScale = ContentScale.Crop
        )
        Column {
            Text(
                "Happy Birthday Sam!",
                fontSize = 100.sp,
                textAlign = TextAlign.Center , lineHeight = 120.sp
            )
            Text(
                "From Emma",
                fontSize = 32.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PractiseOnePreview() {
    PractiseOne()
}