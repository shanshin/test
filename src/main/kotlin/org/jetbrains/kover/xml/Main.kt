package org.jetbrains.kover.xml

public inline fun<R> localRun(block:()->R):R{
    return block()
}

fun runLocalRun(){
    localRun{11}
}

class Main {
    fun call(): Int {
        return 3
    }
}
