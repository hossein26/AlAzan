package com.github.meypod.al_azan

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Composable
@Preview(showBackground = true)
fun AzanAlarm(modifier: Modifier = Modifier) {

    AlAzanTheme {
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
                    .padding(top = dimensionResource(R.dimen.last_card_padding))
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

            Column(
                modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = dimensionResource(R.dimen.last_card_padding))
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
                        .clip(RoundedCornerShape(16.dp))
                        .size(width = 244.dp, height = 100.dp)
                        .background(Color(0xFFE5E9E8))

                ) {
                    Row{
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

