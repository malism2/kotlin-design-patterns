package com.malism.pattern.singleton

class SynchronizedSingleton private constructor() {
    companion object {
        private lateinit var instance: SynchronizedSingleton
        @Synchronized fun getInstance(): SynchronizedSingleton {
            if (instance == null) {
                instance = SynchronizedSingleton()
            }
            return instance
        }
    }
}