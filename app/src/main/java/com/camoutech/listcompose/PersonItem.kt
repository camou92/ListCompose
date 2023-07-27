package com.camoutech.listcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.random.Random

@Composable
fun PersonItem(fullName: String){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth().clickable {  }
    ){
        Box(modifier = Modifier
            .size(50.dp)
            .padding(8.dp)
            .clip(RoundedCornerShape(50))
            .background(Color(Random.nextInt()))
        ){
            Text(
                text = fullName.first().uppercase(),
                style = MaterialTheme.typography.body2,
                modifier = Modifier.align(Alignment.Center)
            )
        }
        Text(
            text = fullName,
            style = MaterialTheme.typography.body1,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PersonItemPreview(){
    PersonItem(fullName = "Mohamed Camara")
}