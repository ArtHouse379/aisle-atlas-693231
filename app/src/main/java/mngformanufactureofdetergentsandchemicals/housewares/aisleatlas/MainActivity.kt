package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.approot.AppRoot
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.theme.CTVJAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CTVJAppTheme {
                AppRoot()
            }
        }
    }
}
