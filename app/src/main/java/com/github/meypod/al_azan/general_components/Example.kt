package com.github.meypod.al_azan.general_components

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch


@Preview
@Composable
fun SwipeUpAnimation() {
    val swipeOffset = remember { Animatable(300f) } // Initial offset
    val scope = rememberCoroutineScope()

    val cornerRadius = remember { Animatable(18f) }
    val size = remember { Animatable(200f) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .width(size.value.dp)
                .height(200.dp)
                .offset(y = swipeOffset.value.dp)
                .background(Color.Blue, RoundedCornerShape(cornerRadius.value))
                .pointerInput(Unit) {
                    detectDragGesturesAfterLongPress(
                        onDragEnd = {
                            // Animate to the final position
                            scope.launch {
                                val targetOffset = if (swipeOffset.value > 150f) 300f else 0f
                                swipeOffset.animateTo(
                                    targetValue = targetOffset,
                                    animationSpec = tween(durationMillis = 300)
                                )
                            }

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
                                    targetValue = 200f, // Final size when swiped up
                                    animationSpec = tween(durationMillis = 300)
                                )
                            }
                        }
                    )
//                    detectVerticalDragGestures(
//                        onDragEnd = {
//                            // Animate to the final position
//                            scope.launch {
//                                val targetOffset = if (swipeOffset.value > 150f) 300f else 0f
//                                swipeOffset.animateTo(
//                                    targetValue = targetOffset,
//                                    animationSpec = tween(durationMillis = 300)
//                                )
//                            }
//
//                        },
//                        onVerticalDrag = { _, dragAmount ->
//                            scope.launch {
//                                swipeOffset.snapTo(swipeOffset.value + dragAmount)
//                            }
//                            scope.launch {
//                                cornerRadius.animateTo(
//                                    targetValue = size.value / 0.5f, // Half of the size for a perfect circle
//                                    animationSpec = tween(durationMillis = 1)
//                                )
//                                size.animateTo(
//                                    targetValue = 200f, // Final size when swiped up
//                                    animationSpec = tween(durationMillis = 300)
//                                )
//                            }
//                        }
//                    )
                }
        )
    }
}