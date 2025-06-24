package com.movieapp.ui.theme

import com.movieapp.R
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

val Typography = Typography(
    headlineLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 60.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp
    ),
    titleLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 32.sp
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 15.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 15.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 18.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 18.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp
    )
)

// 커스텀 확장 속성들
val Typography.h5Title: TextStyle
    @Composable get() = titleMedium.copy(
        fontSize = 24.sp
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

/**
 * h1 → headlineLarge
 * h2 → headlineMedium
 * h3 → headlineSmall
 * h4 → titleLarge
 * h5 → titleMedium
 * h6 → titleSmall
 * subtitle1 → labelMedium
 * subtitle2 → labelSmall
 * body1 → bodyLarge
 * body2 → bodyMedium
 * button → labelLarge
 * caption → bodySmall
 */