package com.malism.pattern.singleton

import java.lang.IllegalStateException

class DoubleCheckedSingleton private constructor(){

    init {
        // protect again instance from reflection
        if (instance == null) {
            instance = this
        } else {
            throw IllegalStateException("Already initialized")
        }
    }

    companion object {
        private lateinit var instance: DoubleCheckedSingleton
        fun getInstance(): DoubleCheckedSingleton {
            if (instance == null) {
                synchronized(DoubleCheckedSingleton.javaClass) {
                    if (instance == null) {
                        instance = DoubleCheckedSingleton()
                    }
                }
            }
            return instance
        }
    }

}