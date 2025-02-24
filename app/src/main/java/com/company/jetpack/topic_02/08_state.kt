package com.company.jetpack.topic_02

/** remember and mutableStateOf()

- **State**: In Jetpack Compose, state is data or a value that can change. When it changes, the UI
automatically updates to show the latest information.

- **Recomposition**: When the state changes, Jetpack Compose reruns the entire composable function
to update the UI.

- **remember**: `remember` keeps a value or object across recompositions, so it doesn’t reset value every
time the UI updates.

- **mutableStateOf()**: `mutableStateOf` stores a value that can change. When this value changes,
the UI updates automatically.

-** var name by remember { mutableStateOf(" ")}
name is -> State Here.

 */