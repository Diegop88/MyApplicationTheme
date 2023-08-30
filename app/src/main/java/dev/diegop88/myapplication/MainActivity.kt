package dev.diegop88.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.diegop88.myapplication.ui.theme.DefaultDimens
import dev.diegop88.myapplication.ui.theme.MyApplicationTheme
import dev.diegop88.myapplication.ui.theme.TabletDimens

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Card(modifier = Modifier.padding(MyApplicationTheme.dimens.horizontalPadding)) {
            Greeting("Android")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreviewDark(tablet: Boolean = true) {
    val dimens = if (tablet) TabletDimens else DefaultDimens
    MyApplicationTheme(dimens = dimens) {
        Card(modifier = Modifier.padding(MyApplicationTheme.dimens.horizontalPadding)) {
            Greeting("Android")
        }
    }
}