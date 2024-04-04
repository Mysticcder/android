package com.alex.mystic

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.alex.mystic.ui.theme.MysticTheme

class ImagePIckerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Image() {
    Column {
        val result = remember {
            mutableStateOf<Uri?>(null) }

        val launcher = rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia() ) {
            result.value = it}
        Column {
            Button(onClick = {launcher.launch(PickVisualMediaRequest(mediaType =
            ActivityResultContracts.PickVisualMedia.ImageOnly))})
            {
                Text(text = "Select Image")

            }
            result.value?.let { image->
                val painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current)
                        .data(data = image)
                        .build()
                )
               androidx.compose.foundation.Image(painter = painter, contentDescription = "")

            }
            Spacer(modifier = Modifier.height(15.dp))


        }
        AsyncImage(
            model = "",
            contentDescription = null,
        )


    }
    }


