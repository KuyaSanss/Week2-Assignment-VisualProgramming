package com.gavin.week2_assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gavin.week2_assignment.ui.theme.Poppins
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.foundation.layout.size

@Composable
fun Soal2View() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.night_time),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color(0xFF383C5C),
                        shape = RoundedCornerShape(
                            topStart = 24.dp,
                            topEnd = 24.dp
                        )
                    )
                    .padding(16.dp)
            ) {
                Text(
                    "My Travel",
                    fontFamily = Poppins,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(bottom = 16.dp)
                        .fillMaxWidth()
                )
                Text(
                    "Aurora",
                    fontFamily = Poppins,
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 7.dp)
                )
                Text(
                    "Tromso, Norway",
                    fontFamily = Poppins,
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 5.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Row() {
                    Text(
                        text = "★",
                        color = Color.Yellow,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "★",
                        color = Color.Yellow,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "★",
                        color = Color.Yellow,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "★",
                        color = Color.Yellow,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "★",
                        color = Color.Yellow,
                        fontSize = 20.sp
                    )
                    Text(
                        text = "5.0",
                        color = Color.Yellow,
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .padding(top = 5.dp)
                    )

                }

                var answer1 by remember { mutableStateOf("") }
                var answer2 by remember { mutableStateOf("") }
                var answer3 by remember { mutableStateOf("") }

                val fieldColor = Color(0xffd9ecff)
                val textColor = Color(0xFF454B5A)

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0xFF383C5C))
                        .padding(horizontal = 5.dp, vertical = 10.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    BasicTextField(
                        value = answer1,
                        onValueChange = { answer1 = it },
                        singleLine = true,
                        textStyle = TextStyle(
                            color = textColor,
                            fontSize = 10.sp
                        ),
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(40.dp)
                                    .background(fieldColor, RoundedCornerShape(5.dp))
                                    .padding(horizontal = 9.dp),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (answer1.isEmpty()) {
                                    Text(
                                        "What did you enjoy most about your trip?",
                                        fontSize = 10.sp,
                                        color = textColor
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )

                    BasicTextField(
                        value = answer2,
                        onValueChange = { answer2 = it },
                        singleLine = true,
                        textStyle = TextStyle(
                            color = textColor,
                            fontSize = 10.sp
                        ),
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(40.dp)
                                    .background(fieldColor, RoundedCornerShape(5.dp))
                                    .padding(horizontal = 9.dp),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (answer2.isEmpty()) {
                                    Text(
                                        "What was your favorite spot?",
                                        fontSize = 10.sp,
                                        color = textColor
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )

                    BasicTextField(
                        value = answer3,
                        onValueChange = { answer3 = it },
                        singleLine = true,
                        textStyle = TextStyle(
                            color = textColor,
                            fontSize = 10.sp
                        ),
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(40.dp)
                                    .background(fieldColor, RoundedCornerShape(5.dp))
                                    .padding(horizontal = 9.dp),
                                contentAlignment = Alignment.CenterStart
                            ) {
                                if (answer3.isEmpty()) {
                                    Text(
                                        "Anything else you'd like to add?",
                                        fontSize = 10.sp,
                                        color = textColor
                                    )
                                }
                                innerTextField()
                            }
                        }
                    )
                    Spacer(modifier = Modifier.height(40.dp))
                }
            }
        }
        SmallFloatingActionButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 16.dp)
                .size(45.dp),
            shape = RoundedCornerShape(10.dp),
            containerColor = Color(0xffd9ecff),
            contentColor = Color.Black
        ) {
            Text(
                text = "+",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xffa4a5,
)
@Composable
fun Soal2Preview() {
    Soal2View()
}