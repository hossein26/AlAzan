package com.github.meypod.al_azan.ui.intro

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.github.meypod.al_azan.R
import com.github.meypod.al_azan.general_components.Navigation.INTRO_3
import com.github.meypod.al_azan.general_components.Navigation.MAIN_SCREEN
import com.github.meypod.al_azan.ui.components.Footer
import com.github.meypod.al_azan.ui.components.IslamicPatternBackground
import com.github.meypod.al_azan.ui.theme.AlAzanTheme

@Preview
@Composable
fun Intro2(navController: NavController = rememberNavController(), modifier: Modifier = Modifier) {

    val context = LocalContext.current

    AlAzanTheme {
        IslamicPatternBackground(
            color = Color(0xFF00585A)
        ) {
            Box{
                Box(
                    modifier = modifier.fillMaxSize()
                        .padding(dimensionResource(R.dimen.screen_padding))
                ) {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)

                            .offset(y = (-60).dp)
                    ) {
                        Text(
                            text = stringResource(R.string.thanks),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.titleLarge,
                            modifier = modifier
                                .fillMaxWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                        Spacer(modifier.padding(dimensionResource(R.dimen.spacer_small)))

                        Text(
                            text = stringResource(R.string.thanks_desc),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = modifier
                                .align(Alignment.CenterHorizontally)
                                .widthIn(max = 600.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )


                    }

                    Column(
                        verticalArrangement = Arrangement.spacedBy(
                            dimensionResource(R.dimen.spacer_extra_medium),
                            Alignment.Top
                        ),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = modifier
                            .fillMaxWidth()
                            .offset(y = (-150).dp)
                            .padding(
                                horizontal = dimensionResource(R.dimen.horizontal_padding)
                            )
                            .align(Alignment.BottomCenter)
                    ) {
                        Text(
                            text = stringResource(R.string.backup_desc),
                            color = Color.White,
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically)
                        )
                        Button(
                            onClick = {
                                Toast.makeText(context, "open files", Toast.LENGTH_SHORT).show()
                            },
                            shape = CircleShape,
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.secondaryContainer),
                            contentPadding = PaddingValues(
                                //start = 16.dp,
                                //top = 10.dp,
                                //end = 24.dp,
                                //bottom = 10.dp
                            ),
                            modifier = Modifier
                                .requiredHeight(height = 40.dp)
                                .wrapContentWidth()
                        ) {

                            Row(
                                horizontalArrangement = Arrangement.spacedBy(
                                    dimensionResource(R.dimen.padding_medium),
                                    Alignment.CenterHorizontally
                                ),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.horizontal_padding))

                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_upload),
                                    contentDescription = stringResource(R.string.backup_button),
                                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSecondaryContainer),
                                    modifier = Modifier
                                        .wrapContentSize()
                                )
                                Text(
                                    text = stringResource(R.string.backup_button),
                                    color = MaterialTheme.colorScheme.onSecondaryContainer,
                                    textAlign = TextAlign.Center,
                                    style = MaterialTheme.typography.labelLarge,
                                    modifier = Modifier
                                        .wrapContentHeight(align = Alignment.CenterVertically)
                                )
                            }
                        }
                    }
                }
                Footer(
                    modifier.align(Alignment.BottomCenter),
                    onNextClick = { navController.navigate(INTRO_3) },
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


