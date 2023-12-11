package com.example.restoransederhana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.restoransederhana.ui.theme.RestoranSederhanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .verticalScroll(
                        enabled = true,
                        state = ScrollState(0)
                    )
            ) {
                Image(
                    painterResource(id = R.drawable.sederhana),
                    contentDescription = "Logo RM Sederhana",
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(100.dp))
                        .fillMaxSize(1f)
                )
                Text(
                    text = "Restoran",
                    style = MaterialTheme.typography.headlineSmall,
                    fontWeight = FontWeight(600),
                    color = Color.Blue,
                    modifier = Modifier
                        .padding(top = 20.dp, bottom = 4.dp)
                )
                Text(
                    text = "Sederhana",
                    style = MaterialTheme.typography.headlineLarge,
                    fontWeight = FontWeight(600),
                    color = Color.Red
                )
                Text(
                    text = "Makanan Padang",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight(500),
                    color = Color.Red,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Text(
                    text = "Menu Makanan",
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight(400),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(5.dp)
                )
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    MenuMakanan("Rendang", 20000)
                    MenuMakanan("Sate Padang", 15000)
                    MenuMakanan("Dendeng", 20000)
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
    RestoranSederhanaTheme {
        Greeting("Android")
    }
}