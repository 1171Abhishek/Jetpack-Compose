package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.jetpack.R

@Composable
fun DotAlignFunction(modifier: Modifier = Modifier) {
//    align: Controls the alignment of a composable within its parent container.
//    In box every options are available.
//    In column and row we can align only in cross axis

   /* Box(modifier.fillMaxSize()) {
        Image(
            painterResource(R.drawable.image), contentDescription = null,
            modifier
                .size(100.dp)
                .align(Alignment.TopStart)
              /*.align(Alignment.TopCenter)
                .align(Alignment.TopEnd)
                .align(Alignment.CenterStart)
                .align(Alignment.Center)
                .align(Alignment.CenterEnd)
                .align(Alignment.BottomStart)
                .align(Alignment.BottomCenter)
                .align(Alignment.BottomEnd)*/
        )
    }*/
  /*  Column (modifier.fillMaxSize()) {
        Image(
            painterResource(R.drawable.image), contentDescription = null,
            modifier
                .size(100.dp)
//                .align(Alignment.End)
//                .align(Alignment.Start)
                .align(Alignment.CenterHorizontally)

        )
    }*/

       Row (modifier.fillMaxSize()) {
        Image(
            painterResource(R.drawable.image), contentDescription = null,
            modifier
                .size(100.dp)
                .align(Alignment.CenterVertically)
//                .align(Alignment.Top)
//                .align(Alignment.Bottom)



        )
    }



}


@Preview(showSystemUi = true)
@Composable
fun DotAlignFunctionPreview() {
    DotAlignFunction()
}