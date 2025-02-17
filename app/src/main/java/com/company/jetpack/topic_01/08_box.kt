package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.company.jetpack.R

/** Box
 *  Box = Stacking UI elements on top of each other, and placing them at any position.
 */
@Composable
fun BoxFunction(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier
                .size(300.dp)
                .background(Color.Black, RoundedCornerShape(20))
                .padding(32.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.random),
                contentDescription = null,
                modifier.align(Alignment.TopCenter)
            )
            Image(
                painter = painterResource(R.drawable.random),
                contentDescription = null,
                modifier.align(Alignment.Center)
            )
            Image(
                painter = painterResource(R.drawable.random),
                contentDescription = null,
                modifier.align(Alignment.BottomCenter)
            )
            Image(
                painter = painterResource(R.drawable.random),
                contentDescription = null,
                modifier.align(Alignment.CenterStart)
            )
            Image(
                painter = painterResource(R.drawable.random),
                contentDescription = null,
                modifier.align(Alignment.CenterEnd)
            )


        }
    }


}

@Preview(showSystemUi = true)
@Composable
fun BoxFunctionPreview() {
    BoxFunction()
}