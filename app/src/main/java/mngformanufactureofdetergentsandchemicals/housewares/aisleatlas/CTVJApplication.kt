package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas

import android.app.Application
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di.dataModule
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di.dispatcherModule
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class CTVJApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@CTVJApplication)
            modules(appModules)
        }
    }
}
