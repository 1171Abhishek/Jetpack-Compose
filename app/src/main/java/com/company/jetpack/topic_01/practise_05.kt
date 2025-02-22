package com.company.jetpack.topic_01

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.company.jetpack.R

@Composable
fun PractiseFive(modifier: Modifier = Modifier) {
    Box(modifier
        .fillMaxHeight()
        .background(color = Color(0xFFDAE5DB)) ) {

        Column(modifier.align(Alignment.Center).fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painterResource(R.drawable.android_logo),
                contentDescription = null, modifier.size(120.dp)
            )
            Text("Jennifer Doe", fontSize = 50.sp)
            Text(
                "Android developer extraordinaire",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3A6B52)
            )
        }

        Column(modifier.align(Alignment.BottomCenter)) {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Call, contentDescription = null,
                    tint = Color(0xFF296047)
                )
                Text("+91 1236547890", color = Color(0xFF296047))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                Icon(
                    Icons.Default.Share, contentDescription = null,
                    tint = Color(0xFF296047)
                )
                Text("@AndroidDev", color = Color(0xFF296047))
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.Default.Email, contentDescription = null,
                    tint = Color(0xFF296047)
                )
                Text("random@android.com", color = Color(0xFF296047))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewPractiseFive(modifier: Modifier = Modifier) {
    PractiseFive()
}