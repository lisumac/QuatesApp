package com.rkd.quatesapp.screens

import android.provider.CalendarContract
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Preview
@Composable
fun QuoteListItem() {
    Card(
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .padding(12.dp)
    ) {
        Row(Modifier.padding(12.dp)) {

            Image(
                imageVector = Icons.Default.FormatQuote,
                contentDescription = "Quotes",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .size(40.dp)
                    .background(Color.Black)
                    .rotate(180F)
            )
            Spacer(Modifier.width(8.dp))

            Column(Modifier.padding(8.dp)) {

                Text(
                    text = "Good luck is another name for tenacity of purpose.",
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
                    text = "Ralph Emerson",
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
//                    contentDescription = "Quotes",
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
@Preview(showBackground = true)
@Composable
fun DetailsOfQuotes() {

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    listOf(Color.White, Color.Cyan)
                )
            )
    ) {

        Card(
            elevation = CardDefaults.cardElevation(6.dp),
            modifier = Modifier
                .padding(32.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
            ) {

                Icon(
                    imageVector = Icons.Default.FormatQuote,
                    contentDescription = "Quote Icon",
                    tint = Color.White,
                    modifier = Modifier
                        .size(48.dp)
                        .background(Color.Black, shape = CircleShape)
                        .padding(8.dp)
                        .rotate(180f)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Good luck is another name for tenacity of purpose.",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Blue
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "— Ralph Emerson",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

