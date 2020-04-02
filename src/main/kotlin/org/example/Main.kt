package org.example

import kotlinext.js.jsObject
import react.child
import react.dom.render
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    window.onload = {
        render(document.getElementById("root")) {
            child(
                functionalComponent = Ticker,
                props = jsObject {
                    startFrom = 5
                }
            )
        }
    }
}