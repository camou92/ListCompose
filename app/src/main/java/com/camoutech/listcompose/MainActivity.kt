package com.camoutech.listcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.camoutech.listcompose.ui.theme.ListComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListComposeTheme {

                    MyScreen()
                }
            }
        }
    }

@Composable
fun MyScreen() {
    LazyColumn{
        items(Data.listPersons){fullName->
            PersonItem(fullName = fullName)
        }
    }
    /*Column(modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(rememberScrollState())
    ) {
        Data.listPersons.forEach{
            PersonItem(fullName = it)
        }

    }*/
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListComposeTheme {
        MyScreen()
    }
}