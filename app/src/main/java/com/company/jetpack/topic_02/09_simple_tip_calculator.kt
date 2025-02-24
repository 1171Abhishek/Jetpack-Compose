package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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

private fun tipCalculator(tipAmount: Double):Double {
    return ((15/100.0)*tipAmount)
}
@Composable
fun SimpleTipCalculator(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var billAmount by remember { mutableStateOf("") }

        Text("Calculate Tip")

        TextField(value = billAmount, onValueChange = { billAmount = it },
            label = { Text("Bill Amount") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        val convertedValue = billAmount.toDoubleOrNull()?:0.0

        Text("Tip Amount: $${tipCalculator(convertedValue)}")

    }
}

@Preview(showSystemUi = true)
@Composable
fun SimpleTipCalculatorPreview() {
    SimpleTipCalculator()
}