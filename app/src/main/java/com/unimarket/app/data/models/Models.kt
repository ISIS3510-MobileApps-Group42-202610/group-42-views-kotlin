package com.unimarket.app.data.models

// Mock data models
data class Product(
    val id: String,
    val title: String,
    val price: Double,
    val description: String,
    val category: String,
    val imageUrl: String,
    val sellerName: String,
    val sellerImage: String,
    val rating: Float,
    val reviews: Int,
    val isFavorite: Boolean = false,
    val location: String = "Campus Blvd"
)

data class Category(
    val id: String,
    val name: String,
    val icon: String,
    val color: String,
    val count: Int
)

data class User(
    val id: String,
    val name: String,
    val email: String,
    val profileImage: String,
    val rating: Float,
    val reviews: Int,
    val location: String,
    val joinedDate: String
)

data class Message(
    val id: String,
    val senderId: String,
    val senderName: String,
    val senderImage: String,
    val content: String,
    val timestamp: String,
    val isFromCurrentUser: Boolean
)

data class Conversation(
    val id: String,
    val userId: String,
    val userName: String,
    val userImage: String,
    val lastMessage: String,
    val timestamp: String,
    val isOnline: Boolean,
    val unreadCount: Int = 0,
    val productName: String? = null
)

data class Listing(
    val id: String,
    val title: String,
    val price: Double,
    val status: String, // "Active", "Sold", "Pending"
    val views: Int,
    val createdDate: String
)

