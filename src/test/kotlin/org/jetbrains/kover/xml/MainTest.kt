package org.jetbrains.kover.xml

import kotlin.test.Test


class MainTest {
    @Test
    fun test() {
        println(localRun { 5 })
        println(otherFun())
        println(Main().call())
    }

}
