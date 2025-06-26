package com.movieapp.ui.models.buttons

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LeadingIconData(
    @DrawableRes val iconDrawableRes: Int,
    @StringRes val iconContentDescription: Int
)
