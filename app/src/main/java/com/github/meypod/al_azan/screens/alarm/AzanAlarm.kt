package com.github.meypod.al_azan.screens.alarm

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@Composable
@Preview(showBackground = true)
fun AzanAlarm(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val configuration = LocalConfiguration.current
    val screenHeightDp = configuration.screenHeightDp
    val density = LocalDensity.current.density
    val initialOffsetY = remember(screenHeightDp) { (screenHeightDp * 0.4f * density) }
    val scope = rememberCoroutineScope()
    val offsetY = remember { Animatable(initialOffsetY) }
    val isDragging = remember { mutableStateOf(false) }
    val cornerRadius = remember { Animatable(60f) }
    val size = remember { Animatable(244f) }
    var showDialog by remember { mutableStateOf(false) }
    var showButton by remember { mutableStateOf(true) }
    var showText by remember { mutableStateOf(true) }
    val colors = listOf(
        Color.White,
        Color.White.copy(alpha = 0.5f),
        Color.White.copy(alpha = 0.5f),
        Color.White.copy(alpha = 0.5f)
    )
    var currentColorIndex by remember { mutableIntStateOf(0) }
    AlAzanTheme {
        LaunchedEffect(showDialog) {
            if (showDialog) {
                showButton = false
                showText = false
            } else {
                showButton = true
                showText = true
            }
        }
        if (showDialog) {
            Dialog(
                properties = DialogProperties(
                    usePlatformDefaultWidth = false
                ),
                onDismissRequest = {
                    showDialog = false
                }
            ) {
                AlarmDialog()
            }
        }
        LaunchedEffect(key1 = Unit) {
            while (true) {
                delay(150)
                currentColorIndex = (currentColorIndex + 1) % colors.size
            }
        }
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(WindowInsets.navigationBars.asPaddingValues())
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF00AC83),
                            Color(0xFF006876)
                        )
                    )
                )
                .background(
                    brush = ShaderBrush(
                        ImageShader(
                            ImageBitmap.imageResource(R.drawable.main_background),
                            TileMode.Repeated,
                            TileMode.Repeated
                        )
                    ),
                    alpha = 0.04f
                )
        ) {
            if (isDragging.value) {
                Column(
                    modifier = modifier
                        .align(Alignment.BottomCenter)
                        .offset(y = (-160).dp)
                ) {
                    for (i in 1 until 4) {
                        val iconColor = colors[(currentColorIndex + i - 1) % colors.size]
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_up),
                            contentDescription = "",
                            tint = iconColor
                        )
                    }
                }
            }
            Column(
                modifier
                    .padding(top = dimensionResource(R.dimen.last_card_padding_intro))
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .align(Alignment.TopCenter),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "AZAN",
                    color = Color.White,
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.headlineSmall,
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Text(
                    text = "Maghrib",
                    color = Color.White,
                    fontSize = 45.sp,
                    style = MaterialTheme.typography.displayMedium,
                )
                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                Text(
                    text = "19:30",
                    color = Color.White,
                    fontSize = 32.sp,
                    style = MaterialTheme.typography.headlineLarge
                )
            }
            if (showButton) {
                Column(
                    modifier
                        .fillMaxSize()
                        .padding(bottom = dimensionResource(R.dimen.padding_extra_extra_large)),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    if (!isDragging.value) {
                        Text(
                            text = "Hold and Swipe Up For More Option",
                            color = Color.White,
                            fontSize = 14.sp,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier.offset {
                                IntOffset(
                                    x = 0,
                                    y = initialOffsetY.roundToInt()
                                )
                            }
                        )
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .size(width = size.value.dp, height = 100.dp)
                            .offset { IntOffset(x = 0, y = offsetY.value.roundToInt()) }
                            .background(
                                MaterialTheme.colorScheme.surfaceContainer,
                                RoundedCornerShape(cornerRadius.value)
                            )
                            .pointerInput(Unit) {
                                detectDragGesturesAfterLongPress(
                                    onDragCancel = {
                                        scope.launch {
                                            offsetY.animateTo(
                                                targetValue = initialOffsetY, // Reset to original position
                                                animationSpec = tween(300)
                                            )
                                        }
                                        scope.launch {
                                            cornerRadius.animateTo(
                                                targetValue = size.value * 0.5f, // Half of the size for a perfect circle
                                                animationSpec = tween(durationMillis = 1)
                                            )
                                            size.animateTo(
                                                targetValue = 244f, // Final size when swiped up
                                                animationSpec = tween(durationMillis = 300)
                                            )
                                        }
                                        isDragging.value = false
                                    },
                                    onDragEnd = {
                                        if (isDragging.value) {
                                            if (offsetY.value < initialOffsetY * 0.7) {
                                                scope.launch {
                                                    showDialog = true
                                                    offsetY.animateTo(
                                                        targetValue = initialOffsetY,
                                                        animationSpec = tween(durationMillis = 300)
                                                    )
                                                }
                                            } else {
                                                scope.launch {
                                                    showDialog = false
                                                    offsetY.animateTo(
                                                        targetValue = initialOffsetY,
                                                        animationSpec = tween(300)
                                                    )
                                                }
                                            }
                                        }
                                        isDragging.value = false
                                    },
                                    onDragStart = {
                                        isDragging.value = true
                                        showText = false
                                        scope.launch {
                                            cornerRadius.animateTo(
                                                targetValue = size.value / 0.5f, // Half of the size for a perfect circle
                                                animationSpec = tween(durationMillis = 1)
                                            )
                                            size.animateTo(
                                                targetValue = 100f, // Final size when swiped up
                                                animationSpec = tween(durationMillis = 300)
                                            )
                                        }
                                    },
                                    onDrag = { _, dragAmount ->
                                        isDragging.value = true
                                        val newOffset = offsetY.value + dragAmount.y
                                        scope.launch {
                                            offsetY.snapTo(
                                                newOffset.coerceIn(
                                                    initialOffsetY / 10,
                                                    initialOffsetY
                                                )
                                            )
                                        }
                                    }
                                )
                            })
                    {
                        Row {
                            Icon(
                                painter = painterResource(R.drawable.clock),
                                contentDescription = "",
                                tint = MaterialTheme.colorScheme.primary,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            if (showText) {
                                Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                                Text(
                                    text = "Dismiss",
                                    color = MaterialTheme.colorScheme.primary,
                                    fontSize = 28.sp,
                                    style = MaterialTheme.typography.headlineMedium,
                                    modifier = Modifier
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}