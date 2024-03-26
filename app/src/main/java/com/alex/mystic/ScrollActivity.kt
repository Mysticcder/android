package com.alex.mystic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alex.mystic.ui.theme.MysticTheme

class ScrollActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lazy()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Lazy() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item { 
            Column {
                Text(text = "text 1")
                
                Spacer(modifier = Modifier.height(1000.dp))
                
                Text(text = "text 2")
            }
        }
        
    }
    
}

