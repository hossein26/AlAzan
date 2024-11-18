package com.github.meypod.al_azan.screens.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.ImageShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.Navigation.INTRO_2
import com.github.meypod.al_azan.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenuIntro
import com.github.meypod.al_azan.general_components.SkipSetupDialog
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Composable
fun Intro1(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    var showSkipDialog by remember { mutableStateOf(false) }
    var timeLeft by remember { mutableIntStateOf(3) }
    val listOfLanguage = listOf(
        "English",
        "فارسی",
        "العربية",
        "Türkçe",
        "Français",
        "Indonesia",
        "اردو",
        "हिन्दी",
        "Deutsch",
        "Bosanski",
        "Kiswahili",
        "বাংলা",
        "Tiếng Việt"
    )
    if (showSkipDialog) {
        SkipSetupDialog(
            onSkip = {
                navController.navigate(MAIN_SCREEN)
                showSkipDialog = false
            },
            onCancel = {
                showSkipDialog = false
            }
        )
    }
    AlAzanTheme {
        val gradientBrush = Brush.linearGradient(
            colors = listOf(
                MaterialTheme.colorScheme.surfaceTint,
                MaterialTheme.colorScheme.onTertiary
            ),
            start = Offset(0f, 0f),
            end = Offset(0f, 10000f)
        )
        Column(
            modifier = modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Column(
                modifier = modifier.fillMaxSize().weight(1f).background(gradientBrush)
            ) {
                Text(
                    text = stringResource(R.string.welcome_to),
                    color = Color.White,
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = modifier
                        .padding(top = 50.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(R.string.al_azan_app),
                    color = Color.White,
                    style = MaterialTheme.typography.displayMedium.copy(
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier
                        .padding(top = dimensionResource(R.dimen.padding_medium))
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
                Image(
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .width(244.dp)
                        .height(311.dp)
                        .offset(y = 20.dp)
                        .padding(top = dimensionResource(R.dimen.padding_medium)),
                    painter = painterResource(R.drawable.mosque_img),
                    contentDescription = "mosque",
                    contentScale = ContentScale.Fit
                )
            }
            Spacer(
                Modifier
                    .shadow(elevation = dimensionResource(R.dimen.shadow_elevation_high))
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xFF00585A))
            )
            Box(
                modifier = modifier
                    .fillMaxSize()
                    .weight(1f)
                    .background(
                        Color(0xFF00585A)
                    )
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
            )
            {
                Column(
                    modifier = modifier
                        .fillMaxSize()
                        .padding(top = dimensionResource(R.dimen.padding_extra_large)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.language_choose),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = modifier
                            .fillMaxWidth()
                    )
                    Spacer(modifier.size(dimensionResource(R.dimen.spacer_large)))
                    SampleBottomSheetMenuIntro(
                        items = listOfLanguage
                    ) {}
                    Spacer(
                        modifier
                            .fillMaxWidth()
                            .height(dimensionResource(R.dimen.spacer_extra_large))
                    )
                    Button(
                        onClick = {
                            navController.navigate(INTRO_2)
                        },
                        modifier = modifier
                            .widthIn(min = dimensionResource(R.dimen.start_button_width))
                            .requiredHeight(dimensionResource(R.dimen.start_button_height))
                            .clip(shape = CircleShape),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.tertiaryContainer
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.get_started),
                            color = MaterialTheme.colorScheme.onTertiaryContainer,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .wrapContentWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                    }
                    Spacer(
                        Modifier
                            .fillMaxWidth()
                            .height(dimensionResource(R.dimen.spacer_large))
                    )
                    TextButton(
                        onClick = {
                            showSkipDialog = true
                            timeLeft = 3
                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        modifier = modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                    ) {
                        Text(
                            text = stringResource(R.string.skip),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.labelLarge,
                            modifier = modifier
                                .width(dimensionResource(R.dimen.skip_button_width))
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                    }
                }
            }
        }
    }
}