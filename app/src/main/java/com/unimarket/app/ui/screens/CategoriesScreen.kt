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
import com.unimarket.app.ui.theme.AccentOrange
import com.unimarket.app.ui.theme.BackgroundLight
import com.unimarket.app.ui.theme.PrimaryIndigo
import com.unimarket.app.ui.theme.SecondaryEmerald
import com.unimarket.app.ui.theme.TextPrimary
import com.unimarket.app.ui.theme.TextSecondary

@Composable
fun CategoriesScreen(onNavigateToSearch: (String) -> Unit) {
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
                text = "Categories",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Browse by category",
                fontSize = 14.sp,
                color = TextSecondary
            )
        }

        // Category Grid
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(MockData.mockCategories.chunked(2)) { categoryRow ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    categoryRow.forEach { category ->
                        CategoryCard(
                            category = category,
                            modifier = Modifier.weight(1f),
                            onClick = { onNavigateToSearch(category.name) }
                        )
                    }

                    if (categoryRow.size == 1) {
                        Box(modifier = Modifier.weight(1f))
                    }
                }
            }
        }
    }
}

@Composable
fun CategoryCard(
    category: com.unimarket.app.data.models.Category,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    val backgroundColor = when (category.name) {
        "Books" -> PrimaryIndigo.copy(alpha = 0.1f)
        "Notes" -> SecondaryEmerald.copy(alpha = 0.1f)
        "Electronics" -> AccentOrange.copy(alpha = 0.1f)
        "Calculators" -> Color(0xFFEC4899).copy(alpha = 0.1f)
        "Furniture" -> Color(0xFF06B6D4).copy(alpha = 0.1f)
        else -> Color(0xFF8B5CF6).copy(alpha = 0.1f)
    }

    val accentColor = when (category.name) {
        "Books" -> PrimaryIndigo
        "Notes" -> SecondaryEmerald
        "Electronics" -> AccentOrange
        "Calculators" -> Color(0xFFEC4899)
        "Furniture" -> Color(0xFF06B6D4)
        else -> Color(0xFF8B5CF6)
    }

    Box(
        modifier = modifier
            .height(140.dp)
            .shadow(
                elevation = 6.dp,
                shape = RoundedCornerShape(16.dp),
                ambientColor = Color.Black.copy(alpha = 0.08f),
                spotColor = Color.Black.copy(alpha = 0.12f)
            )
            .background(Color.White, RoundedCornerShape(16.dp))
            .clickable { onClick() }
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(backgroundColor, RoundedCornerShape(8.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = category.icon, fontSize = 28.sp)
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = category.name,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )

                Text(
                    text = "${category.count} items",
                    fontSize = 11.sp,
                    color = TextSecondary
                )
            }
        }
    }
}

