package com.example.alazan.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
@Preview(showBackground = true)


fun Fix(modifier: Modifier = Modifier) {

    AlAzanTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF00AC83),
                            Color(0xFF006876)
                        )
                    )
                )

        ) {
//            Image(
//                painter = painterResource(id = R.drawable.image),
//                contentDescription = "",
//                contentScale = ContentScale.None,
//                modifier = Modifier
//                    .fillMaxSize()
//            )
            Column(
                modifier
                    .padding(10.dp)
                    .wrapContentHeight()
                    .fillMaxWidth()
                    .padding(top = 40.dp)
                    .align(Alignment.TopCenter)
            ) {
                Text(
                    text = "AZAN",
                    color = Color(0xFFFFFFFF),
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp)

                )


                Text(
                    text = "Maghrib",
                    color = Color(0xFFFFFFFF),
                    fontSize = 45.sp,
                    style = MaterialTheme.typography.displayMedium,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp)

                )

                Text(
                    text = "19:30",
                    color = Color(0xFFFFFFFF),
                    fontSize = 32.sp,
                    style = MaterialTheme.typography.headlineLarge,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(10.dp)

                )

            }

            Column(
                modifier
                    .align(Alignment.BottomCenter)
                    .padding(bottom = 64.dp)
            ) {
                Text(
                    text = "Swipe Up For More Option",
                    color = Color(0xFFFFFFFF),
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
                    Row(
                    ) {

                        Icon(
                            painter = painterResource(R.drawable.clock),
                            contentDescription = "",
                            tint = Color(0xFF00585A),
                            modifier = Modifier
                                .padding(end = 12.dp)
                                .size(32.dp)
                                .align(Alignment.CenterVertically)


                        )

                        Text(
                            text = "Dismiss",
                            color = Color(0xFF00585A),
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