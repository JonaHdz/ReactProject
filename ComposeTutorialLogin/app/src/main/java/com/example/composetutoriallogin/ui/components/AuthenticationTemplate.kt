package com.example.composetutoriallogin.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.composetutoriallogin.R
import com.example.composetutoriallogin.ui.theme.DarkTextColor
import com.example.composetutoriallogin.ui.theme.PrimaryPink
import com.example.composetutoriallogin.ui.theme.PrimaryPinkBlended
import com.example.composetutoriallogin.ui.theme.PrimaryPinkDark
import com.example.composetutoriallogin.ui.theme.PrimaryPinkLight
import com.example.composetutoriallogin.ui.theme.PrimaryYellowDark
import kotlinx.coroutines.launch

@Composable
fun AuthenticationScreenTEmpleate(
    modifier:Modifier = Modifier,
    backgroundGradiant : Array<Pair<Float,Color>>,
    @DrawableRes imgRes : Int,
    title : String,
    subtitles : String,
    mainActionButtonTitle : String,
    secondaryACtionButtonTitle : String,
    mainACtionButtonColors : ButtonColors,
    secondaryActionButtonColors : ButtonColors,
    actionButtonShadow : Color,
    onMainACtionButtonCLicked: () -> Unit,
    onSecondaryACtionButtonClicked: () -> Unit
){

    //ajusta la gui para cuando se usa el teclado, la gui se delice un poco hacia arriba permitiendos eguir viendo el input
    val scrollState = rememberScrollState()
    val coroutineScope = rememberCoroutineScope()
    val keyboardHeigght = WindowInsets.ime.getBottom(LocalDensity.current)
    LaunchedEffect(keyboardHeigght){
        coroutineScope.launch {
            scrollState.scrollBy(keyboardHeigght.toFloat())
        }
    }
    ////
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(*backgroundGradiant)
            )
            .verticalScroll(scrollState)
            .systemBarsPadding()
            .imePadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(imgRes),
            contentDescription = null,
            modifier = modifier
                .size(300.dp)
                .padding(start = 30.dp)
        )
        Message(title = title, subtitles = subtitles)
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.ic_person,
            placeHolder = "Usuario",
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        InputField(
            leadingIconRes = R.drawable.ic_key,
            placeHolder = "Contraseña",
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Spacer(
            modifier = Modifier.height(10.dp)
        )
        ActionButton(
            isNavigarionVisible = true,
            text = mainActionButtonTitle,
            onclickled = onMainACtionButtonCLicked,
            colors = mainACtionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier.padding(horizontal = 24.dp)
        )
        Separator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .height(62.dp)
        )
        ActionButton(
            isNavigarionVisible = false,
            text = secondaryACtionButtonTitle,
            onclickled = onSecondaryACtionButtonClicked,
            colors = secondaryActionButtonColors,
            shadowColor = actionButtonShadow,
            modifier = Modifier.padding(horizontal = 24.dp).padding(bottom = 24.dp)
        )

    }

}

@Composable
private fun Message(
    modifier: Modifier = Modifier,
    title : String,
    subtitles : String
){
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = title,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subtitles,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
            color = Color.White,
            fontWeight = FontWeight.Black
        )

    }
}
@Composable
private fun InputField(
    modifier: Modifier = Modifier,
    visualTransformation : VisualTransformation = VisualTransformation.None,
    @DrawableRes leadingIconRes : Int,
    placeHolder : String
){
    var inputValue by remember { mutableStateOf("") }
    TextField(
        modifier = modifier
            .fillMaxWidth()
            .height(62.dp),
        value = inputValue,
        onValueChange = {inputValue = it} ,
        visualTransformation = visualTransformation,
        singleLine = true,
        shape = RoundedCornerShape(percent = 50),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedTextColor = DarkTextColor,
            unfocusedTextColor = DarkTextColor,
            unfocusedPlaceholderColor = DarkTextColor,
            focusedPlaceholderColor = DarkTextColor,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White
        ),
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            fontWeight = FontWeight.Medium
        ),
        leadingIcon = {
            Icon(
                painter = painterResource(leadingIconRes),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        placeholder = {
            Text(text = placeHolder)
        }

    )
}

@Composable
private fun Separator (
    modifier: Modifier = Modifier
){
    Row (
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
        Text(
            text = "Or",
            style = MaterialTheme.typography.labelMedium,
            color = Color.White
        )
        DashedLine(
            modifier = Modifier.weight(weight = 1f)
        )
    }
}

@Composable
private fun DashedLine(
    modifier: Modifier = Modifier
){
    Canvas(modifier = modifier){
        drawLine(
            color = Color.White,
            start = Offset(0f,0f),
            end = Offset(size.width,0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(8f,8f),0f),
            cap = StrokeCap.Round,
            strokeWidth = 1.dp.toPx()
        )
    }
}