package com.malism.pattern.singleton

class HolderSingleton private constructor(){
    object Holder { val instance = HolderSingleton() }
    companion object {
        fun getInstance() = Holder.instance
    }
}