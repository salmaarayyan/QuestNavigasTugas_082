package com.example.questnavigastugas_082.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.example.navigasi.R
import com.example.questnavigastugas_082.R


@Composable
fun HalamanUtama(
    onNextButtonClicked: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Selamat Datang", style = MaterialTheme.typography.headlineLarge, fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.pinkcard),
            contentDescription = "Logo"
        )
        Text("Salmaa Rifhani Rayyan", style = MaterialTheme.typography.titleMedium)
        Text("20230140082", style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onNextButtonClicked
        ) {
            Text("SUBMIT")
        }
    }
}