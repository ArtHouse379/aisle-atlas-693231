package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.database.dao.CartItemDao
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.database.dao.OrderDao
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.database.converter.Converters
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.entity.CartItemEntity
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class CTVJAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}