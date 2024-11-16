package com.github.meypod.al_azan.ui.intro

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.ADJUSTMENTS
import com.github.meypod.al_azan.general_components.Navigation.ADVANCED_CALCULATION_SETTINGS
import com.github.meypod.al_azan.general_components.Navigation.INTRO_7
import com.github.meypod.al_azan.general_components.SampleBottomSheetMenu
import com.github.meypod.al_azan.ui.components.Footer
import com.github.meypod.al_azan.ui.components.PatternBackgroundBox
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro4(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {
    AlAzanTheme {
        val calculationMethod = listOf(
            "Shia Ithna Ashari, Leva Institute, Qum, Iran",
            "Shia Ithna Ashari, Leva Institute, Saveh, Iran",
            "Shia Ithna Ashari, Leva Institute, Tehran, Iran",
            "Shia Ithna Ashari, Leva Institute, Arak, Iran",
        )

        val calendarType = listOf(
            "Islamic (civil)",
            "Islamic (civil)"
        )

        PatternBackgroundBox {
            Box(
                modifier = modifier
                    .fillMaxSize().clipToBounds()
            ) {
                Column(
                    modifier = modifier
                        .align(Alignment.TopCenter)
                        .padding(dimensionResource(R.dimen.screen_padding))
                        .verticalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(R.string.calculation),
                        color = MaterialTheme.colorScheme.onPrimaryContainer,
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.headlineMedium.copy(
                            fontWeight = FontWeight.Bold
                        ),
                        modifier = modifier
                            .wrapContentHeight(align = Alignment.CenterVertically)
                            .padding(dimensionResource(R.dimen.text_padding))
                    )
                    Row(
                        modifier = modifier
                            .padding(
                                top = dimensionResource(R.dimen.horizontal_title_padding),
                                bottom = dimensionResource(R.dimen.horizontal_title_padding)
                            ),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_telescope),
                            contentDescription = null,
                            modifier = Modifier
                                .requiredSize(size = dimensionResource(R.dimen.icon_size_intro))
                        )
                        Spacer(modifier.padding(horizontal = dimensionResource(R.dimen.spacer_large_icon_text)))
                        Text(
                            text = stringResource(R.string.how_calculate),
                            color = MaterialTheme.colorScheme.onPrimaryContainer,
                            style = MaterialTheme.typography.titleMedium.copy(
                                fontWeight = FontWeight.Bold
                            ),
                            modifier = modifier
                                .padding(dimensionResource(R.dimen.text_padding)),
                        )
                    }
                    Row(
                        modifier = modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.information_slab_circle),
                            contentDescription = null,
                            modifier = modifier
                                .size(dimensionResource(R.dimen.icon_info_size)),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                        Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
                        Column(
                            modifier = modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 12.sp,
                                        )
                                    ) { append(stringResource(R.string.calculation_desc_1)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 12.sp,
                                            fontWeight = FontWeight.Bold
                                        )
                                    ) { append(stringResource(R.string.calculation_desc_2)) }
                                    withStyle(
                                        style = SpanStyle(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            fontSize = 12.sp
                                        )
                                    ) { append(stringResource(R.string.calculation_desc_3)) }
                                },
                                lineHeight = 16.sp,
                                modifier = Modifier
                                    .widthIn(max = dimensionResource(R.dimen.max_width_text)),
                            )
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        modifier = modifier
                            .fillMaxWidth()
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Column(
                            modifier = modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.calculation_method),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items)))
                            SampleBottomSheetMenu(
                                items = calculationMethod
                            ) { }
                            Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_small)))
                            Row(
                                modifier = modifier
                                    .fillMaxWidth()
                                    .border(
                                        width = dimensionResource(R.dimen.item_border_width),
                                        color = MaterialTheme.colorScheme.outline,
                                        shape = RoundedCornerShape(dimensionResource(R.dimen.item_border_radius))
                                    )
                                    .padding(dimensionResource(R.dimen.item_content_padding)),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        stringResource(R.string.fajr_angle),
                                        modifier = Modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center,
                                    )
                                    Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_large)))
                                    Text(
                                        "16",
                                        modifier = Modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.primary
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                ) {
                                    Text(
                                        stringResource(R.string.isha_angle),
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_large)))
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.primary
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1.1f)
                                ) {
                                    Text(
                                        stringResource(R.string.isha_interval),
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_large)))
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.primary
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                }
                                Column(
                                    modifier = modifier
                                        .fillMaxWidth()
                                        .weight(1.2f)
                                ) {
                                    Text(
                                        stringResource(R.string.maghrib_angle),
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium.copy(
                                            color = MaterialTheme.colorScheme.onSurface
                                        ),
                                        textAlign = TextAlign.Center
                                    )
                                    Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_large)))
                                    Text(
                                        "16",
                                        modifier = modifier.fillMaxWidth(),
                                        style = MaterialTheme.typography.labelMedium,
                                        color = MaterialTheme.colorScheme.primary,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
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
                            modifier = modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = stringResource(R.string.calendar),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.titleSmall,
                                modifier = modifier
                                    .fillMaxWidth()
                            )
                            Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_medium)))
                            Text(
                                text = stringResource(R.string.calendar_type_desc),
                                color = MaterialTheme.colorScheme.onSurface,
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = modifier
                                    .fillMaxWidth()

                            )
                            Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items)))
                            SampleBottomSheetMenu(
                                items = calendarType
                            ) { }
                            Spacer(modifier = modifier.size(dimensionResource(R.dimen.spacer_items_large)))
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                                    .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.information_slab_circle),
                                    contentDescription = null,
                                    modifier = modifier
                                        .size(dimensionResource(R.dimen.icon_info_size)),
                                    tint = MaterialTheme.colorScheme.onSurface
                                )
                                Spacer(modifier.size(dimensionResource(R.dimen.spacer_small_icon_text)))
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = stringResource(R.string.attention),
                                        fontSize = 14.sp,
                                        style = MaterialTheme.typography.titleSmall,
                                        color = MaterialTheme.colorScheme.onSurface,
                                        fontWeight = FontWeight.Medium
                                    )
                                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_extra_small)))
                                    Text(
                                        text = stringResource(R.string.attention_desc),
                                        fontSize = 12.sp,
                                        style = MaterialTheme.typography.bodySmall.copy(
                                            lineHeight = 16.sp
                                        ),
                                        color = MaterialTheme.colorScheme.onSurfaceVariant
                                    )
                                }
                            }
                        }
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        modifier = modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate(ADJUSTMENTS)
                            }
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Text(
                            text = stringResource(R.string.adjustments),
                            modifier = modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .size(dimensionResource(R.dimen.icon_size_small))
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier.padding(dimensionResource(R.dimen.spacer_items)))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate(ADVANCED_CALCULATION_SETTINGS)
                            }
                            .clip(shape = RoundedCornerShape(dimensionResource(R.dimen.card_radius)))
                            .background(color = MaterialTheme.colorScheme.surfaceContainer)
                            .padding(dimensionResource(R.dimen.card_content_padding))
                    ) {
                        Text(
                            text = stringResource(R.string.advanced_calculation_settings),
                            modifier = modifier
                                .fillMaxWidth(),
                            style = MaterialTheme.typography.titleSmall.copy(
                                color = MaterialTheme.colorScheme.onSurface
                            )
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.ic_navigation_next),
                            contentDescription = null,
                            modifier = modifier
                                .size(dimensionResource(R.dimen.icon_size_small))
                                .align(Alignment.CenterEnd),
                            tint = MaterialTheme.colorScheme.onSurface
                        )
                    }
                    Spacer(modifier = modifier.padding(dimensionResource(R.dimen.last_card_padding)))

                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_7) },
                    onBackClick = {
                        navController.popBackStack()
                    },
                    onSkipClick = {}
                )
            }
        }

    }

}




