package com.example.tarxetadepresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarxetadepresentacion.funcions.funcions.EnvoltorioTarxeta
import com.example.tarxetadepresentacion.ui.theme.TarxetaDePresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarxetaDePresentacionTheme {
                Scaffold(
                    content = { padding ->
                        Box(modifier = Modifier.padding(padding)) {
                            EnvoltorioTarxeta()
                        }
                    }
                )


            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarxetaDePresentacionTheme {
        EnvoltorioTarxeta()
    }
}