package org.jetbrains.kover.xml

import kotlin.test.Test


class MainTest {
    @Test
    fun test() {
        println(localRun { 6 })
        println(Main().call())
    }

}
