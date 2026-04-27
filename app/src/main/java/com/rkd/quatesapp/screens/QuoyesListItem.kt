package com.rkd.quatesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.rkd.quatesapp.model.Quotes


@Composable
fun QuoteListItem(quotes: Quotes, onClick: (quotes: Quotes)-> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.fillMaxWidth(200f)
            .padding(12.dp).clickable{onClick(quotes)}
    ) {
        Row(Modifier.padding(12.dp)) {

            Image(
                imageVector = Icons.Default.FormatQuote,
                contentDescription = "com.rkd.quatesapp.model.Quotes",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black)
                    .rotate(180F)
            )
            Spacer(Modifier.width(8.dp))

            Column(Modifier.padding(8.dp)) {

                Text(
                    text = quotes.text,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Start,
                    color = Color.Blue
                )
                Box(
                    Modifier
                        .background(Color.Gray)
                        .fillMaxWidth(0.4f)
                        .height(1.dp)
                )

                Text(
                    text = quotes.author,
                    style = MaterialTheme.typography.bodySmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(4.dp)
                )
            }

        }
    }
}

//@Preview()
//@Composable()
//fun detailsOfQuotes() {
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = Modifier
//            .fillMaxSize(1f)
//            .background(Brush.sweepGradient(listOf(Color.Magenta, Color.Gray)))
//    ) {
//        Card(
//            elevation = CardDefaults.cardElevation(4.dp),
//            modifier = Modifier
//                .padding(12.dp)
//        ) {
//            Column(
//                verticalArrangement = Arrangement.Center,
//                modifier = Modifier
//                    .align(Alignment.Center)
//                    .padding(4.dp)
//            ) {
//                Image(
//                    imageVector = Icons.Default.FormatQuote,
//                    contentDescription = "com.rkd.quatesapp.model.Quotes",
//                    colorFilter = ColorFilter.tint(Color.White),
//                    modifier = Modifier
//                        .size(40.dp)
//                        .background(Color.Black)
//                        .rotate(180F)
//                )
//                Text(
//                    text = "Good luck is another name for tenacity of purpose.",
//                    style = MaterialTheme.typography.bodyMedium,
//                    textAlign = TextAlign.Start,
//                    color = Color.Blue
//                )
//
//                Text(
//                    text = "Ralph Emerson",
//                    style = MaterialTheme.typography.bodySmall,
//                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(4.dp)
//                )
//            }
//
//        }
//    }
//}


