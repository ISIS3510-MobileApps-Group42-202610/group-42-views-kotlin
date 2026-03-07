package com.unimarket.app.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Alignment
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unimarket.app.ui.theme.BackgroundLight
import com.unimarket.app.ui.theme.PrimaryIndigo
import com.unimarket.app.ui.theme.TextPrimary
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onNavigateToLogin: () -> Unit) {
    var isAnimating by remember { mutableFloatStateOf(0f) }

    LaunchedEffect(Unit) {
        delay(3000)
        onNavigateToLogin()
    }

    val scale by animateFloatAsState(
        targetValue = if (isAnimating > 0.5f) 1.1f else 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(1500)
        ), label = ""
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .size(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "🏪",
                fontSize = 80.sp,
                modifier = Modifier
                    .size(100.dp)
                    .graphicsLayer(
                        scaleX = scale,
                        scaleY = scale
                    )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "UniMarket",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = PrimaryIndigo,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Student Marketplace",
                fontSize = 14.sp,
                color = TextPrimary,
                textAlign = TextAlign.Center
            )
        }
    }
}

