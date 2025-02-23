package com.company.jetpack.topic_02

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.R


@Composable
fun Lemonade(modifier: Modifier = Modifier) {

    var result by remember { mutableIntStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> R.drawable.lemon_restart
    }
     val stringResource = when (result) {
        1 -> "lemon_tree"
        2 -> "lemon_squeeze"
        3 -> "lemon_drink"
        else -> "lemon_restart"
    }

    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(imageResource), contentDescription = null,
            modifier.clickable { if (result == 4) result = 1 else result++ })
        Text(stringResource)
    }
}

@Preview(showSystemUi = true)
@Composable
fun LemonadePreview() {
    Lemonade()
}