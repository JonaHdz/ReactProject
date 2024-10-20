package com.example.composetutoriallogin.ui.screen.registration

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.composetutoriallogin.R
import com.example.composetutoriallogin.ui.components.AuthenticationScreenTEmpleate
import com.example.composetutoriallogin.ui.theme.PrimaryPink
import com.example.composetutoriallogin.ui.theme.PrimaryPinkBlended
import com.example.composetutoriallogin.ui.theme.PrimaryPinkDark
import com.example.composetutoriallogin.ui.theme.PrimaryPinkLight
import com.example.composetutoriallogin.ui.theme.PrimaryViolet
import com.example.composetutoriallogin.ui.theme.PrimaryVioletDark
import com.example.composetutoriallogin.ui.theme.PrimaryVioletLight

@Composable
fun RegistrationScreen(
    modifier : Modifier = Modifier,
    onRegistrationCLickedd : () -> Unit,
    onLoginCLicked : () -> Unit
){
    AuthenticationScreenTEmpleate(
        modifier = modifier,
        backgroundGradiant = arrayOf(
            0f to PrimaryViolet,
            1f to PrimaryVioletDark
        ),
        imgRes = R.drawable.img_coder_w,
        title = "OA",
        subtitles = "apurate verga",
        mainActionButtonTitle = "Crea tu cuenta en fa",
        secondaryACtionButtonTitle = "login",
        mainACtionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletDark,
            contentColor = Color.White
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletLight,
            contentColor = Color.White
        ),
        actionButtonShadow = PrimaryVioletDark,
        onMainACtionButtonCLicked = onLoginCLicked,
        onSecondaryACtionButtonClicked = onRegistrationCLickedd
    )
}