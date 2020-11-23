package com.malism.pattern.singleton

class LazySingleton private constructor() {

    companion object {
        private val instance: LazySingleton by lazy(LazyThreadSafetyMode.PUBLICATION) { LazySingleton() }
    }
}