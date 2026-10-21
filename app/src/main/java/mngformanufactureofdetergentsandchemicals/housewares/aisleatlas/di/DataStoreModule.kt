package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di

import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.datastore.OnboardingDataStoreManager
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataStoreModule = module {
    single { OnboardingDataStoreManager(androidContext()) }
}