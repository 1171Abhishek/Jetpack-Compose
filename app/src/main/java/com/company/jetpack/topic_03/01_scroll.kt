package com.company.jetpack.topic_03

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.company.jetpack.topic_03.scroll_affirmation.Affirmation
import com.company.jetpack.topic_03.scroll_data.DataSource

/** Structure
 *  1. Create a data class -> In new package
 *  2. Create a DataSource class -> In new package
 *  3. Create a composable function -> In new kotlin file
 */

// This function is used to display images and text
@Composable
fun ScrollFunction(modifier: Modifier) {
    AffirmationScroll(DataSource().loadAffirmation())
}


// This function is used to display the image and text
@Composable
fun AffirmationFunction(modifier: Modifier = Modifier, affirmation: Affirmation) {
    Card {
        Column {
            Image(
                painterResource(affirmation.imageResourceId),
                contentDescription = null, modifier.size(300.dp)
            )
            Text(stringResource(affirmation.stringResourceId))
        }
    }
}

// This function is used to scroll the list of images and text
@Composable
fun AffirmationScroll(
    affirmationList: List<Affirmation>
) {
    LazyColumn {
        items(affirmationList) {
            AffirmationFunction(affirmation = it)
        }
    }
}
