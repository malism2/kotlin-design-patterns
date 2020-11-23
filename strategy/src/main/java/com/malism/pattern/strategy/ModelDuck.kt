package com.malism.pattern.strategy

import com.malism.utils.Logger

class ModelDuck(flyBehavior: FlyBehavior? = null,
                quackBehavior: QuackBehavior? = null) : Duck(flyBehavior, quackBehavior){
    override fun display() {
        Logger.d(TAG, "Model duck look!")
    }
}