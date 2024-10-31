package com.example.alazan.ui.components

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
            modifier = Modifier
                .height(42.dp)
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
                cursorBrush = SolidColor(MaterialTheme.colorScheme.tertiaryContainer),
                modifier = Modifier
                    .onFocusChanged { focusState ->
                        isFocused = focusState.isFocused
                    },
            )
        }

        // Label that floats over the border
        Text(
            text = label,
            color = MaterialTheme.colorScheme.tertiaryContainer,
            style = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
            modifier = Modifier

                .background(MaterialTheme.colorScheme.inversePrimary)
                .align(Alignment.TopCenter)
                .offset(y = (-8).dp) // Move label slightly above the border
                .padding(horizontal = 2.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCustomOutlinedTextFieldWithLabel() {
    var text by remember { mutableStateOf("-00:18:36") }

    CustomOutlinedTextFieldWithLabel(
        value = text,
        onValueChange = { text = it },
        label = "Next Prayer:"
    )
}

