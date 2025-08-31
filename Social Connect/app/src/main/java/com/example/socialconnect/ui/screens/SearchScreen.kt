package com.example.socialconnect.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SearchScreen() {
    var query by remember { mutableStateOf("") }
    val results = listOf("User1", "User2") // Replace with Firestore query

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        TextField(value = query, onValueChange = { query = it }, label = { Text("Search") })
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(results) { result ->
                Text(result, style = MaterialTheme.typography.body1, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
