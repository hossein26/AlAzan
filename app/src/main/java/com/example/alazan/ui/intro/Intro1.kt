package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.components.PatternBackgroundBox
import com.example.alazan.ui.components.SkipSetupDialog
import com.example.alazan.ui.components.SmplDropdownMenu
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro1(navController: NavController, modifier: Modifier = Modifier) {

    var showSkipDialog by remember { mutableStateOf(false) }
    var timeLeft by remember { mutableStateOf(3) }


    if (showSkipDialog){
        SkipSetupDialog(
            onSkip = {
                //showSkipDialog = false // Perform skip action
                // Additional actions for skip
            },
            onCancel = {
                showSkipDialog = false // Dismiss dialog
            }
        )
    }



    AlAzanTheme {
        val configuration = LocalConfiguration.current
        val gradientBrush = Brush.linearGradient(
            colors = listOf(Color(0xFF00585A), Color(0xFFFFF176)), // Colors in the gradient
            start = androidx.compose.ui.geometry.Offset(0f, 0f), // Starting point
            end = androidx.compose.ui.geometry.Offset(0f, 10000f) // Ending point
        )
        PatternBackgroundBox {
            Column(
                Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
            ) {
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .background(gradientBrush)
                        .offset(y = 16.dp)

                ) {
                    Text(
                        text = "Welcome to",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight(400)
                        ),
                        modifier = modifier
                            .padding(top = 50.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = "Al Azan App",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        style = MaterialTheme.typography.displayMedium.copy(
                            fontWeight = FontWeight(700)
                        ),
                        modifier = modifier
                            .padding(top = 8.dp)
                            .fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                    Image(
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .width(244.dp)
                            .height(311.dp)
                            .padding(top = 12.dp),
                        painter = painterResource(R.drawable.mosque_img),
                        contentDescription = "",
                        contentScale = ContentScale.Fit
                    )

                }
                Spacer(Modifier.shadow(elevation = 4.dp).fillMaxWidth().height(0.5.dp).background(Color(0xFF00585A)))
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(top = 24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Choose Your Language",
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = modifier
                            .fillMaxWidth()
                    )
                    SmplDropdownMenu()
                    Spacer(
                        Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                    )
                    StartedButton {
                        navController.navigate("intro2")
                    }
                    Spacer(
                        Modifier
                            .fillMaxWidth()
                            .height(20.dp)
                    )
                    TextButton(
                        onClick = {
                            showSkipDialog = true
                            timeLeft = 3
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .requiredHeight(height = 40.dp)
                            .requiredWidth(width = 153.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(
                                    8.dp,
                                    Alignment.CenterHorizontally
                                ),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = modifier
                                    .fillMaxSize()
                            ) {
                                Text(
                                    text = "Skip",
                                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                                    textAlign = TextAlign.Center,
                                    style = MaterialTheme.typography.labelLarge,
                                    modifier = modifier
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}




@Composable
fun StartedButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(1.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .width(153.dp)

            .requiredHeight(56.dp)
            //.padding(horizontal = 100.dp)
            .clip(shape = RoundedCornerShape(100.dp))
            .background(color = MaterialTheme.colorScheme.tertiaryContainer)
            .clickable { }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .width(153.dp)
                .requiredHeight(height = 40.dp)
                .padding(
                    horizontal = 24.dp,
                    vertical = 10.dp
                )
        ) {
            Text(
                text = "Get Started",
                color = MaterialTheme.colorScheme.onTertiaryContainer,
                textAlign = TextAlign.Center,
                lineHeight = 1.43.em,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier
                    .clickable { onClick() }
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}




