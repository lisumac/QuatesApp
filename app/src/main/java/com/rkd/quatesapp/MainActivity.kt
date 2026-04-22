package com.rkd.quatesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rkd.quatesapp.screens.DetailsOfQuotes
import com.rkd.quatesapp.screens.QuoteListItem
import com.rkd.quatesapp.screens.QuoteListScreen
import com.rkd.quatesapp.ui.theme.QuatesAppTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        CoroutineScope(Dispatchers.IO).launch{
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
        QuoteListScreen(ArrayList(DataManager.data.toList()), onClick = {

        })
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