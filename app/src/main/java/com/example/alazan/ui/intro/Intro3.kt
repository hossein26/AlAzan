package com.example.alazan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.components.Footer
import com.example.alazan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro3(modifier: Modifier = Modifier) {
    AlAzanTheme {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = modifier
                    .align(Alignment.TopCenter)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Location",
                    color = MaterialTheme.colorScheme.onBackground,
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = Modifier
                        .wrapContentHeight(align = Alignment.CenterVertically)
                        .padding(8.dp)
                )
                Row(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vaadin_globe),
                        contentDescription = null,
                        modifier = Modifier
                            .requiredSize(size = 48.dp)
                    )
                    Text(
                        text = "What’s your Horizon ?",
                        color = MaterialTheme.colorScheme.onBackground,
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            letterSpacing = 0.15.sp
                        ),
                        modifier = Modifier
                            .padding(8.dp),
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = MaterialTheme.colorScheme.onBackground)
                        .padding(12.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.information_slab_circle),
                        contentDescription = null,
                        modifier = modifier.padding(end = 6.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp)
                                ) {append("We need your location to ")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold)
                                ) {append("calculate Azan")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp)
                                ) {append(" for you. \nJust hit the ")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold)
                                ) {append("“Add New Location”")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp)
                                ) {append(" button below to add your location.\n")}
                                withStyle(style = SpanStyle(
                                    color = Color(0xff181c1c),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Bold)
                                ) {append("You can add more locations any time.")}},
                            modifier = Modifier
                                .fillMaxWidth()
                        )
                    }
                }
                Spacer(modifier.padding(6.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(shape = RoundedCornerShape(12.dp))
                        .background(color = MaterialTheme.colorScheme.onBackground)
                        .padding(12.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Locations List",
                            color = Color(0xff181c1c),
                            style = MaterialTheme.typography.labelLarge,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(20.dp)
                        )
                        Text(
                            text = "your location list is empty. please add new location",
                            color = Color(0xff181c1c),
                            style = TextStyle(
                                fontSize = 14.sp,
                                letterSpacing = 0.25.sp
                            ),
                            modifier = Modifier
                                .height(40.dp)
                                .padding(top = 12.dp)
                        )
                        Row {

                        }
                        Button(
                            onClick = {

                            },
                            shape = RoundedCornerShape(100.dp),
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                            contentPadding = PaddingValues(
                                start = 16.dp,
                                top = 10.dp,
                                end = 24.dp,
                                bottom = 10.dp
                            ),
                            modifier = Modifier
                                .padding(top = 6.dp)
                                .requiredHeight(height = 40.dp)
                                .width(182.dp)
                                .align(Alignment.CenterHorizontally)
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
                                Image(
                                    painter = painterResource(id = R.drawable.ic_plus),
                                    contentDescription = "icon",
                                    modifier = Modifier
                                        .requiredSize(size = 18.dp)
                                )
                                Text(
                                    text = "Add New Location",
                                    color = MaterialTheme.colorScheme.onPrimary,
                                    textAlign = TextAlign.Center,
                                    style = MaterialTheme.typography.labelLarge,
                                    modifier = Modifier
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                )
                            }
                        }
                    }
                }
            }
            Footer(modifier.align(Alignment.BottomCenter))
        }
    }

}


@Composable
fun Frame145(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .requiredWidth(width = 390.dp)
            .requiredHeight(height = 712.dp)
            .padding(
                horizontal = 16.dp,
                vertical = 10.dp
            )
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(12.dp))
                .background(color = Color(0xffebefee))
                .padding(all = 12.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Locations List",
                    color = Color(0xff181c1c),
                    lineHeight = 1.43.em,
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(align = Alignment.CenterVertically)
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(all = 10.dp)
            ) {
                Text(
                    text = "your location list is empty. please add new location",
                    color = Color(0xff181c1c),
                    lineHeight = 1.43.em,
                    style = TextStyle(
                        fontSize = 14.sp,
                        letterSpacing = 0.25.sp
                    ),
                    modifier = Modifier
                        .wrapContentHeight(align = Alignment.CenterVertically)
                )
            }
            Button(
                onClick = { },
                shape = RoundedCornerShape(100.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xff00585a)),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    top = 10.dp,
                    end = 24.dp,
                    bottom = 10.dp
                ),
                modifier = Modifier
                    .requiredHeight(height = 40.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .requiredHeight(height = 40.dp)
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
                        Image(
                            painter = painterResource(id = R.drawable.ic_plus),
                            contentDescription = "icon",
                            colorFilter = ColorFilter.tint(Color.White),
                            modifier = Modifier
                                .requiredSize(size = 18.dp)
                        )
                        Text(
                            text = "Add New Location",
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
