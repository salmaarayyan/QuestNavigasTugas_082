package com.example.questnavigastugas_082

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

enum class Tampilan {
    SelamatDatang,
    DaftarPeserta,
    Formulir
}

@Composable
fun AplikasiPendaftaran(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = com.example.navigasi.Tampilan.SelamatDatang.name,
            modifier = Modifier.padding(innerPadding)
        ) {

        }
    }
}