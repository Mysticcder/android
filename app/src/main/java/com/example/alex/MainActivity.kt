package com.example.alex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alex.ui.theme.AlexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Greeting()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greeting() {

   Column(
       modifier = Modifier
           .background(Color.Yellow)
//           .fillMaxWidth()
//           .fillMaxHeight()
           .fillMaxSize(),
       verticalArrangement = Arrangement.Top,
       horizontalAlignment = Alignment.CenterHorizontally

   ) {

      Row(
          horizontalArrangement = Arrangement.SpaceBetween,
          modifier = Modifier
              .background(Color.Cyan)
              .fillMaxWidth()
              .height(25.dp)



      ) {
          Text(text = "Chats")

          Spacer(modifier = Modifier.width(10.dp))

          Text(text = "Status")

          Spacer(modifier = Modifier.width(10.dp))

          Text(text = "Community")

          Spacer(modifier = Modifier.width(10.dp))

          Text(text = "Calls")

      }

        Spacer(modifier = Modifier.height(50.dp))

       Text(text = "My first android project", color = Color.Blue, fontSize = 20.sp)
       Text(text = "Happy coding", fontFamily = FontFamily.Serif, modifier = Modifier.background
           (Color.Red) )
   }

}
