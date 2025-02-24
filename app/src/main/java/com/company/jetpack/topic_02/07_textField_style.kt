package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextFieldStyle(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        var name by remember { mutableStateOf("") }
//        Styling in TextField
        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }, // Label which is shown when the text field is empty.
            maxLines = 2, // Maximum number of lines in the text field.
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number) // Which keyboard to use.
//            This can be number , text , email , ascii etc.

        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextFieldStylePreview() {
    TextFieldStyle()
}

