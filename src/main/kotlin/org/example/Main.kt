package org.example

import org.w3c.dom.Element
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    window.onload = {
        document.body!!.sayHello()
    }
}

fun Element.sayHello() {
    appendChild(document.createTextNode("Hello, world!"))
}