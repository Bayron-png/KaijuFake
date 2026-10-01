package com.duoc.kaijufake.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TarjetaProducto(nombre: String, precio: Int) {
    Card(   modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            Text(text = nombre, fontWeight = FontWeight.Bold)
            Text(text = precio.toString(), color = Color.Gray)
        }
    }
}

@Preview
@Composable
fun probarTarjetaProducto(){
    TarjetaProducto("Polera", 15000)
}