package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    boxes()
                }
            }
        }
    }
}

@Composable
fun box(
    title : String ,
    discription : String,
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
            )
        Text(
            text = discription,
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun boxes(){
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row (
            Modifier.weight(1f)
        ){
            box(
                title = "Text composable",
                discription = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xFFEADDFF))
                    .padding(16.dp)
                    .weight(1f)
            )
            box(
                title = "Image composable",
                discription = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xFFD0BCFF))
                    .padding(16.dp)
                    .weight(1f)
            )
        }
        Row (
            Modifier.weight(1f)
        ){
            box(
                title = "Row composable",
                discription = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xFFB69DF8))
                    .padding(16.dp)
                    .weight(1f)
            )
            box(
                title = "Column composable",
                discription = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color(0xFFF6EDFF))
                    .padding(16.dp)
                    .weight(1f)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        boxes()
    }
}
