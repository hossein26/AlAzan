package com.github.meypod.al_azan.general_components


import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

@Preview
@Composable
fun SwipeToCenterWithReturn() {
    // Animatable to control the button's Y-offset
    val offsetY = remember { Animatable(600f) } // Start at bottom
    val screenHeight = 600f // Define screen height (can use dynamic height)
    val coroutine = rememberCoroutineScope()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF48B1A5)), // Background color
        contentAlignment = Alignment.TopCenter
    ) {
        // Main content (e.g., title and time)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "AZAN", color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Maghrib",
                color = Color.White,
                style = androidx.compose.ui.text.TextStyle(fontSize = 32.sp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "19:38",
                color = Color.White,
                style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp)
            )
        }

        // Swipeable Button
        Box(
            modifier = Modifier
                .offset { IntOffset(0, offsetY.value.roundToInt()) } // Apply vertical offset
                .pointerInput(Unit) {
                    detectDragGestures(
                        onDragEnd = {
                            coroutine.launch {
                            // Animate the button back to its original position when the gesture ends
                            offsetY.animateTo(screenHeight, animationSpec = tween(500))
                            }
                        },
                        onDrag = { _, dragAmount ->
                            // Update the offset dynamically but limit it to between the bottom and center
                            val newOffset = offsetY.value + dragAmount.y
                            coroutine.launch {
                            offsetY.snapTo(newOffset.coerceIn(screenHeight / 2, screenHeight))
                            }
                        }
                    )
                }
                .align(Alignment.TopCenter)
        ) {
            Button(
                onClick = {
                    // You can add a custom action here if needed
                },
                modifier = Modifier
                    .size(width = 200.dp, height = 56.dp)
                    .background(Color.Gray)
            ) {
                Text("Dismiss", color = Color.White)
            }
        }
    }
}


@Composable
fun SwipeToCenterScreen() {
    // Animatable for smooth swipe movement
    val offsetY = remember { Animatable(600f) } // Start near the bottom
    val screenHeight = 600f // Replace this with a dynamic height if needed
    val coroutine = rememberCoroutineScope()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF48B1A5)), // Background color
        contentAlignment = Alignment.TopCenter
    ) {
        // Main content (title, time, etc.)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "AZAN", color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Maghrib", color = Color.White, style = androidx.compose.ui.text.TextStyle(fontSize = 32.sp))
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "19:38", color = Color.White, style = androidx.compose.ui.text.TextStyle(fontSize = 24.sp))
        }

        // Swipeable Button
        Box(
            modifier = Modifier
                .offset { IntOffset(0, offsetY.value.roundToInt()) } // Offset the button
                .pointerInput(Unit) {
                    detectDragGestures { _, dragAmount ->
                        // Update the offset dynamically but limit it to between the bottom and center
                        val newOffset = offsetY.value + dragAmount.y
                        coroutine.launch {
                            offsetY.snapTo(newOffset.coerceIn(screenHeight / 2, screenHeight)) // Clamp between center and bottom
                        }

                    }
                }
                .align(Alignment.TopCenter)
        ) {
            Button(
                onClick = {
                    // Snap to the center when clicked
                    coroutine.launch {
                    offsetY.animateTo(screenHeight / 2, animationSpec = tween(500))
                    }
                },
                modifier = Modifier
                    .size(width = 200.dp, height = 56.dp)
                    .background(Color.Gray)
            ) {
                Text("Dismiss", color = Color.White)
            }
        }
    }
}

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