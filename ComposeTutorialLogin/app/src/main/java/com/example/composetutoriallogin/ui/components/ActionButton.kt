package com.example.composetutoriallogin.ui.components


import androidx.compose.foundation.layout.Arrangement
import com.example.composetutoriallogin.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutoriallogin.ui.theme.ComposeTutorialLoginTheme
import com.example.composetutoriallogin.ui.theme.PrimaryPink

@Composable
fun ActionButton(
    isNavigarionVisible: Boolean,
    text: String,
    onclickled: () -> Unit,
    colors: ButtonColors,
    shadowColor : Color,
    modifier: Modifier = Modifier
) {
    Button(
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp)
            .shadow(
                elevation = 24.dp,
                shape = RoundedCornerShape(percent = 50),
                spotColor = shadowColor
            ),
        onClick = onclickled,
        colors = colors
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.Bold
            )
            if (isNavigarionVisible) {
                Icon(
                    painter = painterResource(
                        R.drawable.ic_arrow_right
                    ),
                    contentDescription = null,
                    modifier = modifier.size(24.dp)
                )
            }
        }
    }
}

@Preview
@Composable
fun Preview(){
    ComposeTutorialLoginTheme {
        ActionButton(
            isNavigarionVisible = true,
            text = "Hola",
            onclickled = {  },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                containerColor = PrimaryPink
            ),
            shadowColor = PrimaryPink

        )
    }
}
@Preview
@Composable
fun Preview2(){
    ComposeTutorialLoginTheme {
        ActionButton(
            isNavigarionVisible = false,
            text = "Hola",
            onclickled = {  },
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red,
                containerColor = PrimaryPink
            ),
            shadowColor = PrimaryPink

        )
    }
}