package io.matech.curvy

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes

data class NavMenuItem(
    @DrawableRes
    val icon: Int,
    @DrawableRes
    val animatedIcon: Int,
    @IdRes
    val destinationId: Int = -1
)