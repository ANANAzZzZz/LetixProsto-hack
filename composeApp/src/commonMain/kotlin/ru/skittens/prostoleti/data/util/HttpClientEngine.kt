package ru.skittens.prostoleti.data.util

import io.ktor.client.engine.HttpClientEngineFactory

expect val httpClientEngine: HttpClientEngineFactory<*>