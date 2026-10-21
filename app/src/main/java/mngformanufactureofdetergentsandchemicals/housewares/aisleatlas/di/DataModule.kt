package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di

import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.repository.CartRepository
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.repository.OnboardingRepository
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.repository.OrderRepository
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.data.repository.ProductRepository

import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    includes(databaseModule, dataStoreModule)

    single {
        OnboardingRepository(
            onboardingDataStoreManager = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single { ProductRepository() }

    single {
        CartRepository(
            cartItemDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }

    single {
        OrderRepository(
            orderDao = get(),
            coroutineDispatcher = get(named("IO"))
        )
    }
}