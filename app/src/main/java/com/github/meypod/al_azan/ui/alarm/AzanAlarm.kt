package com.github.meypod.al_azan.ui.alarm

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.ui.theme.AlAzanTheme
import kotlinx.coroutines.launch

@Composable
@Preview(showBackground = true)
fun AzanAlarm(
    navController: NavController = rememberNavController(),
    modifier: Modifier = Modifier,
) {
    val swipeOffset = remember { Animatable(0f) }
    val scope = rememberCoroutineScope()

    val cornerRadius = remember { Animatable(60f) }
    val size = remember { Animatable(244f) }
    var showDialog by remember { mutableStateOf(false) }
    var showButton by remember { mutableStateOf(true) }
    AlAzanTheme {
        if (showDialog){
            Dialog(
                properties = DialogProperties(
                    usePlatformDefaultWidth = false
                ),
                onDismissRequest = {
                    //showDialog = false
                }
            ) {
                AlarmDialog()
            }
        }
        Box(
            modifier = modifier
                .fillMaxSize()
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
                        .align(Alignment.BottomCenter)
                        .padding(bottom = dimensionResource(R.dimen.last_card_padding_intro))
                ) {
                    Text(
                        text = "Swipe Up For More Option",
                        color = Color.White,
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(bottom = 12.dp)
                    )
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .size(width = size.value.dp, height = 100.dp)
                            .offset(y = swipeOffset.value.dp)
                            .background(
                                MaterialTheme.colorScheme.surfaceContainer,
                                RoundedCornerShape(cornerRadius.value)
                            )
                            .pointerInput(Unit) {
                                detectDragGesturesAfterLongPress(
                                    onDragEnd = {
                                        // Animate to the final position
                                        scope.launch {
                                            val targetOffset = swipeOffset.value/2.2f
                                            // if (swipeOffset.value > 150f) 300f else 0f
                                            swipeOffset.animateTo(
                                                targetValue = targetOffset,
                                                animationSpec = tween(durationMillis = 300)
                                            )
                                        }
                                        showButton = false
                                        showDialog = true

                                    },
                                    onDrag = { _, dragAmount ->
                                        scope.launch {
                                            swipeOffset.snapTo(swipeOffset.value + dragAmount.y)
                                        }
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



