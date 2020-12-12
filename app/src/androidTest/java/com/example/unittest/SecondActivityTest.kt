package com.example.unittest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest {

    @get:Rule
    var mActivityRule: ActivityScenarioRule<SecondActivity> =
        ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun enterEditText() {
        Espresso.onView(ViewMatchers.withId(R.id.editTextTextPersonName)).perform(
            ViewActions.typeText("second activity"),
            ViewActions.closeSoftKeyboard()
        )
    }
}