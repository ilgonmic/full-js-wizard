package org.example

import kotlin.browser.document
import kotlin.test.Test
import kotlin.test.assertEquals

class MainPageTest {
    @Test
    fun testSayHello() {
        val container = document.createElement("div")
        container.sayHello()
        assertEquals("Hello, world!", container.textContent)
    }
}