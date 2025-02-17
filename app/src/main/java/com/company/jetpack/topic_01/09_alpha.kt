package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.R

@Composable
fun AlphaClass(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painterResource(R.drawable.image),
            contentDescription = null,
            alpha = 0.5f
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun AlphaClassPreview() {
    AlphaClass()
}