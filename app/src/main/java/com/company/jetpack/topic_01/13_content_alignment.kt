package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.jetpack.R

// Align children element in parent box.

@Composable
fun ContentAlignmentFunction(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painterResource(R.drawable.image), contentDescription = null,
            modifier.size(100.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewFunction() {
    ContentAlignmentFunction()
}