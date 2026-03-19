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
    import androidx.compose.foundation.rememberScrollState
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.foundation.verticalScroll
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.automirrored.filled.ArrowBack
    import androidx.compose.material.icons.filled.Add
    import androidx.compose.material.icons.filled.Image
    import androidx.compose.material3.Icon
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.runtime.getValue
    import androidx.compose.runtime.mutableStateOf
    import androidx.compose.runtime.remember
    import androidx.compose.runtime.setValue
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.draw.shadow
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.unimarket.app.ui.components.AccentButton
    import com.unimarket.app.ui.components.NeumorphicButton
    import com.unimarket.app.ui.components.NeumorphicTextField
    import com.unimarket.app.ui.theme.BackgroundLight
    import com.unimarket.app.ui.theme.PrimaryIndigo
    import com.unimarket.app.ui.theme.TextPrimary
    import com.unimarket.app.ui.theme.TextSecondary
    
    @Composable
    fun CreateListingScreen(onNavigateBack: () -> Unit) {
        var title by remember { mutableStateOf("") }
        var description by remember { mutableStateOf("") }
        var price by remember { mutableStateOf("") }
        var selectedCategory by remember { mutableStateOf("Books") }
    
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BackgroundLight)
                .verticalScroll(rememberScrollState())
        ) {
            // Header
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = "Back",
                    modifier = Modifier
                        .clickable { onNavigateBack() },
                    tint = TextPrimary
                )
    
                Text(
                    text = "Create Listing",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = TextPrimary
                )
    
                Box(modifier = Modifier.fillMaxWidth(0.15f))
            }
    
            Spacer(modifier = Modifier.height(16.dp))
    
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Image Upload
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .shadow(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(12.dp),
                            ambientColor = Color.Black.copy(alpha = 0.08f)
                        )
                        .background(Color.White, RoundedCornerShape(12.dp))
                        .clickable { }
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Default.Image,
                            contentDescription = "Upload Image",
                            modifier = Modifier.height(40.dp),
                            tint = PrimaryIndigo
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = "Tap to add photos",
                            fontSize = 14.sp,
                            color = TextSecondary
                        )
                    }
                }
    
                // Title Input
                Text(
                    text = "Title",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                NeumorphicTextField(
                    value = title,
                    onValueChange = { title = it },
                    label = "Item title",
                    modifier = Modifier.fillMaxWidth()
                )
    
                // Description Input
                Text(
                    text = "Description",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(120.dp)
                        .shadow(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(12.dp),
                            ambientColor = Color.Black.copy(alpha = 0.08f)
                        )
                        .background(Color.White, RoundedCornerShape(12.dp))
                        .padding(12.dp)
                ) {
                    Text(
                        text = if (description.isEmpty()) "Describe your item..." else description,
                        fontSize = 14.sp,
                        color = if (description.isEmpty()) TextSecondary else TextPrimary
                    )
                }
    
                // Price Input
                Text(
                    text = "Price (USD)",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                NeumorphicTextField(
                    value = price,
                    onValueChange = { price = it },
                    label = "$0.00",
                    modifier = Modifier.fillMaxWidth()
                )
    
                // Category Selector
                Text(
                    text = "Category",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextPrimary
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    listOf("Books", "Electronics", "Notes", "Furniture").forEach { category ->
                        Box(
                            modifier = Modifier
                                .weight(1f)
                                .height(40.dp)
                                .shadow(
                                    elevation = 4.dp,
                                    shape = RoundedCornerShape(8.dp),
                                    ambientColor = Color.Black.copy(alpha = 0.08f)
                                )
                                .background(
                                    if (selectedCategory == category) PrimaryIndigo else Color.White,
                                    RoundedCornerShape(8.dp)
                                )
                                .clickable { selectedCategory = category },
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = category,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium,
                                color = if (selectedCategory == category) Color.White else TextPrimary
                            )
                        }
                    }
                }
    
                Spacer(modifier = Modifier.height(24.dp))
    
                // Publish Button
                AccentButton(
                    text = "📤 Publish Listing",
                    onClick = { onNavigateBack() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp)
                )
    
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
    
