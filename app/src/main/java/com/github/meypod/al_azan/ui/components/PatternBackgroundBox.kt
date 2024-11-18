package com.github.meypod.al_azan.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.imageResource
import com.github.meypod.al_azan.R

@Composable
fun IslamicPatternBackground(
    modifier: Modifier = Modifier,
    color: Color,
    content: @Composable () -> Unit,
) {
    Box(
        modifier = modifier
            .background(
                color
            )
            .fillMaxWidth()
            .background(
                brush = ShaderBrush(
                    ImageShader(
                        ImageBitmap.imageResource(R.drawable.main_background),
                        TileMode.Repeated,
                        TileMode.Repeated,
                    )
                ),
                alpha = 0.08f
            )
    ) {
        content()
    }
}




