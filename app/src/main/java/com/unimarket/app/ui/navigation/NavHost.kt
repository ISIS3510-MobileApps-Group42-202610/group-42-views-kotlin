package com.unimarket.app.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument
import com.unimarket.app.ui.screens.CategoriesScreen
import com.unimarket.app.ui.screens.ChatScreen
import com.unimarket.app.ui.screens.CreateListingScreen
import com.unimarket.app.ui.screens.FavoritesScreen
import com.unimarket.app.ui.screens.HomeScreen
import com.unimarket.app.ui.screens.LoginScreen
import com.unimarket.app.ui.screens.MessagesScreen
import com.unimarket.app.ui.screens.ProductDetailScreen
import com.unimarket.app.ui.screens.ProfileScreen
import com.unimarket.app.ui.screens.RegisterScreen
import com.unimarket.app.ui.screens.SearchResultsScreen
import com.unimarket.app.ui.screens.SplashScreen

@Composable
fun UniMarketNavHost(
    navController: NavHostController,
    startDestination: String = Screen.Splash.route
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val showBottomNav = currentRoute in listOf(
        Screen.Home.route,
        Screen.Categories.route,
        Screen.CreateListing.route,
        Screen.Favorites.route,
        Screen.Messages.route,
        Screen.Profile.route
    )

    Box {
        Column(modifier = Modifier.weight(1f)) {
            NavHost(
                navController = navController,
                startDestination = startDestination,
                modifier = Modifier.weight(1f)
            ) {
                composable(Screen.Splash.route) {
                    SplashScreen(
                        onNavigateToLogin = {
                            navController.navigate(Screen.Login.route) {
                                popUpTo(Screen.Splash.route) { inclusive = true }
                            }
                        }
                    )
                }

                composable(Screen.Login.route) {
                    LoginScreen(
                        onNavigateToHome = {
                            navController.navigate(Screen.Home.route) {
                                popUpTo(Screen.Login.route) { inclusive = true }
                            }
                        },
                        onNavigateToRegister = {
                            navController.navigate(Screen.Register.route)
                        }
                    )
                }

                composable(Screen.Register.route) {
                    RegisterScreen(
                        onNavigateToHome = {
                            navController.navigate(Screen.Home.route) {
                                popUpTo(Screen.Register.route) { inclusive = true }
                            }
                        },
                        onNavigateToLogin = {
                            navController.popBackStack()
                        }
                    )
                }

                composable(Screen.Home.route) {
                    HomeScreen(
                        onNavigateToProduct = { productId ->
                            navController.navigate(Screen.ProductDetail.createRoute(productId))
                        }
                    )
                }

                composable(Screen.Categories.route) {
                    CategoriesScreen(
                        onNavigateToSearch = { query ->
                            navController.navigate(Screen.SearchResults.createRoute(query))
                        }
                    )
                }

                composable(Screen.CreateListing.route) {
                    CreateListingScreen(
                        onNavigateBack = {
                            navController.popBackStack()
                        }
                    )
                }

                composable(Screen.Favorites.route) {
                    FavoritesScreen(
                        onNavigateToProduct = { productId ->
                            navController.navigate(Screen.ProductDetail.createRoute(productId))
                        }
                    )
                }

                composable(Screen.Messages.route) {
                    MessagesScreen(
                        onNavigateToChat = { conversationId ->
                            navController.navigate(Screen.Chat.createRoute(conversationId))
                        }
                    )
                }

                composable(Screen.Profile.route) {
                    ProfileScreen(
                        onNavigateToLogin = {
                            navController.navigate(Screen.Login.route) {
                                popUpTo(Screen.Home.route) { inclusive = true }
                            }
                        }
                    )
                }

                composable(
                    Screen.ProductDetail.route,
                    arguments = listOf(
                        navArgument("productId") { type = NavType.StringType }
                    )
                ) { backStackEntry ->
                    val productId = backStackEntry.arguments?.getString("productId") ?: return@composable
                    ProductDetailScreen(
                        productId = productId,
                        onNavigateBack = {
                            navController.popBackStack()
                        },
                        onNavigateToChat = {
                            navController.navigate(Screen.Chat.createRoute("conv_1"))
                        }
                    )
                }

                composable(
                    Screen.SearchResults.route,
                    arguments = listOf(
                        navArgument("query") { type = NavType.StringType }
                    )
                ) { backStackEntry ->
                    val query = backStackEntry.arguments?.getString("query") ?: return@composable
                    SearchResultsScreen(
                        searchQuery = query,
                        onNavigateBack = {
                            navController.popBackStack()
                        },
                        onNavigateToProduct = { productId ->
                            navController.navigate(Screen.ProductDetail.createRoute(productId))
                        }
                    )
                }

                composable(
                    Screen.Chat.route,
                    arguments = listOf(
                        navArgument("conversationId") { type = NavType.StringType }
                    )
                ) { backStackEntry ->
                    val conversationId = backStackEntry.arguments?.getString("conversationId") ?: return@composable
                    ChatScreen(
                        conversationId = conversationId,
                        onNavigateBack = {
                            navController.popBackStack()
                        }
                    )
                }
            }
        }

        if (showBottomNav) {
            BottomNavigationBar(
                navController = navController,
                currentRoute = currentRoute,
                modifier = Modifier.align(androidx.compose.ui.Alignment.BottomCenter)
            )
        }
    }
}

