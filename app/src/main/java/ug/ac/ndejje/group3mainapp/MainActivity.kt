package ug.ac.ndejje.group3mainapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import ug.ac.ndejje.group3mainapp.ui.theme.Group3MainAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Group3MainAppTheme {
               Student()
            }
        }
    }
}

@Composable
fun Student(){
    Column(){
        Text(
            text = "Name: Alex Musa Paulino",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            text = "Programme: Bachelors of Computer Science"
        )

        Text(
            text = "RegNo: 24/1/306/DJ/848"
        )
    }
}



@Preview(showBackground = true)
@Composable
fun StudentPreview () {
    Group3MainAppTheme {
        Student()
    }
}


