import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas_082.view.DaftarData
import com.example.questnavigastugas_082.view.FormulirPendaftaran
import com.example.questnavigastugas_082.view.HalamanUtama

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
            startDestination = Tampilan.SelamatDatang.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Tampilan.SelamatDatang.name) {
                HalamanUtama(
                    onNextButtonClicked = {
                        navController.navigate(Tampilan.DaftarPeserta.name)
                    }
                )
            }
            composable(route = Tampilan.DaftarPeserta.name) {
                DaftarData(
                    onTambahDataClicked = {
                        navController.navigate(Tampilan.Formulir.name)
                    },
                    onBerandaClicked = {
                        navController.popBackStack(Tampilan.SelamatDatang.name, inclusive = false)
                    }
                )
            }
            composable(route = Tampilan.Formulir.name) {
                FormulirPendaftaran(
                    onSubmitButtonClicked = {
                        navController.popBackStack()
                    }
                )
            }
        }
    }
}