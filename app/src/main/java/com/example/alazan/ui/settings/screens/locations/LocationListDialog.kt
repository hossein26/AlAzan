package com.example.alazan.ui.settings.screens.locations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alazan.R
import com.example.alazan.ui.theme.AlAzanTheme

@Composable
@Preview
fun LocationListDialog(modifier: Modifier = Modifier) {
    AlAzanTheme {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
                .clip(RoundedCornerShape(18.dp)),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(16.dp)
        ) {


            Column(
                modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Row(
                    modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, end = 12.dp, top = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Text(
                        text = "Set As Default",
                        modifier
                            .padding(8.dp), fontSize = 14.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Icon(
                        painter = painterResource(R.drawable.ic_check),
                        modifier = Modifier
                            .padding(4.dp)
                            .size(20.dp),
                        contentDescription = ""
                    )
                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(start = 12.dp, end = 12.dp),
                    thickness = 1.dp,
                    color = Color(0xFFBDC9C9)
                )
                   
            }
        }
    }
}