package com.example.composexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomPreview()
        }
    }
}

@Preview(widthDp = 100, heightDp = 100, showBackground = true)
@Composable
fun CustomPreview() {
    Column {
        Text(
            text = "Hello World",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.Black)
                .size(50.dp),
            color = Color.Red
        )
        Text(
            text = "Hello World",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .background(Color.White)
                .size(50.dp)
        )
    }
}