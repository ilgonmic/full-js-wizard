package org.example

import kotlinx.html.js.onClickFunction
import react.*
import react.dom.button
import react.dom.div
import react.dom.p
import kotlin.browser.window

external interface TickerProps : RProps {
    var startFrom: Int
}

val Ticker: FunctionalComponent<TickerProps> = functionalComponent<TickerProps> { props ->
    val (secondsElapsed, setSecondsElapsed) = useState(0)
    val (count, setCount) = useState(props.startFrom)

    useEffectWithCleanup(listOf(secondsElapsed)) {
        var timerId: Int
        fun timeoutCallback() {
            timerId = window.setTimeout(::timeoutCallback)
            setSecondsElapsed(secondsElapsed + 1)
        }

        timerId = window.setTimeout(::timeoutCallback, 1000)

        return@useEffectWithCleanup { window.clearInterval(timerId) }
    }

    div {
        p {
            +"This app has been running for $secondsElapsed seconds."
        }
        button {
            attrs {
                onClickFunction = { setCount(count + 1) }
            }
            +"Hey $count"
        }
    }
}