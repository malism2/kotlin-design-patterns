package com.malism.pattern.strategy

import com.malism.utils.Logger

class MallardDuck: Duck() {

    override fun display() {
        Logger.d(TAG, "Mallard display look!")
    }
}