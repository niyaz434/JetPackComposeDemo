package com.whjr.jetpackcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.whjr.jetpackcomposedemo.ui.theme.JetPackComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    val arralistOfNames = arrayListOf<String>("Dubai", "Jiddah", "Soudhi Arabia")
                    MakeListView(list = arralistOfNames)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ) {
        Row() {
            Column() {
                Text(text = "Hello $name!,Welcome to JetpackCompose")
            }
        }
    }
}

@Composable
fun MakeListView(list: ArrayList<String>) {
    for (item in list) {
        MakeTextLine(textString = item)
    }
}

@Composable
fun MakeTextLine(textString: String) {
    Row(
        Modifier.fillMaxSize(),
        Arrangement.SpaceAround,
        Alignment.Top
    ) {
        Text(text = "Hello $textString!")
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    JetPackComposeDemoTheme {
        Greeting(name = "Android")
        MakeListView(list = arrayListOf("Dubai,Soudhi,Denmark"))
    }
}