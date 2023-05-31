package com.github.rasskazovalexey.sanction

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.rasskazovalexey.sanction.presentation.theme.AppTheme

@Composable
fun NavigationHost() {
    AppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
        }
    }
}
