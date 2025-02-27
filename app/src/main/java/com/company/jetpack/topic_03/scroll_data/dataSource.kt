package com.company.jetpack.topic_03.scroll_data

import com.company.jetpack.R
import com.company.jetpack.topic_03.scroll_affirmation.Affirmation

// DataSource class is used to load data from resources
class DataSource {
    fun loadAffirmation(): List<Affirmation> {
        return listOf(
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
            Affirmation(R.drawable.image, R.string.t1),
        )
    }
}