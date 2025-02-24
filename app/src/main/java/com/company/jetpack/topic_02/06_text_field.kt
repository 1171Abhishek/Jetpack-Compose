package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * TextField : Use TextField To take text input from the user.
 * OutlinedTextField : Use OutlineTextField to take text input from the user.
 * Important : Manage its state using remember and mutableStateOf.
 **/

@Composable
fun UserInputFunction(modifier: Modifier = Modifier) {
    var name by remember { mutableStateOf("") }
    var name2 by remember { mutableStateOf("") }
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //    TextField
        TextField(value = name, onValueChange = { name = it })

        // OutlinedTextField
        OutlinedTextField(value = name2 , onValueChange = {name2 = it})
    }
}

@Preview(showSystemUi = true)
@Composable
fun UserInputFunctionPreview() {
    UserInputFunction()
}