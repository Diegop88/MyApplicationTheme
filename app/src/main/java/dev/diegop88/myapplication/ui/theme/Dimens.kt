package dev.diegop88.myapplication.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimens(
    val horizontalPadding: Dp = 8.dp,
    val smallPadding: Dp = 8.dp,
    val mediumPadding: Dp = 12.dp,
    val largePadding: Dp = 16.dp,
    val listSpacing: Dp = 8.dp,
) {
    override fun toString(): String {
        return "Dimens(small=$smallPadding, medium=$mediumPadding, large=$largePadding)"
    }
}

val DefaultDimens = Dimens()

val TabletDimens = Dimens(
    horizontalPadding = 24.dp
)

internal val LocalDimens = staticCompositionLocalOf { DefaultDimens }
