package com.example.questnavigastugas_082.view

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_082.R

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
                    jenisList.forEach { item ->
                        Row(verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                            RadioButton(
                                selected = false,
                                onClick = null
                            )
                            Text(item, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))

                Text("STATUS PERKAWINAN", fontWeight = FontWeight.SemiBold)
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    statusList.forEach { item ->
                        Row(verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth().padding(vertical = 4.dp)) {
                            RadioButton(
                                selected = false,
                                onClick = null
                            )
                            Text(item, modifier = Modifier.padding(start = 8.dp))
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))

                Text("ALAMAT", fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    readOnly = true,
                    label = { Text("Alamat") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = onSubmitButtonClicked,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF8A2BE2))
                ) {
                    Text(stringResource(R.string.submit), color = Color.White)
                }
            }
        }
    }
}