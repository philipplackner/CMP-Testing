@file:OptIn(ExperimentalTestApi::class)

package com.plcoding.cmp_testing

import Counter
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.runComposeUiTest
import kotlin.test.Test

class SampleUiTest {

    @Test
    fun testCounterCountsUp() = runComposeUiTest {
        setContent {
            Counter()
        }

        onNodeWithText("0").assertExists()
        onNodeWithText("1").assertDoesNotExist()
        onNodeWithText("Increment").performClick()
        onNodeWithText("1").assertExists()
        onNodeWithText("0").assertDoesNotExist()
    }
}