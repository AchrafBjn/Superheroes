package com.example.superheroes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroes.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperheroeApp()
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SuperheroesPreview() {
        SuperheroesTheme(darkTheme = false) {
            SuperheroeApp()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun SuperheroesDarkPreview() {
        SuperheroesTheme(darkTheme = true) {
            SuperheroeApp()
        }
    }
}