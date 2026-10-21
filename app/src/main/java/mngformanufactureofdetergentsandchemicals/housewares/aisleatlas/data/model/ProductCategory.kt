package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.model

import androidx.annotation.StringRes
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    TABLEWARE(R.string.product_category_tableware_title),
    HOME_TEXTILES(R.string.product_category_home_textiles_title),
    STATIONERY(R.string.product_category_stationery_title),
    TOYS(R.string.product_category_toys_title),
}
