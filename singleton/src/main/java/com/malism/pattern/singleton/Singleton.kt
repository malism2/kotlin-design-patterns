package com.malism.pattern.singleton

class Singleton private constructor(){

    companion object {
        private val instance = Singleton()
        fun getInstance() = instance
    }
}