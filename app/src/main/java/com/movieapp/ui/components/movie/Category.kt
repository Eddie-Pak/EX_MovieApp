package com.movieapp.ui.components.movie

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.movieapp.ui.theme.Paddings

@Composable
fun CategoryRow() {
    Column() {
        LazyRow(
            contentPadding = PaddingValues(horizontal = Paddings.large),
        ) {  }
    }
}

@Composable
fun CategoryTitle() {
    Text(
        text = "Action",
        modifier = Modifier
            .padding(
                vertical = Paddings.large,
                horizontal = Paddings.extra
            ),
        style = MaterialTheme.typography.titleMedium
    )
}