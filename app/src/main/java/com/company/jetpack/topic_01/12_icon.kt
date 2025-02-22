package com.company.jetpack.topic_01

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun IconFunction(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize() , contentAlignment = Alignment.Center){
        Icon(imageVector = Icons.Outlined.MailOutline , contentDescription = null)
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewFunction(modifier: Modifier = Modifier) {
    IconFunction()
}