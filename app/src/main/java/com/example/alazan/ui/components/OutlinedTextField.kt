package com.example.alazan.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.ui.theme.AlAzanTheme


@Composable
fun CustomOutlinedTextFieldWithLabel(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "Label",
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier,
) {
    var isFocused by remember { mutableStateOf(false) }
    var textFieldValue by remember { mutableStateOf(TextFieldValue(value)) }

    Box {

        // Main Text Field Box with border
        Box(
            modifier = modifier
                .height(58.dp)
                .wrapContentWidth()
                .border(
                    width = 2.dp,
                    color = MaterialTheme.colorScheme.tertiaryContainer,
                    shape = RoundedCornerShape(16.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = textFieldValue.text,
                onValueChange = {
                    textFieldValue = TextFieldValue(it)
                    onValueChange(it)
                },
                singleLine = true,
                readOnly = true,
                textStyle = MaterialTheme.typography.labelLarge.copy(
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.tertiaryContainer
                ),
                //cursorBrush = SolidColor(MaterialTheme.colorScheme.tertiaryContainer),
                modifier = modifier
                    .onFocusChanged { focusState ->
                        isFocused = focusState.isFocused
                    },
            )
            // Label that floats over the border

        }
        Box(
            modifier
                .background(MaterialTheme.colorScheme.inversePrimary)
                .align(Alignment.TopCenter)
                .offset(y = (-16).dp) // Move label slightly above the border
                .padding(horizontal = 2.dp)
        ) {
            Text(
                text = label,
                color = MaterialTheme.colorScheme.tertiaryContainer,
                style = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
                modifier = modifier


            )
        }


    }
}

@Preview(
    showBackground = true,
    fontScale = 2f
)
@Composable
fun PreviewCustomOutlinedTextFieldWithLabel() {
    var text by remember { mutableStateOf("-00:18:36") }

    AlAzanTheme {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            // Background box with rounded border
            Box(
                modifier = Modifier
                    .widthIn(182.dp) // Adjust height as needed
                    .border(
                        width = 2.dp, // Border thickness
                        color = MaterialTheme.colorScheme.tertiary,
                        shape = RoundedCornerShape(16.dp)
                    ), contentAlignment = Alignment.Center

            ){
                Text("-00:18:36", modifier = Modifier.padding(vertical = 16.dp, horizontal = 24.dp), style = MaterialTheme.typography.labelMedium.copy(
                    color = MaterialTheme.colorScheme.tertiary
                ))
            }

            // Text on top of the border
            Box(
                modifier = Modifier
                    .align(Alignment.TopCenter) // Position the text on the border
                    .offset(y = (-18).dp) // Adjust the offset to place text on the border
                    .background(Color.White) // Background for text to make it visible over the border
                    .padding(horizontal = 8.dp, vertical = 2.dp) // Padding for text box
            ) {
                Text(
                    text = "Next Prayer:",
                    style = MaterialTheme.typography.labelMedium.copy(
                        fontSize = 9.sp, color = MaterialTheme.colorScheme.tertiary
                    )
                )
            }
        }
    }


}

@Composable
fun NextPrayerCountdownWithTextOnBorder() {
    // Define colors for the border and text
    val borderColor = Color(0xFFFAD65C)     // Replace with exact color if needed
    val textColor = Color(0xFFFAD65C)       // Replace with exact color if needed
    val backgroundColor = Color(0xFF3A8273) // Replace with exact color if needed

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(backgroundColor)
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        // Box with rounded border
        Box(
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .border(
                    width = 4.dp,
                    color = borderColor,
                    shape = RoundedCornerShape(50)
                )
                .padding(vertical = 16.dp), // Space inside the border
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.height(20.dp)) // Spacer to align content below the top text
                Text(
                    text = "-00:18:36", // Replace with dynamic timer if needed
                    color = textColor,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // Text on top of the border
        Box(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 8.dp) // Use padding instead of offset
                .background(backgroundColor) // Background to match main color
                .padding(horizontal = 8.dp) // Padding around the text
        ) {
            Text(
                text = "Next Prayer:",
                color = textColor,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Counter() {
    var text by remember { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier
            .widthIn(min = 110.dp, max = 147.dp)
            .height(60.dp),
        shape = RoundedCornerShape(16.dp),
        readOnly = true,
        value = "-00:18:36",
        textStyle = MaterialTheme.typography.labelLarge.copy(
            fontWeight = FontWeight(600),
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.tertiary
        ),

        onValueChange = {

        },
        label = {
            Text(
                "Next Prayer:",
                modifier = Modifier.fillMaxWidth(),
                fontSize = 12.sp,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.tertiary
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = MaterialTheme.colorScheme.tertiary,
            unfocusedBorderColor = MaterialTheme.colorScheme.tertiary
        )
    )
}

@Composable
fun NextPrayerCountdown() {
    // Define colors for the background and text
    val backgroundColor = Color(0xFF3A8273) // Replace with exact color if needed
    val borderColor = Color(0xFFFAD65C)     // Replace with exact color if needed
    val textColor = Color(0xFFFAD65C)       // Replace with exact color if needed

    // Main Box with background color
    Box(
        modifier = Modifier
            .width(42.dp)
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        // Box for rounded rectangle border and text
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    BorderStroke(4.dp, borderColor),
                    RoundedCornerShape(50) // To create rounded rectangle shape
                )
                .padding(vertical = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            // Text for "Next Prayer" and the countdown timer
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Next Prayer:",
                    color = textColor,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "-00:18:36", // Replace with dynamic timer if needed
                    color = textColor,
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
fun NextPrayerCountdown2() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(
                color = Color(0xFF008080), // Background color similar to your image
                shape = RoundedCornerShape(24.dp) // Rounded rectangle border
            )
            .border(
                width = 2.dp,
                color = Color(0xFFFFD700), // Border color similar to your image
                shape = RoundedCornerShape(24.dp)
            )
            .padding(vertical = 16.dp, horizontal = 32.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Next Prayer:",
                fontSize = 24.sp,
                color = Color(0xFFFFD700), // Text color similar to your image
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "-00:18:36",
                fontSize = 32.sp,
                color = Color(0xFFFFD700), // Text color similar to your image
                fontWeight = FontWeight.Bold
            )
        }
    }
}



