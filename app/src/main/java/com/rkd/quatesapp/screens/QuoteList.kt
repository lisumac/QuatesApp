package com.rkd.quatesapp.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rkd.quatesapp.model.Quotes

@Composable()
fun QuoteList(data: ArrayList<Quotes>, onClick: ()-> Unit){
    LazyColumn(modifier = Modifier.fillMaxWidth(200f)) {
        items(data) { data->
            QuoteListItem(data,onClick )
        }
    }

}