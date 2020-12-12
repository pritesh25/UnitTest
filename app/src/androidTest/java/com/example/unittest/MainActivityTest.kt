package com.example.unittest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.filters.LargeTest
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    var mActivityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Before
    fun initValidString() {
        // Specify a valid string.

    }

    @Test
    fun ensureTextInsertion() {

        Espresso.onView(ViewMatchers.withId(R.id.etName)).perform(
            ViewActions.typeText("Hello world"),
            closeSoftKeyboard()
        )

        //Espresso.onView(ViewMatchers.withId(R.id.etName)).perform(ViewActions.typeText("Bye World"))

        Espresso.onView(ViewMatchers.withId(R.id.button)).perform(ViewActions.click())


    }

}