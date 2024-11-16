package com.github.meypod.al_azan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.INTRO_4
import com.github.meypod.al_azan.general_components.Navigation.LOCATION_LIST
import com.github.meypod.al_azan.general_components.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.ui.components.Footer
import com.github.meypod.al_azan.ui.components.PatternBackgroundBox
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro3(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize()
            ) {
                Column(
                    modifier = modifier
                        .align(Alignment.TopCenter)
                        .padding(dimensionResource(R.dimen.screen_padding)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.location),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.Bold,
                        ),
                        modifier = Modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(dimensionResource(R.dimen.text_padding))
                    )
                    Row(
                        modifier = modifier
                            .padding(
                                top = dimensionResource(R.dimen.horizontal_title_padding),
                                bottom = dimensionResource(R.dimen.horizontal_title_padding)
                            ),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.vaadin_globe),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = dimensionResource(R.dimen.icon_size_intro))
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_large_icon_text)))
                        Text(
                            text = stringResource(R.string.whats_horizon),
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = Modifier
                                .padding(dimensionResource(R.dimen.text_padding)),
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.information_slab_circle),
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_1)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,

                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_2)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_3)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_4)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_5)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 14.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append(stringResource(R.string.horizon_desc_6)) }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.location_list),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall.copy(
                                    fontWeight = FontWeight.Medium
                                ),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier.size(dimensionResource(R.dimen.spacer_medium)))
                            Text(
                                text = stringResource(R.string.empty_location),
                                style = MaterialTheme.typography.bodyMedium,
                                color = MaterialTheme.colorScheme.onSurface,
                            )
                            Spacer(modifier.size(dimensionResource(R.dimen.spacer_large)))
                            Button(
                                onClick = {
                                    navController.navigate(LOCATION_LIST)
                                },
                                shape = CircleShape,
                                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                                modifier = Modifier
                                    .widthIn(min = dimensionResource(R.dimen.button_icon_width))
                                    .heightIn(min = dimensionResource(R.dimen.button_icon_height))
                                    .align(Alignment.CenterHorizontally)
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(
                                        8.dp,
                                        Alignment.CenterHorizontally
                                    ),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .wrapContentWidth()
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.ic_plus),
                                        contentDescription = stringResource(R.string.icon),
                                        modifier = Modifier
                                            .requiredSize(size = dimensionResource(R.dimen.plus_icon_size)),
                                        colorFilter = ColorFilter.tint(
                                            MaterialTheme.colorScheme.onPrimary
                                        ),

                                        )
                                    Text(
                                        text = stringResource(R.string.add_new_location),
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        textAlign = TextAlign.Center,
                                        style = MaterialTheme.typography.labelLarge,
                                    )
                                }
                            }
                        }
                    }
                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_4) },
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {
                        navController.navigate(MAIN_SCREEN)
                    }
                )
            }
        }

    }

}

