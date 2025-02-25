package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview

/*
"Ime Action in Jetpack Compose is a way to specify the action to be performed when the user presses
 the action button (e.g., "Done," "Next," "Search," "Go")
 */

@Composable
fun ImeActionFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var name by remember { mutableStateOf("") }
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            keyboardOptions = KeyboardOptions(
//                imeAction = ImeAction.Next
                imeAction = ImeAction.Search
//                imeAction = ImeAction.Send
//                imeAction = ImeAction.Go
            )
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewImeActionFunction(modifier: Modifier = Modifier) {
    ImeActionFunction()
}