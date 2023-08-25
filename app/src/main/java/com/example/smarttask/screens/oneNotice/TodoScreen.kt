package com.example.smarttask.screens.oneNotice


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.smarttask.R
import com.example.smarttask.defaultMargin
import com.example.smarttask.defaultMarginHalf
import com.example.smarttask.defaultMarginQuarter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoScreen(noteNumber: String?) {
    var titleText by remember { mutableStateOf(TextFieldValue("")) }
    var notieText by remember { mutableStateOf(TextFieldValue("")) }
    var noticeChecked by remember { mutableStateOf(false) }
    Column {
        TextField(
            value = titleText,
            onValueChange = { newText -> titleText = newText },
            keyboardActions = KeyboardActions(),
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = "My Todo Title",
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                textColor = Color.Black,
                disabledTextColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                containerColor = Color.White,
            )
            //shape = Nov(12.dp)
        )
        Divider(thickness = 1.dp, color = Color.Black)

        //Für die Anzahl an Todos mit Check-Kasten Links und rechts der Aufwandsschätzung
        //jeweils ein To-Do Darstellen

        Row {
            IconButton(
                onClick = {
                    noticeChecked = noticeChecked == false
                },
                modifier = Modifier
                    .padding(top = Dp.defaultMarginQuarter, start = Dp.defaultMargin)
                //.size(25.dp)
            )
            {
                if (!noticeChecked) {
                    Icon(
                        painter = painterResource(id = R.drawable.not_checked),
                        contentDescription = "Not Checked"
                    )
                } else {
                    Icon(
                        painter = painterResource(id = R.drawable.checked),
                        contentDescription = "Checked"
                    )
                }
            }

            TextField(
                value = notieText,
                onValueChange = { newText -> notieText = newText },
                keyboardActions = KeyboardActions(),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = Dp.defaultMarginHalf),
                placeholder = {
                    Text(
                        text = "Write your Notice",
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.Black,
                    disabledTextColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                    containerColor = Color.Transparent,
                )
                //shape = Nov(12.dp)
            )

            Text(
                text = "2",
                modifier = Modifier.padding(top = Dp.defaultMargin, start = Dp.defaultMarginQuarter)
            )
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.drop_down),
                    contentDescription = "Drop Down",
                    modifier = Modifier.padding(top = Dp.defaultMarginQuarter)
                )
            }
        }

        //Mittig ein Plus Button für weitere hinzuzufügenen Todos
        IconButton(
            onClick = { },
            modifier = Modifier
                .size(30.dp)
                .align(Alignment.CenterHorizontally)
        )
        {
            Icon(
                painter = painterResource(id = R.drawable.icons8_plus_500),
                contentDescription = "Plus Icon"
            )
        }

        if (noteNumber != null) {
            Spacer(modifier = Modifier.fillMaxSize(0.5f))
            Text(text = noteNumber, modifier = Modifier.align(Alignment.CenterHorizontally))
        }

        /*
        OutlinedTextField(
            value = notieText,
            onValueChange = { newText -> notieText = newText },
            keyboardActions = KeyboardActions(),
            modifier = Modifier.fillMaxWidth(),
            placeholder = {
                Text(
                    text = "Write your Notice",
                )
            },
            shape = RoundedCornerShape(0.dp),
            //colors = TextFieldColors()
        )*/
    }
}


@Preview
@Composable
fun TodoScreenPreview() {
    TodoScreen("sdsf")
}