package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.jetpack.R

@Composable
fun Practise_Two(modifier: Modifier = Modifier) {
    Column {
        Image(painterResource(R.drawable.bg_compose_background), contentDescription = null)
        Text(stringResource(R.string.t1), modifier.padding(16.dp), fontSize = 24.sp)
        Text(
            stringResource(R.string.t2),
            modifier.padding(start = 16.dp , end = 16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
        Text(
            stringResource(R.string.t3),
            modifier.padding(start = 16.dp , end = 16.dp),
            fontSize = 16.sp,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun Practise_TwoPreview() {
    Practise_Two()
}