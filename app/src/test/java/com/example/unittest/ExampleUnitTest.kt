package com.example.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleUnitTest {

    private val cxt = ApplicationProvider.getApplicationContext<Context>()

    @Test
    fun getContextExample() {
        println("app name = ${cxt.getString(R.string.app_name)}")
        Assert.assertEquals("com.example.unittest", cxt.getString(R.string.app_name))
    }

    /*@Test
    fun differentPackage() {
        // Context of the app under test.
        val cxt = Mockito.mock(Context::class.java)
        Mockito.`when`(cxt.getString(R.string.app_name)).thenReturn("I got the response")
        val body = cxt.getString(R.string.app_name)
        Assert.assertEquals("I got the response", body)
    }*/

}