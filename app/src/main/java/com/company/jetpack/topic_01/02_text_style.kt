package com.company.jetpack.topic_01

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.jetpack.ui.theme.JetpackComposeTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TextStyle(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
//        Font size
        Text("Hello Jetpack Compose", fontSize = 30.sp)

//        Text Color
        Text("Hello Jetpack Compose", color = Color.Green)

//        Bold Text
        Text("Hello Jetpack Compose", fontWeight = FontWeight.Bold)

//        Italic Text
        Text("Hello Jetpack Compose", fontStyle = FontStyle.Italic)

//        Line Height
        Text("Line Height", fontSize = 100.sp , lineHeight = 100.sp)

//        Marquee Effect
        Column(Modifier
            .width(400.dp)
            .background(Color.Green)) {
            Text(
                "Hello Jetpack Compose Marquee Effect",
                modifier = Modifier.basicMarquee(), fontSize = 50.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewTextStyle() {
    JetpackComposeTheme {
        TextStyle()
    }
}