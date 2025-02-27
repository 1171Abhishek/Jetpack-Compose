package com.company.jetpack.topic_03.scroll_affirmation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// data class is used to store data in this data is image and text
data class Affirmation(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int
)