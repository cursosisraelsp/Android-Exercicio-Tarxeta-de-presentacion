package com.example.tarxetadepresentacion.funcions.funcions

import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarxetadepresentacion.R


@Composable
fun Greeting(name: String,cor:Color, tamanhoTexto:TextUnit,estiloLetra:FontWeight,modifier: Modifier = Modifier) {
    Column (modifier = Modifier.fillMaxHeight(0.15F), verticalArrangement = Arrangement.Center){
        Text(
            color = cor,
            fontSize = tamanhoTexto,
            fontWeight = estiloLetra,
            text = name,
            modifier = modifier
        )
    }

}

@Composable
fun GreetingImaxe(imaxen:Painter,estilo: ContentScale,modifier: Modifier = Modifier){
    Image(modifier = modifier,
        painter = imaxen,
        contentDescription = null,
        contentScale = estilo)
}

@Composable
fun EnvoltorioTarxeta(){
    val imaxe = painterResource(R.drawable.android_logo)
    val estilo = ContentScale.Fit
    val modificadorImaxe = Modifier.width(100.dp).background(color = Color.Black)

    val modificadorColumn = Alignment.CenterHorizontally
    val alineacionFila =  Alignment.CenterVertically
    val tamanhoName = 36.sp
    val tamanhoSubName = 11.sp
    val tamanhoTextBloqueBotton = 16.sp
    val name = "Jennifer Doe";
    val weightName = FontWeight.Thin
    val subName = "Android Developer Extraordinaire"
    val weightSubName = FontWeight.Bold
    val corName =  Color.Black
    val corSubName = Color.Black
    val tamanhoIcono = Modifier.size(12.dp)

    Column (
        modifier = Modifier
            .fillMaxHeight(1f)
    ){
    Box(){
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth(1f)
                .fillMaxHeight(0.5F),
            horizontalAlignment = modificadorColumn,
            verticalArrangement = Arrangement.Center
        ){
        GreetingImaxe(imaxe,estilo,modificadorImaxe)
        Greeting(name, corName,tamanhoName,weightName)
        Greeting(subName, corSubName,tamanhoSubName,weightSubName)

        }
    }
        Box(


            ){
            Column(
                modifier = Modifier.background(color = Color.Green)
                    .fillMaxWidth(1f).fillMaxHeight(1F).padding(50.dp),
                horizontalAlignment = modificadorColumn,
                verticalArrangement = Arrangement.Bottom
            ){
                Column (
                    modifier = Modifier.fillMaxWidth(0.8f).background(color = Color.White),
                    horizontalAlignment = Alignment.Start) {

                    Row (
                        modifier = Modifier.fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = alineacionFila){
                        Icon(Icons.Rounded.Call, contentDescription = "Localized description",modifier = tamanhoIcono)
                        Text(modifier = Modifier.width(175.dp),fontSize = tamanhoTextBloqueBotton,text = "+11 (523) 456 678 908")
                    }
                    Row(modifier = Modifier.fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = alineacionFila){
                        Icon(Icons.Rounded.Share, contentDescription = "Localized description",modifier = tamanhoIcono)
                        Text(modifier = Modifier.width(175.dp),fontSize = tamanhoTextBloqueBotton,text = "@Pepito")
                    }

                    Row(modifier = Modifier.fillMaxWidth(1f),
                        horizontalArrangement = Arrangement.SpaceAround,
                        verticalAlignment = alineacionFila){
                        Icon(Icons.Rounded.Email, contentDescription = "Localized description", modifier = tamanhoIcono)
                        Text(modifier = Modifier.width(175.dp),fontSize = tamanhoTextBloqueBotton,text = "pepito@gmail.com")


                    }

                }


            }
        }

    }
}