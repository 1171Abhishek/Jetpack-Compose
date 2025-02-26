package com.example.learn.test

import com.company.jetpack.topic_02.square

import org.junit.Assert.assertEquals // import -> assertEquals()

import org.junit.Test   // import -> @Test

class LearnTest {
    @Test
    fun learnTestFunction(){
        val actualValue = square(4)
        assertEquals(16, actualValue)
    }
}

/*  These options are available
assertEquals()
assertNotEquals()
assertTrue()
assertFalse()
assertNull()
assertNotNull()
assertThat()
 */