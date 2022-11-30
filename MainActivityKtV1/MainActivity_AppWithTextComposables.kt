package com.example.happynonbirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happynonbirthday.ui.theme.HappyNonBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyNonBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colors.background
                ) {
                    NonBirthdayGreetingWithText("whatever you do", "from the phone or emulator") }
            }
        }
    }
}

@Composable
fun NonBirthdayGreetingWithText(message: String, from: String) {
    Column {
        Text(
            text = message,
            fontSize = 36.sp,
        )
        Text(
            text = from,
            fontSize = 24.sp
        )
    }

}

@Preview(showBackground = false)
@Composable
fun NonBirthdayCardPreview() {
    HappyNonBirthdayTheme {
        NonBirthdayGreetingWithText("Most days are this!", "from the preview" )
    }
}

