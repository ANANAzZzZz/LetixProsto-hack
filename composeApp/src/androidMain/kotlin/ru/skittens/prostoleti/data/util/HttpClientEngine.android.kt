package ru.skittens.prostoleti.data.util

import io.ktor.client.engine.HttpClientEngineFactory
import io.ktor.client.engine.cio.CIO

actual val httpClientEngine: HttpClientEngineFactory<*>
    get() = CIO