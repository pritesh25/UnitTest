package com.example.unittest

import android.content.Context

class Demo {
    fun getPackage(cxt: Context?): String? {
        cxt?.let {
            return it.getString(R.string.app_name)
        }
        return null
    }
}