package com.malism.pattern.strategy

import com.malism.utils.Logger

interface QuackBehavior {
    fun quack()
}

class Quack: QuackBehavior {
    override fun quack() {
        Logger.d(Duck.TAG, "quack!!!")
    }
}

class Mute: QuackBehavior {
    override fun quack() {
        Logger.d(Duck.TAG, "mute!!!")
    }
}

class Squeak: QuackBehavior {
    override fun quack() {
        Logger.d(Duck.TAG, "squeak!!!")
    }
}