package com.unimarket.app.data

import com.unimarket.app.data.models.Category
import com.unimarket.app.data.models.Conversation
import com.unimarket.app.data.models.Listing
import com.unimarket.app.data.models.Message
import com.unimarket.app.data.models.Product
import com.unimarket.app.data.models.User

object MockData {

    val mockProducts = listOf(
        Product(
            id = "1",
            title = "Advanced Calculus Textbook",
            price = 45.0,
            description = "Like new condition, used for one semester only",
            category = "Books",
            imageUrl = "📚",
            sellerName = "Maria Garcia",
            sellerImage = "👩",
            rating = 4.8f,
            reviews = 42,
            location = "Engineering Building"
        ),
        Product(
            id = "2",
            title = "Scientific Calculator TI-84",
            price = 120.0,
            description = "Perfect for engineering and calculus courses",
            category = "Electronics",
            imageUrl = "🧮",
            sellerName = "John Smith",
            sellerImage = "👨",
            rating = 4.9f,
            reviews = 28,
            location = "Science Complex"
        ),
        Product(
            id = "3",
            title = "Study Notes - Biology 101",
            price = 15.0,
            description = "Comprehensive notes from entire semester",
            category = "Notes",
            imageUrl = "📝",
            sellerName = "Sarah Chen",
            sellerImage = "👩",
            rating = 4.7f,
            reviews = 35,
            location = "Library Floor 3"
        ),
        Product(
            id = "4",
            title = "Wooden Desk Lamp",
            price = 35.0,
            description = "Modern design, excellent for studying",
            category = "Furniture",
            imageUrl = "💡",
            sellerName = "Alex Rodriguez",
            sellerImage = "👨",
            rating = 4.6f,
            reviews = 19,
            location = "Dorms"
        ),
        Product(
            id = "5",
            title = "Organic Chemistry Solutions Manual",
            price = 25.0,
            description = "Complete with worked solutions",
            category = "Books",
            imageUrl = "📖",
            sellerName = "Emma Wilson",
            sellerImage = "👩",
            rating = 4.9f,
            reviews = 51,
            location = "Lab Building"
        ),
        Product(
            id = "6",
            title = "Laptop Cooling Pad",
            price = 28.0,
            description = "USB powered, keeps laptop cool during long study sessions",
            category = "Electronics",
            imageUrl = "❄️",
            sellerName = "David Park",
            sellerImage = "👨",
            rating = 4.5f,
            reviews = 22,
            location = "Computer Lab"
        )
    )

    val mockCategories = listOf(
        Category("1", "Books", "📚", "#4F46E5", 234),
        Category("2", "Notes", "📝", "#10B981", 156),
        Category("3", "Electronics", "🖥️", "#F59E0B", 89),
        Category("4", "Calculators", "🧮", "#EC4899", 45),
        Category("5", "Furniture", "🪑", "#06B6D4", 72),
        Category("6", "Services", "🤝", "#8B5CF6", 38)
    )

    val mockUser = User(
        id = "user_1",
        name = "Alexandra Silva",
        email = "alexandra.silva@university.edu",
        profileImage = "👤",
        rating = 4.9f,
        reviews = 127,
        location = "Campus Avenue",
        joinedDate = "Joined March 2023"
    )

    val mockFavoriteProducts = listOf(
        mockProducts[0],
        mockProducts[2],
        mockProducts[4]
    )

    val mockConversations = listOf(
        Conversation(
            id = "conv_1",
            userId = "user_2",
            userName = "Maria Garcia",
            userImage = "👩",
            lastMessage = "Is this still available?",
            timestamp = "2 min ago",
            isOnline = true,
            unreadCount = 1,
            productName = "Advanced Calculus Textbook"
        ),
        Conversation(
            id = "conv_2",
            userId = "user_3",
            userName = "John Smith",
            userImage = "👨",
            lastMessage = "Can you deliver tomorrow?",
            timestamp = "1 hour ago",
            isOnline = false,
            productName = "Scientific Calculator"
        ),
        Conversation(
            id = "conv_3",
            userId = "user_4",
            userName = "Sarah Chen",
            userImage = "👩",
            lastMessage = "Perfect! I'll take it",
            timestamp = "5 hours ago",
            isOnline = true,
            productName = "Study Notes - Biology"
        )
    )

    val mockMessages = listOf(
        Message(
            id = "msg_1",
            senderId = "user_2",
            senderName = "Maria Garcia",
            senderImage = "👩",
            content = "Hi! Is this textbook still available?",
            timestamp = "10:30 AM",
            isFromCurrentUser = false
        ),
        Message(
            id = "msg_2",
            senderId = "user_1",
            senderName = "You",
            senderImage = "👤",
            content = "Yes, it's still available! Perfect condition.",
            timestamp = "10:32 AM",
            isFromCurrentUser = true
        ),
        Message(
            id = "msg_3",
            senderId = "user_2",
            senderName = "Maria Garcia",
            senderImage = "👩",
            content = "Great! Can we meet at the library tomorrow?",
            timestamp = "10:35 AM",
            isFromCurrentUser = false
        ),
        Message(
            id = "msg_4",
            senderId = "user_1",
            senderName = "You",
            senderImage = "👤",
            content = "Perfect! See you at 2 PM at the main entrance.",
            timestamp = "10:36 AM",
            isFromCurrentUser = true
        ),
        Message(
            id = "msg_5",
            senderId = "user_2",
            senderName = "Maria Garcia",
            senderImage = "👩",
            content = "Sounds good! Looking forward to it 😊",
            timestamp = "10:37 AM",
            isFromCurrentUser = false
        )
    )

    val mockListings = listOf(
        Listing(
            id = "list_1",
            title = "Advanced Calculus Textbook",
            price = 45.0,
            status = "Active",
            views = 234,
            createdDate = "2 days ago"
        ),
        Listing(
            id = "list_2",
            title = "Laptop Cooling Pad",
            price = 28.0,
            status = "Active",
            views = 156,
            createdDate = "1 week ago"
        ),
        Listing(
            id = "list_3",
            title = "Physics Lab Manual",
            price = 32.0,
            status = "Sold",
            views = 89,
            createdDate = "2 weeks ago"
        )
    )

    val mockSearchResults = listOf(
        mockProducts[0],
        mockProducts[1],
        mockProducts[4]
    )
}

