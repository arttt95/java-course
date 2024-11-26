package com.arttt95.aulaaprendajavadozero

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
import com.arttt95.aulaaprendajavadozero.ui.theme.AulaAprendaJavaDoZeroTheme
import com.arttt95.aulaaprendajavadozero.FuncionarioBanco

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*val funcionario1 = FuncionarioBanco()

        funcionario1.salario = 1000.00

        val totalComDesconto = funcionario1.calcularSalarioComDesconto()

        println("Total com desconto: " + totalComDesconto)*/


        enableEdgeToEdge()
        setContent {
            AulaAprendaJavaDoZeroTheme {
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

    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AulaAprendaJavaDoZeroTheme {
        Greeting("Android")
    }
}