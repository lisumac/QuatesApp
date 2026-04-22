package com.rkd.quatesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.rkd.quatesapp.model.Quotes

@Composable
fun QuoteListScreen(data: ArrayList<Quotes>, onClick: () -> Unit) {
    Column() {
        Text(
           text =  "QuoteListApp",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 12.dp)
                .fillMaxWidth(1f),


        )

        QuoteList(data = data, onClick)
    }
}