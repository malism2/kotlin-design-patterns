package com.malism.pattern.strategy

import android.util.Log

interface FlyBehavior {
    fun fly()
}

class FlyWings: FlyBehavior {
    override fun fly() {
        Log.d(Duck.TAG, "fly with wings!")
    }
}

class FlyNone: FlyBehavior {
    override fun fly() {
        Log.d(Duck.TAG, "I can't fly!")
    }
}