package com.github.rasskazovalexey.sanction.data

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.cio.CIO

internal actual val engine: HttpClientEngine
    get() = CIO.create()
