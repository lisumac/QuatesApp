package com.rkd.quatesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.rkd.quatesapp.model.Quotes

@Composable()
fun QuoteList(data: ArrayList<Quotes>, onClick: ()-> Unit){
    LazyColumn() {
        items(data) { data->
            QuoteListItem(data,onClick )
        }
    }

}