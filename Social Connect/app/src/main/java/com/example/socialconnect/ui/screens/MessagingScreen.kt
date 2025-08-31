package com.example.socialconnect.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MessagingScreen() {
    var message by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        BasicTextField(
            value = message,
            onValueChange = { message = it },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
        Button(onClick = { /* Save to Firestore */ }, modifier = Modifier.padding(top = 8.dp)) {
            Text("Send")
        }
    }
}
