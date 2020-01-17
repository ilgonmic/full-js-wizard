package org.example

import org.w3c.dom.Element
import org.w3c.dom.HTMLDivElement
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

        (document.createElement("div") as HTMLDivElement).apply {
            style.width = "1em"
            style.height = "1em"

            innerHTML = require("Kotlin-logo.svg")
            document.body!!.appendChild(this)
        }
    }
}

external fun require(path: String): String

fun Element.sayHello() {
    appendChild(document.createTextNode("Hello, world!"))
}