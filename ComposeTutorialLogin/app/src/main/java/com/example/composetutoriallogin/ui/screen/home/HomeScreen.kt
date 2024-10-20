package com.example.composetutoriallogin.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.composetutoriallogin.ui.components.ActionButton
import com.example.composetutoriallogin.ui.theme.PrimaryGreen
import com.example.composetutoriallogin.ui.theme.PrimaryGreenDark
import com.example.composetutoriallogin.ui.theme.PrimaryPinkDark
import com.example.composetutoriallogin.ui.theme.PrimaryViolet
import nl.dionsegijn.konfetti.compose.KonfettiView

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onRestartFlow : () -> Unit
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryViolet,
                    1f to PrimaryGreen
                )
            )
            .systemBarsPadding(),
        horizontalAlignment =  Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(weight = 1f))
        Greeting()
        Spacer(modifier = Modifier.weight(weight = 1f))
        ActionButton(
            isNavigarionVisible = true,
            text = "pushale plei",
            onclickled = onRestartFlow,
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryGreenDark,
                contentColor =  Color.White
            ),
            shadowColor = PrimaryPinkDark
        )
//        KonfettiView(
//            modifier = Modifier.fillMaxSize(),
//            parties =
//        )
    }
}

@Composable
private fun Greeting(
    modifier: Modifier = Modifier,
){
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Text(text = "Felicidades",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(text = "botate  \uD83E\uDD73",
            style = MaterialTheme.typography.headlineMedium,
            color = Color.Black

        )
    }
    
}