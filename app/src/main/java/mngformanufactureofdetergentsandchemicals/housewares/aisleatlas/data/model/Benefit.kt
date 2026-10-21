package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Shield
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(icon = Icons.Outlined.Star, text = "Quality materials"),
    Benefit(icon = Icons.Outlined.Shield, text = "30-day warranty"),
    Benefit(icon = Icons.Outlined.Home, text = "Everyday essentials"),
)
