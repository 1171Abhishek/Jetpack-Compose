package com.company.jetpack.topic_01

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.R

@Composable
fun DotAlignFunction(modifier: Modifier = Modifier) {
//    align: Controls the alignment of a composable within its parent container.
    Row   (
        modifier
            .fillMaxSize()
            .background(Color.Black) , horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.random),
            contentDescription = null ,
            modifier.align(Alignment.CenterVertically)
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun DotAlignFunctionPreview() {
    DotAlignFunction()
}