package com.company.jetpack.topic_04

/*
Activity: An Activity is the current screen in an app where the user interacts.
          Activity 1 -> Home Screen
          Activity 2 -> Product Details Screen
          Activity 3 -> Cart Screen
 */

/*
Jetpack Compose, we use a single Activity and navigate between multiple screens
using @Composable functions with Navigation Components.
 */

/*
Activity goes through different stages from creation to destruction. These stages are called the
Activity Lifecycle.

1️⃣ `onCreate()`  → Activity is created (screen initializes).
2️⃣ `onStart()`   → Activity becomes visible but not interactive.
3️⃣ `onResume()`  → Activity is fully active and interactive.
4️⃣ `onPause()`   → Activity is partially visible (e.g., a call or popup appears).
5️⃣ `onStop()`    → Activity is hidden (e.g., app minimized or switched).
6️⃣ `onDestroy()` → Activity is fully removed from memory (app closed).

✅ Each Activity has its own lifecycle, and Android manages it automatically.


/*
Think of an Activity like a Human Life 👶➡️👨‍💼➡️👴
Just like a human goes through different stages of life, an Activity goes through different stages in an app.

Stages of Activity Lifecycle
Stages of Activity Lifecycle

1️⃣ Birth (`onCreate()`) 👶 → Activity is created.
2️⃣ Awake (`onStart()`) 🌞 → Activity is visible, but not interactive.
3️⃣ Active (`onResume()`) 🏃 → Activity is fully active, user can interact.
4️⃣ Paused (`onPause()`) ⏸ → Activity is visible, but not interactive (e.g., popup appears).
5️⃣ Sleeping (`onStop()`) 💤 → Activity is completely hidden, but still in memory.
6️⃣ Restart (`onRestart()`) 🔄 → Activity was stopped but is coming back.
7️⃣ Death (`onDestroy()`) ☠️ → Activity is fully removed from memory.

Example in Real Life 🎬
Imagine you open YouTube on your phone:

📱 YouTube app opens → `onCreate()`
🎥 You see the home screen → `onStart()`
🎬 You start watching a video → `onResume()`
📞 A call comes (YouTube pauses) → `onPause()`
🔙 You minimize the app → `onStop()`
↩️ You reopen YouTube from recent apps → `onRestart()` → `onStart()` → `onResume()`
❌ You close YouTube completely → `onDestroy()`



When is onRestart() Called?
onRestart() is triggered in these cases:
✅ App is minimized (user presses the home button).
✅ User switches to another app (e.g., opens WhatsApp while YouTube is running).
✅ Phone is locked (screen turns off, and the activity goes into the background).



_________________________________________________________________________________________________
|     Feature       | `onPause()`                          | `onStop()`                         |
|-------------------|--------------------------------------|------------------------------------|
| Visibility        | Activity is partially visible        | Activity is completely hidden      |
| Interactivity     | Not interactive                      | Not interactive                    |
| When It Happens   | Another screen overlays the activity | User navigates away or minimizes the app |
|                       (e.g., call, dialog)               |
| Still in Memory   | ✅ Yes                               | ✅ Yes, but Android may remove it if needed |
| Best Use Case     | Pause animations, videos, or         | Release resources, save important data |
                      temporary data
| Execution Order   | Always called before `onStop()`      | Called after `onPause()` if the activity is fully off-screen |
___________________________________________________________________________________________

 */