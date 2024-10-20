package com.example.composetutoriallogin.ui.screen.login

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetutoriallogin.R
import com.example.composetutoriallogin.ui.components.ActionButton
import com.example.composetutoriallogin.ui.components.AuthenticationScreenTEmpleate
import com.example.composetutoriallogin.ui.theme.DarkTextColor
import com.example.composetutoriallogin.ui.theme.PrimaryPink
import com.example.composetutoriallogin.ui.theme.PrimaryPinkBlended
import com.example.composetutoriallogin.ui.theme.PrimaryPinkDark
import com.example.composetutoriallogin.ui.theme.PrimaryPinkLight
import com.example.composetutoriallogin.ui.theme.PrimaryYellowDark

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked : () -> Unit,
    onRegistrationClicked : () -> Unit
    
){
    AuthenticationScreenTEmpleate(
        modifier = modifier,
        backgroundGradiant = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ),
        imgRes = R.drawable.img_coder_m,
        title = "Bienvenido",
        subtitles = "logueate",
        mainActionButtonTitle = "siguiente",
        secondaryACtionButtonTitle = "Crea una cuenta",
        mainACtionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryPinkDark,
        onMainACtionButtonCLicked = { /*TODO*/ },
        onSecondaryACtionButtonClicked = {})


}





@Preview
@Composable
private fun Preview(){
    //LoginScreen()
}