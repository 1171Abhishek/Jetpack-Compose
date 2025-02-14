package com.company.jetpack.topic_01

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.company.jetpack.ui.theme.JetpackComposeTheme

@Composable
fun ButtonFunction(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*
        High Emphasis: "Do this now!" (Big, bold, colorful)
        Medium Emphasis: "This is also important." (Noticeable, but not as much as the high-emphasis ones)
        Low Emphasis: "These are options, but not critical." (Subtle, doesn't demand immediate attention)
         */
//       ---------------------------------------------------------------------------------------------

        /*        Filled Button -> Primary , High Emphasis , & most important action on a screen.
                                   This is the action you want the user to take. */
        Button(onClick = {}) { Text(text = "Filled Button") }


//        Outlined Button -> Secondary , Medium Emphasis , & optional additional action.
        OutlinedButton(onClick = {}) { Text(text = "Outlined Button") }

//        Filled Tonal Button -> Primary or Significant action , High Emphasis , & less important action.
        FilledTonalButton(onClick = {}) { Text("Filled Tonal Button") }

//        Text Button ->Low Emphasis , & or actions that are more like links.
        TextButton(onClick = {}) { Text("Text Button") }

//        Elevated Button -> High high Emphasis, more than any other type of button.
        ElevatedButton(onClick = {}) { Text("Elevated Button") }

    }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonFunctionPreview() {
    JetpackComposeTheme { ButtonFunction() }
}