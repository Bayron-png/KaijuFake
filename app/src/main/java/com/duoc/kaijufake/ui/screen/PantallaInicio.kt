package com.duoc.kaijufake.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.duoc.kaijufake.model.Producto
import com.duoc.kaijufake.ui.components.ListaProductos
import com.duoc.kaijufake.ui.theme.Blanco
import com.duoc.kaijufake.ui.theme.ColorPrimario

val listaEjemplo = listOf(
    Producto(nombre = "Polera Fea", precio = 15000),
    Producto(nombre = "Zapatos para patos", precio = 10000),
    Producto(nombre = "Chaleco de plumas de pollo", precio = 27000))

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaInicio() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Kaiju",
                        color = Blanco,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = ColorPrimario
                )
            )
        },
        bottomBar = {
            NavigationBar(
                containerColor = ColorPrimario
            ) {
                NavigationBarItem(
                    selected = false,
                    onClick = { },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Inicio", tint = Blanco) },
                    label = { Text("Inicio", color = Blanco) }
                )
                NavigationBarItem(
                    selected = false,
                    onClick = { },
                    icon = { Icon(Icons.Default.ShoppingCart, contentDescription = "Eventos", tint = Blanco) },
                    label = { Text("Catálogo", color = Blanco) }
                )
            }
        }
    ) { padding ->
        ListaProductos(productos = listaEjemplo, modifier = Modifier.padding(padding))
    }
}