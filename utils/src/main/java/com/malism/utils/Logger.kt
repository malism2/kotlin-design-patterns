package com.malism.utils

import android.util.Log

object Logger {
    private const val DEBUG = true

    fun d(tag: String, msg: String) {
        if (DEBUG) Log.d(tag, msg)
    }

    fun d(tag: String, msg: String, throwable: Throwable) {
        if (DEBUG) Log.d(tag, msg, throwable)
    }

    fun e(tag: String, msg: String) {
        Log.e(tag, msg)
    }

    fun e(tag: String, msg: String, throwable: Throwable) {
        Log.d(tag, msg, throwable)
    }
}