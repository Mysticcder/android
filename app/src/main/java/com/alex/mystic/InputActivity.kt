package com.alex.mystic

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alex.mystic.ui.theme.MysticTheme

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Input() {
Column(
    modifier = Modifier
        .background(Color.Yellow)
        .fillMaxSize()
        .padding(10.dp),



    horizontalAlignment = Alignment.CenterHorizontally


){




  var name by androidx.compose.runtime.remember {
      androidx.compose.runtime.mutableStateOf(TextFieldValue(""))
  }

    TextField(value = name,
        onValueChange = { name = it},
        label = {Text(text = "Enter name")},
        textStyle = androidx.compose.ui.text.TextStyle(Color.White),
        leadingIcon = { androidx.compose.material3.Icon(imageVector = androidx.compose.material.icons.Icons.Default.Person , contentDescription = "")}

    )

    Spacer(modifier = Modifier.height(15.dp))


    var email by remember { mutableStateOf(TextFieldValue("")) }

    TextField(value = email,
        onValueChange = { email = it},
        label = {Text(text = "Enter email")},
        leadingIcon = { androidx.compose.material3.Icon(imageVector = androidx.compose.material.icons.Icons.Default.Email , contentDescription = "")}

    )

    Spacer(modifier = Modifier.height(15.dp))

    var phone by remember { mutableStateOf(TextFieldValue("")) }

    androidx.compose.material3.OutlinedTextField(
        value = phone ,
        onValueChange = {phone = it},
        label = {Text(text = "Phone")},
        keyboardOptions = androidx.compose.foundation.text.KeyboardOptions
            (keyboardType = androidx.compose.ui.text.input.KeyboardType.Companion.Number),
        leadingIcon = { androidx.compose.material3.Icon(imageVector = androidx.compose.material.icons.Icons.Default.Phone ,
            contentDescription = "")},
        textStyle = androidx.compose.ui.text.TextStyle(Color.White),
//        colors = TextFieldDefaults.outlinedTextFieldColors(
//            focusedBorderColor = androidx.compose.ui.graphics.Color.Blue,
//            focusedBorderColor = androidx.compose.ui.graphics.Color.Blue,
//            unfocusedBorderColor = androidx.compose.ui.graphics.Color.Red,
//            unfocusedBorderColor = androidx.compose.ui.graphics.Color.Red,
//            CursorColor = androidx.compose.ui.graphics.Color.White,
//            unfocusedLeadingColor = androidx.compose.ui.graphics.Color.Red,
//            FocusedLeadingColor = androidx.compose.ui.graphics.Color.Green
//        )
    )
    }
    }



















