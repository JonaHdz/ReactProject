package com.example.composetutoriallogin

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
import com.example.composetutoriallogin.ui.screen.container.ScreenContainer
import com.example.composetutoriallogin.ui.screen.home.HomeScreen
import com.example.composetutoriallogin.ui.screen.login.LoginScreen
import com.example.composetutoriallogin.ui.screen.registration.RegistrationScreen
import com.example.composetutoriallogin.ui.screen.welcome.WelcomeScreen
import com.example.composetutoriallogin.ui.theme.ComposeTutorialLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeTutorialLoginTheme {
                ScreenContainer()
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    //WelcomeScreen()
}

