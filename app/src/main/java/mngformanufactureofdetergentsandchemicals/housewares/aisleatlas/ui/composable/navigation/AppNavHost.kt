package mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.cart.CTVJCartScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.checkout.CTVJCheckoutScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.home.CTVJHomeScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.onboarding.CTVJOnboardingScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.order.CTVJOrdersScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.productdetails.CTVJProductDetailsScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.settings.CTVJSettingsScreen
import mngformanufactureofdetergentsandchemicals.housewares.aisleatlas.ui.composable.screen.splash.CTVJSplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            CTVJSplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            CTVJOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            CTVJHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            CTVJProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            CTVJCartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            CTVJCheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            CTVJOrdersScreen()
        }

        composable<NavRoute.Settings> {
            CTVJSettingsScreen()
        }
    }
}