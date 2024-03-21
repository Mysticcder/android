package com

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alex.mystic.MainActivity
import com.ui.theme.MysticTheme

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            About()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
  Column(
      modifier = Modifier
          .background(Color.Blue)
          .fillMaxSize()
          .padding(10.dp)
  ) {
      Text(text = "About", color = Color.Red)
      val home = LocalContext.current
      Button(onClick = {

          home.startActivity(Intent(home, MainActivity::class.java))

      },
//          colors = ButtonDefaults.buttonColors(Color.Green),
//          shape = RectangleShape
//          shape = RoundedCornerShape(10.dp)
          shape = CutCornerShape(10),

          colors = ButtonDefaults.outlinedButtonColors(Color.Yellow),
          border = BorderStroke(5.dp, Color.Black),



      ) {
          Text(text = "Home", color = Color.Red)

      }


      val laps = AnnotatedString("Click Here")
      val lots = LocalContext.current
      ClickableText(text = laps, onClick = {
          lots.startActivity(Intent(lots, MainActivity::class.java))
      })
      }

  }



