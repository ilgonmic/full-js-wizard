package org.example

import kotlinx.serialization.json.Json
import kotlinx.serialization.list
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

        val jsonData = Json.stringify(Data.serializer(), Data(42))
        val jsonList = Json.stringify(Data.serializer().list, listOf(Data(42)))
        println(jsonData)
        println(jsonList)

        val obj = Json.parse(Data.serializer(), """{"a":42}""")
        println(obj)
    }
}

external fun require(path: String): String

fun Element.sayHello() {
    appendChild(document.createTextNode("Hello, world!"))
}