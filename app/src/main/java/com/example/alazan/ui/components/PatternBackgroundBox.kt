package com.example.alazan.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import com.example.alazan.R

@Composable
fun PatternBackgroundBox(kind: Int = 0,modifier: Modifier = Modifier,content: @Composable (modifier: Modifier) -> Unit) {
    // Load the pattern image as an ImageBitmap
    val patternImage: ImageBitmap = ImageBitmap.imageResource(R.drawable.main_background)

    val backgroundColor = if (kind == 0){
        Color(0xFF00585A)
    }else{
        MaterialTheme.colorScheme.inversePrimary
    }


    val patternColor = if (kind == 0){
        Color.Gray
    }else{
        Color(0x51FFFFFF)
    }


    // Draw the repeating background pattern
    Box(
        modifier = modifier.background(backgroundColor)
    ) {

        Canvas(modifier = modifier.fillMaxSize()) {
            // Get the image size
            val imageWidth = patternImage.width
            val imageHeight = patternImage.height

            // Calculate the number of repetitions needed to fill the entire background
            val horizontalCount = (size.width / imageWidth  ).toInt() + 1
            val verticalCount = (size.height/ imageHeight).toInt() + 1

            // Draw the image repeatedly in a grid pattern
            for (i in 0 until horizontalCount) {
                for (j in 0 until verticalCount) {
                    drawImage(
                        image = patternImage,
                        topLeft = Offset(x = i * imageWidth.toFloat(), y = j * imageHeight.toFloat()),
                        colorFilter = ColorFilter.tint(patternColor),
                        alpha = 0.1f
                    )
                }
            }

        }
        content(modifier.fillMaxSize())


    }

}




