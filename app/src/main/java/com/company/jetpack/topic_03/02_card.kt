package com.company.jetpack.topic_03

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Card is a composable used to create elevated surfaces with rounded corners, shadows, and padding.
*/

@Composable
fun CardFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Filled Card
        Card {
            Text("Hello I'm Abhishek" , modifier.padding(12.dp))
        }

        Spacer(modifier.height(20.dp))

        // Outlined Card
        OutlinedCard {
            Text("Hello I'm Abhishek", modifier.padding(12.dp))
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun CardFunctionPreview() {
    CardFunction()
}