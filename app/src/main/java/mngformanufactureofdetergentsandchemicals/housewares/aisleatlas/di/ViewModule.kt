package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.di

import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.AppViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.CartViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.CheckoutViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.OnboardingViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.OrderViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.ProductDetailsViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.ProductViewModel
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}