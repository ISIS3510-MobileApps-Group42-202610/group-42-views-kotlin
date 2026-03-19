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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
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
import com.unimarket.app.ui.theme.BackgroundLight
import com.unimarket.app.ui.theme.TextPrimary
import com.unimarket.app.ui.theme.TextSecondary

@Composable
fun FavoritesScreen(onNavigateToProduct: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
    ) {
        // Header
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "Saved Items",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "${MockData.mockFavoriteProducts.size} saved items",
                fontSize = 14.sp,
                color = TextSecondary
            )
        }

        // Favorites List
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            contentPadding = androidx.compose.foundation.layout.PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(MockData.mockFavoriteProducts) { product ->
                FavoriteProductCard(
                    product = product,
                    onClick = { onNavigateToProduct(product.id) }
                )
            }
        }
    }
}

@Composable
fun FavoriteProductCard(
    product: com.unimarket.app.data.models.Product,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 6.dp,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
                ambientColor = Color.Black.copy(alpha = 0.08f),
                spotColor = Color.Black.copy(alpha = 0.12f)
            )
            .background(Color.White, androidx.compose.foundation.shape.RoundedCornerShape(16.dp))
            .clickable { onClick() }
            .padding(12.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            // Product Image
            Box(
                modifier = Modifier
                    .androidx.compose.foundation.layout.size(100.dp)
                    .background(
                        color = when {
                            product.category == "Books" -> androidx.compose.material3.MaterialTheme.colorScheme.primary.copy(alpha = 0.1f)
                            product.category == "Electronics" -> Color(0xFFF59E0B).copy(alpha = 0.1f)
                            else -> androidx.compose.material3.MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f)
                        },
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = product.imageUrl, fontSize = 40.sp)
            }

            // Product Info
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(vertical = 4.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = product.title,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = TextPrimary,
                        maxLines = 2
                    )

                    Spacer(modifier = Modifier.height(4.dp))

                    Text(
                        text = product.sellerName,
                        fontSize = 12.sp,
                        color = TextSecondary
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "$${product.price}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        color = androidx.compose.material3.MaterialTheme.colorScheme.primary
                    )

                    Icon(
                        Icons.Default.Delete,
                        contentDescription = "Remove",
                        tint = Color(0xFFEF4444),
                        modifier = Modifier
                            .androidx.compose.foundation.layout.size(20.dp)
                            .clickable { }
                    )
                }
            }
        }
    }
}

