package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.R

@Composable
fun ImageFunction(modifier: Modifier = Modifier) {
//    Image
    Image(painter = painterResource(R.drawable.image), contentDescription = null)
}

@Preview(showSystemUi = true)
@Composable
fun ImageFunctionPreview() {
    ImageFunction()
}