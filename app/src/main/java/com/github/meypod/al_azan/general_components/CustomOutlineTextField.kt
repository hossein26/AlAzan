package com.github.meypod.al_azan.general_components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.heightIn
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OutlinedTextFieldWithLabel(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
) {
    var textFieldValue by remember { mutableStateOf(TextFieldValue(value)) }
    val fontScale = LocalDensity.current.fontScale
    val offset = (-9 * fontScale)

    Box {
        Box(
            modifier = Modifier
                .heightIn(min = 42.dp)
                .wrapContentWidth()
                .border(
                    width = 2.dp,
                    color = Color(0xFFFFE487),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(vertical = 6.dp),
            contentAlignment = Alignment.Center
        ) {
            BasicTextField(
                value = textFieldValue.text,
                onValueChange = {
                    textFieldValue = TextFieldValue(it)
                    onValueChange(it)
                },
                singleLine = true,
                textStyle = MaterialTheme.typography.labelLarge.copy(
                    textAlign = TextAlign.Center,
                    color = Color(0xFFFFE487)
                ),
                cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
            )
        }
        Text(
            text = label,
            color = Color(0xFFFFE487),
            style = MaterialTheme.typography.labelSmall.copy(fontSize = 11.sp),
            modifier = Modifier
                .offset(y = offset.dp)
                .background(Color(0xFF008083))
                .align(Alignment.TopCenter)
        )
    }
}