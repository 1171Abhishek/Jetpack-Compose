package com.company.jetpack.topic_02

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
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
fun DiceRollerApp(modifier: Modifier = Modifier) {

    var number by remember { mutableIntStateOf(1) }
    val imageResource = when(number){
        1-> R.drawable.dice_1
        2-> R.drawable.dice_2
        3-> R.drawable.dice_3
        4-> R.drawable.dice_4
        5-> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painterResource(imageResource), contentDescription = null)
        Button(onClick = {number = (1..6).random()}) {
            Text("Roll $number")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DiceRollerAppPreview() {
    DiceRollerApp()
}