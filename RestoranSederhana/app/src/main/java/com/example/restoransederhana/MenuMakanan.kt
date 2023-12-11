package com.example.restoransederhana

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MenuMakanan(nama: String, harga: Int) {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {
        Text(
            text = "$nama",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight(600),
            color = Color.Blue,
            modifier = Modifier
                .padding(bottom = 2.dp)
        )
        Text(
            text = "Rp $harga",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight(500),
            color = Color.Black,
        )
    }
}