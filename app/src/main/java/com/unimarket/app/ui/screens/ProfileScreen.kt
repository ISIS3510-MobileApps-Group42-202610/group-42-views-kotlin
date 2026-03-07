package com.unimarket.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unimarket.app.data.MockData
import com.unimarket.app.ui.components.NeumorphicButton
import com.unimarket.app.ui.theme.BackgroundLight
import com.unimarket.app.ui.theme.PrimaryIndigo
import com.unimarket.app.ui.theme.TextPrimary
import com.unimarket.app.ui.theme.TextSecondary

@Composable
fun ProfileScreen(onNavigateToLogin: () -> Unit) {
    val user = MockData.mockUser

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
    ) {
        item {
            // Profile Header
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Avatar
                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .shadow(
                            elevation = 8.dp,
                            shape = RoundedCornerShape(20.dp),
                            ambientColor = Color.Black.copy(alpha = 0.1f),
                            spotColor = Color.Black.copy(alpha = 0.15f)
                        )
                        .background(
                            PrimaryIndigo.copy(alpha = 0.1f),
                            RoundedCornerShape(20.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Text(text = user.profileImage, fontSize = 48.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Name
                Text(
                    text = user.name,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Rating
                Text(
                    text = "⭐ ${user.rating} • ${user.reviews} reviews",
                    fontSize = 12.sp,
                    color = TextSecondary
                )

                Spacer(modifier = Modifier.height(8.dp))

                // Email
                Text(
                    text = user.email,
                    fontSize = 12.sp,
                    color = TextSecondary
                )

                Spacer(modifier = Modifier.height(12.dp))

                // Location
                Text(
                    text = "📍 ${user.location}",
                    fontSize = 12.sp,
                    color = TextSecondary
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(12.dp))

            // Stats Section
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                StatCard(
                    label = "My Listings",
                    value = "${MockData.mockListings.size}",
                    modifier = Modifier.weight(1f)
                )
                StatCard(
                    label = "Purchases",
                    value = "12",
                    modifier = Modifier.weight(1f)
                )
                StatCard(
                    label = "Sold",
                    value = "8",
                    modifier = Modifier.weight(1f)
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))

            // My Listings Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "My Listings",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Text(
                        text = "See all",
                        fontSize = 12.sp,
                        color = PrimaryIndigo
                    )
                }

                Spacer(modifier = Modifier.height(12.dp))
            }
        }

        items(MockData.mockListings.take(3)) { listing ->
            ListingItem(listing = listing)
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))

            // Settings Section
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                SettingItem(
                    icon = Icons.Default.Edit,
                    label = "Edit Profile",
                    onClick = { }
                )
                SettingItem(
                    icon = Icons.Default.Settings,
                    label = "Settings",
                    onClick = { }
                )
                SettingItem(
                    icon = Icons.Default.Help,
                    label = "Help & Support",
                    onClick = { }
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Logout Button
            NeumorphicButton(
                text = "🚪 Log Out",
                onClick = onNavigateToLogin,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(48.dp),
                isPrimary = false
            )

            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Composable
fun StatCard(
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(80.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(12.dp),
                ambientColor = Color.Black.copy(alpha = 0.08f)
            )
            .background(Color.White, RoundedCornerShape(12.dp))
            .padding(12.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = value,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryIndigo
            )
            Text(
                text = label,
                fontSize = 10.sp,
                color = TextSecondary
            )
        }
    }
}

@Composable
fun ListingItem(listing: com.unimarket.app.data.models.Listing) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(12.dp),
                ambientColor = Color.Black.copy(alpha = 0.08f)
            )
            .background(Color.White, RoundedCornerShape(12.dp))
            .clickable { }
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = listing.title,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                Text(
                    text = "${listing.views} views • ${listing.createdDate}",
                    fontSize = 11.sp,
                    color = TextSecondary
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "$${listing.price}",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = PrimaryIndigo
                )
                Box(
                    modifier = Modifier
                        .background(
                            when (listing.status) {
                                "Active" -> Color(0xFF10B981).copy(alpha = 0.1f)
                                "Sold" -> Color(0xFFEF4444).copy(alpha = 0.1f)
                                else -> Color(0xFFFBBF24).copy(alpha = 0.1f)
                            },
                            RoundedCornerShape(4.dp)
                        )
                        .padding(4.dp)
                ) {
                    Text(
                        text = listing.status,
                        fontSize = 10.sp,
                        color = when (listing.status) {
                            "Active" -> Color(0xFF10B981)
                            "Sold" -> Color(0xFFEF4444)
                            else -> Color(0xFFFBBF24)
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun SettingItem(
    icon: androidx.compose.material.icons.Icons?,
    label: String,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(12.dp),
                ambientColor = Color.Black.copy(alpha = 0.08f)
            )
            .background(Color.White, RoundedCornerShape(12.dp))
            .clickable { onClick() }
            .padding(horizontal = 12.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (icon != null) {
                    Icon(
                        icon,
                        contentDescription = label,
                        tint = PrimaryIndigo,
                        modifier = Modifier.size(20.dp)
                    )
                }
                Text(
                    text = label,
                    fontSize = 14.sp,
                    color = TextPrimary
                )
            }
        }
    }
}

