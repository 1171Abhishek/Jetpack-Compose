package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/*
A switch button is a toggle control that allows users to quickly turn a setting or
feature on or off.
 */

@Composable
fun SwitchButtonFunction(modifier: Modifier = Modifier) {
    var isChecked by remember { mutableStateOf(false) }
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Switch(checked = isChecked, onCheckedChange = { isChecked = it })
    }
}


@Preview(showSystemUi = true)
@Composable
fun SwitchButtonFunctionPreview() {
    SwitchButtonFunction()
}