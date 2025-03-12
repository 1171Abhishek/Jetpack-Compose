package com.company.jetpack

import android.os.Bundle
import android.util.Log // For Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.company.jetpack.topic_03.LearnCustomFont
import com.company.jetpack.ui.theme.JetpackComposeTheme

private const val TAG = "MainActivity" // This line defines a constant variable for logging.
//"MainActivity": Is just a label used to identify logs from this class.
/*Why use TAG in logging?
Instead of writing "MainActivity" every time in Log.d(), we just use TAG, making logging
consistent and easier to manage.
 */

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG , "onCreate Called")
        /*
        Logs a debug message (d means Debug)
        TAG: Identifies that the log is from "MainActivity".
        "onCreate Called": The actual message to log.
         */
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LearnCustomFont(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

/*    Log.d(TAG, "message") prints a message in the Logcat console.
    ✅ Log.d → "d" stands for Debug, meaning it's used for debugging.
    ✅ TAG → A label (e.g., "MainActivity") to identify where the log is coming from.
    ✅ "message" → The actual text you want to print.*/

    /*
    These code prints a message in the Logcat console so we can see when different activity
    lifeCycle is called.
     */
    override fun onStart(){
        super.onStart()
        Log.d(TAG , "onStart Called")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG , "onResume Called")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG , "onPause Called")
    }

     override fun onStop(){
        super.onStop()
        Log.d(TAG , "onStop Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG , "onRestart Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG , "onDestroy Called")
    }
}


