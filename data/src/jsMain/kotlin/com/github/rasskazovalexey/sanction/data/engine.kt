package com.github.rasskazovalexey.sanction.data

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js

internal actual val engine: HttpClientEngine
    get() = Js.create()
