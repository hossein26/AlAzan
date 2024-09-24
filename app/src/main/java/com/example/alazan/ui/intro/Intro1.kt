package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun Intro1(modifier: Modifier = Modifier) {
    AlAzanTheme {
        AlAzanTheme {
            Box(
                modifier
                    .fillMaxSize()
                    .background(color = MaterialTheme.colorScheme.background),
            ) {
                Image(
                    painter = painterResource(R.drawable.mosque_illustration_1),
                    contentDescription = "",
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(top = 34.dp),
                    contentScale = ContentScale.Crop
                )
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(top = 60.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = "Welcome to",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = MaterialTheme.typography.headlineMedium,
                        modifier = modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                    )
                    Text(
                        text = "Al Azan App",
                        color = MaterialTheme.colorScheme.onPrimary,
                        style = TextStyle(
                            fontSize = 45.sp,
                            fontWeight = FontWeight.Bold,
                            shadow = Shadow(
                                blurRadius = 3f
                            )
                        ),
                        modifier = Modifier.padding(top = 2.dp)
                    )

                }

                Image(
                    painter = painterResource(R.drawable.ellipse_3),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )

                Column(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 80.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Choose Your Language",
                        color = MaterialTheme.colorScheme.onPrimary,
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(bottom = 5.dp)
                    )
                    SimpleDropdownMenu()
                    StartedButton(modifier = Modifier.padding(bottom = 12.dp, top = 45.dp))
                    TextButton(
                        onClick = {

                        },
                        colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                        modifier = Modifier
                            .requiredHeight(height = 40.dp)
                            .requiredWidth(width = 153.dp)
                    ) {
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(
                                    8.dp,
                                    Alignment.CenterHorizontally
                                ),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .fillMaxSize()
                            ) {
                                Text(
                                    text = "Skip",
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    lineHeight = 1.43.em,
                                    style = MaterialTheme.typography.labelLarge,
                                    modifier = Modifier
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
fun SimpleDropdownMenu() {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf("English", "Persian", "France")
    var selectedItem by remember { mutableStateOf(items[0]) }

    Box(
        modifier = Modifier
            .padding(8.dp)
            .requiredWidth(272.dp)
            .requiredHeight(40.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .background(Color.Transparent)
                .fillMaxWidth()
                .clickable { expanded = !expanded }
                .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(8.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = selectedItem,
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f),
                style = MaterialTheme.typography.labelLarge.copy(MaterialTheme.colorScheme.onPrimary)
            )
            Icon(
                painter = painterResource(
                    id = if (expanded) {
                        R.drawable.arrow_drop_up
                    } else {
                        R.drawable.arrow_drop_down
                    }
                ),
                contentDescription = "Drop down",
                modifier = Modifier
                    .size(24.dp)
                    .padding(end = 2.dp, start = 2.dp),
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .requiredWidth(width = 270.dp)
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = {
                            Text(
                                item, style = MaterialTheme.typography.labelLarge.copy(Color.White),
                                modifier = Modifier.background(color = MaterialTheme.colorScheme.primary)
                            )
                        },
                        onClick = {
                            selectedItem = item
                            expanded = false
                        }
                    )
                }
            }
        }
    }

}


@Composable
fun StartedButton(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(153.dp)
            .requiredHeight(56.dp)
            .clip(shape = RoundedCornerShape(100.dp))
            .background(color = Color(0xffecc622))
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            )
            .clickable { }
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(height = 40.dp)
                .padding(
                    horizontal = 24.dp,
                    vertical = 10.dp
                )
        ) {
            Text(
                text = "Get Started",
                color = Color(0xff443700),
                textAlign = TextAlign.Center,
                lineHeight = 1.43.em,
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier
                    .wrapContentHeight(align = Alignment.CenterVertically)
            )
        }
    }
}


@Preview()
@Composable
private fun IntroPreview() {
    AlAzanTheme {
        Intro1()
    }

}

