package com

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.CacheDrawModifierNode
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alex.mystic.R
import com.ui.theme.MysticTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Picha()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Picha() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(10.dp)

    ) {

        Image(painter = painterResource(id = R.drawable.img),
            contentDescription = "img",
            modifier = Modifier
                .background(Color.Yellow)
                .clip(RoundedCornerShape(60))
                .size(200.dp),

//            colorFilter = ColorFilter.tint(Color.Yellow),
            contentScale = ContentScale.Crop


        )



    }

}


