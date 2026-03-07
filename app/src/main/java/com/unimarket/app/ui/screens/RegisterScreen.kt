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
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unimarket.app.ui.components.NeumorphicButton
import com.unimarket.app.ui.components.NeumorphicTextField
import com.unimarket.app.ui.theme.BackgroundLight
import com.unimarket.app.ui.theme.PrimaryIndigo
import com.unimarket.app.ui.theme.TextPrimary
import com.unimarket.app.ui.theme.TextSecondary

@Composable
fun RegisterScreen(onNavigateToHome: () -> Unit, onNavigateToLogin: () -> Unit) {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundLight)
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(40.dp))

            // Logo
            Text(
                text = "🏪",
                fontSize = 64.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Create Account",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = TextPrimary
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Join UniMarket today",
                fontSize = 14.sp,
                color = TextSecondary,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Full Name Input
            NeumorphicTextField(
                value = fullName,
                onValueChange = { fullName = it },
                label = "Full Name",
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Name",
                        tint = PrimaryIndigo,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Email Input
            NeumorphicTextField(
                value = email,
                onValueChange = { email = it },
                label = "University Email",
                modifier = Modifier.fillMaxWidth(),
                leadingIcon = {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Email",
                        tint = PrimaryIndigo,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Password Input
            NeumorphicTextField(
                value = password,
                onValueChange = { password = it },
                label = "Password",
                modifier = Modifier.fillMaxWidth(),
                isPassword = true,
                leadingIcon = {
                    Icon(
                        Icons.Default.Lock,
                        contentDescription = "Password",
                        tint = PrimaryIndigo,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Confirm Password Input
            NeumorphicTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = "Confirm Password",
                modifier = Modifier.fillMaxWidth(),
                isPassword = true,
                leadingIcon = {
                    Icon(
                        Icons.Default.Lock,
                        contentDescription = "Confirm Password",
                        tint = PrimaryIndigo,
                        modifier = Modifier.padding(start = 12.dp)
                    )
                }
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Create Account Button
            NeumorphicButton(
                text = "Create Account",
                onClick = onNavigateToHome,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                isPrimary = true
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Login Link
            Row(
                modifier = Modifier,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have an account? ",
                    fontSize = 13.sp,
                    color = TextSecondary
                )
                Text(
                    text = "Log In",
                    fontSize = 13.sp,
                    color = PrimaryIndigo,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.clickable { onNavigateToLogin() }
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

