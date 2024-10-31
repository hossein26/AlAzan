package com.example.alazan.ui.settings.screens.fixproblem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
fun FixProblems(navController: NavController, modifier: Modifier = Modifier) {
    AlAzanTheme {

        Column(
            modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .verticalScroll(rememberScrollState())
        ) {


            Row(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(bottom = 8.dp)
                    .background(color = MaterialTheme.colorScheme.surfaceContainer),

                ) {

                Icon(
                    modifier = Modifier
                        .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                        .size(16.dp)
                        .align(Alignment.CenterVertically),
                    painter = painterResource(R.drawable.icon_back),
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.onSurface,
                )

                Row(
                    modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    horizontalArrangement = Arrangement.Center

                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_widget),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                        modifier = Modifier
                            .padding(12.dp)
                            .size(20.dp)
                            .align(Alignment.CenterVertically)
                    )

                    Text(
                        text = "Fix Problems",
                        modifier
                            .align(Alignment.CenterVertically),
                        color = MaterialTheme.colorScheme.onSurface,
                        fontSize = 22.sp,
                        style = MaterialTheme.typography.titleLarge
                    )

                    Box(
                        modifier = Modifier
                            .size(24.dp)
                    )
                }


            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row {
                    Icon(
                        modifier = Modifier
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                            .size(20.dp)
                            .align(Alignment.Top),
                        painter = painterResource(R.drawable.ic_info_gray),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                    Text(
                        text = "App doesn’t work correctly or Azan won’t notify you on-time ?\n" +
                                "Probably you need to fix one or two things below:",
                        modifier
                            .padding(8.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Column {
                    Text(
                        text = "Help The App Keep Running",
                        modifier
                            .padding(8.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "In order to app keep working perfectly, you need to allow it be running in the background or battery optimization settings on your phone will close the app after a few minutes. \n" +
                                "To to so follow steps below:\n" +
                                "  1- Hit the button below to open battery optimization settings.\n" +
                                "  2- Find the Al-Azan App in the list.\n" +
                                "  3- Disable the Power Optimization For Al-Azan\n" +
                                "  4- You Are Done",
                        modifier
                            .padding(12.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )


                    Row(
                        modifier
                            .padding(start = 16.dp)
                    ) {
                        Checkbox(
                            checked = true,
                            onCheckedChange = {
                            }, modifier
                                .padding(start = 24.dp),
                            colors = CheckboxDefaults.colors(
                                checkedColor = MaterialTheme.colorScheme.primary
                            )
                        )
                        Text(
                            text = "State: ",
                            modifier
                                .align(Alignment.CenterVertically),
                            style = MaterialTheme.typography.labelLarge,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        Text(
                            text = "Enabled",
                            modifier
                                .align(Alignment.CenterVertically),
                            color = MaterialTheme.colorScheme.error,
                            style = MaterialTheme.typography.labelLarge
                        )
                    }

                    Button(
                        onClick = {},
                        modifier
                            .padding(bottom = 8.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary,
                            contentColor = MaterialTheme.colorScheme.secondaryContainer
                        )
                    ) {
                        Text(
                            text = "Open Battery Optimization Settings",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp,
                        )
                    }

                }

            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {

                Column {

                    Text(
                        text = "Power Manager Settings",
                        modifier
                            .padding(8.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = "Some devices need extra settings inside the Power Manager to let the app keeps running in the background. If you fixed previous step and still facing problem, use these steps:\n" +
                                "  1- Hit the button below to open Power Manager\n" +
                                "  2- Find the Al-Azan App in the list.\n" +
                                "  3- Disable the Power Saving For Al-Azan\n" +
                                "  4- You Are Done",
                        modifier
                            .padding(8.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Button(
                        onClick = {},
                        modifier
                            .padding(bottom = 8.dp)
                            .align(Alignment.CenterHorizontally),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.primary
                        )
                    ) {
                        Text(
                            text = "Open Power Manager Settings",
                            style = MaterialTheme.typography.labelLarge,
                            fontSize = 14.sp,
                            color = MaterialTheme.colorScheme.secondaryContainer
                        )
                    }
                }
            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {

                Row {
                    Icon(
                        modifier = Modifier
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                            .size(20.dp)
                            .align(Alignment.Top),
                        painter = painterResource(R.drawable.ic_info_gray),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                    Text(
                        text = "Samsung devices have their own custom Power Manager called “Device Care”.\n" +
                                "\n" +
                                "For Samsung users:\n" +
                                "  1- Hit the button to open Battery Menu.\n" +
                                "  2- Open “Background usage limits”\n" +
                                "  3- open “Never auto sleeping apps”\n" +
                                "  4- Hit the “+” button on top\n" +
                                "  5- Find and add the “Al-Azan” app.\n" +
                                "  6- You are done.\n" +
                                "\n" +
                                "Note: If you didn’t find the app in the list you probably don’t need to do this part. ",
                        modifier
                            .padding(10.dp),
                        fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }
            }
            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Advanced",
                        modifier
                            .padding(12.dp),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Icon(
                        modifier = Modifier
                            .padding(12.dp)
                            .size(24.dp),
                        painter = painterResource(R.drawable.ic_nav_naxt),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                }
            }

            Box(
                modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 8.dp, end = 8.dp, bottom = 8.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row {
                    Icon(
                        modifier = Modifier
                            .padding(start = 12.dp, top = 12.dp, bottom = 12.dp)
                            .size(20.dp)
                            .align(Alignment.Top),
                        painter = painterResource(R.drawable.ic_info_gray),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface,
                    )
                    Text(
                        text = "If you still had problem with app stopping after some time, please visit dontkillmyapp.com for more\n solutions. ",
                        modifier
                            .padding(10.dp),
                        fontSize = 12.sp,
                        style = MaterialTheme.typography.labelLarge,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }

            }

            Spacer(modifier
                .padding(25.dp))

        }

    }
}


