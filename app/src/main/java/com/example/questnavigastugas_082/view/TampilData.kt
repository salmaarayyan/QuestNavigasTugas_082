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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DaftarData(
    onTambahDataClicked: () -> Unit,
    onBerandaClicked: () -> Unit
) {
    val nama = "Salmaa Rifhani Rayyan"
    val jenisKelamin = "Perempuan"
    val status = "Lajang"
    val alamat = "Balikpapan"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF6E6FF))
            .verticalScroll(rememberScrollState()) // Tambahkan ini agar aman di semua ukuran layar
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFB56BFF))
                .padding(16.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Text(
                text = "List Daftar Peserta",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Nama Lengkap
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("NAMA LENGKAP", fontWeight = FontWeight.SemiBold, color = Color.Gray)
                    Text(nama, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Cursive)
                }
            }
            // -- Jenis Kelamin
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("JENIS KELAMIN", fontWeight = FontWeight.SemiBold, color = Color.Gray)
                    Text(jenisKelamin, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Cursive)
                }
            }
            // -- Status Perkawinan
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("STATUS PERKAWINAN", fontWeight = FontWeight.SemiBold, color = Color.Gray)
                    Text(status, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Cursive)
                }
            }

            // Alamat
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                colors = CardDefaults.cardColors(containerColor = Color.White)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("ALAMAT", fontWeight = FontWeight.SemiBold, color = Color.Gray)
                    Text(alamat, style = MaterialTheme.typography.bodyLarge, fontFamily = FontFamily.Cursive)
                }
            }
        }

        // Memberi jarak
        Spacer(modifier = Modifier.height(20.dp))

        // Tombol-tombol navigasi
        Column(modifier = Modifier.padding(horizontal = 16.dp)) {
            Button(
                onClick = onTambahDataClicked,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8A2BE2))
            ) {
                Text("Formulir Pendaftaran", color = Color.White)
            }
            Spacer(modifier = Modifier.height(15.dp))
            Button(
                onClick = onBerandaClicked,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Gray) // Warna beda
            ) {
                Text("Beranda", color = Color.White)
            }
        }
    }
}

