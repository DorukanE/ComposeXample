package com.example.composexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateManagement()
        }
    }
}

@Preview()
@Composable
fun StateManagement() {
    Surface(
            color = Color.LightGray,
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.fillMaxSize()
    ) {
        Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Hello!", fontSize = 26.sp)
            Spacer(modifier = Modifier.padding(5.dp))
            Button(onClick = {
                click()
            }, shape = RoundedCornerShape(10.dp)) {
                Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(text = "Button")
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null,
                    modifier = Modifier
                            .clickable { println("image Clicked") }
                            .size(150.dp)
                            .clip(RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(10.dp))
            Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = null
            )
            Spacer(modifier = Modifier.padding(1.dp))
            Image(
                    painter = ColorPainter(Color.DarkGray),
                    contentDescription = null,
                    modifier = Modifier
                            .height(1.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
            )
        }
    }
}

@Composable
fun CustomPreview() {
    Column(
            modifier = Modifier
                    .background(Color.LightGray)
                    .fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
    ) {
        CustomText(text = "Custom text 1") {
            click()
        }
        CustomText("Hello Custom Text") { click2() }
        CustomText("Hello Custom Text") { click3() }
        CustomText("Hello Custom Text") { click4() }
    }
}

@Composable
fun CustomText(text: String, exampleFunction: () -> Unit) {
    Spacer(modifier = Modifier.size(10.dp))
    Text(
            text = text,
            textAlign = TextAlign.Center,
            modifier = Modifier
                    .background(Color.Black)
                    .padding(3.dp)
                    .clickable {
                        exampleFunction.invoke()
                    },
            color = Color.Red
    )
    Spacer(modifier = Modifier.size(10.dp))
}

fun click() {
    println("clicked")
}

fun click2() {
    println("clicked2")
}

fun click3() {
    println("clicked3")
}

fun click4() {
    println("clicked4")
}