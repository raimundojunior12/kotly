package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.test2.models.Pessoa
import com.example.test2.ui.theme.Test2Theme
import com.example.test2.views.FichaPessoal
import com.example.test2.views.PessoaCard

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Test2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    PessoaCard(Pessoa("Raimundo", 38,))
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Test2Theme {
//        Greeting("Android")
//    }
//}