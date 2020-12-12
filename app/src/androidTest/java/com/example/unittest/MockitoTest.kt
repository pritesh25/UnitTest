package com.example.unittest

import android.content.Context
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MockitoTest {

    //@Mock
    //lateinit var demo: MockC

    /*@Before
    fun onSetup() {
        demo = Demo()
    }*/

    @Test
    fun samePackage() {
        val context = mock(Context::class.java)
        println("package name = ${context.getString(R.string.app_name)}")
        //println("app name = ${demo.getPackage(mock(Context::class.java))}")
    }
}