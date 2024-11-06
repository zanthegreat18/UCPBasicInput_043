package com.tugas.ucp1_043

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview (showBackground = true)
@Composable
fun LatihanInput (modifier : Modifier = Modifier) {
    var origin by remember { mutableStateOf(value = "") }
    var departure by remember { mutableStateOf(value = "") }
    var arival by remember { mutableStateOf(value = "") }
    var memilihtransport by remember { mutableStateOf(value = "") }

    var originsv by remember { mutableStateOf(value = "") }
    var departuresv by remember { mutableStateOf(value = "") }
    var arivalsv by remember { mutableStateOf(value = "") }
    var memilihtransportsv by remember { mutableStateOf(value = "") }

    val listTR = listOf("Bus", "Ship", "Train", "Plane")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Profile()
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(5.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {

            Text(
                text = "Plan Your Adventures",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(text = "Let's plane an exquisite adventure's")

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp)
                    .clip(RoundedCornerShape(20.dp)),
                value = origin,
                onValueChange = { origin = it },
                label = { Text("Origin") },
                placeholder = { Text("Surabaya") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(20.dp)),

                value = origin,
                onValueChange = { origin = it },
                label = { Text("Departure") },
                placeholder = { Text("12 Januari 2024") }
            )
            OutlinedTextField(
                modifier = Modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(20.dp)),
                value = origin,
                onValueChange = { origin = it },
                label = { Text("Arival") },
                placeholder = { Text("Masukan Email Anda") }
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
        )
        {
            Row {
                listTR.forEach { item ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = memilihtransportsv == item,
                            onClick = {
                                memilihtransport = item
                            }
                        )
                        Text(item)
                    }
                }
            }
        }
        Button(
            onClick = {
                originsv = origin
                departuresv = departure
                arivalsv = arival
                memilihtransportsv = memilihtransport
            },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        ) { Text(text = "Submit") }
    }

}

@Composable
fun Profile(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Yellow)
            .padding(10.dp)
    ) {
        Row (modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .clip(CircleShape),
            ){
                Image(
                    painter = painterResource(id = R.drawable.tenggiri2),
                    contentDescription = "",
                    modifier = Modifier.size(100.dp)
                        .clip(CircleShape)
                )
            }
        }
    }
}





























