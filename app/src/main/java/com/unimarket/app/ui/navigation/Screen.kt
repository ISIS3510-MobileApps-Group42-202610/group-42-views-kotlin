package com.unimarket.app.ui.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Register : Screen("register")
    object Home : Screen("home")
    object Categories : Screen("categories")
    object CreateListing : Screen("create_listing")
    object Favorites : Screen("favorites")
    object Messages : Screen("messages")
    object Profile : Screen("profile")
    object ProductDetail : Screen("product_detail/{productId}") {
        fun createRoute(productId: String) = "product_detail/$productId"
    }
    object SearchResults : Screen("search_results/{query}") {
        fun createRoute(query: String) = "search_results/$query"
    }
    object Chat : Screen("chat/{conversationId}") {
        fun createRoute(conversationId: String) = "chat/$conversationId"
    }
}

