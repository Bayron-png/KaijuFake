package com.duoc.kaijufake.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.duoc.kaijufake.model.Producto

@Composable
fun ListaProductos(productos: List<Producto>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(productos) { producto ->
            TarjetaProducto(nombre = producto.nombre, precio = producto.precio)
        }
    }
}