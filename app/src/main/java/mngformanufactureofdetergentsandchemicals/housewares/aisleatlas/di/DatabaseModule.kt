package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di

import androidx.room.Room
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.database.CTVJAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "ctvj_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = CTVJAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<CTVJAppDatabase>().cartItemDao() }

    single { get<CTVJAppDatabase>().orderDao() }
}