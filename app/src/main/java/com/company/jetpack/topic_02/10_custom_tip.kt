package com.company.jetpack.topic_02

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private fun customTipCalculator(tipAmount: Double, tipPercentage: Double , round:Boolean): Double {
    val o = ((tipPercentage / 100.0) * tipAmount)
    val o1 = (String.format("%.0f",o)).toDouble()
    return if (round) {
        o1
    } else {
        o
    }
}

@Composable
fun CustomTipCalculator(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        var inp1 by remember { mutableStateOf("") }
        var inp2 by remember { mutableStateOf("") }
        var inp3 by remember { mutableStateOf(false) }

        Text("Calculate Tip")

        OutlinedTextField(value = inp1, onValueChange = { inp1 = it },
            label = { Text("Bill Amount") })
        OutlinedTextField(value = inp2, onValueChange = { inp2 = it },
            label = { Text("Tip Percentage") })

        val convertedValue1 = inp1.toDoubleOrNull()?:0.0
        val convertedValue2 = inp2.toDoubleOrNull()?:0.0
        Row {
            Text("Round up tip?")
            Switch(checked = inp3, onCheckedChange = { inp3 = it })
        }
        Text("Tip Amount: ${customTipCalculator(convertedValue1, convertedValue2 , inp3)}")
    }
}

@Preview(showSystemUi = true)
@Composable
fun CustomTipCalculatorPreview() {
    CustomTipCalculator()
}