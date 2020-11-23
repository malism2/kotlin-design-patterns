package android.util

object Log {

    fun d(tag: String, msg: String): Int {
        println("DEBUG: $tag: $msg")
        return 0
    }

    fun d(tag: String, msg: String, throwable: Throwable): Int {
        println("DEBUG: $tag: $msg: ${throwable.localizedMessage}")
        return 0
    }

    fun e(tag: String, msg: String): Int {
        println("ERROR: $tag: $msg")
        return 0
    }

    fun e(tag: String, msg: String, throwable: Throwable): Int {
        println("ERROR: $tag: $msg: ${throwable.localizedMessage}")
        return 0
    }
}