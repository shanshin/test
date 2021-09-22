package org.jetbrains.kover.xml

public inline fun<R> localRun(block:()->R):R{
    return block()
}

fun runLocalRun(){
    localRun{9}
}

fun otherFun() : Int {
    return 4
}

class Main {
    fun call(): Int {
        return 3
    }

    fun unused(): Int {
        return 1
    }
}
