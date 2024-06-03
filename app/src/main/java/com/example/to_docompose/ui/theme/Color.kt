package com.example.to_docompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val LightGray = Color(0xFFFCFCFC)
val MediumGray = Color(0xFF9C9C9C)
val DarkGray = Color(0xFF141414)

val LowPriorityColor = Color(0xFF00C980)
val MediumPriorityColor = Color(0xFFFFC114)
val HighPriorityColor = Color(0XFFFF4646)
val NonePriorityColor = MediumGray

val Colors.splashScreenBackground: Color
    @Composable
    get() = if (isSystemInDarkTheme()) Color.Black else Purple700

val Colors.taskItemTextColor: Color
    @Composable
    get() = if (isSystemInDarkTheme()) LightGray else DarkGray

val Colors.taskItemBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme())  DarkGray else Color.White

val Colors.fabBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme())  Purple700 else Teal200

val Colors.topAppBarContentColor: Color
    @Composable
    get() = if (isSystemInDarkTheme())  LightGray else Color.White

val Colors.topAppBarBackgroundColor: Color
    @Composable
    get() = if (isSystemInDarkTheme())  Color.Black else Purple500