package com.example.exercise3task

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

/**
 * Exercise 2 (10 minutes):
 *
 * Recreate the UI and functionality of your app from the previous exercise,
 * using Kotlin + Compose.
 * */
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var text by remember { mutableStateOf("") }
            var pageChanged by remember { mutableStateOf(false) }

            if (!pageChanged) {
                Home(value = text,
                    onValueChange = {
                        text = it
                    },
                    onClick = {
                        pageChanged = true
                        Log.v("GDG", "Button clicked")
                    })
            } else {
                Page2(value = text)
            }
        }
    }


}

@Composable
fun Home(modifier: Modifier = Modifier,
         value: String,
         onValueChange: (String) -> Unit,
         onClick: () -> Unit) {

    Column(modifier = modifier) {
        TextField(modifier = modifier, value = value, onValueChange = onValueChange)
        Button(modifier = modifier, onClick = onClick) {
            Text("Submit")
        }
    }

}

@Composable
fun Page2(value: String) {
        Text(value)
}