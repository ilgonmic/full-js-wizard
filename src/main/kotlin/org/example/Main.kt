package org.example

import org.w3c.dom.Element
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(Welcome::class) {
                attrs {
                    name = "Kotlin/JS"
                }
            }
        }
    }
}

fun Element.sayHello() {
    appendChild(document.createTextNode("Hello, world!"))
}