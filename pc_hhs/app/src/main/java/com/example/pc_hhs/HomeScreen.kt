package com.example.pc_hhs

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var Name by remember { mutableStateOf("hhs") }
    var Pass by remember { mutableStateOf("1234") }

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally ) {
        TextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "Enter Your UserName") },
        )
        TextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Enter Your Password") },
        )
        val context = LocalContext.current
        Button(onClick = {
            if (password == Pass && username == Name) {
                Toast.makeText(context,"خوش آمدید", Toast.LENGTH_SHORT).show()
                navController.navigate(Second.Route)
            }
            else {
                Toast.makeText(context,"نام کاربری یا کلمه عبور اشتباه می باشد !", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(text = "Login")
        }
    }
}