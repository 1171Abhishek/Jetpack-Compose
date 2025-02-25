package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/*
In Jetpack Compose, a **leading icon** appears before the text (start), while a trailing icon
appears after the text (end)
 */
@Composable
fun LeadingIconFunction(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        var name by remember { mutableStateOf("") }
        TextField(value = name, onValueChange = { name = it },
            label = { Text("Leading Icon") },
            leadingIcon = { Icon(Icons.Default.Call, contentDescription = null) },
            trailingIcon = { Icon(Icons.Outlined.MailOutline, contentDescription = null) }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun LeadingIconFunctionPreview() {
    LeadingIconFunction()
}