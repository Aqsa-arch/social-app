package com.example.socialconnect.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.*

@Composable
fun FollowButton(isFollowing: Boolean, onToggle: () -> Unit) {
    Button(onClick = onToggle) {
        Text(if (isFollowing) "Unfollow" else "Follow")
    }
}
