package com.malism.pattern.strategy

import android.util.Log

abstract class Duck(private var flyBehavior: FlyBehavior? = null,
                    private var quackBehavior: QuackBehavior? = null) {
    companion object {
        const val TAG = "Duck"
    }

    abstract fun display()

    fun setFlyBehavior(flyBehavior: FlyBehavior) {
        this. flyBehavior = flyBehavior
    }

    fun setQuackBehavior(quackBehavior: QuackBehavior) {
        this.quackBehavior = quackBehavior
    }

    fun swim() = Log.d(TAG, "duck swimming!")
    fun performFly() = flyBehavior?.fly()
    fun performQuack() = quackBehavior?.quack()
}