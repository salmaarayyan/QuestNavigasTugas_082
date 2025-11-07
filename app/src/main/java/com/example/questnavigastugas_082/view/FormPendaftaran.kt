package com.example.questnavigastugas_082.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FormulirPendaftaran(
    onSubmitButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    // Pilihan data untuk radio button
    val jenisList = listOf("Laki-laki", "Perempuan")
    val statusList = listOf("Janda", "Lajang", "Duda")

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF6E6FF))
            .verticalScroll(rememberScrollState())
        ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFB56BFF))
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "Formulir Pendaftaran",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 16.dp)
            )
        }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = MaterialTheme.shapes.medium,
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                // Input Nama Lengkap (sudah benar)
                Text("NAMA LENGKAP", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    readOnly = true,
                    label = { Text("Nama Lengkap") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))

                Text("JENIS KELAMIN", fontWeight = FontWeight.SemiBold)
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                }
            }
        }

    }
}