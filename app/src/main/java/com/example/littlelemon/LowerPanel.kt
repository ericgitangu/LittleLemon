package com.example.littlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial(){
    Card (
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = R.string.cardtext),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MenuDish() {
    Card {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center

        ) {
            Column {
                Text(
                    text = stringResource(id = R.string.greekSaladName),
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
                Text(
                    modifier = Modifier
                        .padding(0.dp, 5.dp, 0.dp, 5.dp)
                        .fillMaxWidth(.75f),
                    text = stringResource(id = R.string.greekSaladDefinition),
                    color = Color.Gray,
                )
                Text(
                    text = stringResource(id = R.string.greekSaladPrice),
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.greeksalad),
                        contentDescription = "Greek Salad image.",
                        modifier = Modifier.clip(RoundedCornerShape(20.dp))
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview(){
    LowerPanel()
}
