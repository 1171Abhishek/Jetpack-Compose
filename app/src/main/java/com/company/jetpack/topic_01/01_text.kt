package com.company.jetpack.topic_01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.R
import com.company.jetpack.ui.theme.JetpackComposeTheme

@Composable
fun TextFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//    Simple Text
        Text("Hello Jetpack Compose")

//    Text from resources
        Text(stringResource(R.string.first_text))
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextFunction(modifier: Modifier = Modifier) {
    JetpackComposeTheme {
        TextFunction(modifier)
    }
}