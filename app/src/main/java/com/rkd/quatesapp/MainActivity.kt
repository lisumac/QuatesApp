package com.rkd.quatesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.rkd.quatesapp.DataManager.currentPage
import com.rkd.quatesapp.model.Quotes
import com.rkd.quatesapp.screens.DetailsOfQuotes
import com.rkd.quatesapp.screens.QuoteListScreen
import com.rkd.quatesapp.ui.theme.QuatesAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        CoroutineScope(Dispatchers.IO).launch {
            delay(1000)

            DataManager.loadAssetFromFile(applicationContext)
        }

        setContent {
            App()

        }
    }
}

@Composable
fun App() {
    if (DataManager.isDataLoaded.value) {
        if (currentPage.value == Pages.LISTING) {
            QuoteListScreen(ArrayList(DataManager.data.toList()), onClick = { quotes ->
                DataManager.switchPages(quotes)
            })
        } else {
            DetailsOfQuotes(DataManager.currentQuotes.let { it } as Quotes)
        }

    } else {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Loading...",
                textAlign = TextAlign.Center
            )
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuatesAppTheme {
        Greeting("Android")
    }
}

enum class Pages {
    LISTING,
    DETAILS
}