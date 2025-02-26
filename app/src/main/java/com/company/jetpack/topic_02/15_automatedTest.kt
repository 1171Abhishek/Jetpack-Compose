package com.company.jetpack.topic_02

import androidx.annotation.VisibleForTesting

/*
    Automated test:
Software testing ensures your app works as expected. Automated testing uses code to check if
another piece of code is working correctly.

    Types of automated test

Local Tests: These test small pieces of code (like functions or classes) directly on your computer,
             without needing a device or emulator. They run fast and use fewer resources.

Instrumentation Tests: These are UI tests that check how an app interacts with Android APIs. They
            run on a real device or emulator, simulating user actions to ensure the app responds correctly.
 */

@VisibleForTesting    // annotation added
internal fun square(num: Int): Int {
    return num * num
}


/*
Project -> app -> src -> test [unitTest] -> java -> com -> create your package and write test code
 */