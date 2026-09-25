package com.gavin.week2_assignment.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.gavin.week2_assignment.R

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

val Typography = Typography().run {
    copy(
        displayLarge = displayLarge.copy(fontFamily = Poppins),
        displayMedium = displayMedium.copy(fontFamily = Poppins),
        displaySmall = displaySmall.copy(fontFamily = Poppins),
        headlineLarge = headlineLarge.copy(fontFamily = Poppins),
        headlineMedium = headlineMedium.copy(fontFamily = Poppins),
        headlineSmall = headlineSmall.copy(fontFamily = Poppins),
        titleLarge = titleLarge.copy(fontFamily = Poppins),
        titleMedium = titleMedium.copy(fontFamily = Poppins),
        titleSmall = titleSmall.copy(fontFamily = Poppins),
        bodyLarge = bodyLarge.copy(fontFamily = Poppins),
        bodyMedium = bodyMedium.copy(fontFamily = Poppins),
        bodySmall = bodySmall.copy(fontFamily = Poppins),
        labelLarge = labelLarge.copy(fontFamily = Poppins),
        labelMedium = labelMedium.copy(fontFamily = Poppins),
        labelSmall = labelSmall.copy(fontFamily = Poppins)
    )
}